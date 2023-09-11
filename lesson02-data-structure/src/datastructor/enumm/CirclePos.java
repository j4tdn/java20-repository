package datastructor.enumm;

/*
 * KDL enum --> CirclePos
 * Có 3 giá trị : INSIDE, ONSIDE, OUTSIDE
 * Mỗi giá trị măc định gồm 2 phần:
 * 1 --> chỉ số --> bắt đầu từ 0 ordinal
 * 2--> tên --> name()
 * 
 *  VD: trình trạng giao hàng : đóng gói vận chuyển đang giao
 *  	vị trí của điểm so với đường tròn
 * */
public enum CirclePos { 
	INSIDE("Trong đường tròn"), //CirclePos INSIDE = new CirclePos(); gọi là biến hay giá trị đều đc
	ONSIDE("Trên đường tròn"), 
	OUTSIDE("Ngoài đường tròn");
	
	private String value;
	
	private CirclePos(String value) {
		this.value =value;
	}
	
	public String getValue() {
		return value;
	}
}
