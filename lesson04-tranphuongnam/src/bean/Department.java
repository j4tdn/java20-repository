package bean;

public enum Department {
	
	
	DESIGN("Phòng ban thiết kế"),
	CONSTRUCTION("Phòng ban xây dựng"),
	FINANCE("Phòng ban tài chính");
	
	private String departmentName;
	
	Department(String departmentName){
		this.departmentName = departmentName;
	}
	
	public String getName() {
		return departmentName;
	}
}
