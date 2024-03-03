package dao;

import java.util.Collection;
import java.util.List;

import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public interface ItemGroupDao {
	
	List<ItemGroup> getAll();
	
	List<ItemGroupDto> countItemsByItemGroup();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	void save(ItemGroup itemGroup);
	
	void save(Collection<ItemGroup> groups);
	
	void saveOrUpdate(ItemGroup itemGroup);
	
	void merge(ItemGroup itemGroup);
}