package dao;

import java.util.List;

import org.hibernate.query.NativeQuery;
import org.hibernate.type.StringType;

import persistence.entities.ItemGroup;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao{

	//
	//jpql/hql: vieet query ở dạng entities/attribute
	//			jpq/hibernate tự chuyển đổi sang native db
//	private static final String Q_GET_ALL_ITEM_GROUPS = ""
//			+ "SELECT * FROM item_group";
			
	// name query: native/jpql/hql
	// thay vì truyền native/jpql/hql vào
	// khai báo cho sql nớ 1 cái name --> truyền name vào là xong
	// khai báo ở chỗ Entity 
	
//	private static final String Q_GET_ALL_ITEM_GROUPS = ""
//			+ "FROM ItemGroup";
	
	
	private static final String  Q_GET_ITE_GROUP_BY_NAME =""
			+"SELECT * FROM item_group WHERE NAME = :pName";
	
	//--> native query
//	@Override
//	public List<ItemGroup> getAll() {
//		//Từng dòng trả về từ SQL sẽ đuọc mapping vào ItemGroup
//		//Muoosn mao đưcoj,  ItemGroup phải là Entity
//		return openSession()
//					.createNativeQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class)
//					.getResultList();
//		
//	}
	
	//jpql/hql
//	@Override
//	public List<ItemGroup> getAll() {
//		return openSession()
//					.createQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class)
//					.getResultList();
//		
//	}
	
	@Override
	public List<ItemGroup> getAll() {
		return openSession()
					.createNamedQuery(ItemGroup.Q_GET_ALL, ItemGroup.class)
					.getResultList();
		
	}
	
	@Override
	public ItemGroup get(int id) {
		//hỗ trọ khi entity instance theo id
		return openSession().get(ItemGroup.class, id);
	}

	@Override
	public ItemGroup get(String name) {
		return openSession().createNativeQuery(Q_GET_ITE_GROUP_BY_NAME, getEntityClass())
							.setParameter("pName", name, StringType.INSTANCE)
							.uniqueResult();
//							.getSingleResult();
	}

	private Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}
	
}
