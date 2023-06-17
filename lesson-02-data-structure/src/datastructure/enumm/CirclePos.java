package datastructure.enumm;

/*
 * KDL enum --> Teen: CirclePos
 * Có 3 giá trị: INSIDE, ONSIDE, OUTSIDE
 * Mỗi giá trị mặc định gồm 2 phần:
 * 1 --> chỉ số bắt đầu từ 0
 * 2 --> tên --> getName()
 * 
 * VD: Vị trí tương đối của điểm so với đường tròn
 * 	 : Tình trạng giao hàng: đóng gòi, vận chuyển, giao thành công
 */

public enum CirclePos {
	INSIDE("In"), //CirclePos INSIDE = new CirclePos();
	ONSIDE("On"), //CirclePos ONSIDE = new CirclePos();
	OUTSIDE("Out");
	
	private String value;
	
	private CirclePos(String value) {
		this.value = value;
	}
	
	public String getValue() {
		return value;
	}

}
