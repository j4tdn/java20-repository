package service;

import dao.CacheDao;
import dao.HibernateCacheDao;

public class CacheServiceImpl implements CacheService {
	
	private CacheDao cacheDao;
	
	public CacheServiceImpl() {
		cacheDao = new HibernateCacheDao();
	}
	
	@Override
	public void firstLevelCache() {
		cacheDao.firstLevelCache();
	}
	
	@Override
	public void secondLevelCache() {
		cacheDao.secondLevelCache();
	}
	
}
