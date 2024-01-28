package dao;

import java.util.List;

import persistence.entities.ItemGroup;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
}
