package view;

import bean.Car;

public class Ex01CarDemo {
	public static void main(String[] args) {
//		Car c1 = new Car();
//		c1.setId(1);
//		c1.setName("C1");

		
		Car.setModel("Honda");
		
		Car c1 = new Car(1, "C1", "Black", 480);
		Car c2 = new Car(2, "C2", "Black", 980);
		Car c3 = new Car(3, "C3", "While", 670);
		Car c4 = new Car(4, "C4", "Red", 5550);
		Car c5 = new Car(5, "C5", "Yellow", 1500);
		Car c6 = new Car(6, "C3", "Black", 2300);
		Car c99 = new Car(99, "C99", "Pink", 1500);
		Car c100 = new Car(100, "C100", "Blue", 1200);
		
		Car.setModel("HondaVN");
		
		System.out.println("c1--> " +c1);
		System.out.println("c2--> " +c2);
		System.out.println("c3--> " +c3);
		System.out.println("c4--> " +c4);
		System.out.println("c5--> " +c5);
		System.out.println("c6--> " +c6);
		System.out.println("c99--> " +c99);
		System.out.println("c100--> " +c100);
	}
}
