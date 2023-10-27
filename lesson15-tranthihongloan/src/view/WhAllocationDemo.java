package view;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.Store;
import model.DataModel;
import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;

public class WhAllocationDemo {
	
	public static void main(String[] args) {
		
		checkPlanningAmount(DataModel.planningAmount, DataModel.requiredMinPlanningAmount);
	
		
	}
	
	public static void checkPlanningAmount(Integer pA, Integer requiredMinPA) {
		Item itemA77 = new Item(77, "Item A77");
		
		// Step 1: Check for planning amount
		if(pA <= requiredMinPA)  {
			return;
		} else {
			
			System.out.println("Step 2: Filling gaps by references or average");
			var storesOfItem = DataModel.mockStoresOfRefItemA77();
			var stores = storesOfItem.get(itemA77);
			var refStores = DataModel.mockRefStores();
			
			Map<Integer, Store> mapStores = new HashMap<>();
			for (Store store : stores) {
				mapStores.put(store.getId(), store);
			}
		       
			BigDecimal sum = BigDecimal.ZERO;
			BigDecimal average;
			int count = 0;
			List<Integer> noIdRefStores = new ArrayList<>();
			
			// Lam tron voi 1 chu so thap phan
			for (Store store : stores) {
				store.setPotential(store.getPotential().setScale(1, BigDecimal.ROUND_HALF_UP));
			}
			
			for (Store store : stores) {
				
				// Neu Store ko co Potential
			    if(store.getPotential() == null || store.getPotential().compareTo(BigDecimal.ZERO) == 0) {
			    	Integer idRefStore = refStores.get(store.getId());
			    	
			    	// Neu Store co Store tham chieu
			    	if(idRefStore != null) {
			    		BigDecimal potentialRefStore = mapStores.get(idRefStore).getPotential();
				    	
			    		// Neu Store tham chieu co Potential
				    	if(potentialRefStore != null || potentialRefStore.compareTo(BigDecimal.ZERO) != 0) {
				    		store.setPotential(mapStores.get(idRefStore).getPotential());
				    	}
				    	
			    	} else {
			    		noIdRefStores.add(store.getId());
			    	}
			    	
			    } else {
			    	count++;
			    	sum = sum.add(store.getPotential());
			    }
			}
			
			average = sum.divide(new BigDecimal(count), 1, BigDecimal.ROUND_HALF_UP);
			
			// Them Potential cho Store ko co Store tham chieu
			for (Integer id : noIdRefStores) {
				for (Store store : stores) {
					if(id == store.getId()) {
						store.setPotential(average);
					}
				}
			}
			
			for (Store store : stores) {
				System.out.println(store);
			}
			System.out.println();
			
			System.out.println("Step 3: Calculate Store Demand of current Item");
			
		}
	}
}
