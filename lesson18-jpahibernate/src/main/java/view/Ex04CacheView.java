package view;

import service.CacheService;
import service.CacheServiceImpl;

public class Ex04CacheView {
	
	private static CacheService cacheService;
	
	static {
		cacheService = new CacheServiceImpl();
	}
	
	public static void main(String[] args) {
		cacheService.firstLevelCache();
	}
	
}
