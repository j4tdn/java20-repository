package service;

import java.util.Collection;
import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupService {
	
	List<ItemGroup> getAll();
	
	List<ItemGroup> getItemGroupWithItems();
	
	List<ItemGroupDto> countItemsByItemGroup(); 
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	void saveOrUpdate(ItemGroup itemGroup);
	
	void save(ItemGroup itemGroup);
	
	/**
	 * Insert list of groups to database
	 * --> Using batch update(INSERT/UPDATE/DELETE)
	 *
	 * @param groups the given groups
	 */
	void save(Collection<ItemGroup> groups);
	
	void update(ItemGroup itemGroup);
	
}
