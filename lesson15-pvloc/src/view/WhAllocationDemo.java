package view;

import bean.Item;
import bean.Store;
import model.DataModel;
import utils.NumberUtils;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

public class WhAllocationDemo {
    public static void main(String[] args) {
        // Dữ liệu về Planning Amount và Required Min Planning Amount
        int planningAmount = 88;
        int requiredMinPlanningAmount = 50;
        
        // Kiểm tra điều kiện
        if (planningAmount <= requiredMinPlanningAmount) {
            System.out.println("Stop calculation because planning amount is less than or equal to requiredMinPlanningAmount.");
        } else {
            System.out.println("Continue with step 2");
            
            // Bước 2: Tiếp theo, bạn có thể thực hiện các tính toán và xử lý dựa trên dữ liệu Reference Item A55, Reference Item A77, Store Potential, Weight of Reference Item, Min Per Store, và các dữ liệu khác mà bạn có.
            
            // Gọi hàm fillPotentialGaps và in kết quả
            Map<Item, List<Store>> storesDataA55 = DataModel.mockStoresOfRefItemA55();
            Map<Item, List<Store>> storesDataA77 = DataModel.mockStoresOfRefItemA77();
            Map<Integer, Integer> referenceStoresA55 = DataModel.mockRefStores();
            Map<Integer, Integer> referenceStoresA77 = DataModel.mockRefStores();
            Map<Integer, BigDecimal> refWeights = DataModel.mockRefWeights();

            fillPotentialGaps(storesDataA55, referenceStoresA55, refWeights);
            fillPotentialGaps(storesDataA77, referenceStoresA77, refWeights);

            // In kết quả cho bảng A55
            System.out.println("Table A55 Results:");
            printStorePotentials(storesDataA55);

            // In kết quả cho bảng A77
            System.out.println("Table A77 Results:");
            printStorePotentials(storesDataA77);
        }
    }

    private static void fillPotentialGaps(Map<Item, List<Store>> storesData, Map<Integer, Integer> referenceStores, Map<Integer, BigDecimal> refWeights) {
        for (Item item : storesData.keySet()) {
            List<Store> stores = storesData.get(item);

            for (Store store : stores) {
                if (store.getPotential() == null || store.getPotential().equals(BigDecimal.ZERO)) {
                    Integer referenceStoreId = referenceStores.get(store.getId());

                    if (referenceStoreId != null) {
                        Store referenceStore = findStoreById(stores, referenceStoreId);

                        if (referenceStore != null) {
                            store.setPotential(referenceStore.getPotential());
                        }
                    } else {
                        BigDecimal ownPotential = calculateOwnPotential(store.getId(), stores, refWeights);
                        store.setPotential(ownPotential);
                    }
                }
            }
        }
    }

    private static Store findStoreById(List<Store> stores, Integer storeId) {
        for (Store store : stores) {
            if (store.getId().equals(storeId)) {
                return store;
            }
        }
        return null;
    }

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
            return sum.divide(weightSum, 1, BigDecimal.ROUND_HALF_UP);
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


