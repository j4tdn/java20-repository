package view;

import java.util.HashMap;
import java.util.Map;

public class SharesDemo {
    public static void main(String[] args) {
        // Define the data for Store Trend Factors, Reference Items, and Weight Ref values.
        double[] storeTrendFactors = {1.0, 1.2, 1.0, 1.0, 1.0, 1.0, 1.5, 1.0, 1.0, 1.0, 0.9, 0.7, 1.0, 1.0};
        double[] referenceItemA55 = {21.9, 66.9, 10.5, 36.4, 14.0, 65.5, 17.9, 26.7, 54.9, 35.0, 22.7, 1.0, 19.1, 19.4};
        double[] referenceItemA77 = {22.0, 150.8, 33.4, 23.4, 26.3, 22.2, 23.6, 21.9, 20.7, 22.0, 26.6, 35.5, 32.1, 22.5};
        double[] weightRef = {2.5, 1.5};

        // Define the mapping of stores to their respective warehouses.
        Map<Integer, Integer> storeToWarehouse = new HashMap<>();
        storeToWarehouse.put(1, 2);
        storeToWarehouse.put(2, 1);
        storeToWarehouse.put(3, 1);
        storeToWarehouse.put(4, 1);
        storeToWarehouse.put(5, 1);
        storeToWarehouse.put(6, 1);
        storeToWarehouse.put(7, 2);
        storeToWarehouse.put(8, 2);
        storeToWarehouse.put(9, 2);
        storeToWarehouse.put(10, 2);
        storeToWarehouse.put(11, 3);
        storeToWarehouse.put(12, 3);
        storeToWarehouse.put(13, 3);
        storeToWarehouse.put(14, 3);

        // Initialize variables to store the total demand and total demand for each warehouse.
        Map<Integer, Double> warehouseDemands = new HashMap<>();
        double totalDemandCountry = 0.0;

        // Calculate the demand for each store and accumulate the total demand at the warehouse level.
        for (int i = 0; i < storeTrendFactors.length; i++) {
            int warehouse = storeToWarehouse.get(i + 1);
            double demand = calculateDemand(storeTrendFactors[i], referenceItemA55[i], referenceItemA77[i], weightRef);
            
            if (warehouseDemands.containsKey(warehouse)) {
                double currentWarehouseDemand = warehouseDemands.get(warehouse);
                warehouseDemands.put(warehouse, currentWarehouseDemand + demand);
            } else {
                warehouseDemands.put(warehouse, demand);
            }

            totalDemandCountry += demand;
        }

        // Calculate and print the share for each warehouse.
        for (Map.Entry<Integer, Double> entry : warehouseDemands.entrySet()) {
            int warehouse = entry.getKey();
            double demand = entry.getValue();
            double share = (demand / totalDemandCountry) * 100;
            System.out.println("Share WH " + warehouse + ": " + share + "%");
        }
    }

    // Function to calculate the demand for a store.
    public static double calculateDemand(double trendFactor, double refItemA55, double refItemA77, double[] weightRef) {
        double numerator = (refItemA55 * weightRef[0] + refItemA77 * weightRef[1]) * trendFactor;
        double denominator = weightRef[0] + weightRef[1];
        return numerator / denominator;
    }
}