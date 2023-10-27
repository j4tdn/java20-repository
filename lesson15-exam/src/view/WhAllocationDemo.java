package view;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import static utils.NumberUtils.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import bean.Item;
import bean.Store;
import model.DataModel;
public class WhAllocationDemo {
	
	public static int getRefStoreForStore(int storeId, Map<Integer, Integer> refStoresMap) {
	    Integer refStore = refStoresMap.get(storeId);

	    if (refStore != null) {
	        return refStore;
	    } else {
	        return -1; 
	    }
	}
	
	public static BigDecimal calculateAverageNonZeroBD(List<Store> stores) {
	    BigDecimal sum = BigDecimal.ZERO;
	    int count = 0;

	    for (Store store : stores) {
	        BigDecimal x = store.getPotential();
	        if (x.compareTo(BigDecimal.ZERO) != 0) { 
	            sum = sum.add(x);
	            count++;
	        }
	    }

	    if (count == 0) {
	        return BigDecimal.ZERO;
	    }

	    return sum.divide(BigDecimal.valueOf(count), 1, RoundingMode.HALF_UP);
	}
	public static void potentialRef(Map<Item, List<Store>> Mapxx) {
		
		Item firstItem = Mapxx.keySet().iterator().next();
		List<Store> stores = Mapxx.get(firstItem);
		
		Map<Integer, Integer> ref = DataModel.mockRefStores();
		
		for (Store store: stores) {
			if(store.getPotential().compareTo(BigDecimal.ZERO) != 0) {
				store.setPotentialRef(store.getPotential()) ;
			} else {
				if (getRefStoreForStore(store.getId(), ref)!=-1) {
					store.setPotentialRef(stores.get(getRefStoreForStore(store.getId(), ref)-1).getPotential());
				}else {
					BigDecimal average = calculateAverageNonZeroBD(stores);
					store.setPotentialRef(average);
				}
			}
		}
		for (Store store : stores) {
		    System.out.println(store);
		}
	}
	public static BigDecimal getStoreTrendForStore(int storeId, Map<Integer, BigDecimal> storeTrendsMap) {
	    BigDecimal storeTrend = storeTrendsMap.get(storeId);

	    if (storeTrend != null) {
	        return storeTrend;
	    } else {
	        return BigDecimal.ONE;
	    }
	}
	
	public static BigDecimal getWeight(int key) {
	    Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();
	    return refWeights.getOrDefault(key, BigDecimal.ZERO);
	}
	
	public static List<BigDecimal> CalculateStoreDemand(Map<Item, List<Store>> MapA55 , Map<Item, List<Store>> MapA77) {
		Item firstItem55 = MapA55.keySet().iterator().next();
		List<Store> stores55 = MapA55.get(firstItem55);	
		
		Item firstItem77 = MapA77.keySet().iterator().next();
		List<Store> stores77 = MapA77.get(firstItem77);	
		
		Map<Integer, BigDecimal> storeTrendsMap = DataModel.mockStoreTrends();
		
		Map<Integer, BigDecimal> storeWeights = DataModel.mockRefWeights();
		
		int size = stores55.size(); 
		List<BigDecimal> list = new ArrayList<>();
		
	    for (int i = 0; i < size; i++) {
	        Store store55 = stores55.get(i);
	        Store store77 = stores77.get(i);
	        
	        BigDecimal demand = store55.getPotentialRef().multiply(getWeight(55))
	                .add(store77.getPotentialRef().multiply(getWeight(77)))
	                .divide(getWeight(55).add(getWeight(77)), 2, RoundingMode.HALF_UP)
	                .multiply(getStoreTrendForStore(i + 1, storeTrendsMap));	    
	        list.add(demand);
	    }
		return list;
	}
	public static Map<Integer,BigDecimal> SumWH(List<BigDecimal> listDemand,Map<Item, List<Store>> MapA55) {
		Item firstItem55 = MapA55.keySet().iterator().next();
		List<Store> stores55 = MapA55.get(firstItem55);	
		
		int size = stores55.size(); // Số lượng phần tử trong danh sách
		Map<Integer,BigDecimal> MapWH= new HashMap<>();
		MapWH.put(1, new BigDecimal("0.0"));
		MapWH.put(2, new BigDecimal("0.0"));
		MapWH.put(3, new BigDecimal("0.0"));
		for (int i = 0; i < size; i++) {
	        Store store55 = stores55.get(i);
	        
	        BigDecimal newvalue = MapWH.get(store55.getWhId()).add(listDemand.get(i));
	        MapWH.put(store55.getWhId(), newvalue);
	    }
		return MapWH;
	}
	
	public static void main(String[] args) {
		//step1
		if (DataModel.planningAmount <= DataModel.requiredMinPlanningAmount) {
			System.out.println("planningAmount khong the nho hon requiredMinPlanningAmount");
			System.exit(0);
		}
		
		//step2
		Map<Item, List<Store>> MapA55 =DataModel.mockStoresOfRefItemA55();
		Map<Item, List<Store>> MapA77 =DataModel.mockStoresOfRefItemA77();
		potentialRef(MapA55);
		System.out.println("\n");
		potentialRef(MapA77);
		
		//step3
		List<BigDecimal> listDecimal = new ArrayList<>();
		listDecimal= CalculateStoreDemand(MapA55, MapA77);
		System.out.println("\nlistDecimal : " +listDecimal);
		
		//step4
		Map<Integer,BigDecimal> MapWH= new HashMap<>();
		MapWH = SumWH(listDecimal, MapA55);
		System.out.println("\nMapWH : "+MapWH);
		
		//step5
		BigDecimal sumWH = BigDecimal.ZERO;
        for (BigDecimal value : MapWH.values()) {
        	sumWH = sumWH.add(value);
        }
        Map<Integer,BigDecimal> shares= new HashMap<>();
        for (Map.Entry<Integer, BigDecimal> entry : MapWH.entrySet()) {
            Integer key = entry.getKey();
            BigDecimal value = entry.getValue();
            shares.put(key, value.multiply(BigDecimal.valueOf(100)).divide(sumWH,2,RoundingMode.HALF_UP ));
        }
        System.out.println("\nshares : " +shares);
        
        //step6
        Map<Integer,BigDecimal> allocates= new HashMap<>();
        for (Map.Entry<Integer, BigDecimal> entry : shares.entrySet()) {
            Integer key = entry.getKey();
            BigDecimal value = entry.getValue();
            allocates.put(key, value.multiply(BigDecimal.valueOf(DataModel.planningAmount)).divide(BigDecimal.valueOf(100),4,RoundingMode.HALF_UP ));
        }
        System.out.println("\nallocates : "+ allocates);
        
        //step7
        Map<Integer,BigDecimal> amountOfStore= new HashMap<>();
        amountOfStore.put(1, new BigDecimal("0.0"));
        amountOfStore.put(2, new BigDecimal("0.0"));
        amountOfStore.put(3, new BigDecimal("0.0"));
        Item firstItem = MapA55.keySet().iterator().next();
		List<Store> stores = MapA55.get(firstItem);
		for( Store store: stores) {
  		    BigDecimal newvalue = amountOfStore.get(store.getWhId()).add(BigDecimal.valueOf(1));
  		    amountOfStore.put(store.getWhId(), newvalue);
  		    
		}
		System.out.println("\n Amount of Stores:"+ amountOfStore);
        Map<Integer,BigDecimal> miniMum= new HashMap<>();
        for (Map.Entry<Integer, BigDecimal> entry : allocates.entrySet()) {
            Integer key = entry.getKey();
            BigDecimal value = entry.getValue();
            if(amountOfStore.get(key).multiply(BigDecimal.valueOf(DataModel.minPerStore)).compareTo(value)>0) {
                miniMum.put(key, amountOfStore.get(key).multiply(BigDecimal.valueOf(DataModel.minPerStore)));
            }else {
            	miniMum.put(key, value);
            }
        }
		System.out.println("\n miniMum : "+ miniMum);
		
		//step8
		Map<Integer,BigDecimal> recalcShare= new HashMap<>();
		BigDecimal sumRecalc= BigDecimal.valueOf(0);
        for (Map.Entry<Integer, BigDecimal> entry : allocates.entrySet()) {
            Integer key = entry.getKey();
            BigDecimal value = entry.getValue();
            if(amountOfStore.get(key).multiply(BigDecimal.valueOf(DataModel.minPerStore)).compareTo(value)>0) {
            	recalcShare.put(key, BigDecimal.valueOf(0));
            }else {
            	recalcShare.put(key, value);
            	sumRecalc =sumRecalc.add(value);
            	
            }
        }
        for(Map.Entry<Integer, BigDecimal> entry : recalcShare.entrySet()) {
            Integer key = entry.getKey();
            BigDecimal value = entry.getValue();
            recalcShare.put(key, value.multiply(BigDecimal.valueOf(100)).divide(sumRecalc,4,RoundingMode.HALF_UP));
        }
        System.out.println("\nrecalcShare :" + recalcShare);
	}
	

}