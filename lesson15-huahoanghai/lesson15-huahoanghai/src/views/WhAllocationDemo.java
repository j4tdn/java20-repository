package views;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Item;
import bean.Store;
import model.DataModel;

public class WhAllocationDemo {

	public static void main(String[] args) {

		if (checkPlanningAmount()) {

			 Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();
			Map<Item, List<Store>> storesDataA55 = DataModel.mockStoresOfRefItemA55();
			Map<Item, List<Store>> storesDataA77 = DataModel.mockStoresOfRefItemA77();
			Map<Integer, Integer> refStores = DataModel.mockRefStores();
			processStoresData(storesDataA55);
			processStoresData(storesDataA77);
			System.out.println("Calculation Completed. Store Information:");
			  // Calculate store demand for Item A55 and Item A77
	     
	       
			  System.out.println("Table A55 Results:");
	            printStorePotentials(storesDataA55);

	            // In kết quả cho bảng A77
	            System.out.println("Table A77 Results:");
	            printStorePotentials(storesDataA77);
	        
	        
		} else {
			System.out.println("Stop Calculation");
		}
	}

	// Step1
	public static boolean checkPlanningAmount() {

		Integer planningAmount = DataModel.planningAmount;
		Integer requiredMinPlanningAmount = DataModel.requiredMinPlanningAmount;

		return planningAmount > requiredMinPlanningAmount;
	}

	// Step2
	public static void processStoresData(Map<Item, List<Store>> storesData) {
		Map<Integer, Integer> refStoreMapping = DataModel.mockRefStores(); // Obtain the reference store mapping here

		for (Item item : storesData.keySet()) {
			List<Store> stores = storesData.get(item);

			BigDecimal averagePotential = calculateAverageExistingPotential(stores);

			for (Store store : stores) {
				BigDecimal potential = store.getPotential();
				Integer id = store.getId();
				Integer refStoreId = refStoreMapping.get(id);

				// Check if potential is null or has no value
				if (potential == null || potential.compareTo(BigDecimal.ZERO) == 0) {
					// Set the potential based on the reference store mapping
					if (refStoreId != null) {
						for (Store potentialStore : stores) {
							if (potentialStore.getId().equals(refStoreId)) {
								store.setPotential(potentialStore.getPotential());
								System.out.println("Updated Store - Item: " + item.getName() + ", Store ID: " + id
					                    + ", Potential updated to: " + store.getPotential().setScale(1, RoundingMode.HALF_UP));
								break;
							}
						}
					} else if (averagePotential != null) {
						store.setPotential(averagePotential);
						System.out.println("Updated Store - Item: " + item.getName() + ", Store ID: " + id
								+ ", Potential updated to avg : " + store.getPotential());
					}
				}
			}
		}
	}

	private static BigDecimal calculateAverageExistingPotential(List<Store> stores) {
	    BigDecimal totalPotential = BigDecimal.ZERO;
	    int storeCount = 0;

	    for (Store store : stores) {
	        BigDecimal potential = store.getPotential();
	        if (potential != null && potential.compareTo(BigDecimal.ZERO) != 0) {
	            totalPotential = totalPotential.add(potential);
	            storeCount++;
	        }
	    }

	    return (storeCount > 0) ? totalPotential.divide(BigDecimal.valueOf(storeCount), 1, RoundingMode.HALF_UP) : null;
	}
	
	
	//step3
	 private static BigDecimal calculateOwnPotential(Integer storeId, List<Store> stores, Map<Integer, BigDecimal> refWeights) {
	        BigDecimal sum = BigDecimal.ZERO;
	        BigDecimal weightSum = BigDecimal.ZERO;

	        for (Store store : stores) {
	            BigDecimal referenceStoreId = refWeights.get(store.getId());

	            if (referenceStoreId != null && !storeId.equals(store.getId())) {
	                BigDecimal weight = refWeights.get(referenceStoreId);
	                if (weight != null && weight.compareTo(BigDecimal.ZERO) > 0) {
	                    sum = sum.add(store.getPotential().multiply(weight));
	                    weightSum = weightSum.add(weight);
	                }
	            }
	        }

	        if (weightSum.compareTo(BigDecimal.ZERO) > 0) {
	            return sum.divide(weightSum, 1, RoundingMode.HALF_UP);
	        }

	        return BigDecimal.ZERO;
	    }

	    private static void printStorePotentials(Map<Item, List<Store>> storesData) {
	        for (Item item : storesData.keySet()) {
	            List<Store> stores = storesData.get(item);
	            for (Store store : stores) {
	                System.out.println("Store: " + store.getDesc() + ", Potential: " + store.getPotential());
	            }
	        }
	    }

	  
	
	

}
	
