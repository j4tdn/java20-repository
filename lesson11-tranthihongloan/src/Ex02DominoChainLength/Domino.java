package Ex02DominoChainLength;

public class Domino {
	private int height;
	private int position;
	
	public Domino() {

	}

	public Domino(int height, int position) {
		this.height = height;
		this.position = position;
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getPosition() {
		return position;
	}

	public void setPosition(int position) {
		this.position = position;
	}

	@Override
	public String toString() {
		return "Domino [height=" + height + ", position=" + position + "]";
	}
	
	public boolean checkDistance(int otherPosDo) {
		int distance = otherPosDo - this.position;	
		if(height > distance) {
			return true;
		}
		return false;
	}
}
