package dao;

import java.util.List;

import persistence.entities.Item;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao {

	private static final String GET_ALL_ITEMS = ""
			+ "SELECT * FROM item";
	
	@Override
	public List<Item> getAll() {
		return openSession()
					.createNativeQuery(GET_ALL_ITEMS, Item.class)
					.getResultList();
	}
}
