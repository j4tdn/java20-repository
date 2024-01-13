package service;

import java.util.Collection;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

import dao.ItemGroupDao;
import dao.JdbcItemGroupDao;
import persistence.ItemGroup;

public class ItemGroupServiceImpl implements ItemGroupService{
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new JdbcItemGroupDao();
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
	public void saveOrUpdate(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup should not be null");
		Optional.ofNullable(itemGroup.getId())
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
	 * --> chuyển qa dùng batch update
	@Override
	public void save(Collection<ItemGroup> groups) {
		Objects.requireNonNull(groups);
		if (!groups.isEmpty()) {
			// cứ 1 item group -> gọi 1 hàm save(service) -> save(dao)
			// -> tạo ra 1 [prepared]statement, executeUpdate, open/close connection liên tục
			// JAVA:host
			//MySQL:host
			// --> bị ảnh hưởng bởi network
			// --> mạng có vấn đề hàm sẽ bị chậm
			
			// fix --> JDBC --> batch(1 chồng, 1 đống) update
			// update 1 lần 1 đống đối tượng vào database --> hạn chế gửi/đóng connection
			for (ItemGroup group: groups) {
				save(group);
			}
		}
	}
	*/
	
	@Override
	public void update(ItemGroup itemGroup) {
		Objects.requireNonNull(itemGroup, "itemGroup should not be null");
		itemGroupDao.update(itemGroup);
	}
	
	
}
