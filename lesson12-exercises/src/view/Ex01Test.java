package view;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import bean.Store;
import models.DataModels;

public class Ex01Test {

	public static void main(String[] args) {

		List<Store> stores = DataModels.mockStores();
		Integer warehouseAllocationAmount = 300;
		Map<Integer, Integer> refStores = DataModels.mockRefStores();
		
		
		fillExpSales(stores, refStores).forEach(System.out::println);

		System.out.println("===");
		stores.forEach(System.out::println);
	}
	
	public static List<Store> fillExpSales(List<Store> stores, Map<Integer, Integer> refStores) {
		var tmp = new ArrayList<>(stores);
		BigDecimal avgExpSales = calAvgExpSales(stores);
		for (Store store : stores) {
			if (store.getExpectedSales() == null) {
				Integer refStoreId = refStores.get(store.getStoreId());
				if (refStoreId == null) {
					store.setExpectedSales(avgExpSales);
				}else {
					Store refStore = tmp.stream().filter(s -> s.getStoreId().equals(refStoreId)).toList().get(0);
					if (refStore.getExpectedSales() != null) {
						store.setExpectedSales(refStore.getExpectedSales());
					}else {
						store.setExpectedSales(avgExpSales);
					}
				}
			}
		}
		return stores;
	}
	
	
	public static BigDecimal calAvgExpSales(List<Store> stores) {
		long size = stores.stream()
				.filter(store -> store.getExpectedSales() != null)
				.count();

		return stores.stream()
				.filter(store -> store.getExpectedSales() != null)
				.map(store -> store.getExpectedSales())
				.reduce(BigDecimal.ZERO, BigDecimal::add)
				.divide(BigDecimal.valueOf(size))
				.setScale(1, RoundingMode.HALF_UP);
	}
}
