package dao;

import java.util.List;

import org.hibernate.transform.Transformers;
import org.hibernate.type.StandardBasicTypes;

import dto.ItemGroupDTO;
import persistence.ItemGroup;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao{
	
	private static final String Q_GET_ALL_ITEM_GROUP_DTO = 
			"SELECT ig.ID AS " + ItemGroupDTO.ID + "\n"
			+ "	    ,ig.NAME AS " + ItemGroupDTO.NAME + "\n"
			+ "     ,SUM(AMOUNT) AS "+ ItemGroupDTO.AMOUNT +" \n"
			+ "  FROM item_group ig\n"
			+ "  JOIN item it\n"
			+ "	ON ig.ID = it.ITEM_GROUP_ID\n"
			+ "  JOIN item_detail itd\n"
			+ "	ON it.ID = itd.ITEM_ID\n"
			+ " GROUP BY ig.ID, ig.NAME;"; 
	
	@Override
	public List<ItemGroup> getAll() {
		return openSession()
					.createNativeQuery("SELECT * FROM item_group", ItemGroup.class)
					.getResultList();
	}
	
	@SuppressWarnings({ "unchecked", "deprecation" })
	@Override
	public List<ItemGroupDTO> getAllItemGroupDTO() {
		return openSession()
				.createNativeQuery(Q_GET_ALL_ITEM_GROUP_DTO)
				.addScalar(ItemGroupDTO.ID, StandardBasicTypes.INTEGER)
				.addScalar(ItemGroupDTO.NAME, StandardBasicTypes.STRING)
				.addScalar(ItemGroupDTO.AMOUNT,StandardBasicTypes.INTEGER)
				.setResultTransformer(Transformers.aliasToBean(ItemGroupDTO.class))
				.getResultList();
	}
}
