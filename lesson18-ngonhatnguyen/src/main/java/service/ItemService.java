package service;

import java.util.List;

import persistence.dto.ItemDateDto;
import persistence.dto.ItemSalesAmountDto;

public interface ItemService {
	List<ItemDateDto> getItemsByCreatedDate(String createdAt);
	
	List<ItemSalesAmountDto> getItemsBySales(int year);
}
