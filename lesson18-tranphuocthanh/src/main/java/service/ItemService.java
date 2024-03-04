package service;

import java.time.LocalDate;
import java.util.List;

import persistence.ItemDto1;
import persistence.ItemDto2;
import persistence.ItemDto3;

public interface ItemService {
	
	List<ItemDto1> getItemDtoWithDate(LocalDate ldate);
	
	List<ItemDto2> getItemDtoInventory() ;
	
	List<ItemDto3> getItemsWithMaxSalesPrice();
}
