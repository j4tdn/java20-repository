package datastructor.enumm;


/**
 * KDL Enum --> ten: circlepos
 * co 3 gia tri: INSIDE, ONSIDE, OUTSIDE
 * moi gia tri mac dinh gon 2 phan: 
 * 1--> chi so --> bat dau tu 0
 * 2--> ten -->name()
 *	VD: vi tri tuong doi cua diem so voi duong tron: trong, tren, ngoai
 *Tinh trang giao hang : Dong goi. van chuyen , giao hang thanh cong 
 */
public enum CirclePos {
	INSIDE("Trong duong tron"),// CirclePos Inside = new CirclePos();
	ONSIDE("Tren duong tron"),//CirclePos Onside = new CirclePos();
	OUTSIDE("Ngoai duong tron");//CirclePos outside = new CirclePos();

	private String val;
	
	 CirclePos (String val) {
		this.val = val;
	}
	 
	public String getVal() {
		return val;
	}
}
