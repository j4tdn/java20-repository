package service;

import java.util.List;

import persistence.entities.ItemGroup;

public interface ItemGroupService {
	
	List<ItemGroup> getAll();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
}
