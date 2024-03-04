package dao;

import java.time.LocalDate;
import java.util.List;

import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LocalTimeType;
import org.hibernate.type.StringType;

import persistence.ItemDto1;
import persistence.ItemDto2;
import persistence.ItemDto3;
import utils.DateUtils;

public class HibernateItemDao extends BaseHibernateDao implements ItemDao {

	private static final String GET_ITEMS_BY_DATE = ""
			+ "SELECT it.ID " + ItemDto1.PROP_ID +  ",\n"
			+ "		  it.NAME " + ItemDto1.PROP_NAME + ", \n"
			+ "		  CAST(od.CREATED_AT AS TIME)" + ItemDto1.PROP_TIME + "\n"
			+ "  FROM item it\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON it.ID = itd.ITEM_ID\n"
			+ "  JOIN order_detail odd\n"
			+ "    ON odd.ITEM_DETAIL_ID = itd.ID\n"
			+ "  JOIN `order` od\n"
			+ "    ON od.ID = odd.ORDER_ID \n"
			+ " WHERE DATE(od.CREATED_AT) = :pDate\n"
			+ " ORDER BY od.CREATED_AT DESC, ID ASC";

	private static final String GET_ITEMS_INVENTORY = ""
			+ " SELECT it.ID " + ItemDto2.PROP_ID + ", \n"
			+ "        it.NAME " + ItemDto2.PROP_NAME + ",\n"
			+ "        itd.AMOUNT " + ItemDto2.PROP_AMOUNT + "\n"			
			+ "   FROM item it\n"
			+ "   JOIN item_detail itd\n"
			+ "     ON it.ID = itd.ITEM_ID";
	
	private static final String GET_TOP3_SALES_PRICE = ""
			+ "SELECT it.ID" + ItemDto3.PROP_ID + ",\n"
			+ "       it.NAME " + ItemDto3.PROP_NAME + ",\n"
			+ "		  odd.AMOUNT " + ItemDto3.PROP_AMOUNT + "\n"
			+ "  FROM item it\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON it.ID = itd.ITEM_ID\n"
			+ "  JOIN order_detail odd\n"
			+ "    ON odd.ITEM_DETAIL_ID = itd.ID\n"
			+ "  JOIN `order` od\n"
			+ "    ON od.ID = odd.ORDER_ID\n"
			+ "WHERE YEAR(od.CREATED_AT) = :pYear\n"
			+ " ORDER BY odd.AMOUNT DESC, it.ID ASC\n"
			+ " LIMIT 3";
			
	
	@Override
	public List<ItemDto1> getItemDtoWithDate(LocalDate ldate) {
		return openSession().createNativeQuery(GET_ITEMS_BY_DATE)
				.setParameter("pDate", DateUtils.toSqlDate(ldate))
				.addScalar(ItemDto2.PROP_ID, IntegerType.INSTANCE)
				.addScalar(ItemDto2.PROP_NAME, StringType.INSTANCE)
				.addScalar(ItemDto2.PROP_AMOUNT, LocalTimeType.INSTANCE)
				.setResultTransformer(new AliasToBeanResultTransformer(ItemDto2.class))
				.getResultList();
	}
	
	@Override
	public List<ItemDto2> getItemDtoInventory() {
		return openSession().createNativeQuery(GET_ITEMS_INVENTORY)
				.addScalar(ItemDto2.PROP_ID, IntegerType.INSTANCE)
				.addScalar(ItemDto2.PROP_NAME, StringType.INSTANCE)
				.addScalar(ItemDto2.PROP_AMOUNT, IntegerType.INSTANCE)
				.setResultTransformer(new AliasToBeanResultTransformer(ItemDto2.class))
				.getResultList();
	}
	
	
	@Override
	public List<ItemDto3> getItemsWithMaxSalesPrice() {
		openSession().createNativeQuery(GET_TOP3_SALES_PRICE)
		.addScalar(ItemDto3.PROP_ID, IntegerType.INSTANCE)
		.addScalar(ItemDto3.PROP_NAME, StringType.INSTANCE)
		.addScalar(ItemDto3.PROP_AMOUNT, IntegerType.INSTANCE)
		.setResultTransformer(new AliasToBeanResultTransformer(ItemDto3.class))
		.getResultList();
	}
}
