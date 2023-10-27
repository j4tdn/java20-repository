package models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import bean.Store;

public class DataModels {

	private DataModels() {
	}
	
	public static List<Store> mockStores(){
		// storeId, ref, stock, expSales, isSelected
		List<Store> stores = new ArrayList<>();
		Store s1 = new Store("S1", null, bd(18), bd(40), true);
		Store s2 = new Store("S2", null, bd(19), bd(20), true);
		Store s3 = new Store("S3", null, bd(21), bd(17), true);
		Store s4 = new Store("S4", null, bd(14), bd(31), true);
		Store s5 = new Store("S5", null, bd(14), bd(10), true);
		Store s6 = new Store("S6", null, bd(15), bd(30), true);
		Store s7 = new Store("S7", s2, bd(15), null, true);
		Store s8 = new Store("S8", null, bd(12), bd(19), true);
		Store s9 = new Store("S9", null, bd(17), bd(26), true);
		Store s10 = new Store("S10", s7, bd(15), null, true);
		
		stores.add(s1);
		stores.add(s2);
		stores.add(s3);
		stores.add(s4);
		stores.add(s5);
		stores.add(s6);
		stores.add(s7);
		stores.add(s8);
		stores.add(s9);
		stores.add(s10);
		
		return stores;
		
	}
	private static BigDecimal bd(double val) {
		return BigDecimal.valueOf(val);
	}

}
