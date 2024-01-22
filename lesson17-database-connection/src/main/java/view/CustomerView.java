package view;

import persistence.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class CustomerView {

	private static CustomerService customerService;
	
	static {
		customerService = new CustomerServiceImpl();
	}
	
	public static void main(String[] args) {
		 Customer customerToBeInserted = 
				 new Customer(6, "kaka", "kaka@gmail.com", "Milan", "22244478", "tttt666");
		 customerService.save(customerToBeInserted);
		 
		 Customer customer = customerService.login("kaka@gmail.com", "tttt666");
		 
		 if (customer == null)
			 System.out.println("Email hoặc Mật khẩu không chính xác");
		 else
			 System.out.println("Đăng nhập thành công\n" + customer.toString());
		 
	}
}
