package bean;

public enum BookStatus {
	NEW("Moi"),
	OLD("Cu");
	
	String value;
	private BookStatus(String value) {
		this.value = value;
	}
	public String getValue() {
		return value;
	}
}
