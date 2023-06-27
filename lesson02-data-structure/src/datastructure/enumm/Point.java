package datastructure.enumm;

public class Point {
	private int x;
	private int y;
	
	public Point() {
		// TODO Auto-generated constructor stub
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
	@Override
	public boolean equals(Object o) {
		System.out.println("o hash --> " + System.identityHashCode(o));
		System.out.println("o runtime --> " + o.getClass());
		//Th1: 2 bien cung tro chung 1 o nho o HEAP
		if (this == o) {
			return true;
		}
		//TH2: Vì this!= null --> o==null hoặc o lúc runtime k phải point --> false;
		//if(o==null || o.getClass() != this.getClass()){
		if(!(o instanceof Point)) {
			return false;
		}
		//Th3: o!= null và o là KDL Point
		Point that = (Point)o;
		
		return this.getX()== that.getX() && this.getY() == that.getY() ;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
}
