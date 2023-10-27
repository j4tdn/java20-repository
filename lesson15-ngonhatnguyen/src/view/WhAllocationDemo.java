package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import static utils.NumberUtils.*;
import static utils.CollectionUtils.*;

import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {
	
	public static void main(String[] args) {
		var refItem55 = DataModel.mockStoresOfRefItemA55();
		var refItem77 = DataModel.mockStoresOfRefItemA77();
		
		if (!checkForPlanningAmount(DataModel.planningAmount)) {
			System.out.println("Planning amount <= requiredMinPlanningAmount --> Stop Calculation");
		} else {
			var pItem55 = fillingGapsByRefOrAvg(refItem55);
			var pItem77 = fillingGapsByRefOrAvg(refItem77);
			generate("Potentials of Reference Item 55", pItem55);
			generate("Potentials of Reference Item 77", pItem77);
			
			System.out.println("\n==========================\n");
			
			generate("Demand of current item", calStoreDemandOfCurrentItem(pItem55, pItem77));
		}
		
	}
	
	// step 1
	private static boolean checkForPlanningAmount(Integer planningAmount) {
		if (planningAmount <= DataModel.requiredMinPlanningAmount) {
			return false;
		}
		return true;
	}
	
	// step 2
	private static double calAveragePotentialWithOwnStore(List<Store> stores) {
		double result = 0;
		int count = 0;
		for (var store : stores) {
			if (store.getPotential() != null && store.getPotential().compareTo(BigDecimal.ZERO) != 0) {
				result += Double.parseDouble(store.getPotential().toString());
				count++;
			}
		}
		return result / count;
	}
	
	private static Map<Integer, List<Entry<Integer, BigDecimal>>> fillingGapsByRefOrAvg(Map<Item, List<Store>> refItems) {
		var refStores = DataModel.mockRefStores();
		var entryList = new ArrayList<>(refItems.entrySet());
		
		
		List<Store> listStore = entryList.get(0).getValue();
		boolean haveAnyGaps = listStore.stream()
					.anyMatch(st -> (st.getPotential() == null || st.getPotential().compareTo(BigDecimal.ZERO) == 0));
		
		//for (var entry: entryList) {
		if (haveAnyGaps) {
			double avg = calAveragePotentialWithOwnStore(listStore);
			for (var store:listStore) {
				boolean isNullPotential = (store.getPotential() == null || store.getPotential().compareTo(BigDecimal.ZERO) == 0) ? true : false;
				
				if (isNullPotential) {
					var potentials = listStore.stream()
							.filter(st -> st.getId() == refStores.get(store.getId()))
							.distinct()
							.collect(Collectors.toList());
					
					if (refStores.containsKey(store.getId()) && (potentials.get(0).getPotential() != null && potentials.get(0).getPotential().compareTo(BigDecimal.ZERO)!=0)) {
						store.setPotential(potentials.get(0).getPotential());
					} else {
						store.setPotential(bd(avg));
					}
				}
			}
		}
		var potentialMap = new LinkedHashMap<Integer, BigDecimal>();
		for (var store: listStore) { 
			potentialMap.put(store.getId(), store.getPotential()); 
		}
		
		var filledMap = new LinkedHashMap<Integer, List<Entry<Integer, BigDecimal>>>();
			filledMap.put(entryList.get(0).getKey().getId(), potentialMap.entrySet().stream().collect(Collectors.toList()));
		return filledMap;
	}
	
	// step 3 Calculate Store Demand of current Item
	private static Map<Integer, BigDecimal> calStoreDemandOfCurrentItem(Map<Integer, List<Entry<Integer, BigDecimal>>>... refItems) {
		var refWeights = DataModel.mockRefWeights();
		var trends = DataModel.mockStoreTrends();
		
		List<List<Entry<Integer, BigDecimal>>> listValues = new ArrayList<>();
		double weight[] = new double[refWeights.size()];
		int count = 0;
		double sumWeight = 0;
		
		for (var refItem : refItems) {
			var entryList = new ArrayList<>(refItem.entrySet());
			
			listValues.add(entryList.get(0).getValue());
			
			if (refWeights.containsKey(entryList.get(0).getKey())) {
				weight[count] = Double.parseDouble(refWeights.get(entryList.get(0).getKey()).toString());
				sumWeight += weight[count++];
			}
		}
		
		List<Integer> listStoreIds = new ArrayList<>();		
		for (var list : listValues.get(0)) {
			listStoreIds.add(list.getKey());
		}
		
		double[] demand = new double[listValues.get(0).size()];
		count = 0;
		var demandMap = new LinkedHashMap<Integer, BigDecimal>();
		
		for (int i = 0; i < listStoreIds.size(); i++) {
			for (int j = 0; j < listValues.size(); j++) {
				var list = listValues.get(j);
				if (list.get(i).getKey() == listStoreIds.get(i)) {
					demand[count] += Double.parseDouble(list.get(i).getValue().toString()) * weight[j];
					continue;
				}
			}
			double trend = 1;
			if (trends.containsKey(listStoreIds.get(i))) {
				trend = Double.parseDouble(trends.get(listStoreIds.get(i)).toString());
			}
			
			demand[count] = (demand[count] / sumWeight) * trend;
			demandMap.put(listStoreIds.get(i), bd(demand[count++]).setScale(1, RoundingMode.HALF_UP));
		}
		return demandMap;
	}
	 
}
