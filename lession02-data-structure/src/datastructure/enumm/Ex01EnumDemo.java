package datastructure.enumm;

import static java.lang.Math.*;

/*
 Ex11: Viết chương trình tìm vị trí tương đối của một điểm A
       so với đường tròn tâm O bán kính R
       ========================================
       A(5, 7)
       O(0, 0) R = 6
 Ex12: Từ bài trên, nếu điểm nằm trên đường tròn thì vẽ một đường
 
 */
public class Ex01EnumDemo {
	public static void main(String[] args) {
		// Toán tử == --> so sánh 2 biến 2 giá trị ở STACK
		int a = 5;
		int b = 5;
		Point p1 = new Point(1, 1); // H1
		Point p2 = new Point(1, 1); // H2
		System.out.println("a==b --> " + (a == b)); 	// KQ: True (vì 5 = 5)
		System.out.println("p1==p2 --> " + (p1 == p2)); // KQ: False (vì H1 # H2)
		
		// So sánh giá trị của biến nguyên thủy --> ==
		// So sánh giá trị của biến đối tượng --> Hàm equals thuộc class Object
		// (mặc định vẫn so sánh == địa chỉ
		// do đó ta cần phải ghi đè hàm equals trong class Point theo định nghĩa
		// bài toán là so sánh 2 giá trị của p1 và p2)
		System.out.println("p1.equals(p2) --> " + (p1.equals(p2)));

		System.out.println("\n==========================\n");

		Point pA = new Point(3, 4);
		Circle circle = new Circle(new Point(0, 0), 5);

		String pos = findPos(pA, circle);
		System.out.println("post --> " + pos);
	}

	private static String findPos(Point pA, Circle circle) {
		Point pO = circle.getPoint();
		float R = circle.getR();

		double distance = sqrt(pow((pA.getX() - pO.getX()), 2) + pow((pA.getY() - pO.getY()), 2));
		return distance > R ? "Ngoài đường tròn" : distance == R ? "Trên đường tròn" : "Trong đường tròn";
	}
}
