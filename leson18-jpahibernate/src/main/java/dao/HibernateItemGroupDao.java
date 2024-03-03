package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.transform.Transformers;
import org.hibernate.type.IntegerType;
import org.hibernate.type.LongType;
import org.hibernate.type.StandardBasicTypes;
import org.hibernate.type.StringType;

import com.mysql.cj.xdevapi.PreparableStatement;

import persistence.dto.ItemGroupDto;
import persistence.entities.ItemGroup;
import utils.SqlUtils;

public class HibernateItemGroupDao extends BaseHibernateDao implements ItemGroupDao {

	// native query: viết query ở ngôn ngữ sql/oracle
	// jpql/hql    : viết query ở dạng/theo tên entities/attribules
	//             : jpa/hibernate tự chuyển đổi sang native db mà mình đang kết nối đến
	
	// name query: native/jpql-hql
	// thay vì truyền sql vào thì mình khai báo cho sql 1 cái tên
	// sau đó truyền name vào
	// khai báo name ở chỗ Entity
	
//	private static final String Q_GET_ALL_ITEM_GROUPS = ""
//			+ "SELECT * FROM item_group";

//	private static final String Q_GET_ALL_ITEM_GROUPS = ""
//			+ "FROM ItemGroup";
	private static final int BATCH_SIZE = 50;
	private static final String Q_GET_ITEM_GROUP_BY_NAME = ""
			+ "SELECT * FROM item_group WHERE `NAME` = :pName";
	
	private static final String Q_COUNT_ITEMS_BY_ITEM_GROUP = ""
			+ "SELECT itg.ID " + ItemGroupDto.PROP_IG_ID + " ,\n"
			+ "       itg.NAME " + ItemGroupDto.PROP_IG_NAME + " ,\n"
			+ "       sum(itd.AMOUNT) " + ItemGroupDto.PROP_TOTAL_OF_ITEMS + ",\n"
			+ "	      group_concat(concat(it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') "
			+ ItemGroupDto.PROP_ITEM_DETAILS_INFO + "\n"
			+ "  FROM item_group itg\n"
			+ "  JOIN item it\n"
			+ "    ON itg.ID = it.ITEM_GROUP_ID\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON itd.ITEM_ID = it.ID\n"
			+ " GROUP BY itg.ID, itg.NAME;";
	
	// sử dụng native query
//	@Override
//	public List<ItemGroup> getAll() {
//		Session session = openSession();
//		// Từng dòng dữ liệu trả về từ SQL sẽ đc mapping vào ItemGroup
//		NativeQuery<ItemGroup> nativeQuery = session.createNativeQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class);
//		
//		return nativeQuery.getResultList();
//		// return openSession().createNativeQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class).getResultList();
//	}
	
	// sử dụng jpql/hql
//	@Override
//	public List<ItemGroup> getAll() {
//		return openSession()
//				.createQuery(Q_GET_ALL_ITEM_GROUPS, ItemGroup.class)
//				.getResultList();
//	}
	
	// sử dụng name query
	@Override
	public List<ItemGroup> getAll() {
		return openSession()
				.createNamedQuery(ItemGroup.Q_GET_ALL, ItemGroup.class)
				.getResultList();
	}
	
	/*
	private static final String Q_COUNT_ITEMS_BY_ITEM_GROUP = ""
			+ "SELECT itg.ID,\n"
			+ "       itg.NAME,\n"
			+ "       sum(itd.AMOUNT) TOTAL_OF_ITEMS,\n"
			+ "	      group_concat(concat(it.NAME, '-', itd.SIZE_ID, '-', itd.AMOUNT) SEPARATOR ', ') "
			+ "ITEM_DETAILS_INFO\n"
			+ "  FROM item_group itg\n"
			+ "  JOIN item it\n"
			+ "    ON itg.ID = it.ITEM_GROUP_ID\n"
			+ "  JOIN item_detail itd\n"
			+ "    ON itd.ITEM_ID = it.ID\n"
			+ " GROUP BY itg.ID, itg.NAME;";
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		// createNativeQuery(sql, T.class)
		// sql result row  -> T instance
		// sql result rows -> List<T>
		
		// createNativeQuery(sql)
		// sql result row  -> Object[]
		// sql result rows -> List<Object[]>
		
		@SuppressWarnings("unchecked")
		List<Object[]> rows = openSession()
				.createNativeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP)
				.getResultList();
		
		var result = new ArrayList<ItemGroupDto>();
		for (Object[] row: rows) {
			ItemGroupDto itemGroupDto = new ItemGroupDto();
			itemGroupDto.setIgId(Integer.parseInt(String.valueOf(row[0])));
			itemGroupDto.setIgName(String.valueOf(row[1]));
			itemGroupDto.setTotalOfItems(Long.parseLong(String.valueOf(row[2])));
			itemGroupDto.setItems(String.valueOf(row[3]));
			result.add(itemGroupDto);
		}
		return result;
	}*/
	
	// jdbc: setInt(?-1, value)
	//       getInt(alias)
	// jpa/hibernate:
	//  + setParameter(param, value, type)
	//  + addScalar(alias, type)
	// -> muốn auto get từ sql(row) rồi set vào java(object)
	// thì alias của column phải trùng với name của attribute
	
	@SuppressWarnings({ "deprecation", "unchecked" })
	@Override
	public List<ItemGroupDto> countItemsByItemGroup() {
		return openSession()
			.createNativeQuery(Q_COUNT_ITEMS_BY_ITEM_GROUP)
			.addScalar(ItemGroupDto.PROP_IG_ID, IntegerType.INSTANCE)
			.addScalar(ItemGroupDto.PROP_IG_NAME, StringType.INSTANCE)
			.addScalar(ItemGroupDto.PROP_TOTAL_OF_ITEMS, LongType.INSTANCE)
			.addScalar(ItemGroupDto.PROP_ITEM_DETAILS_INFO, StringType.INSTANCE)
			.setResultTransformer(Transformers.aliasToBean(ItemGroupDto.class))
			.getResultList();
	}
	
	@Override
	public ItemGroup get(int id) {
		// hỗ trợ khi entity instance theo id
		return openSession().get(ItemGroup.class, id);
	}
	
	@Override
	public ItemGroup get(String name) {
		return openSession()
					.createNativeQuery(Q_GET_ITEM_GROUP_BY_NAME, ItemGroup.class)
					.setParameter("pName", name, StringType.INSTANCE)
					.uniqueResult();
					}

	@Override
	public void save(ItemGroup itemGroup) {
		excuteWithTransaction(session -> session.save(itemGroup));
		
	}

	@Override
	public void saveOrUpdate(ItemGroup itemGroup) {
		excuteWithTransaction(session->session.saveOrUpdate(itemGroup));
		
	}
	private static final String Q_MERGE_ITEM_GROUP = ""
			+ "CALL P_MERGE_INTO_ITEM_GROUP(:pId, :pName)";
	private static final String Q_INSERT_ITEM_GROUP = ""
			+ "INSERT INTO item_group(ID, NAME)\n"
			+ "VALUES(?, ?)";
	@Override
	public void merge(ItemGroup itemGroup) {
		excuteWithTransaction(session->{
			openSession().createNativeQuery(Q_MERGE_ITEM_GROUP).setParameter("pId", itemGroup.getId(),IntegerType.INSTANCE)
			.setParameter("pName", itemGroup.getName(),StringType.INSTANCE)
			.executeUpdate();
		});
		
		}
//	openSession().createNativeQuery(Q_MERGE_ITEM_GROUP).setParameter("pId", itemGroup.getId(),IntegerType.INSTANCE)
//	.setParameter("pName", itemGroup.getName(),StringType.INSTANCE)
//	.executeUpdate();
	//Exception in thread "main" javax.persistence.TransactionRequiredException: Executing an update/delete query
	//Sửa
//	@Override
//	public void merge(ItemGroup itemGroup) {
//		excuteWithTransaction(session->{
//			openSession().createNativeQuery(Q_MERGE_ITEM_GROUP).setParameter("pId", itemGroup.getId(),IntegerType.INSTANCE)
//			.setParameter("pName", itemGroup.getName(),StringType.INSTANCE)
//			.executeUpdate();
//		});
//		
//		}
	
	@Override
	public void save(Collection<ItemGroup> groups) {
		openSession().doWork(connection -> {
			try(PreparedStatement pst = connection.prepareStatement(Q_INSERT_ITEM_GROUP)) {
				int batchCount = 0;
				for (ItemGroup itemGroup: groups) {
					//cân nhắc với setObject cho null value với KDL không phải chuỗi
					
					pst.setInt(1, itemGroup.getId());
					pst.setString(2, itemGroup.getName());
					pst.addBatch();
					
					// cứ batch chứa 50 phần tử execute bớt 1 lần
					if (batchCount % BATCH_SIZE == 0) {
						pst.executeBatch();
					}
				}
				
				// execute all hoặc execute phần còn lại trong batch
				pst.executeBatch();
			} catch (Exception e) {
				// TODO: handle exception
			}
		});
		//JDBC tập trung trên thuộc itnhs
		//
	}
	
	}
