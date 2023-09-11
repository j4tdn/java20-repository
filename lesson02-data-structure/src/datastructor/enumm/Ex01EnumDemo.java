package datastructor.enumm;

import static java.lang.Math.*;//sẽ import tất cả static của hàm Math

public class Ex01EnumDemo {
	
	public static void main(String[] args) {
		//Toán tử == so sánh 2 biến 2 giá trị ở stack
		int a= 5;
		int b= 5;
		Poin p1 = new Poin(1,1);
		Poin p2 = new Poin(1,1);
		
		Poin pA = new Poin(3,4);
		Circle circle = new Circle(new Poin(0,0),5);
		
		CirclePos pos = findPos(pA, circle);
		System.out.println("circlepost--->" + pos.getValue());
		
		if(pos.equals(CirclePos.ONSIDE)) {
			System.out.println("Vẽ đường thẳng ");
		}else {
			System.out.println("Không thỏa mãn");
		}
		
	}
	
	private static CirclePos findPos(Poin pA,Circle circle) {
		Poin pO  =circle.getPoin();
		float R = circle.getR();
		
		double distance = sqrt(pow((pA.getX()-pO.getX()), 2)
							+pow((pA.getY()-pO.getY()), 2));
		
	return distance > R ? CirclePos.OUTSIDE:
		   distance == R? CirclePos.ONSIDE :
			   			  CirclePos.INSIDE;
	}
}
