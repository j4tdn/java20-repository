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
	public List<ItemGroupDto> countItemsByItemGroup() {
		return itemGroupDao.countItemsByItemGroup();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}
	
	@Override
	public ItemGroup get(int id) {
		return itemGroupDao.get(id);
	}
	
	@Override
	public ItemGroup get(String name) {
		Objects.requireNonNull(name, "item group name should not be null");
		return itemGroupDao.get(name);
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "item group should not be null");
		itemGroupDao.save(itemGroup);
	}
	
	@Override
	public void save(Collection<ItemGroup> groups) {
		Objects.requireNonNull(groups, "groups should not be null");
		itemGroupDao.save(groups);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "item group should not be null");
		itemGroupDao.saveOrUpdate(itemGroup);
	}
	
	@Override
	public void merge(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "item group should not be null");
		itemGroupDao.merge(itemGroup);
	}
	
}
