package service;

import java.util.Collection;
import java.util.List;

import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	List<ItemGroupDto> countItemsByItemGroup();
	
	void save(ItemGroup itemGroup);
	
	void save(Collection<ItemGroup> groups);

	void saveOrUpdate(ItemGroup itemGroup);

	void merge(ItemGroup itemGroup);
}
