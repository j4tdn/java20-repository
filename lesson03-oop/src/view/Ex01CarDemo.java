package view;

import been.Car;

public class Ex01CarDemo {
     public static void main(String[] args) {
    	 
    	 // tất cả các đối tượng tạo ra từ class Cả -> luôn có model = Honda
    	 // muốn đổi tên là HondaVN
		Car c1 = new Car();
		c1.setName("c1");
		c1.setId(1);
		Car c2 = new Car(2,"c2","honda", "black",9380);
		Car c4 = new Car(3,"c3","honda", "blue",9680);
		Car c5 = new Car(4,"c4","honda", "white",980);
		Car c3 = new Car(5,"c5","honda", "yealow",680);
		Car c6 = new Car(6,"c6","honda", "black",9480);
		
		
		System.out.println( "c1 --> "+ c1);
		System.out.println( "c2 --> "+ c2);
		System.out.println( "c3 --> "+ c3);
		System.out.println( "c4 --> "+ c4);
		System.out.println( "c5 --> "+ c5);
	}
}
