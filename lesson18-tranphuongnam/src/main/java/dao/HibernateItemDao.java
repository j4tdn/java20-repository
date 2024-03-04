package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.dtos.ItemDTO;
import persistence.entities.Item;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao{
	
	private static final String Q_GET_ITEM_BY_DATE = 
			"SELECT it.ID   AS " + ItemDTO.ID + " , \n"
			+ "	    it.NAME AS " + ItemDTO.NAME+ ", \n"
			+ "     cast(CREATED_AT AS DATE) AS " + ItemDTO.CREATE_AT +"\n"
			+ "  FROM `order` od\n"
			+ "  JOIN `order_detail` odd\n"
			+ "	ON od.ID = odd.ORDER_ID\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON odd.ITEM_DETAIL_ID = itd.ID\n"
			+ "  JOIN item it\n"
			+ "    ON it.ID = itd.ITEM_ID\n"
			+ " WHERE cast(CREATED_AT AS DATE) = str_to_date(:date, '%d/%m/%Y')\n"
			+ " ORDER BY CREATED_AT DESC, ID ASC;";
	
	private static final String Q_GET_ITEM_BY_AMOUNT_IN_ORDER_AND_YEAR = 
			"  SELECT it.ID AS " + ItemDTO.ID + ", \n"
			+ "		 it.NAME AS " + ItemDTO.NAME+", \n"
			+ "		SUM(odd.AMOUNT)\n"
			+ "  FROM `order` od\n"
			+ "  JOIN `order_detail` odd\n"
			+ "	ON od.ID = odd.ORDER_ID\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON odd.ITEM_DETAIL_ID = itd.ID\n"
			+ "  JOIN item it\n"
			+ "    ON it.ID = itd.ITEM_ID\n"
			+ " WHERE year(od.CREATED_AT) = :year\n"
			+ " GROUP BY it.ID, it.NAME\n"
			+ " ORDER BY SUM(odd.AMOUNT) DESC, it.ID DESC \n"
			+ " LIMIT 3";
	
	private static final String Q_GET_ALL_ITEM_BY_ITEM_GROUP = 
			" SELECT it.*,ig.*\n"
			+ "   FROM item it\n"
			+ "   JOIN item_group ig\n"
			+ "     ON it.ITEM_GROUP_ID = ig.ID;";
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ItemDTO> getItemByOrderDate(String date) {
		return openSession().createNativeQuery(Q_GET_ITEM_BY_DATE)
							.setParameter("date", date)
							.addScalar(ItemDTO.ID, StandardBasicTypes.INTEGER)
							.addScalar(ItemDTO.NAME, StandardBasicTypes.STRING)
							.setResultTransformer(Transformers.aliasToBean(ItemDTO.class))
							.getResultList();
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemDTO> getItemByAmountInOrderByYear(int year) {
		return openSession().createNativeQuery(Q_GET_ITEM_BY_AMOUNT_IN_ORDER_AND_YEAR)
				.setParameter("year", year)
				.addScalar(ItemDTO.ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemDTO.NAME, StandardBasicTypes.STRING)
				.setResultTransformer(Transformers.aliasToBean(ItemDTO.class))
				.getResultList();
	}
	
	public List<Item> getAllItemByItemGroup(){
		return openSession().createNativeQuery(Q_GET_ALL_ITEM_BY_ITEM_GROUP, Item.class)
							.getResultList();
	}
}
