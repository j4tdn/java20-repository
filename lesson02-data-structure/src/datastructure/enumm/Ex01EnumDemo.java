package datastructure.enumm;
import static java.lang.Math.*;
public class Ex01EnumDemo {

	public static void main(String[] args) {
		//so sánh giá trị nguyên thủy ==
		//so sánh giá trị biến đối tượng Object#equals
		int a= 5;
		int b= 5;
		Point p1 = new Point(1,1);
		Point p2 = new Point(1,1);
		System.out.println("a==b --> "+ (a==b));
		System.out.println("p1==p2 -->" +(p1==p2));
		System.out.println("p1==p2 -->" +(p1==p2));
		System.out.println("p1.equals(p2)--> " +(p1.equals(p2)));
		
		Point pA = new Point(5, 7);
		Circle circle = new Circle(new Point(0,0),6);
		
		CirclePos pos = findPos(pA, circle);
		System.out.println("circle pos --> " + pos.name());
		System.out.println("circle pos --> " + pos.ordinal());
		
		if(pos.equals(CirclePos.ONSIDE)) {
			System.out.println("ve duong kinh di qua O A");
		}else {
			System.out.println("Khong thoa man bai toan");
		}
		
	}
	private static CirclePos findPos(Point pA, Circle circle) {
		Point pO =circle.getPoint();
		float R = circle.getR();
		double distance = sqrt(pow((pA.getX()-pO.getX()), 2)
								+pow((pA.getY()-pO.getY()), 2));
		return distance > R ? CirclePos.OUTSIDE
				: distance ==R ? CirclePos.ONSIDE
						:CirclePos.INSIDE;
	}
}
