package view;

import bean.Item;
import bean.Store;
import model.DataModel;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.*;

import static model.DataModel.*;

public class WhAllocationDemo {
	public static void main(String[] args) {
		System.out.println("<---- Step 1 ---->");
		if(checkPlanningAmt())
			System.out.println("Continue.");
		else
			System.out.println("Program stopped, amount of items is insufficient.");

		System.out.println("<---- Step 2 ---->");

		fillPotentialGaps(mockStoresOfRefItemA77());

		System.out.println("<---- Step 3 ---->");

		Item tempItem = mockStoresOfRefItemA55().keySet().iterator().next();
		List<Store> storeList = mockStoresOfRefItemA55().get(tempItem);

		List<Map<Item, List<Store>>> listOfMaps= new ArrayList<>();
		listOfMaps.add(mockStoresOfRefItemA55());
		listOfMaps.add(mockStoresOfRefItemA77());

		calculateStoreDemand(listOfMaps, storeList);
	}

	// Step 1:
	public static boolean checkPlanningAmt(){
		return DataModel.planningAmount > DataModel.requiredMinPlanningAmount;
	}

	// Step 2:
	public static void fillPotentialGaps(Map<Item, List<Store>> mockStore){
		Map<Integer, Integer> map2 = mockRefStores();
		List<Store> changedStores = new ArrayList<>();

		// Get the first (and only) key in the map
		// Print test.
		Item tempItem = mockStore.keySet().iterator().next();
		System.out.println("Before change");
		System.out.println("Current Item: " + tempItem);
		for(Store store : mockStore.get(tempItem)){
			store.setPotential(store.getPotential().setScale(1, RoundingMode.HALF_EVEN));
			System.out.println("Store: " + store.getId() + "     ," + "Potential: " + store.getPotential());
		}

		// Make a reference list for stores
		Map<Integer, Store> map3 = new HashMap<>();
		for(Map.Entry entry : map2.entrySet()){
			Optional result2 = mockStore.get(tempItem).stream()
					.filter(store -> store.getId().equals((Integer)entry.getValue()))
					.findFirst();

			Store store2 = (Store) result2.get();
			map3.put((Integer) entry.getKey(), store2);
		}


		for(Store tempStore : mockStore.get(tempItem)){
			int countstore = mockStore.get(tempItem).size();


			// Check if a store have zero potential or the potential doesn't exist.
			if(tempStore.getPotential() == null || tempStore.getPotential().compareTo(BigDecimal.ZERO) == 0){
				changedStores.add(tempStore);
				// Reduce the number of stores to calculate the average.
				countstore--;
				// Check if the store has reference store
				Integer tempStoreId = tempStore.getId();
				if(map3.containsKey(tempStoreId) && map3.get(tempStoreId).getPotential().compareTo(BigDecimal.ZERO) != 0){
					tempStore.setPotential(map3.get(tempStoreId).getPotential());
				} else {
					Optional<BigDecimal> tempSum = mockStore.get(tempItem).stream()
							.filter(id -> !map3.containsKey(id))
							.filter(store -> !changedStores.contains(store))
							.map(Store::getPotential)
							.reduce(BigDecimal::add);

					BigDecimal total = new BigDecimal("0");
					if(tempSum.isPresent()){
						total = tempSum.get();
					}

					BigDecimal average = total.divide(BigDecimal.valueOf(--countstore), 1, RoundingMode.HALF_EVEN);
					tempStore.setPotential(average);
				}
			}
		}
		System.out.println("After change: ");
		System.out.println("Current Item: " + tempItem);
		for(Store store : mockStore.get(tempItem)){
			System.out.println("Store: " + store.getId() + "     ," + "Potential: " + store.getPotential());
		}
	}

	// Step 3:
	public static void calculateStoreDemand(List<Map<Item, List<Store>>> listOfMaps,List<Store> storelist){
		Map<Integer, BigDecimal> trends = mockStoreTrends();
		Map<Integer, BigDecimal> weights = mockRefWeights();
		Map<Integer, BigDecimal> DemandList = new HashMap<>();
		Map<Integer, List<Item>> StoreItemList = new HashMap<>();

		// Calculate the total weight as the major divisor.
		BigDecimal totalWeightDivisor = BigDecimal.valueOf(0);
		for(Map<Item, List<Store>> map : listOfMaps){
			Item tempItem = map.keySet().iterator().next();
			totalWeightDivisor = totalWeightDivisor.add(weights.get(tempItem.getId()));
		}

		BigDecimal totalDividend;

			BigDecimal demand;
			int i = 1;
			while (i <= storelist.size()) {
				demand = BigDecimal.valueOf(0);
				totalDividend = BigDecimal.valueOf(0);
				for(Map<Item, List<Store>> map : listOfMaps) {
					Item tempItem = map.keySet().iterator().next();
					for (Store store : map.get(tempItem)) {
						if (store.getId() == i)
							totalDividend = totalDividend.add(store.getPotential()
									.multiply(weights.get(tempItem.getId())));
					}
				}
				if (trends.containsKey(i)) {
					demand = (demand.add(totalDividend));
					demand = demand.divide(totalWeightDivisor).multiply(trends.get(i));
				} else {
					demand = demand.add(totalDividend);
					demand = demand.divide(totalWeightDivisor);
				}
				DemandList.put(i, demand);
				i++;
			}

			for(Map.Entry<Integer, BigDecimal> entry : DemandList.entrySet()){
				System.out.println("Store " + entry.getKey() +
						"        Demand new campaign: " + entry.getValue().setScale(1, RoundingMode.HALF_EVEN));
			}
		}
}