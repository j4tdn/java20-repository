package view;

import static model.DataModel.*;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import utils.Utils;

import static utils.NumberUtils.*;

public class WhAllocationDemo {
	private static List<Store> stores = convertMapToList(mockStoresOfRefItemA77());

	public static void main(String[] args) {
		
		Map<Item, List<Store>> storeA77 = mockStoresOfRefItemA77();
		var ListstoreA77 = convertMapToList(storeA77);
		
		
		//step 1:
		
		if(checkPlanningAmount(planningAmount, requiredMinPlanningAmount)) {
			System.out.println("continue step 2");
		}else {
			System.out.println("require: min planning amount is not > planning amount!!!");
		}
		
		//step 2: 
		fillingGaps(ListstoreA77);
		System.out.println("Step 2:Filling gaps by references or average ");
		System.out.println(storeA77);

		//step 3:
		System.out.println("\nStep 3: Calculate Store Demand of current Item\n");
		var ItemA1 = stores();
		System.out.println(ItemA1);
		
		//step 4: 
		var demandTotalWh = demandWh(ItemA1);
		Utils.generate("Step 4: Sum of Demand WH Level", demandTotalWh);
		
		//step 5:
		var calShares = caculatorShares(demandTotalWh);
		Utils.generate("Step 5: Caculator Share ", calShares);
		
		//step 6:
		var allowcatedShare = allowcatedShares(calShares);
		Utils.generate("Step 6: Allowcated Share ", allowcatedShare);
		
		//step 7:
		var applyMinimum = applyMinimum(allowcatedShare, stores);
		Utils.generate("Step 7: apply Minimum ", applyMinimum);
		
		//step 8:
		var recalculateShare = RecaculatorShare(applyMinimum);
		Utils.generate("Step 8: Recalculate Share ", recalculateShare);
		
		//step 9:
		var reallocate = Reallocate(recalculateShare);
		Utils.generate("Step 9: Real Locate  ", reallocate);
		
		//step10:
		var roudUp = RoudUp(reallocate);
		Utils.generate("Step 10: Roud Up  ", roudUp);
	}
	private static Map<Integer, BigDecimal> RoudUp(Map<Integer, BigDecimal> reallocate){
		Map<Integer, BigDecimal> roudUp = new HashMap<>();
		for (Map.Entry<Integer, BigDecimal> entry : reallocate.entrySet()) {
			Integer key = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal roundedValue = value.setScale(0, RoundingMode.CEILING);
			roudUp.put(key, roundedValue);
		}
		return roudUp;
	}
	
	private static Map<Integer, BigDecimal> Reallocate(Map<Integer, BigDecimal> recalculateShare){
		Map<Integer, BigDecimal> reallocate = new HashMap<>();
		int count = 0;
		for (Map.Entry<Integer, BigDecimal> entry : recalculateShare.entrySet()) {
			BigDecimal value = entry.getValue();
			if (value.compareTo(bd(0)) != 0) {
				count++;
			}
		}
		for (Map.Entry<Integer, BigDecimal> entry : recalculateShare.entrySet()) {
			Integer key = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal newValue = value.multiply(BigDecimal.valueOf(planningAmount - count ))
										.divide(new BigDecimal("100"));
			reallocate.put(key, newValue);
		}
		return reallocate;
	}
	
	private static Map<Integer, BigDecimal> RecaculatorShare(Map<Integer, BigDecimal> applyMinimum){
		Map<Integer, BigDecimal> recalculateShare = new HashMap<>();
		BigDecimal sum = BigDecimal.ZERO;
		for (BigDecimal value : applyMinimum.values()) {
			if(value.compareTo(bd(0)) != 0) {
				sum = sum.add(value);
			}
		}
		for (var entry : applyMinimum.entrySet()) {
			Integer whId = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal percentage = value.multiply(new BigDecimal("100.0").divide(sum, 3, RoundingMode.HALF_UP));
			recalculateShare.put(whId, percentage);
		}
		return recalculateShare;
	}
	
	private static Map<Integer, BigDecimal> applyMinimum(Map<Integer, BigDecimal> allowcatedShares, 
			List<Store> stores){
		Integer totalWarehouseId = 0;
		 for (Store store : stores) {
	            totalWarehouseId = store.getWhId() + 1;
	        }
		Map<Integer, BigDecimal> applyMinimum = new HashMap<>();
		for(var entry : allowcatedShares.entrySet()) {
			Integer	key = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal newValue;
			var AmountOf = minPerStore * totalWarehouseId;
			if(value.compareTo(bd(AmountOf)) >0) {
				newValue = value;
			}else {
				newValue = bd(AmountOf);
			}
			applyMinimum.put(key, newValue);
		}
		return applyMinimum;
	}
	
	private static Map<Integer, BigDecimal> allowcatedShares(Map<Integer, BigDecimal> demandWh){
		Map<Integer, BigDecimal> allowcatedShares = new HashMap<>();
		for(var entry : demandWh.entrySet()) {
			Integer key = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal newValue = value.multiply(new BigDecimal(planningAmount))
										.divide(new BigDecimal(100));
			allowcatedShares.put(key, newValue);
		}
		return allowcatedShares;
	}
	
	
	private static Map<Integer, BigDecimal> caculatorShares(Map<Integer, BigDecimal> demandWh){
		Map<Integer, BigDecimal> sharestagesByWhId = new HashMap<>();
		BigDecimal totalSum = BigDecimal.ZERO;
		for (BigDecimal value : demandWh.values()) {
			totalSum = totalSum.add(value);
		}
		for (var entry : demandWh.entrySet()) {
			Integer whId = entry.getKey();
			BigDecimal value = entry.getValue();
			BigDecimal percentage = value.multiply(new BigDecimal("100"))
										.divide(totalSum, 4, RoundingMode.HALF_UP);
			sharestagesByWhId.put(whId, percentage);
		}
		return sharestagesByWhId;
	}
	private static Map<Integer, BigDecimal> demandWh(List<Store> stores){
		var totalPotentialByWhId = new HashMap<Integer, BigDecimal>();
		for (Store store : stores) {
			Integer whId = store.getWhId();
			BigDecimal storePotential = store.getPotential();
			BigDecimal currentTotal = totalPotentialByWhId.getOrDefault(whId, BigDecimal.ZERO);
			BigDecimal newTotal = currentTotal.add(storePotential);
			totalPotentialByWhId.put(whId, newTotal);
		}
		return totalPotentialByWhId;
	}
	
	private static List<Store> stores(){
		var ListstoreA55 = convertMapToList(mockStoresOfRefItemA55());
		var ListstoreA77 = convertMapToList(mockStoresOfRefItemA77());
		List<Store> result = new ArrayList<>();
		for (int i = 0; i < ListstoreA55.size(); i++) {
			BigDecimal storePotential55 = ListstoreA55.get(i).getPotential();	
			BigDecimal storePotential77 = ListstoreA77.get(i).getPotential();		
			BigDecimal sum = storePotential77.multiply(bd(1.5)).add(storePotential55.multiply(bd(2.5)));
			BigDecimal divide = sum.divide(bd(4));
			BigDecimal average = divide.multiply(mockStoreTrendFactors().get(i + 1));
			average = average.setScale(1, RoundingMode.HALF_UP);
			Store store = ListstoreA77.get(i);
			store.setPotential(average);
			
			result.add(store);
		}
		return result;
	}
	
	private static void fillingGaps(List<Store> stores) {
		for(Store store:stores) {
			if(store.getPotential().compareTo(BigDecimal.ZERO) == 0 || store.getPotential() == null) {
				Integer refStoreId = mockRefStores().get(store.getId());
				if (refStoreId != null) {
					BigDecimal refStorePotential = stores
							.stream()
							.filter(s -> s.getId().equals(refStoreId))
							.map(Store::getPotential)
							.findFirst()
							.orElse(BigDecimal.ZERO);
					refStorePotential = refStorePotential.setScale(1, RoundingMode.HALF_UP);
					store.setPotential(refStorePotential);
			}else {
				store.setPotential(caculatorAverage());
			}
	
		}	
	}
}
	
	public static List<Store> nonZeroPotentialStores() {
		return stores.stream()
				.filter(store -> store.getPotential().compareTo(BigDecimal.ZERO) != 0)
				.collect(Collectors.toList());
	}
	
	public static BigDecimal caculatorAverage() {
		BigDecimal totalPotential = stores.stream()
								.map(Store::getPotential)
								.reduce(BigDecimal.ZERO, BigDecimal::add);
		BigDecimal averagePotential = totalPotential
				.divide(BigDecimal.valueOf(nonZeroPotentialStores().size()), 1, RoundingMode.HALF_UP);
		return averagePotential;
	}

	
	public static List<Store> convertMapToList(Map<Item, List<Store>> itemStoreMap) {
        List<Store> allStores = new ArrayList<>();
        for (List<Store> stores : itemStoreMap.values()) {
            allStores.addAll(stores);
        } 
        return allStores;
    }
	private static boolean checkPlanningAmount(Integer planningAmout, Integer minPlanningAmout) {
		if(planningAmout < minPlanningAmout) {
			return false;
		}
		return true;
	}
}
