package service;

import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

import dao.ItemDao;
import dao.ItemGroupDao;
import dao.JdbcItemDao;
import dao.JdbcItemGroupDao;
import persistence.Item;
import persistence.ItemGroup;
import persistence.dto.ItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService {

	private ItemGroupDao itemGroupDao;
	private ItemDao itemDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
		itemDao = new JdbcItemDao();
	}
	
	@Override
	public List<ItemGroup> getAll() {
		return itemGroupDao.getAll();
	}

	@Override
	public List<ItemGroup> getItemGroupWithItems() {
		List<Item> items = itemDao.getAll(); // Item-ItemGroup
		Map<ItemGroup, List<Item>> itemGroupItemsMap = 
				items.stream().collect(Collectors.groupingBy(Item::getGroup));
		
		return itemGroupItemsMap.entrySet()
			.stream()
			.map(e -> {
				ItemGroup itemGroup = e.getKey();
				itemGroup.setItems(e.getValue());
				return itemGroup;
			})
			.collect(Collectors.toList());
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
		Objects.requireNonNull(name, "item group name should not be null");
		return itemGroupDao.get(name);
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup should not be null");
		int id = itemGroup.getId();
		var group = get(id);
		
		Optional.ofNullable(group)
			.ifPresentOrElse(val -> update(itemGroup), () -> save(itemGroup));
	}

	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup should not be null");
		itemGroupDao.save(itemGroup);
	}
	
	@Override
	public void save(Collection<ItemGroup> groups) {
		Objects.requireNonNull(groups, "itemGroups should not be null");
		if (!groups.isEmpty()) {
			itemGroupDao.save(groups);
		}
	}

//	Chuyển qua dùng batch update
//	@Override
//	public void save(Collection<ItemGroup> groups) {
//		Objects.requireNonNull(groups, "itemGroups should not be null");
//		if (!groups.isEmpty()) {
//			for (ItemGroup itemG: groups) {
//				save(itemG);
//			}
//		}
//	}
	
	@Override
	public void update(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup should not be null");
		itemGroupDao.update(itemGroup);
	}
	
	@Override
	public void merge(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup should not be null");
		itemGroupDao.merge(itemGroup);
	}

}
