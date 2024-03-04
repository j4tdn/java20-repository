package service;

import java.time.LocalDate;
import java.util.List;
import java.util.Objects;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public List<Item> getAll() {
		// TODO Auto-generated method stub
		return itemDao.getAll();
	}
	@Override
	public List<Item> getItemByOrderDate(LocalDate purchaseDate) {
		// TODO Auto-generated method stub
		return itemDao.getItemByOrderDate(purchaseDate);
	}
}
