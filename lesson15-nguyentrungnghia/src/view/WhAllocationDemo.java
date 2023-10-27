package view;

import static model.DataModel.*;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

import bean.Item;
import bean.Store;
import utils.NumberUtils;

public class WhAllocationDemo {

	public static void main(String[] args) {

		// ========== STEP 1 ==========
		if (planningAmount <= requiredMinPlanningAmount)
			return;
		else
			System.out.println("Next to Step 2");

		// ========== STEP 2 ==========
		getListStoresFromRefItem(mockStoresOfRefItemA77(), mockRefStores());
	}

	private static List<Store> getListStoresFromRefItem(Map<Item, List<Store>> mockStores, Map<Integer, Integer> mockRefStores) {
		// Lấy ra 1 List tất cả store
		var set = mockStores.entrySet();
		List<Store> listStores = null;
		for (var entry : set)
			listStores = entry.getValue();
		
		// Lấy ra 1 List các store có potential = 0
		List<Store> list0 = listStores.stream()
						    	      .filter(s -> s.getPotential().equals(NumberUtils.bd(0)))
						    	      .collect(Collectors.toList());
		
		// Reference
		for (int i = 0; i < list0.size(); i++) 
			for (var entry : mockRefStores.entrySet()) {
				if (list0.get(i).getId() == entry.getKey())
					list0.get(i)
						 .setPotential(listStores.stream()
								 			   .filter(s -> s.getId() == entry.getValue())
								 			   .collect(Collectors.toList())
								 			   .get(0)
								 			   .getPotential());
				else if (list0.get(i).getId() == entry.getValue()) 
					list0.get(i)
					 	 .setPotential(listStores.stream()
							 			   	   .filter(s -> s.getId() == entry.getValue())
							 			   	   .collect(Collectors.toList())
							 			   	   .get(0)
							 			   	   .getPotential());
			}
		
		// Trung bình cộng các potential của các Store có potential khác 0
		BigDecimal avg = listStores.stream()
				  				   .filter(s -> !s.getPotential().equals(NumberUtils.bd(0)))
				  				   .map(s -> s.getPotential())
				  				   .reduce(NumberUtils.bd(0), (a, b) -> a.add(b));
		
		System.out.println(avg.toString());
		System.out.println(list0 + "\n");
		
		return listStores;
	}

}
