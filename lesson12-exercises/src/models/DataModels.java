package models;

import java.math.BigDecimal;
import java.util.List;
import java.util.Map;

import bean.Store;

public class DataModels {

	private DataModels() {
	}
	
	public static List<Store> mockStores(){
		// storeId, ref, stock, expSales, isSelected
		return List.of(
				new Store(1, null, bd(18), bd(40), true), 
				new Store(2, null, bd(19), bd(20), true),
				new Store(3, null, bd(21), bd(17), true), 
				new Store(4, null, bd(14), bd(31), true),
				new Store(5, null, bd(14), bd(10), true), 
				new Store(6, null, bd(15), bd(30), true),
				new Store(7, "Store 2", bd(15), null, true), 
				new Store(8, null, bd(12), bd(19), true),
				new Store(9, null, bd(17), bd(26), true), 
				new Store(10, "Store 7", bd(15), null, true)
		);
		
	}
	private static BigDecimal bd(double val) {
		return BigDecimal.valueOf(val);
	}
	
	public static Map<Integer, Integer> mockRefStores(){
		return Map.of(
				7, 2,
				10, 7
		);
	}

}
