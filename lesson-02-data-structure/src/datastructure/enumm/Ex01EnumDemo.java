package datastructure.enumm;

import static java.lang.Math.*;

import javax.management.ObjectName;

public class Ex01EnumDemo {
	
	private static final String onsideOfCircle = "On";
	private static final String insideOfCircle = "In";
	private static final String outsideOfCircle = "Out";
	
	public static void main(String[] args) {
		//Toán tử == --> so sánh 2 biến ở STACK
		//So sánh giá trị của biến nguyên thuỷ --> ==
		//So sánh giá trị của biến đối tượng --> Object#equals(mặc định vẫn so sánh == địa chỉ)
		
		int a = 5;
		int b = 5;
		System.out.println("a==b --> " + (a==b));
		Point pA = new Point(5, 7);
		float R = 6;

		Circle circle = new Circle(new Point(0, 0), 6);
		
		CirclePos pos = findPos(pA, circle);
		System.out.println("post --> " + pos.name());
		System.out.println("post --> " + pos.getValue());
		
		if (pos.equals(CirclePos.ONSIDE) ) {
			System.out.println("Vẽ đường kính đi qua O A");
		} else {
			System.out.println("Không thoả mãn bài toán");
		}

	}

	private static CirclePos findPos(Point pA, Circle circle) {
		Point pO = circle.getPoint();
		float R = circle.getR();

		double distance = sqrt(pow((pA.getX() - pO.getX()), 2) + pow((pA.getY() - pO.getY()), 2));

//		if (distance > R) {
//			return "Outside";
//		}
//		if (distance == R) {
//			return "On";
//		}
//		return "In";
		
		return distance > R ? CirclePos.OUTSIDE : distance == R ? CirclePos.ONSIDE : CirclePos.INSIDE;
	}

}
