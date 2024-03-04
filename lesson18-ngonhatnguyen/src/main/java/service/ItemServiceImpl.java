package service;

import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.dto.ItemDateDto;
import persistence.dto.ItemSalesAmountDto;

public class ItemServiceImpl implements ItemService {
	
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	public List<ItemDateDto> getItemsByCreatedDate(String createdAt) {
		return itemDao.getItemsByCreatedDate(createdAt);
	}
	
	@Override
	public List<ItemSalesAmountDto> getItemsBySales(int year) {
		return itemDao.getItemsBySales(year);
	}
}
