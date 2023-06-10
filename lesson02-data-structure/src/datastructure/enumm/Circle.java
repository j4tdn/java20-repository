package datastructure.enumm;

public class Circle {
	private Point point;
	private float R;

	public Circle() {
	}

	public Circle(Point point, float R) {
		this.point = point;
		R = R;
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

	public void setR(float R) {
		R = R;
	}

	@Override
	public String toString() {
		return "Circle [point=" + point + ", R=" + R + "]";
	}

}
