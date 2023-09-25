package excersises;

public enum NumberMapper {
	NO("KHông"),
	N1("Một"),
	N2("Hai"),
	N3("Ba"),
	N4("Bốn"),
	N5("Năm"),
	N6("Sáu"),
	N7("Bảy"),
	N8("TÁM"),
	N9("Chín");
	
	private String NumberAsTest;
	
	NumberMapper(String NumberAsTest) {
		this.NumberAsTest = NumberAsTest;
	}
//	public String NumberMapper() {
//		return NumberAsTest;
//	}
	public String getNumberAsTest() {
		return NumberAsTest;
	}
	public void setNumberAsTest(String numberAsTest) {
		NumberAsTest = numberAsTest;
	}
	
	
}
