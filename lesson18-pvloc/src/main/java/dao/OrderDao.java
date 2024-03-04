package dao;

import java.util.List;

import persistence.Order;

public interface OrderDao {
	List<Order> getAll();
}
