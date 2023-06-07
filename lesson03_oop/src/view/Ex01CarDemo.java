package view;

import bean.Car;

public class Ex01CarDemo {
	public static void main(String[] args) {
		Car c1 = new Car(1,"C1", "Honda", "Black", 400);
		Car c2 = new Car(2, "C2", "Honda", "Black", 980); 
		c1.setId(1);
		c1.setName("c1");
		Car c3 = new Car(3, "C3", "Honda", "White", 580); 
		Car c4 = new Car(4, "C4", "Honda", "Red", 980); 
		Car c5 = new Car(5, "C5", "Honda", "Yellow", 680); 
		Car c6 = new Car(6, "C6", "Honda", "Black", 350); 
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
	}
	

}
