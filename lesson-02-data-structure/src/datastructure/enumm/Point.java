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
	
	
	//p1.equals(p2)
	//p1 --> this
	//p2 --> o
	
	//0 = p2;
	@Override
	public boolean equals(Object o) {
		//compile: o --> Object
		//runtime: o --> point
		
		System.out.println("o hash --> " + System.identityHashCode(o) );
		System.out.println("o reuntime --> " + o.getClass());
		
		//TH1: 2 biến trỏ chung 1 ô nhớ HEAP
		if(this == o) {
			return true;
		}
		
		//TH2: vì this != null --> o == null hoặc o lúc runtime không phải point --> flase;
		if(!(o instanceof Point)) {
			return false;
		}
		
		//TH3: o ! null và o là kiểu dữ liệu point
		Point that = (Point)o;
		
		return this.getX() == that.getX() && that.getY() == that.getY();
		

	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	

	
	
	
}
