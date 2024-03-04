package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.dto.RemaningItemGroupDto;

public class ItemGroupServiceImpl implements ItemGroupService{
	public static ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl(){
		itemGroupDao = new HibernateItemGroupDao();
	}
	
	@Override
	public List<RemaningItemGroupDto> getRemainingItems() {
		return itemGroupDao.getRemainingItems();
	}
}
