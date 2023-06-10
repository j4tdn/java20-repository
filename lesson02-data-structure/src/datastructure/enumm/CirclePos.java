package datastructure.enumm;

/**
 * KDL enum --> Tên: CirclePos Có 3 giá trị: INSIDE, ONSIDE, OUTSIDE Mỗi giá trị
 * mặc định gồm 2 phần 1 --> Chỉ số bắt đầu từ 0 ordinal() || 2 --> Tên --> name()
 * 
 * VD: Vị trí tương đối của điểm so với đường tròn: trong, trên, ngoài Tình
 * trạng giao hàng: đóng gói, vận chuyển, giao thành công
 * 
 * @author PC
 *
 */
public enum CirclePos {
	INSIDE("Trong đường tròn"), // CirclePos INSIDE = new CirclePos();
	ONSIDE("Trên đường tròn"), // CirclePos ONSIDE = new CirclePos();
	OUTSIDE("Ngoài đường tròn"); // CirclePos OUTSIDE = new CirclePos();

	private String value;

	CirclePos(String value) {
		this.value = value;
	}

	CirclePos() {

	}

	public String getValue() {
		return value;
	}
}
