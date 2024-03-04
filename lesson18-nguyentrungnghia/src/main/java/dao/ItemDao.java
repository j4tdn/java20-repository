package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.entities.Item;

public interface ItemDao {
	
	List<Item> getAll(LocalDate localDate);

}
