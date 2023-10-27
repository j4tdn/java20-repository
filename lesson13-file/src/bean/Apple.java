package bean;

import java.io.Serializable;
import java.time.LocalDate;

public class Apple implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7212729907671208826L;
	private Integer id;
	private String origin;
	private String color;
	private LocalDate expiredDate;
	
	public Apple() {
	}

	public Apple(Integer id, String origin, String color, LocalDate expiredDate) {
		super();
		this.id = id;
		this.origin = origin;
		this.color = color;
		this.expiredDate = expiredDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}
	
	public static boolean testExpired(Apple apple) {
		return apple.getExpiredDate().isBefore(LocalDate.now());
	}
	
	
	@Override
	public String toString() {
		return "Apple [id=" + id + ", origin=" + origin + ", color=" + color + ", expiredDate=" + expiredDate + "]";
	}
	
	
}
