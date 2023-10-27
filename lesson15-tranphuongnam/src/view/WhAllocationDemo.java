package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import model.DataModel;

import static utils.NumberUtils.*;

public class WhAllocationDemo {

	public static void main(String[] args) {

		// Data
		Map<Item, List<Store>> itemA55 = DataModel.mockStoresOfRefItemA55();
		Map<Item, List<Store>> itemA77 = DataModel.mockStoresOfRefItemA77();
		Map<Integer, Integer> refStores = DataModel.mockRefStores();
		Map<Integer, BigDecimal> trendStores = DataModel.mockStoreTrends();
		Map<Integer, BigDecimal> weightItems = DataModel.mockRefWeights();
		
		// Step 1: Check for planning amount
		System.out.println("STEP 1");
		if (!step1(88, 50)) {
			System.out.println("Can not calculate");
			System.exit(0);
		}
		System.out.println("CAN CONTINUE");
		// Step 2:	Filling gaps by references or average
		System.out.println("STEP 2");
		Map<Store, BigDecimal> mapStep2A55 = step2(itemA55, refStores);
		Map<Store, BigDecimal> mapStep2A77 = step2(itemA77, refStores);
		
		
		mapStep2A77.entrySet().forEach(entry -> System.out.println(entry));
		
		// Step 3: 
		System.out.println("STEP 3");
		var mapDemand = step33(trendStores, weightItems, mapStep2A55, mapStep2A77);
		mapDemand.entrySet().forEach(entry -> System.out.println(entry));
		
		// Step 4:
		System.out.println("STEP 4");
		
		
	}

	public static boolean step1(Integer planningAmount, Integer requiredMinPlanningAmount) {
		if (planningAmount > requiredMinPlanningAmount)
			return true;
		return false;
	}

	public static Map<Store, BigDecimal> step2(Map<Item, List<Store>> item, Map<Integer, Integer> refStores) {
		Map<Store, BigDecimal> mapStorePotential = new LinkedHashMap<>();
		
		for(var entry : item.entrySet()) {
			for(Store store : entry.getValue()) {
				
				// avarageValue
				var count = entry.getValue()
						.stream()
						.filter(subStore -> subStore.getPotential().compareTo(BigDecimal.ZERO) != 0)
						.map(storeMap -> storeMap.getPotential())
						.count();
				var avaragePotentialValue = entry.getValue()
													.stream()
													.filter(subStore -> subStore.getPotential().compareTo(BigDecimal.ZERO) != 0)
													.map(storeMap -> storeMap.getPotential())
													.reduce(bd(0), (a,b) -> a.add(b));
				
				avaragePotentialValue = avaragePotentialValue.divide(bd(count), 1, RoundingMode.HALF_UP);
				if(store.getPotential().compareTo(BigDecimal.ZERO) != 0) { // potential != 0
					mapStorePotential.put(store, store.getPotential().setScale(1,RoundingMode.HALF_UP));
				} else { // Find refStore by Id
					for(var subEntry : refStores.entrySet()) {
						if(store.getId().equals(subEntry.getKey())) { // Ok có 10 -> 10, 1
							var listStore = entry.getValue().stream() 
															.filter(tempStore -> tempStore.getId().equals(subEntry.getValue()) && tempStore.getPotential().compareTo(BigDecimal.ZERO) != 0)															.collect(Collectors.toList());
							if(listStore.get(0).getPotential().compareTo(BigDecimal.ZERO) != 0) {
								mapStorePotential.put(store, listStore.get(0).getPotential().setScale(1, RoundingMode.HALF_UP));
							} else {
								mapStorePotential.put(store, avaragePotentialValue);
							}
						} else {
							mapStorePotential.put(store, avaragePotentialValue);
						}
					}
				}
			}
		}
		
		return mapStorePotential;
	}
	
	public static Map<Store, BigDecimal> step33(Map<Integer, BigDecimal> trendStores, Map<Integer, BigDecimal> weightItems, Map<Store, BigDecimal> mapStep2A55, Map<Store, BigDecimal> mapStep2A77 ) {
		Map<Store, BigDecimal> mapStorePotential = new LinkedHashMap<>();
		
		List<Integer> itemId =  weightItems.entrySet().stream()
												.map(entry -> entry.getKey())
												.collect(Collectors.toList());
		
		List<BigDecimal> storeTrendList = trendStores.entrySet().stream()
											.map(e -> bd(e.getKey()))
											.collect(Collectors.toList());
		
		BigDecimal totalWeight = weightItems.entrySet().stream()
												.map(entry -> entry.getValue())
												.reduce(bd(0), (a,b) -> a.add(b));
		
			
			for(var entry : mapStep2A55.entrySet()) {
				boolean isContain = storeTrendList.contains(entry.getKey().getId());
				
				BigDecimal temp = null;
				if(isContain) {
					temp = trendStores.get(entry.getKey().getId());
				} else {
					temp = bd(1);
				}
				
				BigDecimal refA55 = mapStep2A55.entrySet().stream().filter(en -> en.getKey().equals(entry.getKey()))	
																							.map(store -> store.getValue())
																							.reduce(bd(0), (a,b) -> a.add(b));
				
				BigDecimal refA77 = mapStep2A77.entrySet().stream().filter(en -> en.getKey().equals(entry.getKey()))	
																		.map(store -> store.getValue())
																		.reduce(bd(0), (a,b) -> a.add(b));
				
				
				BigDecimal trendVal = trendStores.get(entry.getKey().getId());
				if(trendVal == null){
					trendVal = bd(1);
				}
				
				
				
				
				
				BigDecimal demand = bd((refA55.doubleValue() * weightItems.get(itemId.get(0)).doubleValue()
						+ refA77.doubleValue() * weightItems.get(itemId.get(1)).doubleValue())
						/ (totalWeight.doubleValue() * trendVal.doubleValue())).setScale(1, RoundingMode.HALF_UP);
						
				
				mapStorePotential.put(entry.getKey(), demand);
			}
			
		
		return mapStorePotential;
	}





}