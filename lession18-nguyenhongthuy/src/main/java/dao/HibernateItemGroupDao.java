package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.StringType;

import persistence.dto.RemaningItemGroupDto;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao{
	private static final String Q_GET_REMAINING_ITEMS = ""
			+ "SELECT itg.ID " + RemaningItemGroupDto.PROP_ITEM_ID + ",\r\n"
			+ "	   itg.NAME " + RemaningItemGroupDto.PROP_ITEM_NAME + ",\r\n"
			+ "       sum(itd.AMOUNT) " + RemaningItemGroupDto.PROP_AMOUNT_OF_ITEMS + "\r\n"
			+ "  FROM item_group itg\r\n"
			+ "  JOIN item it\r\n"
			+ "    ON itg.ID = it.ITEM_GROUP_ID\r\n"
			+ "  JOIN item_detail itd\r\n"
			+ "    ON itd.ITEM_ID = it.ID\r\n"
			+ " GROUP BY " + RemaningItemGroupDto.PROP_ITEM_ID + ", itg.NAME;";
	
	@SuppressWarnings({"unchecked", "deprecation"})
	@Override
	public List<RemaningItemGroupDto> getRemainingItems() {
		return openSession()
				.createNativeQuery(Q_GET_REMAINING_ITEMS)
				.addScalar(RemaningItemGroupDto.PROP_ITEM_ID, IntegerType.INSTANCE)
				.addScalar(RemaningItemGroupDto.PROP_ITEM_NAME, StringType.INSTANCE)
				.addScalar(RemaningItemGroupDto.PROP_AMOUNT_OF_ITEMS, IntegerType.INSTANCE)
				.setResultTransformer(Transformers.aliasToBean(RemaningItemGroupDto.class))
				.getResultList();
	}
	
}
