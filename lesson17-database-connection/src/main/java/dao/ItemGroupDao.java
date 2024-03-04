package dao;

import java.util.Collection;
import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupDao {
	/*
	 * Get ALL item groups
	 * 
	 * @return
	 */
	List<ItemGroup> getAll();
	
	List<ItemGroupDto> countItemsByItemGroup();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	void save(ItemGroup itemGroup);
	
	/*
	 * Insert list of groups to database
	 * --> using batch update(INSERT/UPDATE/DELETE
	 * 
	 * @param groups the given groups
	 */
	void save(Collection<ItemGroup> groups);
	
	void update(ItemGroup itemGroup);
	
	void merge(ItemGroup itemGroup);
}
