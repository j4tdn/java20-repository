package dao;

import java.util.List;

import persistence.dtos.ItemDTO;
import persistence.entities.Item;

public interface ItemDao {
		
	List<ItemDTO> getItemByOrderDate(String date);

	List<ItemDTO> getItemByAmountInOrderByYear(int year);

	List<Item> getAllItemByItemGroup();
	
}
