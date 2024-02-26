package dao;

import org.hibernate.Session;

import persistence.entities.ItemGroup;

public class HibernateCacheDao extends BaseHibernateDao implements CacheDao {
	
	@Override
	public void firstLevelCache() {
		// 1st level cache --> dùng rất nhiều
		// configure: có sẵn của hibernate
		// enable: tự động bởi hibernate
		// disable: không được
		// scope: single transaction - single session
		
		System.out.println("Start: Test 1st level cache");
		
		Session s1 = openSession();
		Session s2 = openSession();
		
		ItemGroup group1 = s1.get(ItemGroup.class, 1); // get from database -> store into 1st cache
		System.out.println("group 1: " + group1);
		
		ItemGroup group2 = s2.get(ItemGroup.class, 2); // get from database -> store into 1st cache
		System.out.println("group 2: " + group2);
		
		ItemGroup group3 = s1.get(ItemGroup.class, 2); // get from database -> store into 1st cache
		System.out.println("group 3: " + group3);
		
		// hạn chế: đảm bảo 100% lấy từ database, k quan tâm đến cache
		// s2.evict(group2);
		// s2.clear();
		
		ItemGroup group4 = s2.get(ItemGroup.class, 2); // get from cache
		System.out.println("group 4: " + group4);
		
		System.out.println("Finish: Test 1st level cache");
	}
	
	@Override
	public void secondLevelCache() {
		
		// 2nd level cache --> thật sự dùng nó khi dự án bị bad performance
		// configure: ko có sẵn, phải thêm thư viện bên ngoài, tự cấu hình
		// enable: không có sẵn
		// disable: được
		// scope: single transaction - sessions của transaction
		
		// call procedure, function
		
		// batch update
		
	}
	
}
