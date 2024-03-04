package service;

import java.util.List;

import persistence.dtos.ItemDTO;
import persistence.entities.Item;

public interface ItemService {
	
	List<ItemDTO> getItemByOrderDate(String date);
	
	List<ItemDTO> getItemByAmountInOrderByYear(int year);
	
	List<Item> getAllItemByItemGroup();
}
