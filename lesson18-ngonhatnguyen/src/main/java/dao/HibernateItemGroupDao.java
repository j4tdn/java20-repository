package dao;

import java.util.List;

import org.hibernate.transform.Transformers;

import persistence.dto.ItemGroupAmountDto;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao {
	
	private static final String Q_GET_ITEM_BY_AMOUNT = ""
			+ "SELECT itg.ID " + ItemGroupAmountDto.PROP_IT_ID + ",\r\n"
			+ "	   itg.NAME " + ItemGroupAmountDto.PROP_IT_NAME + ",\r\n"
			+ "	   sum(itd.AMOUNT) " + ItemGroupAmountDto.PROP_OD_CREATED_AT + "\r\n"
			+ "  FROM item_group itg\r\n"
			+ "  JOIN item it\r\n"
			+ "    ON itg.ID = it.ITEM_GROUP_ID\r\n"
			+ "  JOIN item_detail itd\r\n"
			+ "    ON itd.ITEM_ID = it.ID\r\n"
			+ " GROUP BY itg.ID, itg.NAME";
		
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemGroupAmountDto> getItemsByAmount() {
		return openSession()
					.createNativeQuery(Q_GET_ITEM_BY_AMOUNT)
					.setResultTransformer(Transformers.aliasToBean(ItemGroupAmountDto.class))
					.getResultList();
	}
}
