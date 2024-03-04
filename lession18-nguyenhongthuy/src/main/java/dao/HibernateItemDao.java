package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;
import org.hibernate.type.TimeType;


import persistence.dto.ItemTimeDto;
public class HibernateItemDao extends BaseHibernateDao implements ItemDao{
	private static final String Q_GET_ITEMS_BY_TIME_CREATED_ORDER = ""
			+ "SELECT it.ID " + ItemTimeDto.PROP_ITEM_ID + ",\r\n"
			+ "		it.NAME " + ItemTimeDto.PROP_ITEM_NAME + ",\r\n"
			+ "        TIME(od.CREATED_AT) " + ItemTimeDto.PROP_TIME_CREATED_AT + "\r\n"
			+ "FROM item it\r\n"
			+ "JOIN item_detail itd\r\n"
			+ "	ON it.ID = itd.ITEM_ID\r\n"
			+ "JOIN order_detail odd\r\n"
			+ "	ON itd.ID = odd.ITEM_DETAIL_ID\r\n"
			+ "JOIN `order` od\r\n"
			+ "	ON od.ID = odd.ORDER_ID\r\n"
			+ "WHERE CAST(od.CREATED_AT AS DATE) = :pdate\n"
			+ "GROUP BY " + ItemTimeDto.PROP_ITEM_ID + ", " + ItemTimeDto.PROP_TIME_CREATED_AT + "\r\n"
			+ "ORDER BY " + ItemTimeDto.PROP_ITEM_ID + " ASC, " + ItemTimeDto.PROP_TIME_CREATED_AT + " DESC";
	
	private static final String Q_3 = ""
			+ "SELECT it.ID, it.NAME, SUM(odd.AMOUNT) SALES_AMOUNT\r\n"
			+ "  FROM item it\r\n"
			+ "JOIN item_detail id\r\n"
			+ "ON it.ID = id.ITEM_ID\r\n"
			+ "JOIN order_detail odd\r\n"
			+ "ON id.ID = odd.ITEM_DETAIL_ID\r\n"
			+ "JOIN order od\r\n"
			+ "ON od.ID = odd.ORDER_ID\r\n"
			+ "WHERE year(od.CREATED_AT) = '2023'\r\n"
			+ "GROUP BY it.ID, it.NAME\r\n"
			+ "ORDER BY SALES_AMOUNT desc, it.ID desc\r\n"
			+ "LIMIT 3;";
	
	@SuppressWarnings({"unchecked", "deprecation"})
	@Override
	public List<ItemTimeDto> getItemsByTimeCreatedOrder(String date) {
		return openSession()
				.createNativeQuery(Q_GET_ITEMS_BY_TIME_CREATED_ORDER)
				.setParameter("pdate", date, StringType.INSTANCE)
				.addScalar(ItemTimeDto.PROP_ITEM_ID, IntegerType.INSTANCE)
				.addScalar(ItemTimeDto.PROP_ITEM_NAME, StringType.INSTANCE)
				.addScalar(ItemTimeDto.PROP_TIME_CREATED_AT, TimeType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(ItemTimeDto.class))
				.getResultList();
	}
	
	
	
	
	
}
