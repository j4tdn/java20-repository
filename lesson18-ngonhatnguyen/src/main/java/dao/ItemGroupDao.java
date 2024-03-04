package dao;

import java.util.List;

import persistence.dto.ItemGroupAmountDto;

public interface ItemGroupDao {
	List<ItemGroupAmountDto> getItemsByAmount();
}
