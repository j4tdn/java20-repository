package datastructure.enumm;

import static java.lang.Math.*;

/**
 Ex11: Viết chương trình tìm vị trí tương đối của một điểm A 
 	   so với đường tròn tâm O bán kính R 
 	   ========================================
 	   A(5, 7)
	   O(0, 0) R = 6
 */
public class Ex01EnumDemo {
	
	public static void main(String[] args) {
		// Toán tử == --> so sánh 2 biến 2 giá trị ở STACK
		// So sánh giá trị của biến nguyên thủy --> ==
		// So sánh giá trị của biến đối tượng   --> Object#equals(mặc định vẫn so sánh == địa chỉ)
		
		int a = 5;
		int b = 5;
		Point p1 = new Point(1,1); // H1
		Point p2 = new Point(1,2); // H2
		System.out.println("p2 hash --> " + System.identityHashCode(p2));
		System.out.println("a==b --> " + (a==b));
		System.out.println("p1==p2 --> " + (p1==p2));
		System.out.println("p1.equals(p2) --> " + (p1.equals(p2)));
		
		System.out.println("\n=======================\n");
		
		Point pA = new Point(3, 4);
		Circle circle = new Circle(new Point(0, 0), 5);
		
		CirclePos pos = findPos(pA, circle);
		System.out.println("circle pos --> " + pos.name());
		System.out.println("circle pos --> " + pos.getValue());
		
		if (pos.equals(CirclePos.ONSIDE)) {
			System.out.println("Vẽ đường kính đi qua O A");
		} else {
			System.out.println("Không thoải mãn bài toán");
		}
		
	}
	
	private static CirclePos findPos(Point pA, Circle circle) {
		Point pO = circle.getPoint();
		float R = circle.getR();
		
		double distance = sqrt(
							  pow((pA.getX() - pO.getX()), 2) 
				            + pow((pA.getY() - pO.getY()), 2)
				          );
		
		// hard code
		return distance > R ? CirclePos.OUTSIDE
					        : distance == R ? CirclePos.ONSIDE
					        		        : CirclePos.INSIDE;
	}
}
