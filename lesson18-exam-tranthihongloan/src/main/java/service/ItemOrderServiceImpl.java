package service;

import java.util.List;

import dao.HibernateItemOrderDao;
import dao.ItemOrderDao;
import persistence.dto.ItemOrderDto;

public class ItemOrderServiceImpl implements ItemOrderService{

	private ItemOrderDao itemOrderDao;
	
	public ItemOrderServiceImpl() {
		itemOrderDao = new HibernateItemOrderDao();
	}
	
	@Override
	public List<ItemOrderDto> getItemsOrderByDay(String time) {
		return itemOrderDao.getItemsOrderByDay(time);
	}

}
