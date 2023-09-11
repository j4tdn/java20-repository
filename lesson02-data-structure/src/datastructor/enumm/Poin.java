package datastructor.enumm;

public class Poin {
	private int x;
	private int y;
	public Poin() {
		
	}
	public Poin(int x, int y) {
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
	//p1.equal(p2)
	//p1--> this
	//p2--> o
	@Override
	public boolean equals(Object o) {
		//TH1 :  2 biến cùng trỏ chung 1 ô nhớ ở HEAP
		if(this == o){
			return true;
		}
		//TH2: Vì this !=null --> o ==null hoặc 0 lúc runtime ko phải poin --> false
		if(!(o instanceof Poin)) {
			return false;
		}
		//TH3: o !=null và o là KDL Poin
		Poin that = (Poin)o;
		return this.getX() == that.getX() &&
		this.getY() == that.getY();
	}
	@Override
	public String toString() {
		return "Poin [x=" + x + ", y=" + y + "]";
	}
	
	
}
