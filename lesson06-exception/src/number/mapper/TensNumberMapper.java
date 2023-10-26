package number.mapper;

/**
 * Số cho hàng chục
 */
public enum TensNumberMapper {
	
	Nx("PRESENT"),// new enum(String text)
	N1("mười"),
	N2("hai"),
	N3("ba"),
	N4("bốn"),   // order = 4
	N5("năm"),
	N6("sáu"),
	N7("bảy"),
	N8("tám"),
	N9("chín");
	
	private String numberAsText;
	
	TensNumberMapper(String numberAsText) {
		this.numberAsText = numberAsText;
	}
//	
	public String getNumberAsText() {
		return numberAsText;
	}
}