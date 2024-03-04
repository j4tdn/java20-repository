package dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import persistence.Item;
import persistence.ItemDto;

public interface ItemDao {
	List<ItemDto> getItemByTimeCreatedOrder(String create_at);
	List<Item> getItem();
	
	
}
