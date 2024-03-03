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
		Optional.ofNullable(get(itemGroup.getId()))
			.ifPresentOrElse(val -> update(itemGroup), () -> save(itemGroup));
	}

	@Override
	public void save(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup should not be null");
		itemGroupDao.save(itemGroup);
	}
	
	@Override
	public void save(Collection<ItemGroup> groups) {
		Objects.requireNonNull(groups);
		if (!groups.isEmpty()) {
			itemGroupDao.save(groups);
		}
	}
	
	/*
	--> Chuyển qua dùng batch update
	@Override
	public void save(Collection<ItemGroup> groups) {
		Objects.requireNonNull(groups);
		if (!groups.isEmpty()) {
			// Cứ 1 item group -> gọi 1 hàm save(service) -> save(dao)
			// -> tạo ra 1 [prepared]statement, executeUpdate, open/close connection liên tục
			// JAVA: host
			// MySQL: host
			// --> bị ảnh hưởng bởi yếu tố network
			// --> mạng có vấn đề hàm sẽ bị chậm
			
			// fix --> JDBC --> batch(1 chồng, 1 đống) update
			// update 1 lần 1 đống đối tượng vào database --> hạn chế gửi/đóng connection
			for (ItemGroup group: groups) {
				save(group);
			}
		}
	}*/
	
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
