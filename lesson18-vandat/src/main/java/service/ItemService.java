package service;

import java.time.LocalDate;
import java.util.List;

import persistence.dto.ItemDto;
import persistence.entities.Item;

public interface ItemService {

	List<ItemDto> getItemsBySalesDate(LocalDate date);
	
	List<Item> getAll();
}
