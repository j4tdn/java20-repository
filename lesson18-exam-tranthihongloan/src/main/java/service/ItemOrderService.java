package service;

import java.util.List;

import persistence.dto.ItemOrderDto;

public interface ItemOrderService {
	List<ItemOrderDto> getItemsOrderByDay(String time);
}
