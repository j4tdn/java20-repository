package view;

import bean.Car;

public class Ex01CarDemo {
	public static void main(String[] args) {
		//tất cả các đối tượng tạo ra từ Clas Car --> luôn có model = HONDA
		//đổi tên thành HondaVN
		Car.setModel("Honda");
		Car c1 = new Car(1, "c1",  "black", 980);
		Car c2 = new Car(2, "c2",  "black", 980);
		Car c3 = new Car(3, "c3",  "yellow", 1000);
		Car c4 = new Car(4, "c4",  "red", 700);
		Car c99 = new Car(99, "c99",  "white", 600);
		Car c100 = new Car(100, "c100",  "white", 800);
		
		Car.setModel("HondaVN");
		System.out.println("c1: " + c1);
		System.out.println("c2: " + c2);
		System.out.println("c2: " + c3);
		System.out.println("c2: " + c4);
		System.out.println("c2: " + c99);
		System.out.println("c2: " + c100);
	}
}
