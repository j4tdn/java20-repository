package datastructureenumm;

public class Point {
	private int x;
	private int y;

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public Point() {
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	@Override
	public String toString() {
		return "point [x=" + x + ", y=" + y + "]";
	}

	// p1.equals(p2)
	// p1 --> this
	// p2 --> o
	@Override
	public boolean equals(Object o) {
		// compile: o --> Object
		// runtime: o --Point
		System.out.println(" o hash --> " + System.identityHashCode(o));
		System.out.println(" o runtime --> " + o.getClass());
		// TH1 : 2 biến cùng trỏ chung 1 ô nhớ ở HEAP
		if (this == o) {
			return true;
		}
		// TH2 : Vì this !=null --> o ==null hoặc o lúc runtime không phải point --<
		// false

		if (!(o instanceof Point)) {
			return false;

		}
		// TH3 : o !=null và o là KDL Point
		Point that = (Point) o;
		return this.getX() == that.getX() && this.getY() == that.getY();
	}
}
