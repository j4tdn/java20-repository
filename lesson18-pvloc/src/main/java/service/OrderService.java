package service;

import java.util.List;

import persistence.Order;

public interface OrderService {
	List<Order> getAll();
}