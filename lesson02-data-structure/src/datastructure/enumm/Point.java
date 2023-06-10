package datastructure.enumm;

public class Point {
	private int x;
	private int y;

	public Point() {
	}

	public Point(int x, int y) {
		this.x = x;
		this.y = y;
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

	// p1.equals(p2)
	// p1 --> this
	// p2 --> o
	@Override
	public boolean equals(Object o) {
		// compile: o --> Object
		// runtime: o --> Point

		System.out.println("o hash --> " + System.identityHashCode(o));
		System.out.println("o runtime --> " + o.getClass());

		// th1: 2 biến cùng trỏ chung 1 ô nhớ ở heap
		if (this == o) {
			return true;
		}

		// th2: vì this != NULL --> o == null hoặc o lúc runtime k phải point -->false
		// if (o == null || o.getClass() != this.getClass()) {
		if (!(o instanceof Point)) {
			return false;
		}

		// th3: o != null và o là kdl Point
		Point that = (Point) o;

		return this.getX() == that.getX() && this.getY() == that.getY();
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
}
