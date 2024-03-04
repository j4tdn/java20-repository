package dao;

import java.util.List;

import persistence.Item;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao{
	
	@Override
	public List<Item> getAll() {
		return openSession()
					.createNativeQuery("SELECT * FROM item", Item.class)
					.getResultList();
	}
	
	
}
