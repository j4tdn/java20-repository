package buying;

public class Vehical {
	private String id;
	private String owner;
	private String model;
	private int capacity;
	private double cost;
	
	public Vehical() {
		
	}

	public Vehical(String id, String owner, String model, int capacity, double cost) {
		super();
		this.id = id;
		this.owner = owner;
		this.model = model;
		this.capacity = capacity;
		this.cost = cost;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getCapacity() {
		return capacity;
	}

	public void setCapacity(int capacity) {
		this.capacity = capacity;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	@Override
	public String toString() {
		return "Vehical [id=" + id + ", owner=" + owner + ", model=" + model + ", capacity=" + capacity + ", cost="
				+ cost + "]";
	}
}
