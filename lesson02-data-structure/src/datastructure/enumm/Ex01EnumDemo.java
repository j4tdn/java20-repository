package datastructure.enumm;

import static java.lang.Math.*;
/**
 * viết ctr tìm vị trí tương đối điểm A(5,7) so vs đtr tâm O(o,o) bk R = 6
 */

public class Ex01EnumDemo {
	public static void main(String[] args) {
		// toán tử == --> so sánh 2 biến 2 giá trị ở stack
		// so sánh giá trị 2 biến nguyên thủy --> ==
		// so sánh gía trị 2 biến đối tượng   --> Object#equals (mặc định vẫn ss ==)
		
		int a = 5;
		int b = 5;
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 1);
		
		System.out.println("a==b --> " + (a==b));
		System.out.println("p1==p2 --> " + (p1==p2));
		System.out.println("p1.equals(p2) --> " + (p1.equals(p2)));
		
		System.out.println("\n=============\n");
		
		Point pB = new Point(6, 8);
		Circle circle = new Circle(new Point(0, 0), 10);
		
		CirclePos pos = findPos(pB, circle);
		System.out.println("Circlepos --> " + pos.name());
		System.out.println("Circlepos --> " + pos.getValue());
	
		if (pos.equals(CirclePos.ONSIDE)) {
			System.out.println("vẽ đường kính đi qua O A");
		} else System.out.println("không thỏa mãn");
		
	}

	private static CirclePos findPos(Point pA, Circle circle) {
		Point pO = circle.getPoint();
		float R = circle.getR();
		
		double distance = sqrt(pow((pA.getX()-pO.getX()), 2) 
							 + pow((pA.getY()-pO.getY()), 2));
		
		// hard code
		return distance < R ? CirclePos.INSIDE 
							: distance == R ? CirclePos.ONSIDE 
											: CirclePos.OUTSIDE;
	}
}
