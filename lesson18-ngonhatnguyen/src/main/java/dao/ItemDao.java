package dao;

import java.util.List;

import persistence.dto.ItemDateDto;
import persistence.dto.ItemSalesAmountDto;

public interface ItemDao {
	List<ItemDateDto> getItemsByCreatedDate(String createdAt);

	List<ItemSalesAmountDto> getItemsBySales(int year);
}
