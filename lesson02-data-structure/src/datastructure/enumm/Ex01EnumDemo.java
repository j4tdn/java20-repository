package datastructure.enumm;
import static java.lang.Math.*;
/**
 * 	Viết chương trình tìm vị trí tương đối của một điểm A so với đường tròn tâm O
	bán kính R
	=================================
 	A(5, 7)
 	O(0, 0) R = 6
 *
 */
public class Ex01EnumDemo {
	public static void main(String[] args) {
		//Toán tử == --> so sánh 2 biến giá trị ở STACK
		//so sánh giá trị của biến nguyên thủy --> ==
		//so sánh giá trị của biến đối tượng --> object.equals(mặc định vẫn so sánh ==)
		int a = 1;
		int b = 1;
		Point p1 = new Point(1, 1);
		Point p2 = new Point(1, 1);
		System.out.println("a==b --> " + (a==b));
		System.out.println("p1==p2 --> "+ (p1.equals(p2)));
		
		Point pA = new Point(5, 7);
		
		Circle circle = new Circle(new Point(0, 0), 6);
		
		CirclePos pos = findPos(pA, circle);
		System.out.println("circle post --> " + pos.value);
		
	}
	
	private static CirclePos findPos(Point pA, Circle circle) {
		Point pO = circle.getPoint();
		float R = circle.getR();
		
		double distance = sqrt(
							pow((pA.getX() - pO.getX()),2)
						  + pow((pA.getX() - pO.getX()),2));
		
		
		return distance > R ? CirclePos.OUTSIDE : distance == R ? CirclePos.ONSIDE :CirclePos.INSIDE;
	}
}
