package service;

import java.util.List;

import persistence.dto.ItemTimeDto;

public interface ItemService {
	List<ItemTimeDto> getItemsByTimeCreatedOrder(String date);
}
