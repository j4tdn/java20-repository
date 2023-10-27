package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import model.DataModel;
import utils.NumberUtils;

public class WhAllocationDemo {

	public static void main(String[] args) {
		var planningAmount = DataModel.planningAmount;
		var requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;
		//var storesOfRefItemA55 = DataModel.mockStoresOfRefItemA55();
		var storesOfRefItemA77 = DataModel.mockStoresOfRefItemA77();
		
		if(!checkForPlanningAmount(requiredMinPlanningAmount, planningAmount)) {
			System.out.println("Error!!!");
		}else {
			fillingGapsByReferencesOrAverage(storesOfRefItemA77);
			generateStrings("fillingGapsByReferencesOrAverage", fillingGapsByReferencesOrAverage(storesOfRefItemA77));
		}

	}

	// Step 2: Filling gaps by references or average
	private static Map<Integer, List<Entry<Integer, BigDecimal>>> fillingGapsByReferencesOrAverage(
			Map<Item, List<Store>> stores) {

		var storeRef = DataModel.mockRefStores();
		var entry = new ArrayList<>(stores.entrySet());
		var list = entry.get(0).getValue();

		if (list.stream().anyMatch(s -> (s.getPotential().compareTo(BigDecimal.ZERO) == 0))) {
			//tính avg
			double result = 0;
			int count = 0;
			for (var store : list) {
				if (store.getPotential().compareTo(BigDecimal.ZERO) != 0) {
					result += Double.parseDouble(store.getPotential().toString());
					count++;
				}
			}
			double avg = result / count;
			for (var store : list) {
				if (store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
					var potentials = list.stream().filter(st -> st.getId() == storeRef.get(store.getId())).distinct()
							.collect(Collectors.toList());

					if (storeRef.containsKey(store.getId()) && (potentials.get(0).getPotential().compareTo(BigDecimal.ZERO) != 0)) {
						store.setPotential(potentials.get(0).getPotential());
					} else {
						store.setPotential(NumberUtils.bd(avg));
					}
				}
			}
		}
		var potentials = new LinkedHashMap<Integer, BigDecimal>();
		for (var store : list) {
			potentials.put(store.getId(), store.getPotential());
		}
		
		var result = new LinkedHashMap<Integer, List<Entry<Integer, BigDecimal>>>();
		result.put(entry.get(0).getKey().getId(), potentials.entrySet().stream().collect(Collectors.toList()));
		return result;
	}

	// Step 1: Check for planning amount
	private static boolean checkForPlanningAmount(int requiredMinPlanningAmount, int planningAmount) {
		if (planningAmount <= requiredMinPlanningAmount) {
			return false;
		}
		return true;
	}

	public static <K, V> void generateStrings(String prefix, Map<K, V> elements) {
		System.out.println(prefix + " --> {");
		List<Entry<K, V>> modelList = new ArrayList<>(elements.entrySet());
		for (var e : modelList) {
			System.out.println(e.getKey() + ".  " + e.getValue());
		}
		System.out.println("}\n");
	}
}
