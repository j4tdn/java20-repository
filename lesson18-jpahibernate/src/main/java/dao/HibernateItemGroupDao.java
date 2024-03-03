package dao;

import java.sql.PreparedStatement;
import java.util.Collection;
import java.util.List;

import org.hibernate.transform.AliasToBeanResultTransformer;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.StringType;

import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao {
	
	// native query: viết query ở ngôn ngữ mysql/oracle
	
	// jpql/hql: viết query ở dạng/theo tên của entities/attribute
	//         : jpq/hibernate tự chuyển đổi sang native db mà mình đang kết nối đến
	//
	
	// name query: native/jpql/hql
	// thay vì truyền native/jpql/hql vào
	// khai báo cho sql nớ 1 cái name --> truyền name vào là xong
	// khai báo ở chỗ Entity 
	
	private static final int BATCH_SIZE = 50;
	
//	private static final String Q_GET_ALL_ITEM_GROUPS = ""
//			+ "SELECT * FROM item_group";
	
//	private static final String Q_GET_ALL_ITEM_GROUPS = ""
//	+ "SELECT ig FROM ItemGroup ig";	
	
//	private static final String Q_GET_ALL_ITEM_GROUPS = ""
//			+ "FROM ItemGroup";
	
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT * FROM item_group WHERE NAME = :pName";
	
	
//  --> native query	
//	@Override
//	public List<ItemGroup> getAll() {
//		// Từng dòng trả về từ SQL sẽ được mapping vào entity
//		// Muốn map được, entity phải mapping với columns của sql result
//		return openSession()
//					.createNativeQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class)
//					.getResultList();
//	}

//  jpql/hql	
//	@Override
//	public List<ItemGroup> getAll() {
//		return openSession()
//					.createQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class)
//					.getResultList();
//	}
	
	@Override
	public List<ItemGroup> getAll() {
		return openSession()
					.createNamedQuery(ItemGroup.Q_GET_ALL, ItemGroup.class)
					.getResultList();
	}
	
	private static final String Q_COUNT_ITEMS_BY_ITEM_GROUP = ""
			+ "SELECT itg.ID "+ ItemGroupDto.PROP_IG_IG+",\n"
			+ "	  	  itg.NAME " + ItemGroupDto.PROP_IG_NAME + " ,\n"
			+ "	   	  group_concat(concat(it.ID, '-', it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') "+ ItemGroupDto.PROP_ITEMS+",\n"
			+ "       sum(itd.AMOUNT) "+ ItemGroupDto.PROP_TOTAL_OF_ITEMS +"\n"
			+ "  FROM item_group itg\n"
			+ "  JOIN item it\n"
			+ "    ON itg.ID = it.ITEM_GROUP_ID\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON itd.ITEM_ID = it.ID\n"
			+ " GROUP BY itg.ID, itg.NAME;";
	
	private static final String Q_MERGE_ITEM_GROUP = ""
			+ "CALL P_MERGE_INTO_ITEM_GROUP(:pId, :pName)";
	
	private static final String Q_INSERT_ITEM_GROUP = ""
			+ "INSERT INTO item_group(ID, NAME)\n"
			+ "VALUES(:pId, :pName)";
	// auto get sql row --> set java object
	// sql --> column - alias
	// java --> attribute - name/getter/setter
	
	// jdbc --> setInt(?1, val), getInt(alias)
	// jpa/hibernate 
	// 		: + setParameter(?1, val, type)
	// 		: + addScalar(alias, type)
	
	// 1 --> alias phải là tên thuộc tính
	// 2 --> addScalar cx phải dùng tên thuộc tính - alias
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		return openSession()
				.createNativeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP)
				.addScalar(ItemGroupDto.PROP_IG_IG, IntegerType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_TOTAL_OF_ITEMS, LongType.INSTANCE)
				.addScalar(ItemGroupDto.PROP_ITEMS, StringType.INSTANCE)
				.setResultTransformer(new AliasToBeanResultTransformer(ItemGroupDto.class))
				.getResultList();
	}
	
//	@Override
//	public List<ItemGroupDto> countItemsByItemGroup() {
		// createNativeQuery(sql, T.class)
		// sql result row -> T interface
		// sql result rows -> List<T>
		
		// createNativeQuery(sql)
		// sql result row -> Object[]
		// sql result rows -> List<Object[]>
		
		// rows(List<Object[]) -- rs(ResultSet(jdbc))
//		List<Object[]> rows = openSession()
//				.createNativeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP)
//				.getResultList();
//		List<ItemGroupDto> res = new ArrayList<>();
//		for (Object[] row: rows) {
//			ItemGroupDto igd = new ItemGroupDto();
//			igd.setIgId(Integer.parseInt(String.valueOf(row[0])));
//			igd.setIgName(String.valueOf(row[1]));
//			igd.setItems(String.valueOf(row[2]));
//			igd.setTotalOfItems(Long.parseLong(String.valueOf(row[3])));
//			res.add(igd);
//		}
//		return res;
	
	@Override
	public ItemGroup get(int id) {
		// hỗ trợ khi entity instance theo id
		// truy vấn theo thuộc tính bất kỳ thì phải tự viết query, truyền tham số
		return openSession().get(ItemGroup.class, id);
	}
	
	@Override
	public ItemGroup get(String name) {
		return openSession().createNativeQuery(Q_GET_ITEM_GROUP_BY_NAME, getEntityClass())
					.setParameter("pName", name, StringType.INSTANCE)
					.uniqueResult(); // null if not found
					// .getSingleResult(); javax.persistence.NoResultException: No entity found for query
	}
	
	@Override
	public void save(ItemGroup itemGroup) {
		executeWithTransaction(session -> session.save(itemGroup));
	}
	
	@Override
	public void save(Collection<ItemGroup> groups) {
		executeWithTransaction(session -> {
			session.doWork(connection -> {
				try (PreparedStatement pst = connection.prepareStatement(Q_INSERT_ITEM_GROUP)){
					int batchCount = 0;
					for (ItemGroup itemGroup: groups) {
						// cân nhắc vs setObject cho null value vs KDL ko phải chuỗi
						pst.setInt(1, itemGroup.getId());
						pst.setString(2, itemGroup.getName());
						pst.addBatch();

						// cứ batch chứa 50ptu thì execute bớt 1 lần
						if (++batchCount % BATCH_SIZE == 0) {
							pst.executeBatch();
						}
					}
					// execute all(còn lại)
					pst.executeBatch();
				} catch (Exception e) {
					e.printStackTrace();
				}
			});
		});
	}
	
	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		executeWithTransaction(session -> session.saveOrUpdate(itemGroup));
	}
	
	@Override
	public void merge(ItemGroup itemGroup) {
		executeWithTransaction(session -> {
			session.createNativeQuery(Q_MERGE_ITEM_GROUP)
			.setParameter("pId", itemGroup.getId(), StandardBasicTypes.INTEGER) // IntegerType.INSTANCE
			.setParameter("pName", itemGroup.getName(), StandardBasicTypes.STRING) // StringType.INSTANCE
			.executeUpdate();
		});
	}
	
	private Class<ItemGroup> getEntityClass() {
		return ItemGroup.class;
	}
}