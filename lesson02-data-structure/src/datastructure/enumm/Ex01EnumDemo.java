package datastructure.enumm;

import static java.lang.Math.*;
/**
	Ex11: Viết chương trình tìm vị trí tương đối của một điểm A
	so với đường tròn tâm O bán kính R
	============================================================
	A(5, 7)
	O(0, 0) R = 6
 */

public class Ex01EnumDemo {
	public static void main(String[] args) {
		Point pA = new Point(2, 2);
		
		Circle circle = new Circle(new Point(0, 0), 10);
		
		CirclePosition pos = findPos(pA, circle);
		System.out.println("post --> " + pos);
		
		if(pos.equals(CirclePosition.ONSIDE)) {
			System.out.println("Vẽ đường kính đi qua O A");
		} else {
			System.out.println("Không thỏa mãn bài toán");
		}
	}
	
	private static CirclePosition findPos(Point pA, Circle circle) {
		Point pO = circle.getPoint();
		double R = circle.getR();
		
		double distance = sqrt(
							pow((pA.getX() - pO.getX()), 2)
						  + pow((pA.getY() - pO.getY()), 2)
						  );
		
		if(distance > R)
			return CirclePosition.OUTSIDE;
		if(distance == R)
			return CirclePosition.ONSIDE;
		else 
			return CirclePosition.INSIDE;
	}
}
