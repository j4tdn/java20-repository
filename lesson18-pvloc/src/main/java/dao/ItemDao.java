package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.Item;

public interface ItemDao {
	List<Item> getAll();
	List<Item> getItemByOrderDate(LocalDate purchaseDate);
}