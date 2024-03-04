package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.entities.Item;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	public List<Item> getAll(LocalDate localDate) {
		return itemDao.getAll(localDate);
	}
	
}
