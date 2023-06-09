package tax;

public class Vehicle {
	private String ownerName;
	private String kind;
	private int capacity;
	private double value;

	public Vehicle() {
	}

	public Vehicle(String ownerName, String kind, int capacity, double value) {
		this.ownerName = ownerName;
		this.kind = kind;
		this.capacity = capacity;
		this.value = value;
	}

	public String getOwnerName() {
		return ownerName;
	}

	public void setOwnerName(String ownerName) {
		this.ownerName = ownerName;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "Vehicle [OwnerName = " + ownerName + ", kind = " + kind + ", capacity = " + capacity + ", value = "
				+ value;
	}
}
