package view;

import persistence.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class CustomerView {
	
	private static CustomerService customerService;
	
	static {
		customerService = new CustomerServiceImpl();
	}
	
	// 6 -> abou1234
	// 7 -> ttko8871
	
	public static void main(String[] args) {
		// Customer customerToBeInserted = 
		// new Customer(7, "kaka", "kaka@gmail.com", "Milan", "22244478", "ttko8871");
		// customerService.save(customerToBeInserted);
		
		Customer customer = customerService.login("kaka@gmail.com", "ttko8871");
		
		if (customer == null) {
			System.out.println("Email hoặc Mật khẩu không chính xác");
		} else {
			System.out.println("Đăng nhập thành công");
		}
		
	}
	
}
