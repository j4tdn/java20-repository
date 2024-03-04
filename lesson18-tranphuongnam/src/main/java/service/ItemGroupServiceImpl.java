package service;

import java.util.List;

import dao.HibernateItemGroupDao;
import dao.ItemGroupDao;
import persistence.dtos.ItemGroupDTO;

public class ItemGroupServiceImpl implements ItemGroupService{
	
	private ItemGroupDao itemGroupDao;
	
	public ItemGroupServiceImpl() {
		itemGroupDao = new HibernateItemGroupDao();
	}
	

	@Override
	public List<ItemGroupDTO> getAllItemGroupDTO() {
		return itemGroupDao.getAllItemGroupDTO();
	}
}