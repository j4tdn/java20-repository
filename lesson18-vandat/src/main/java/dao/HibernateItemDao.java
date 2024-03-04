package dao;

import java.sql.Date;
import java.time.LocalDate;
import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.DateType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalDateTimeType;
import org.hibernate.type.StringType;

import persistence.dto.ItemDto;
import persistence.entities.Item;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao {

	private static final String Q_GET_ITEMS_BY_SALES_DATE = ""
			+ "SELECT it.ID " + ItemDto.PROP_ID + " ,\n"
			+ "       it.NAME " + ItemDto.PROP_NAME + " ,\n"
			+ "		  od.CREATED_AT " + ItemDto.PROP_CREATED_AT + " \n"
			+ "  FROM item it\n"
			+ "  JOIN item_detail id\n"
			+ "    ON it.ID = id.ITEM_ID\n"
			+ "  JOIN order_detail odd\n"
			+ "    ON id.ID = odd.ITEM_DETAIL_ID\n"
			+ "  JOIN `order` od\n"
			+ "    ON odd.ORDER_ID = od.ID\n"
			+ " WHERE cast(od.CREATED_AT AS DATE) = :pDate"
			+ " ORDER BY od.CREATED_AT DESC, it.ID";
	
	private static final String GET_ALL_ITEMS = ""
			+ "SELECT * FROM item";
	
	@SuppressWarnings("deprecation")
	@Override
	public List<ItemDto> getItemsBySalesDate(LocalDate localDate) {
//		Date date = Date.valueOf(localDate);
//		return openSession().createNativeQuery(Q_GET_ITEMS_BY_SALES_DATE, Item.class)
//				.setParameter("pDate", date, DateType.INSTANCE)
//				.getResultList();
		
		Date date = Date.valueOf(localDate);
		return openSession().createNativeQuery(Q_GET_ITEMS_BY_SALES_DATE, ItemDto.class)
				.setParameter("pDate", date, DateType.INSTANCE)
				.addScalar(ItemDto.PROP_ID, IntegerType.INSTANCE)
				.addScalar(ItemDto.PROP_NAME, StringType.INSTANCE)
				.addScalar(ItemDto.PROP_CREATED_AT, LocalDateTimeType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemDto.class))
				.getResultList();
	}
	
	@Override
	public List<Item> getAll() {
		return openSession()
				.createNativeQuery(GET_ALL_ITEMS, Item.class)
				.getResultList();
	}
}
