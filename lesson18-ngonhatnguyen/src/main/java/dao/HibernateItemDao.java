package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.dto.ItemDateDto;
import persistence.dto.ItemSalesAmountDto;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao {

	private static final String Q_GET_ITEM_BY_CREATED_AT = ""
			+ "SELECT it.ID "+ ItemDateDto.PROP_IT_ID +", \n"
			+ "		  it.NAME " + ItemDateDto.PROP_IT_NAME + ", \n"
			+ "		  TIME(od.CREATED_AT) " + ItemDateDto.PROP_OD_CREATED_AT + "\r\n"
			+ "FROM item it\r\n"
			+ "JOIN item_detail id\r\n"
			+ "ON it.ID = id.ITEM_ID\r\n"
			+ "JOIN order_detail odd\r\n"
			+ "ON id.ID = odd.ITEM_DETAIL_ID\r\n"
			+ "JOIN `order` od\r\n"
			+ "ON od.ID = odd.ORDER_ID\r\n"
			+ "WHERE cast(od.CREATED_AT as DATE) = :pCreatedAt";
	
	private static final String Q_GET_ITEMS_BY_SALES_AMOUNT = ""
			+ "SELECT it.ID " + ItemSalesAmountDto.PROP_IT_ID + ", \n"
			+ "		  it.NAME " + ItemSalesAmountDto.PROP_IT_NAME + ", \n"
			+ "		  SUM(odd.AMOUNT) " + ItemSalesAmountDto.PROP_SALES_AMOUNT + "\r\n"
			+ "  FROM item it\r\n"
			+ "JOIN item_detail id\r\n"
			+ "ON it.ID = id.ITEM_ID\r\n"
			+ "JOIN order_detail odd\r\n"
			+ "ON id.ID = odd.ITEM_DETAIL_ID\r\n"
			+ "JOIN `order` od\r\n"
			+ "ON od.ID = odd.ORDER_ID\r\n"
			+ "WHERE year(od.CREATED_AT) = :pYear \r\n"
			+ "GROUP BY it.ID, it.NAME\r\n"
			+ "ORDER BY " + ItemSalesAmountDto.PROP_SALES_AMOUNT + " desc, it.ID desc\r\n"
			+ "LIMIT 3";
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	public List<ItemDateDto> getItemsByCreatedDate(String createdAt) {
		return openSession()
					.createNativeQuery(Q_GET_ITEM_BY_CREATED_AT)
					.setParameter("pCreatedAt", createdAt, StandardBasicTypes.STRING)
					.setResultTransformer(Transformers.aliasToBean(ItemDateDto.class))
					.getResultList();
	}

	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ItemSalesAmountDto> getItemsBySales(int year) {
		return openSession()
					.createNativeQuery(Q_GET_ITEMS_BY_SALES_AMOUNT)
					.setParameter("pYear", year, StandardBasicTypes.INTEGER)
					.setResultTransformer(Transformers.aliasToBean(ItemSalesAmountDto.class))
					.getResultList();
	}
}
