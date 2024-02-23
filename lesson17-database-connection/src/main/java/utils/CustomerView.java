package utils;

import persistence.Customer;
import service.CustomerService;
import service.CustomerServiceImpl;

public class CustomerView {
	
	private static CustomerService customerService;
	
	static {
		customerService = new CustomerServiceImpl();
	}
	
	// 6 -> haha12234
	// 7 -> hehe11
	
	public static void main(String[] args) {
		
//		Customer customerToBeInserted = new Customer(7, "Thanh", "dz@gmail.com", "Quang Nam"
//													, "12343255", "hehe11");
//		
//		customerService.save(customerToBeInserted);
//		System.out.println("finished");
		
		Customer customer = customerService.login("rcd@gmail.com", "haha12234");
		if (customer == null) {
			System.out.println("Email hoặc Mật khẩu không chính xác");
		}else {
			System.out.println("Đăng nhập thành công");
		}
		
	}
}
