package datastructure.enumm;
/**
 * KDL enum --> Tên: CirclePos
 * Có 3 giá trị: INSIDE, ONSIDE, OUTSIDE
 * Mỗi giá trị mặc định gồm 2 phần:
 * 		1. Chỉ số bắt đầu từ 0
 * 		2. Tên --> name
 *
 * VD: 	Tình trạng giao hàng
 * 		Vị trí tương đối của điểm với đường tròn
 */
public enum CirclePos {
	INSIDE("Trong duong tron"), //CirclePos INSIDE = new CirclePos("Trong duong tron");
	ONSIDE("Tren duong tron"), //CirclePos INSIDE = new CirclePos("Tren duong tron");
	OUTSIDE("Ngoai duong tron");//CirclePos INSIDE = new CirclePos("Ngoai duong tron");

	String value;

	private CirclePos(String value) {
		this.value = value;
	}

	public String getValue() {
		return value;
	}
}
