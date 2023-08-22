package datastructure.enumm;

/*
 * KDL enum --> Tên: CirclePos
 * Có 3 giá trị: INSIDE, ONSIDE, OUTSIDE
 * Mỗi giá trị mặc định gồm 2 phần: 
 * 
 */

public enum CirclePosition {
	INSIDE("Trong đường tròn"),
	ONSIDE("Trên đường tròn"),
	OUTSIDE("Ngoài đường tròn");
	
	private String value;
	
	private CirclePosition(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
