package view;

import static model.DataModel.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import static utils.NumberUtils.*;

import bean.Item;
import bean.Store;
import model.DataModel;
import utils.NumberUtils;

public class WhAllocationDemo {
	private static Map<Item, List<Store>> mockStoresOfRefItemA77 = DataModel.mockStoresOfRefItemA77();

	public static void main(String[] args) {
		// Step 1:Check for planning amount

		if (planningAmount < requiredMinPlanningAmount) {
			System.out.println("Stopping calculation.");
			System.exit(0);
		}

		// Step 2:Filling gaps by references or average
		System.out.println("Step 2: Filling gaps by references or average");
		Map<Item, List<Store>> mockStoresOfRefItemA77 = DataModel.mockStoresOfRefItemA77();
		Map<Item, List<Store>> mockStoresOfRefItemA55 = DataModel.mockStoresOfRefItemA55();
		Map<Integer, Integer> refStores = DataModel.mockRefStores();

		Map<Item, List<Store>> mergedStores = new HashMap<>(mockStoresOfRefItemA77);
		mockStoresOfRefItemA55.forEach((item, stores) -> mergedStores.merge(item, stores, (list1, list2) -> {
			List<Store> mergedList = new ArrayList<>(list1);
			mergedList.addAll(list2);
			return mergedList;
		}));

		for (Map.Entry<Item, List<Store>> entry : mergedStores.entrySet()) {
			Item item = entry.getKey();
			List<Store> stores = entry.getValue();

			for (Store store : stores) {
				if (store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
					Integer refStoreId = refStores.get(store.getId());
					if (refStoreId != null) {
						List<Store> refStore = mergedStores.get(item);
						BigDecimal refStorePotential = refStore.stream().filter(s -> s.getId().equals(refStoreId))
								.map(Store::getPotential).findFirst().orElse(BigDecimal.ZERO);
						refStorePotential = refStorePotential.setScale(1, RoundingMode.HALF_UP);
						store.setPotential(refStorePotential);
					} else {
						store.setPotential(calculateAveragePotential(stores));
					}
				}

			}
			System.out.println("\nItem: " + item);
			stores.forEach(store -> {

				System.out.println(store.getId() + ", " + store.getPotential());
			});
		}

		System.out.println("-----------------------------------------");

		System.out.println("Step 3: Calculate Store Demand of current Item");
		List<Store> allStores77 = new ArrayList<>();
		Map<Item, List<Store>> storesMap77 = mockStoresOfRefItemA77();

		for (List<Store> stores : storesMap77.values()) {
			allStores77.addAll(stores);
		}
		List<Store> allStores55 = new ArrayList<>();
		Map<Item, List<Store>> storesMap55 = mockStoresOfRefItemA77();

		for (List<Store> stores : storesMap55.values()) {
			allStores55.addAll(stores);
		}

		List<Store> demandStore = new ArrayList<>();

		for (int i = 0; i < allStores77.size(); i++) {
			BigDecimal storePotential77 = allStores77.get(i).getPotential();
			BigDecimal storePotential55 = allStores55.get(i).getPotential();

			Map<Integer, BigDecimal> refWeights = mockRefWeights();
			BigDecimal weight77 = refWeights.get(77);
			BigDecimal weight55 = refWeights.get(55);

			BigDecimal sum = storePotential77.multiply(weight77).add(storePotential55.multiply(weight55));
			BigDecimal average = sum.divide(bd(4));
			average = average.multiply(DataModel.mockStoreTrends().get(i + 1));
			average = average.setScale(1, RoundingMode.HALF_UP);

			Store store = (Store) allStores77.get(i);
			store.setPotential(average);
			demandStore.add(store);
		}
		System.out.println(demandStore);

		System.out.println("-----------------------------------------");
		Map<Integer, BigDecimal> totalPotentialByWhId = calculateTotalPotentialByWhId(demandStore);
		NumberUtils.print("4.Sum up Demand to WH Level\n ", totalPotentialByWhId);

		System.out.println("-----------------------------------------");
		Map<Integer, BigDecimal> percentagesByWhId = calculatePercentagesByWhId(totalPotentialByWhId);

		NumberUtils.print("Calculate Shares \n", percentagesByWhId);

		System.out.println("-----------------------------------------");
		Map<Integer, BigDecimal> allocateByShares = allocateByShares(percentagesByWhId, DataModel.planningAmount);
		NumberUtils.print("Allocate by Shares \n", allocateByShares);
		
		System.out.println("-----------------------------------------");
	}

	private static Map<Integer, BigDecimal> calculateTotalPotentialByWhId(List<Store> demandStore) {
		Map<Integer, BigDecimal> totalPotentialByWhId = new HashMap<>();

		for (Store store : demandStore) {
			Integer whId = store.getWhId();
			BigDecimal storePotential = store.getPotential();
			BigDecimal currentTotal = totalPotentialByWhId.getOrDefault(whId, BigDecimal.ZERO);
			BigDecimal newTotal = currentTotal.add(storePotential);

			totalPotentialByWhId.put(whId, newTotal);
		}
		return totalPotentialByWhId;
	}

	private static Map<Integer, BigDecimal> calculatePercentagesByWhId(Map<Integer, BigDecimal> totalPotentialByWhId) {
		Map<Integer, BigDecimal> percentagesByWhId = new HashMap<>();
		BigDecimal totalSum = BigDecimal.ZERO;

		for (BigDecimal value : totalPotentialByWhId.values()) {
			totalSum = totalSum.add(value);
		}

		for (Map.Entry<Integer, BigDecimal> entry : totalPotentialByWhId.entrySet()) {
			Integer whId = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal percentage = value.divide(totalSum, 4, RoundingMode.HALF_UP).multiply(BigDecimal.valueOf(100.0));
			percentagesByWhId.put(whId, percentage);
		}
		return percentagesByWhId;
	}

	private static Map<Integer, BigDecimal> allocateByShares(Map<Integer, BigDecimal> percentagesByWhId,
			int planningAmount) {
		return percentagesByWhId.entrySet().stream()
				.collect(Collectors.toMap(Map.Entry::getKey,
						entry -> entry.getValue().multiply(BigDecimal.valueOf(planningAmount))
								.divide(BigDecimal.valueOf(100), 2, RoundingMode.HALF_UP)
								.setScale(2, RoundingMode.HALF_UP)));
	}
	
	private static Map<Integer, BigDecimal> applyMinimum(List<Store> stores, Map<Integer, BigDecimal> allocations) {
	    Map<Integer, BigDecimal> warehouseSums = stores.stream()
	            .collect(Collectors.groupingBy(Store::getWhId,
	                    Collectors.mapping(store -> allocations.getOrDefault(store.getWhId(), BigDecimal.ZERO),
	                            Collectors.reducing(BigDecimal.ZERO, BigDecimal::add))));

	    for (Map.Entry<Integer, BigDecimal> entry : warehouseSums.entrySet()) {
	        Integer whId = entry.getKey();
	        BigDecimal sum = entry.getValue();
	        BigDecimal difference = BigDecimal.valueOf(2).subtract(sum.max(BigDecimal.ZERO));
	        allocations.put(whId, allocations.getOrDefault(whId, BigDecimal.ZERO).add(difference));
	    }

	    return allocations;
	}

	// ---------------------------------------------------------------------

	public static BigDecimal calculateAveragePotential(List<Store> stores) {
		BigDecimal totalPotential = BigDecimal.ZERO;
		int nonZeroPotentialCount = 0;

		for (Store store : stores) {
			BigDecimal potential = store.getPotential();
			if (potential.compareTo(BigDecimal.ZERO) != 0) {
				totalPotential = totalPotential.add(potential);
				nonZeroPotentialCount++;
			}
		}

		if (nonZeroPotentialCount == 0) {
			return BigDecimal.ZERO;
		}

		BigDecimal averagePotential = totalPotential.divide(BigDecimal.valueOf(nonZeroPotentialCount), 1,
				RoundingMode.HALF_UP);
		return averagePotential;
	}

}
