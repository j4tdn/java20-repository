package view;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

import bean.Item;
import bean.Store;

public class AllocationController {

    public Map<Store, BigDecimal> fillStorePotentials(
            Map<Item, List<Store>> storesData,
            Map<Integer, Integer> refStores,
            Map<Integer, BigDecimal> refWeights,
            int minPerStore) {

        Map<Store, BigDecimal> storePotentials = new HashMap<>();

        for (Item item : storesData.keySet()) {
            List<Store> stores = storesData.get(item);
            for (Store store : stores) {
                BigDecimal potential = store.getPotential();
                int storeId = store.getId();

                if (refStores.containsKey(storeId)) {
                    int referenceStoreId = refStores.get(storeId);

                    if (storePotentials.containsKey(new Store(referenceStoreId, "", BigDecimal.ZERO, 0))) {
                        potential = storePotentials.get(new Store(referenceStoreId, "", BigDecimal.ZERO, 0));
                    }
                } else {
                    BigDecimal averagePotential = BigDecimal.ZERO;
                    int count = 0;
                    for (Store s : stores) {
                        averagePotential = averagePotential.add(s.getPotential());
                        count++;
                    }
                    potential = averagePotential.divide(BigDecimal.valueOf(count), 1, BigDecimal.ROUND_HALF_UP);
                }

                storePotentials.put(store, potential);
            }
        }

        return storePotentials;
    }

    public Map<Store, BigDecimal> calculateStoreDemand(Map<Store, BigDecimal> storePotentials, Map<Integer, BigDecimal> refWeights, int minPerStore) {
        Map<Store, BigDecimal> storeDemand = new HashMap<>();

        for (Store store : storePotentials.keySet()) {
            BigDecimal weight = refWeights.get(store.getWhId());
            BigDecimal potential = storePotentials.get(store);
            BigDecimal demand = potential.multiply(weight);
            storeDemand.put(store, demand);
        }

        return storeDemand;
    }
    
    public Map<String, BigDecimal> calculateDemandWH(Map<Store, BigDecimal> demandA55, Map<Store, BigDecimal> demandA77) {
        Map<String, BigDecimal> demandWH = new HashMap<>();

        for (Store store : demandA55.keySet()) {
            String whKey = "WH " + store.getWhId();
            BigDecimal demand = demandA55.get(store).add(demandA77.get(store));
            demandWH.put(whKey, demand);
        }

        return demandWH;
    }
    
    public Map<String, BigDecimal> calculateShares(Map<String, BigDecimal> demandWH) {
        Map<String, BigDecimal> shares = new HashMap<>();

        BigDecimal totalDemand = BigDecimal.ZERO;
        for (BigDecimal demand : demandWH.values()) {
            totalDemand = totalDemand.add(demand);
        }

        for (String whKey : demandWH.keySet()) {
            BigDecimal demand = demandWH.get(whKey);
            BigDecimal share = demand.divide(totalDemand, 4, BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(100));
            shares.put(whKey, share);
        }

        return shares;
    }
    
    public Map<String, BigDecimal> allocateByShares(Map<String, BigDecimal> shares, int planningAmount) {
        Map<String, BigDecimal> allocationAmountWH = new HashMap<>();

        for (String whKey : shares.keySet()) {
            BigDecimal share = shares.get(whKey);
            BigDecimal allocation = share.divide(BigDecimal.valueOf(100), 4, BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(planningAmount));
            allocationAmountWH.put(whKey, allocation);
        }

        return allocationAmountWH;
    }
    
    public Map<String, BigDecimal> recalculateShare(Map<String, BigDecimal> allocationAmountWH, Map<String, BigDecimal> allocationAmountWHWithMin) {
        Map<String, BigDecimal> shares = new HashMap<>();

        BigDecimal totalAllocation = BigDecimal.ZERO;
        for (BigDecimal allocation : allocationAmountWHWithMin.values()) {
            totalAllocation = totalAllocation.add(allocation);
        }

        for (String whKey : allocationAmountWHWithMin.keySet()) {
            BigDecimal allocation = allocationAmountWHWithMin.get(whKey);
            BigDecimal share = allocation.divide(totalAllocation, 4, BigDecimal.ROUND_HALF_UP).multiply(BigDecimal.valueOf(100));
            shares.put(whKey, share);
        }

        return shares;
    }
    
    public Map<String, BigDecimal> reallocate(int planningAmount, Map<String, BigDecimal> allocationAmountWHWithMin) {
        Map<String, BigDecimal> allocationAmountNewWH = new HashMap<>(allocationAmountWHWithMin);

        BigDecimal totalAllocation = BigDecimal.ZERO;
        for (BigDecimal allocation : allocationAmountNewWH.values()) {
            totalAllocation = totalAllocation.add(allocation);
        }

        if (totalAllocation.compareTo(BigDecimal.valueOf(planningAmount)) > 0) {
            String maxDeviationWHKey = getMaxDeviationWH(allocationAmountNewWH, planningAmount);
            BigDecimal maxDeviation = allocationAmountNewWH.get(maxDeviationWHKey);

            BigDecimal newAllocation = maxDeviation.subtract(BigDecimal.ONE);
            allocationAmountNewWH.put(maxDeviationWHKey, newAllocation);

            return reallocate(planningAmount, allocationAmountNewWH);
        }

        return allocationAmountNewWH;
    }
    
    private String getMaxDeviationWH(Map<String, BigDecimal> allocationAmountNewWH, int planningAmount) {
        BigDecimal maxDeviation = BigDecimal.ZERO;
        String maxDeviationWHKey = null;

        for (String whKey : allocationAmountNewWH.keySet()) {
            BigDecimal allocation = allocationAmountNewWH.get(whKey);
            BigDecimal deviation = allocation.subtract(BigDecimal.valueOf(planningAmount)).abs();

            if (deviation.compareTo(maxDeviation) > 0) {
                maxDeviation = deviation;
                maxDeviationWHKey = whKey;
            }
        }

        return maxDeviationWHKey;
    }
    
    public Map<String, BigDecimal> roundUp(Map<String, BigDecimal> allocationAmountNewWH) {
        Map<String, BigDecimal> allocationAmountRoundedWH = new HashMap<>();

        for (String whKey : allocationAmountNewWH.keySet()) {
            BigDecimal allocation = allocationAmountNewWH.get(whKey);
            allocation = allocation.setScale(0, BigDecimal.ROUND_CEILING);
            allocationAmountRoundedWH.put(whKey, allocation);
        }

        return allocationAmountRoundedWH;
    }
    
    public Map<String, BigDecimal> fixRounding(int planningAmount, Map<String, BigDecimal> allocationAmountNewWH) {
        BigDecimal totalAllocation = BigDecimal.ZERO;

        for (BigDecimal allocation : allocationAmountNewWH.values()) {
            totalAllocation = totalAllocation.add(allocation);
        }

        if (totalAllocation.compareTo(BigDecimal.valueOf(planningAmount)) > 0) {
            String maxDeviationWHKey = getMaxDeviationWH(allocationAmountNewWH, planningAmount);
            BigDecimal maxDeviation = allocationAmountNewWH.get(maxDeviationWHKey);

            BigDecimal newAllocation = maxDeviation.subtract(BigDecimal.ONE);
            allocationAmountNewWH.put(maxDeviationWHKey, newAllocation);

            return fixRounding(planningAmount, allocationAmountNewWH);
        }

        return allocationAmountNewWH;
    }
    
    public void displayResults(Map<String, BigDecimal> allocationAmountRoundedWH) {
        System.out.println("Warehouse Allocation Results:");
        for (String whKey : allocationAmountRoundedWH.keySet()) {
            BigDecimal allocation = allocationAmountRoundedWH.get(whKey);
            System.out.println("Warehouse " + whKey + ": " + allocation.intValue() + " units");
        }
    }
    
    public Map<String, BigDecimal> applyMinimum(Map<String, BigDecimal> allocationAmountWH, int minPerStore) {
        Map<String, BigDecimal> result = new HashMap<>();
        for (Map.Entry<String, BigDecimal> entry : allocationAmountWH.entrySet()) {
            String warehouse = entry.getKey();
            BigDecimal amount = entry.getValue();
            if (amount.compareTo(BigDecimal.valueOf(minPerStore)) < 0) {
                amount = BigDecimal.valueOf(minPerStore);
            }
            result.put(warehouse, amount);
        }
        return result;
    }
    
    public Map<String, BigDecimal> reallocateIfNeeded(int planningAmount, Map<String, BigDecimal> allocationAmountRoundedWH) {
        Map<String, BigDecimal> allocationAmountNewWH = new HashMap<>(allocationAmountRoundedWH);

        BigDecimal totalAllocation = BigDecimal.ZERO;
        for (BigDecimal allocation : allocationAmountNewWH.values()) {
            totalAllocation = totalAllocation.add(allocation);
        }

        if (totalAllocation.compareTo(BigDecimal.valueOf(planningAmount)) > 0) {
            allocationAmountNewWH = reallocate(planningAmount, allocationAmountRoundedWH);
            allocationAmountNewWH = roundUp(allocationAmountNewWH);
            allocationAmountNewWH = fixRounding(planningAmount, allocationAmountNewWH);
        }

        return allocationAmountNewWH;
    }
    
    public Map<String, BigDecimal> allocate(int planningAmount, Map<String, BigDecimal> allocationAmountWH, int minPerStore) {
        Map<String, BigDecimal> allocationAmountRoundedWH = allocationAmountWH;
        BigDecimal totalAllocation = BigDecimal.ZERO;

        for (BigDecimal allocation : allocationAmountRoundedWH.values()) {
            totalAllocation = totalAllocation.add(allocation);
        }

        if (totalAllocation.compareTo(BigDecimal.valueOf(planningAmount)) == 0) {
            return allocationAmountRoundedWH;
        } else if (totalAllocation.compareTo(BigDecimal.valueOf(planningAmount)) > 0) {
            allocationAmountRoundedWH = reallocateIfNeeded(planningAmount, allocationAmountRoundedWH);
        }

        allocationAmountRoundedWH = roundUp(allocationAmountRoundedWH);
        allocationAmountRoundedWH = fixRounding(planningAmount, allocationAmountRoundedWH);
        allocationAmountRoundedWH = applyMinimum(allocationAmountRoundedWH, minPerStore);

        return allocationAmountRoundedWH;
    }

    public static void main(String[] args) {
        AllocationController controller = new AllocationController();

        int planningAmount = 88;

        Map<String, BigDecimal> allocationAmountWH = new HashMap<>();
        allocationAmountWH.put("WH 1", new BigDecimal("45.08"));
        allocationAmountWH.put("WH 2", new BigDecimal("28.42"));
        allocationAmountWH.put("WH 3", new BigDecimal("20.00"));

        int minPerStore = 5;

        Map<String, BigDecimal> allocationAmountRoundedWH = controller.allocate(planningAmount, allocationAmountWH, minPerStore);
        controller.displayResults(allocationAmountRoundedWH);
    }
}
