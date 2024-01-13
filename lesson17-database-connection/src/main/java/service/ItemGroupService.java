package service;

import java.util.Collection;
import java.util.List;

import persistence.ItemGroup;

public interface ItemGroupService {
	List<ItemGroup> getAll();
	
	ItemGroup get(int id);
	
	void saveOrUpdate(ItemGroup itemGroup);
	
	void save(ItemGroup itemGroup);
	
	/**
	 * Insert list of groups to database
	 * --> Using batch update(INSERT/UPDATE/DELETE)
	 * @param groups the given groups
	 */
	void save(Collection<ItemGroup> groups);
	
	
	void update(ItemGroup itemGroup);
	
}
