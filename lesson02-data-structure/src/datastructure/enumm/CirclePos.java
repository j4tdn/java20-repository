package datastructure.enumm;

/**
 * KDL enum --> Tên: CirclePos
 * Có 3 giá trị: INSIDE, ONSIDE, OUTSIDE
 * Mỗi giá trị mặc định gồm 2 phần:
 *   1 --> chỉ số bắt đầu từ 0 ordinal()
 *   2 --> tên --> name()
 *   
 *   VD: Vị trí tương đối của điểm so với đường tròn: trong, trên, ngoài
 *       Tình trạng giao hàng: đóng gói, vận chuyển, giao thành công
 */
public enum CirclePos {
	INSIDE("Trong Đường Tròn"), // CirclePos INSIDE = new CirclePos("Trong Đường Tròn");
	ONSIDE("Trên Đường Tròn"), // CirclePos ONSIDE = new CirclePos("Trên Đường Tròn");
	OUTSIDE("Ngoài Đường Tròn"); // CirclePos OUTSIDE = new CirclePos("Ngoài Đường Tròn");
	
	private String value;
	
	CirclePos(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
