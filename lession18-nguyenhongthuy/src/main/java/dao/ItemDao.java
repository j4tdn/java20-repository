package dao;

import java.util.List;

import persistence.dto.ItemTimeDto;

public interface ItemDao {
	List<ItemTimeDto> getItemsByTimeCreatedOrder(String date);
	
}
