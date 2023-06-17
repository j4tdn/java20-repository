package datastructure.enumm;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

/*
Viết chương trình tìm vị trí tương đối của một điểm A so với đường tròn tâm O bán kính R
*/

public class Ex01EnumDemo {
	public static void main(String[] args) {
		// Toán tử "==" --> so sánh 2 biến 2 giá trị ở STACK
		// So sánh giá trị của biến nguyên thuỷ --> "=="
		// So sánh giá trị của biến đối tượng   --> "equals" (mặc định vẫn so sánh địa chỉ)
		
		int a = 5;
		int b = 5;
		System.out.println("a == b --> " + (a == b));
		
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 1);
		System.out.println("p2 hash --> " + System.identityHashCode(p2));
		System.out.println("p1 == p1 --> " + (p1 == p2));
		System.out.println("p1.equals(p2) --> " + (p1.equals(p2)));
		
		System.out.println("=================================");
		
		Point pA = new Point(3, 4);
		Circle circle = new Circle(new Point(0, 0), 6);
		
		CirclePos pos = findPos(pA, circle);
		System.out.println("circle pos --> " + pos.name());
		System.out.println("circle pos --> " + pos.getValue());
		
		if (pos.equals(CirclePos.ONSIDE))
			System.out.println("Vẽ đường kính đi qua OA");
		else 
			System.out.println("Không thoả mãn bài toán");
	}
	
	private static CirclePos findPos(Point pA, Circle circle) {
		Point pO = circle.getPoint();
		float R = circle.getR();
		
		double distance = sqrt(pow(pA.getX() - pO.getX(), 2) + pow(pA.getY() - pO.getY(), 2));
		
		return distance > R ? CirclePos.OUTSIDE : distance == R ? CirclePos.ONSIDE : CirclePos.INSIDE;
	}
}
