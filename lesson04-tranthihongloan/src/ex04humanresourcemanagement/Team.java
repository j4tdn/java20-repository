package ex04humanresourcemanagement;

public class Team {
	private Leader leader;
	private Staff[] staffs;
	private int quantity;
	
	public Team() {
		
	}

	public Team(Leader leader, Staff[] staffs, int quantity) {
		this.leader = leader;
		this.staffs = staffs;
		this.quantity = quantity;
	}

	public Leader getLeader() {
		return leader;
	}

	public void setLeader(Leader leader) {
		this.leader = leader;
	}

	public Staff[] getStaffs() {
		return staffs;
	}

	public void setStaffs(Staff[] staffs) {
		this.staffs = staffs;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	@Override
	public String toString() {
		return leader.getFullname() + " --> " + quantity;
	}
}
