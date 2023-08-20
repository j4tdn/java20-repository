package number.mapper;

/**
 * Số cho hàng đơn vị
 */
public enum UnitNumberMapper {
	
	N0("không"), // ordinal = 0
	N1("một"),
	N2("hai"),
	N3("ba"),
	N4("bốn"),   // order = 4
	N5("năm"),
	N6("sáu"),
	N7("bảy"),
	N8("tám"),
	N9("chín");
	
	private String numberAsText;
	
	UnitNumberMapper(String numberAsText) {
		this.numberAsText = numberAsText;
	}
	
	public String getNumberAsText() {
		return numberAsText;
	}
}