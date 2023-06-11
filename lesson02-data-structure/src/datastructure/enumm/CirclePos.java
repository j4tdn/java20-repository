package datastructure.enumm;

/**
 * KDL enum --> Tên: CirclePos
 * Có 3 giá trị INSIDE, ONSIDE, OUTSIDE
 * Mỗi giá trị mặc định gồm 2 phần:
 *    1 --> chỉ số bắt đầu từ 0
 *    2 --> tên --> name()
 *    
 *    VD: vị trí tương đối của điểm so với đường tròn: trong trên ngoài
 *    	  Tìm trạng thái giao hàng
 */
public enum CirclePos {
	INSIDE("Trong đường tròn"),		// CirclePos INSIDE = new CirclePos
	OUTSIDE("Ngoài đường tròn"),	// CirclePos OUTSIDE = new CirclePos
	ONSIDE("Trên đường tròn");		// CirclePos ONSIDE = new CirclePos
	
	private String value;
	
	CirclePos(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
