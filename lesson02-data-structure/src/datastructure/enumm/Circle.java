package datastructure.enumm;

public class Circle {
	private Point point;
	private double R;
	
	public Circle() {
		
	}
	
	public Circle(Point point, double R) {
		this.point = point;
		
	}
	
	public double getR() {
		return R;
	}
	
	public void setR(double R) {
		this.R = R;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}
	
	
}
