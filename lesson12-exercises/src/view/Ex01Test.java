package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import bean.Store;
import models.DataModels;

public class Ex01Test {

	public static void main(String[] args) {

		List<Store> stores = DataModels.mockStores();
		Integer warehouseAllocationAmount = 300;

		Map<Long, Integer> result = new HashMap<>();

		fillExpSales(stores).forEach(System.out::println);

	}

	public static List<Store> fillExpSales(List<Store> stores) {
		List<Store> res = new ArrayList<>();
		List<Store> tmp = new ArrayList<>();

		for (Store store : stores) {
			tmp.add(store);
		}

		for (Store store : tmp) {
			if (store.getExpectedSales() != null) {
				res.add(store);
			} else {
				Store ref = store.getReferenceStoreId();
				if (ref == null) {
					store.setExpectedSales(calAvgExpSales(stores));
				} else {
					BigDecimal refExpSales = ref.getExpectedSales();

					if (refExpSales != null ) {
						store.setExpectedSales(refExpSales);
					} else {
						store.setExpectedSales(calAvgExpSales(stores));
					}
				}
				res.add(store);
			}

		}

		return res;
	}

	public static BigDecimal calAvgExpSales(List<Store> stores) {
		long size = stores.stream().filter(store -> store.getExpectedSales() != null).count();

		return stores.stream().filter(store -> store.getExpectedSales() != null).map(store -> store.getExpectedSales())
				.reduce(BigDecimal.ZERO, BigDecimal::add).divide(BigDecimal.valueOf(size))
				.setScale(1, RoundingMode.HALF_UP);
	}
}
