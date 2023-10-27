package model;

import bean.Item;
import bean.Store;
import utils.NumberUtils;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DataModel {
    public static final Integer minPerStore = 5;
    public static final Integer planningAmount = 88;
    public static final Integer requiredMinPlanningAmount = 50;
    
    public DataModel() {
        super();
    }

    public static Map<Item, List<Store> > mockStoresOfRefItemA55() {
        Item itemA55 = new Item(55, "Item A55");
        List<Store> stores = List.of(
            new Store(1, "Store 1", NumberUtils.bd(21.9), 2),
            new Store(2, "Store 2", NumberUtils.bd(66.885), 1),
            new Store(3, "Store 3", NumberUtils.bd(10.5), 1),
            new Store(4, "Store 4", NumberUtils.bd(36.4), 1),
            new Store(5, "Store 5", NumberUtils.bd(14), 1),
            new Store(6, "Store 6", NumberUtils.bd(65.52), 1),
            new Store(7, "Store 7", NumberUtils.bd(17.9), 1),
            new Store(8, "Store 8", NumberUtils.bd(26.7), 2),
            new Store(9, "Store 9", NumberUtils.bd(54.9), 2),
            new Store(10, "Store 10", NumberUtils.bd(35), 2),
            new Store(11, "Store 11", NumberUtils.bd(22.7), 3),
            new Store(12, "Store 12", NumberUtils.bd(1), 3),
            new Store(13, "Store 13", NumberUtils.bd(19.1), 3),
            new Store(14, "Store 14", NumberUtils.bd(19.4), 3)
        );
        return Map.of(itemA55, stores);
    }

    public static Map<Item, List<Store> > mockStoresOfRefItemA77() {
        Item itemA77 = new Item(77, "Item A77");
        List<Store> stores = List.of(
            new Store(1, "Store 1", NumberUtils.bd(22.024), 2),
            new Store(2, "Store 2", NumberUtils.bd(150.777), 1),
            new Store(3, "Store 3", NumberUtils.bd(33.4), 1),
            new Store(4, "Store 4", NumberUtils.bd(23.4), 1),
            new Store(5, "Store 5", NumberUtils.bd(26.289), 1),
            new Store(6, "Store 6", NumberUtils.bd(22.2), 1),
            new Store(7, "Store 7", NumberUtils.bd(23.6), 2),
            new Store(8, "Store 8", NumberUtils.bd(21.9), 2),
            new Store(9, "Store 9", NumberUtils.bd(20.74), 2),
            new Store(10, "Store 10", NumberUtils.bd(0), 2),
            new Store(11, "Store 11", NumberUtils.bd(26.612), 3),
            new Store(12, "Store 12", NumberUtils.bd(0), 3),
            new Store(13, "Store 13", NumberUtils.bd(32.1), 3),
            new Store(14, "Store 14", NumberUtils.bd(22.5), 3)
        );
        return Map.of(itemA77, stores);
    }

    public static Map<Integer, Integer> mockRefStores() {
        return Map.of(
            7, 3,
            10, 1
        );
    }

    public static Map<Integer, BigDecimal> mockRefWeights() {
        return Map.of(
            55, NumberUtils.bd(2.5),
            77, NumberUtils.bd(1.5)
        );
    }

    public static Map<Store, BigDecimal> fillStorePotentials(
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
                    if (storePotentials.containsKey(new Store(referenceStoreId, "", NumberUtils.bd(0), 0))) {
                        potential = storePotentials.get(new Store(referenceStoreId, "", NumberUtils.bd(0), 0));
                    }
                } else {
                    BigDecimal averagePotential = NumberUtils.bd(0);
                    int count = 0;
                    for (Store s : stores) {
                        averagePotential = averagePotential.add(s.getPotential());
                        count++;
                    }
                    potential = averagePotential.divide(NumberUtils.bd(count), 1, BigDecimal.ROUND_HALF_UP);
                }

                storePotentials.put(store, potential);
            }
        }
        return storePotentials;
    }
}