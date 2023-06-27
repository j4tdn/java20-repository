package datastructure.enumm;
/*
 * kdl enum --> teen: CirclePos
 * co 3 gia tri: INSIDE, ONSIDE, OUTSIDE
 * moi gia tri mac dinh gom 2 phan:
 * 	1--> chi so bat dau tu 0
 * 	2--> ten --> name()
 */
public enum CirclePos {
	INSIDE("Trong duong tron"),
	ONSIDE("Tren duong tron"),
	OUTSIDE("Ngoai duong tron");
	
	private String value;
	
	CirclePos(String value) {
		this.value= value;
	}
	public String getValue() {
		return value;
	}
}
