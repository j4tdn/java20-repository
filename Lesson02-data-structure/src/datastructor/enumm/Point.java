package datastructor.enumm;

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

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	@Override
	public boolean equals(Object o) {
		//compile: 0 --> Object
		//runtime: 0 --> Point
		
		//TH1: 2 bien cung tro chung 1 o nho o heap;
		if(this == o) {
			return true;
		}
	
		//vif this != null --> o == null or o luc runtime ko phai point --> false
		//if(o == null || o.getClass() != this.getClass()) {
		if(!(o instanceof Point)) {	
		return false;
		}
		//th3: o != null va o la KDL Point
		Point that = (Point)o;
		
		return this.getX() == that.getX() && this.getY() == that.getX();
	}
	 
	
}
