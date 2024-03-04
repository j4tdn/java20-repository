package service;

import java.time.LocalDate;
import java.util.List;

import persistence.entities.Item;

public interface ItemService {
	
	List<Item> getAll(LocalDate localDate);

}
