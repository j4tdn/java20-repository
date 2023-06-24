package datastructor.enumm;

import static java.lang.Math.*;
/**
 * Viết chương trình tìm vị trí tương đối của một điểm A so với đường tròn tâm 0 bán kính R
 * 		A(5,7)
 * 		0(0,0) 
 *
 */
public class Ex01EnumDemo {
	public static void main(String[] args) {
		//toan tu == --> so sanh 2 bien 2 gia tri o Stack 
		// so sanh gia tri cua bien doi tuong --> Object #equals
		Point pA = new Point(5, 7);		
		Circle circle = new Circle(new Point(0, 0), 6);
		CirclePos pos = findPos(pA, circle);
		System.out.println("circlePost-->" + pos.name());
		System.out.println("circlePost-->" + pos.getVal());
		
		if(pos.equals(CirclePos.ONSIDE)) {
			System.out.println("ve duong kinh di qua O A");
		}else {
			System.out.println("khong thoa man bai toan");
		}
	}
	
	private static CirclePos findPos(Point point, Circle circle) {
		//Point pO = circle.getPoint();
		float R = circle.getR();
		
		double distance = sqrt(pow((point.getX() - circle.getPoint().getX()), 2)
								+ pow((point.getY() - circle.getPoint().getY()), 2)
							);
		//hard code
		return distance > R ? CirclePos.OUTSIDE 
							: distance == R ? CirclePos.ONSIDE 
											: CirclePos.INSIDE;
	
		
	}
}
