package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.dto.ItemDto;
import persistence.entities.Item;

public class ItemServiceImpl implements ItemService {

	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public List<ItemDto> getItemsBySalesDate(LocalDate date) {
		Objects.requireNonNull(date, "item group should not be null");
		return itemDao.getItemsBySalesDate(date);
	}
	
	@Override
	public List<Item> getAll() {
		return itemDao.getAll();
	}
}
