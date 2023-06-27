package datastructure.enumm;

public class Circle {
	private Point point;
	private float R;
	
	public Circle() {
		
	}

	public Circle(Point point, float r) {
		this.point = point;
		R = r;
	}

	public Point getPoint() {
		return point;
	}

	public void setPoint(Point point) {
		this.point = point;
	}

	public float getR() {
		return R;
	}

	public void setR(float r) {
		R = r;
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", R=" + R + "]";
	}
	
	
}
