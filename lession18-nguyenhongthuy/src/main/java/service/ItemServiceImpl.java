package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.dto.ItemTimeDto;

public class ItemServiceImpl implements ItemService{
	
	public static ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	public List<ItemTimeDto> getItemsByTimeCreatedOrder(String date) {
		return itemDao.getItemsByTimeCreatedOrder(date);
	}
}
