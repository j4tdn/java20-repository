package service;

import java.time.LocalDate;
import java.util.List;

import dao.ItemDao;
import dao.JdbcItemDao;
import persistence.Item;

public class ItemServiceImpl implements ItemService{

	private ItemDao itemdao;
	
	public ItemServiceImpl() {
		itemdao = new JdbcItemDao();
	}
	
	@Override
	public List<Item> getAll() {
		return itemdao.getAll();
	}
	
	@Override
	public List<Item> getItemsBySalesDate(LocalDate date) {
		if (date == null) {
			return List.of();
		}
		return itemdao.getItemsBySalesDate(date);
	}
}
