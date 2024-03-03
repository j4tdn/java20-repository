package service;

import java.util.Collection;
import java.util.List;
import java.util.Objects;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		return itemGroupDao.countItemsByItemGroup();
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}

	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "itemGroup should not be null");
		return itemGroupDao.get(name);
	}

	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup,"item group should not be null");
		itemGroupDao.save(itemGroup);
		
	}@Override
	public void merge(ItemGroup itemGroup) {
		
		Objects.requireNonNull(itemGroup,"item group should not be null");
		itemGroupDao.merge(itemGroup);
	}
	@Override
	public void save(Collection<ItemGroup> itemGroup) {
		Objects.requireNonNull(itemGroup,"item group should not be null");
		itemGroupDao.save(itemGroup);
		
	}
	
	
}
