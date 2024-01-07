package datastructure.enumm;

/**
 * KDL enum --> tên: CirclePos có 3 giá trị: INSIDE,ONSIDE,OUTSIDE Mỗi giá trị
 * mặc định gồm 2 phần: 
 * 1 --> chỉ số bắt đầu từ 0 ordinal() 
 * 2 --> tên --> name()
 * 
 * vd: vị trí tương đối của điểm so với đường tròn: trong, trên, ngoài
 * 	   tình trạng giao hàng: đóng gói, vận chuyển, giao thành công
 */

public enum CirclePos {
	INSIDE("trong đường tròn"), // CirclePos INSIDE = new CirclePos("trong đường tròn);
	ONSIDE("trên đường tròn"), // CirclePos ONSIDE = new CirclePos("trên đường tròn);
	OUTSIDE("ngoài đường tròn"); // CirclePos OUTSIDE = new CirclePos("ngoài đường tròn);

	private String value;

	private CirclePos(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}
}
