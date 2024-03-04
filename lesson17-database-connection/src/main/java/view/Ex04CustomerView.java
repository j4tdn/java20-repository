package view;

import persistence.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class Ex04CustomerView {
	private static CustomerService customerService;
	
	static {
		customerService = new CustomerServiceImpl();
	}

	public static void main(String[] args) {
//		Customer customerToBeInserted =
//				new Customer(6, "Ricardo", "rcd@gmail.com", "NewYork", "11122232", "abou1234");
//		
//		customerService.save(customerToBeInserted);
		
		Customer customer =  customerService.login("rcd@gmail.com", "about1234");
		
		if (customer == null) {
			System.out.println("Email hoặc mật khẩu không chính xác");
		} else {
			System.out.println("Đăng nhập thành công");
		}
		
		System.out.println("=== Finished ===");
	}
}
