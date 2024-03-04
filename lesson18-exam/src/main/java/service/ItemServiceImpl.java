package service;

import java.time.LocalDate;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.ItemDto1;
import persistence.ItemDto2;
import persistence.ItemDto3;

public class ItemServiceImpl implements ItemService{

	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}
	
	
	@Override
	public List<ItemDto1> getItemDtoWithDate(LocalDate ldate) {
		return itemDao.getItemDtoWithDate(ldate);
	}
	
	 @Override
	public List<ItemDto2> getItemDtoInventory() {
		return itemDao.getItemDtoInventory();
	}
	 
	 @Override
	public List<ItemDto3> getItemsWithMaxSalesPrice() {
		return itemDao.getItemsWithMaxSalesPrice();
	}
}
