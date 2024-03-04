package dao;

import persistence.Customer;

public interface CustomerDao {
	
	void save(Customer customer);
	
	Customer login(String email, String password);
	
}
