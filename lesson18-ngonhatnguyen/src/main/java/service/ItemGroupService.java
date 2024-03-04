package service;

import java.util.List;

import persistence.dto.ItemGroupAmountDto;

public interface ItemGroupService {
	List<ItemGroupAmountDto> getItemGroupsByAmount();
}
