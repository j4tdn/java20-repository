package dao;

import java.util.List;

import persistence.dto.ItemOrderDto;

public interface ItemOrderDao {
	List<ItemOrderDto> getItemsOrderByDay(String time); 
}
