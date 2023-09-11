package view;

import bean.Car;

public class Ex01CarDemo {
	public static void main(String[] args) {
		//Tất cả các đối tượng tạo ra từ class Car
		// luôn có model  =Honda
		
		//Đổi tên thành HondaVN
		Car c1 =new Car(); 
		c1.setId(1);
		c1.setName("C1");	
		Car c2 =new Car(2,"C2","Honda","Black",980); 
		Car c3 =new Car(3,"C3","Honda","Black",980); 
		Car c4 =new Car(4,"C4","Honda","White",980); 
		Car c5 =new Car(5,"C5","Honda","Brown",980); 
		Car c6 =new Car(6,"C6","Honda","Pink",980); 
		Car c7 =new Car(7,"C7","Honda","White",980); 
		Car c8 =new Car(8,"C8","Honda","Pink",980); 
		System.out.println("c1-->" + c1);
		System.out.println("c1-->" + c2);
	}
}
