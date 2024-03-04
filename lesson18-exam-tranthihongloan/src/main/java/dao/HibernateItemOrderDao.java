package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import persistence.dto.ItemOrderDto;

public class HibernateItemOrderDao extends BaseHibernateDao implements ItemOrderDao{
	
	private static final String Q_GET_ITEMS_ORDER_BY_DAY = ""
	
			+ "SELECT it.ID " + ItemOrderDto.PROP_IO_ID + " ,\n"
			+ "	      it.NAME " + ItemOrderDto.PROP_IO_NAME + ",\n"
			+ "       CAST(o.CREATED_AT AS TIME) " + ItemOrderDto.PROP_IO_CREATED_TIME + "\n"
			+ "  FROM `order` o\n"
			+ "  JOIN order_detail od\n"
			+ "    ON o.ID = od.ORDER_ID\n"
			+ "  JOIN item it\n"
			+ "    ON od.ITEM_DETAIL_ID = it.ID\n"
			+ " WHERE CAST(o.CREATED_AT AS DATE) = :pcreatedtime";

	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemOrderDto> getItemsOrderByDay(String createdAt) {
		return openSession()
			.createNativeQuery(Q_GET_ITEMS_ORDER_BY_DAY)
			.setParameter("pcreatedtime", createdAt, StandardBasicTypes.STRING)
			.addScalar(ItemOrderDto.PROP_IO_ID, StandardBasicTypes.INTEGER)
			.addScalar(ItemOrderDto.PROP_IO_NAME, StandardBasicTypes.STRING)
			.addScalar(ItemOrderDto.PROP_IO_CREATED_TIME, StandardBasicTypes.TIME)
			.setResultTransformer(Transformers.aliasToBean(ItemOrderDto.class))
			.getResultList();
	}
	
}
