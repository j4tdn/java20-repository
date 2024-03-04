package dao;

import java.time.LocalDate;
import java.util.List;

import persistence.entities.Item;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao {

	private static final String Q_GET_ITEMS_BY_CREATED_TIME = "SELECT * FROM item WHERE ";
	
	public List<Item> getAll(LocalDate localDate) {
		return openSession().createNativeQuery(Q_GET_ITEMS_BY_CREATED_TIME).getResultList();
	}
	
}
