package dao;

import java.util.concurrent.TimeUnit;

import org.hibernate.Session;

import persistence.entities.ItemGroup;

public class HibernateCacheDao extends BaseHibernateDao implements CacheDao{
	
	@Override
	public void firstLevelCache() {
		// 1st level cache --> dùng rất nhiều
		// configure: có sẵn của hibernate
		// enable: tự động bởi hibernate
		// disable: ko đc
		// scope: single transaction - single session
		
		System.out.println("Start: Test 1st level cache");
		
		Session s1 = openSession();
		Session s2 = openSession();
		
		ItemGroup group1 = s1.get(ItemGroup.class, 1);// get from db -> store into 1st cache
		System.out.println("group 1: " + group1);
		
		ItemGroup group2 = s2.get(ItemGroup.class, 2);// get from db -> store into 1st cache
		System.out.println("group 2: " + group2);
		
		ItemGroup group3 = s1.get(ItemGroup.class, 2);// get from db -> store into 1st cache
		System.out.println("group 3: " + group3);
		
		// hạn chế: đảm bảo 100% lấy từ database ko qtam đến cache
		// s2.evict(group2);
		// s2.clear();
		
		ItemGroup group4 = s2.get(ItemGroup.class, 2);// get from 1st cache
		System.out.println("group 4: " + group4);
		
		System.out.println("Finish: Test 1st level cache");
	}	
	
	@Override
	public void secondLevelCache() {
		// 2nd level cache --> thật sự dùng khi dự án bị performance
		// configure: ko có sẵn, phải thêm thư viện bên ngoài, tự cấu hình 
		// enable: ko có sẵn
		// disable: đc
		// scope: single transaction - sessions của transaction
		
		System.out.println("Start: Test 2nd level cache");
		
		Session s1 = openSession();
		Session s2 = openSession();
		Session s3 = openSession();
		Session s4 = openSession();
		
		ItemGroup group1 = s1.get(ItemGroup.class, 1);// get from db -> store into 1st, 2nd cache
		System.out.println("group 1: " + group1 + "\n");
		
		ItemGroup group2 = s2.get(ItemGroup.class, 2);// get from db -> store into 1st, 2nd cache
		System.out.println("group 2: " + group2 + "\n");
		
		ItemGroup group3 = s1.get(ItemGroup.class, 2);// get from 2nd cache
		System.out.println("group 3: " + group3 + "\n");
		
		// hạn chế: đảm bảo 100% lấy từ database ko qtam đến cache
		// s2.evict(group2);
		// s2.clear();
		clear2ndCache();
		doTask(5);
		ItemGroup group4 = s2.get(ItemGroup.class, 2);// get from 2nd cache
		System.out.println("group 4: " + group4 + "\n");
		
		ItemGroup group5 = s3.get(ItemGroup.class, 1);// get from 2nd cache
		System.out.println("group 4: " + group5 + "\n");
		
		
		System.out.println("Finish: Test 2nd level cache");
	}
	
	private static void doTask(int seconds) {
		while(seconds > 0) {
			System.out.println(seconds-- + "(s)");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
