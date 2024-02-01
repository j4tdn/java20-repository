package dao;

import java.util.List;

import persistence.entities.Item;

public interface ItemDao {

	List<Item> getAll();
}
