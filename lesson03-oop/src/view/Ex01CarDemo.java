package view;

import bean.Car;

public class Ex01CarDemo {

	public static void main(String[] args) {

		Car.setModel("Honda VN");
		
		Car c1 = new Car(1, "C1", "Black", 111);
		Car c2 = new Car(2, "C2", "Black", 122);
		Car c3 = new Car(3, "C3", "White", 133);
		Car c4 = new Car(4, "C4", "Red", 144);
		Car c5 = new Car(5, "C5", "Yellow", 155);
		Car c6 = new Car(6, "C6", "Black", 166);
		Car c99 = new Car(99, "C99", "Black", 199);
		Car c100 = new Car(100, "C100", "Black", 1100);
		
		System.out.println("c1 --> " + c1);
		System.out.println("c2 --> " + c2);
		System.out.println("c3 --> " + c3);
		System.out.println("c4 --> " + c4);
		System.out.println("c5 --> " + c5);
		System.out.println("c6 --> " + c6);
		System.out.println("c99 --> " + c99);
		System.out.println("c100 --> " + c100);
		
		}

}
