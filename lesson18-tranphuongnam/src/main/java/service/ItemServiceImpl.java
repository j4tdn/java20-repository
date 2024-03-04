package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.dtos.ItemDTO;
import persistence.entities.Item;

public class ItemServiceImpl implements ItemService{
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	@Override
	public List<ItemDTO> getItemByOrderDate(String date) {
		return itemDao.getItemByOrderDate(date);
	}
	
	@Override
	public List<ItemDTO> getItemByAmountInOrderByYear(int year) {
		return itemDao.getItemByAmountInOrderByYear(year);
	}
	
	@Override
	public List<Item> getAllItemByItemGroup() {
		return itemDao.getAllItemByItemGroup();
	}
}
