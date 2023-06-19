package datastructure.enumm;

import static java.lang.Math.*;

public class Ex01EnumDemo {
	public static void main(String[] args) {

		// Toán tử == --> So ánh 2 biến 2 giá trị ở STACK
		// So sánh 2 biến nguyên thủy --> ==
		// So sánh giá trị của biến đối tượng --> Object#equals
		int a = 5;
		int b = 5;
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 1);
		System.out.println("p2 hash --> " + System.identityHashCode(p2));
		System.out.println("p1 ==  p2  --> " + (p1.equals(p2)));
		System.out.println("a  ==  b   --> " + (a == b));
		Point pA = new Point(3, 4);
		float R = 6;
		Circle circle = new Circle(new Point(0, 0), 5);
		System.out.println("Post -->  " + findPos(pA, circle));
		CirclePos pos = findPos(pA, circle);
		System.out.println("circle pos --> " + pos.name()); //pos
		System.out.println("circle pos --> " + pos.getValue());
		
		String hString = "234";
		String hStringg = "234";
		if(hString == hStringg) {
			System.out.println("ok đấy");
		}
		
		if (pos==CirclePos.ONSIDE) {
			System.out.println("Vẽ đường kính đi qua O A");
		} else {
			System.out.println("Không thoải mãn bài toán");
		}
		
		
	}

	private static CirclePos findPos(Point pA, Circle circle) {
		Point pO = circle.getPoint();
		float R = circle.getR();

		double distance = sqrt(pow((pA.getX() - pO.getX()), 2) + pow((pA.getY() - pO.getY()), 2));

//		if (distance > R) {
//			return "Ngoài đường tròn";
//		}
//		if (distance == R) {
//			return "Trên đường tròn";
//		}
//		return "Trong đường tròn";

		return distance > R ? CirclePos.INSIDE : distance == R ? CirclePos.ONSIDE : CirclePos.OUTSIDE;
	}
}
