package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {

	public static void main(String[] args) {

		Integer planningAmountCountry = DataModel.planningAmount;
		Integer minPerStore = DataModel.minPerStore;
		Integer requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;

		Map<Item, List<Store>> refItemA55 = DataModel.mockStoresOfRefItemA55();
		Map<Item, List<Store>> refItemA77 = DataModel.mockStoresOfRefItemA77();
		Map<Integer, Integer> refStores = DataModel.mockRefStores();
		Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();
		Map<Integer, BigDecimal> trenFactors = DataModel.mockTrendFactors();

		 System.out.println("Step 1: ");
		 checkPlanningAmount(planningAmountCountry, requiredMinPlanningAmount);

		System.out.println("Step 2: ");
		Map<Store, BigDecimal> res = fillingForRefItem(refItemA77, refStores);
		for (var entry:res.entrySet()) {
			System.out.println("store " + entry.getKey().getId() + ": " + entry.getValue());
		}
		
		
	}

//	public static Map<Store, BigDecimal> calDemand(Map<Item, List<Store>> refItemA55, Map<Item, List<Store>> refItemA77,
//			Map<Integer, BigDecimal> trenFactors, Map<Integer, BigDecimal> refWeights) {
//		Map<Store, BigDecimal> res = new HashMap<>();
//		
//		Iterator<List<Store>> a55 = refItemA55.
//		
//		
//		return res;
//	}

	public static void checkPlanningAmount(Integer planningAmountCountry, Integer requiredMinPlanningAmount) {
		if (planningAmountCountry <= requiredMinPlanningAmount) {
			System.out.println("Stop calculation!");
			System.exit(0);
		} else {
			System.out.println("Continue with step 2");
		}
	}

	public static Map<Store, BigDecimal> fillingForRefItem(Map<Item, List<Store>> refItem,
			Map<Integer, Integer> refStores) {
		Map<Store, BigDecimal> res = new HashMap<>();
		BigDecimal avgPotential = calAvgPotential(refItem);
		for (Item item : refItem.keySet()) {
			List<Store> stores = refItem.get(item);

			for (Store store : stores) {
				if (store.getPotential().compareTo(BigDecimal.ZERO) != 0) {
					res.put(store, store.getPotential().setScale(1, RoundingMode.HALF_UP));
				} else {
					for (var entry : refStores.entrySet()) {
						if (store.getId().equals(entry.getKey())) {
							Integer refId = entry.getValue();
							Store refStore = findStoreById(refItem, refId);

							if (refStore.getPotential().compareTo(BigDecimal.ZERO) != 0) {
								store.setPotential(refStore.getPotential());
							} else {
								store.setPotential(calAvgPotential(refItem));
							}
							res.put(store, store.getPotential());
						} else {
							res.put(store, avgPotential);
						}
					}
				}
			}
		}
		return res;
	}

	public static Store findStoreById(Map<Item, List<Store>> refItem, Integer storeId) {
		for (List<Store> stores : refItem.values()) {
			for (Store store : stores) {
				if (store.getId().equals(storeId)) {
					return store;
				}
			}
		}
		return null;
	}

	public static BigDecimal calAvgPotential(Map<Item, List<Store>> refItem) {
		List<Store> stores = refItem.values().stream().flatMap(List::stream)
				.filter(store -> store.getPotential() != null && store.getPotential().compareTo(BigDecimal.ZERO) > 0)
				.collect(Collectors.toList());

		double sum = stores.stream().mapToDouble(store -> store.getPotential().doubleValue()).sum();
		int count = stores.size();
		return BigDecimal.valueOf(sum / count).setScale(1, RoundingMode.HALF_UP);
	}

}
