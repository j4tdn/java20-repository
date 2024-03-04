package service;

import java.util.List;

import dao.HibernateOrderDao;
import dao.OrderDao;
import persistence.Order;

public class OrderServiceImpl implements OrderService {
	
	private OrderDao orderDao;
	public OrderServiceImpl() {
		orderDao = new HibernateOrderDao();
	}
	
	@Override
	public List<Order> getAll() {
		// TODO Auto-generated method stub
		return orderDao.getAll();
	}
}
