package datastructure.enumm;

/*
 */
public class Ex01EnumDemo {
	private static final String onsideOfCircle = "Trên đường tròn";
	private static final String insideOfCircle = "Trong đường tròn";
	private static final String outsideOfCircle = "Ngoài đường tròn";
	
	public static void main(String[] args) {
		// Toán tử == --> so sánh 2 biến 2 giá trị ở STACK
		// So sánh giá trị của biến nguyên thủy --> ==
		// So sánh giá trị của biến đối tượng   --> Object#equals
		Point pA = new Point(0, 6);
		Circle circle = new Circle(new Point(0, 0), 6);
		
		CirclePos pos = findPos(pA, circle);
		System.out.println("Postname --> " + pos);
		System.out.println("Postvalue --> " + pos.getValue());
		
		if (pos.equals(CirclePos.ONSIDE)) {
			System.out.println("Vẽ đường kính qua pA");
		}
	}

	private static CirclePos findPos(Point point, Circle circle) {
		Point pO = circle.getPoint();
		float R = circle.getR();
		double distance = Math.sqrt(Math.pow((point.getX() - pO.getX()), 2) + Math.pow((point.getY() - pO.getY()), 2));

		return distance > R ? CirclePos.OUTSIDE
							: distance == R ? CirclePos.ONSIDE
											: CirclePos.INSIDE;
	}
}
