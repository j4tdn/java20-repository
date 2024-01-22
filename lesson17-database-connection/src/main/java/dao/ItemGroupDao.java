package dao;

import java.util.Collection;
import java.util.List;

import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public interface ItemGroupDao {

	List<ItemGroup> getAll();
	
	List<ItemGroupDto> countItemsByItemGroup();
	
	ItemGroup get(int id);
	
	ItemGroup get(String name);
	
	void save(ItemGroup itemGroup);
	
	/**
	 * Insert list of groups to database
	 * --> using batch update(INSERT/UPDATE/DELETE)
	 * 
	 * @param groups to given groups
	 */
	void save(Collection<ItemGroup> groups);
	
	/**
	 * Update item group 
	 * --> update group name by id
	 * 
	 * @param itemGroup the given item group
	 */
	void update(ItemGroup itemGroup);
	
	void merge(ItemGroup itemGroup);
	
	void merge(Collection<ItemGroup> groups);
}
