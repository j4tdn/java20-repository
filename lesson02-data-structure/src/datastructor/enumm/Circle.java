package datastructor.enumm;

public class Circle {
	private Poin poin;
	private float R;
	
	public Circle() {

	}

	public Circle(Poin poin, float r) {
		this.poin = poin;
		R = r;
	}

	public Poin getPoin() {
		return poin;
	}

	public void setPoin(Poin poin) {
		this.poin = poin;
	}

	public float getR() {
		return R;
	}

	public void setR(float R) {
		this.R = R;
	}

	@Override
	public String toString() {
		return "Circle [poin=" + poin + ", R=" + R + "]";
	}
	
}
