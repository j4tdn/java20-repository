package service;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import dao.HibernateItemDao;
import dao.ItemDao;
import persistence.ItemDto;

public class ItemServiceImpl  implements ItemService{
	private ItemDao itemDao;
	
	public ItemServiceImpl() {
		itemDao = new HibernateItemDao();
	}

	@Override
	public List<ItemDto> getItemByTimeCreatedOrder(String create_at) {
		return itemDao.getItemByTimeCreatedOrder(create_at);
	}

}
