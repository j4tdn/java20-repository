package dao;

import java.time.LocalDate;
import java.util.Date;
import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.DateType;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.Item;
import persistence.ItemDto;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao {
	private static final String Q_GET_ITEM_BY_DATE ="SELECT it.ID "+ItemDto.PROP_IT_ID+",\r\n"
	        + "	   it.`NAME` "+ItemDto.PROP_IT_NAME+ ",\r\n"
	        + "	   time(od.CREATED_AT) AS CREATE_TIME "+ItemDto.PROP_CREATE_AT+ "\r\n"
	        + "	FROM item it\r\n"
	        + "	JOIN item_detail itd\r\n"
	        + "		ON it.ID =itd.ITEM_ID\r\n"
	        + "	JOIN order_detail odt\r\n"
	        + "		ON itd.ID = odt.ITEM_DETAIL_ID\r\n"
	        + "	JOIN `order` od\r\n"
	        + "		ON od.ID =odt.ORDER_ID\r\n"
	        + "	 WHERE cast(od.CREATED_AT AS DATE) = :create_at \n"
	        + "GROUP BY " + ItemDto.PROP_IT_ID + ", " + ItemDto.PROP_CREATE_AT + "\r\n"
			+ "ORDER BY " + ItemDto.PROP_IT_ID + " ASC, " + ItemDto.PROP_CREATE_AT + " DESC";
	
	private static final String Q_GET_ITEM ="SELECT it.*, itg.*\r\n"
			+ "FROM item it\r\n"
			+ "JOIN item_group itg ON it.ITEM_GROUP_ID = itg.ID\r\n"
			+ "ORDER BY it.ITEM_GROUP_ID";

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemDto> getItemByTimeCreatedOrder(String create_at) {
	    return openSession()
	            .createNativeQuery(Q_GET_ITEM_BY_DATE)
	            .setParameter("create_at", create_at)
	            .addScalar(ItemDto.PROP_IT_ID, IntegerType.INSTANCE)
	            .addScalar(ItemDto.PROP_IT_NAME, StringType.INSTANCE)
	            .addScalar(ItemDto.PROP_CREATE_AT, DateType.INSTANCE)
	            .setResultTransformer(Transformers.aliasToBean(ItemDto.class))
	            .getResultList();
	}

	@Override
	public List<Item> getItem() {
		return openSession()
				.createNativeQuery(Q_GET_ITEM, getEntityClass())
				.getResultList();
	}
	private Class<Item> getEntityClass() {
		return Item.class;
	}


	

}
