package bean;

import java.io.Serializable;
import java.time.LocalDate;

public class Apple implements Serializable{

	private static final long serialVersionUID = 7804777489552846785L;
	
	private Integer id;
	private String name;
	private String origin;
	private LocalDate expiredDate;

	public Apple() {
	}

	public Apple(Integer id, String name, String origin, LocalDate expiredDate) {
		this.id = id;
		this.name = name;
		this.origin = origin;
		this.expiredDate = expiredDate;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getOrigin() {
		return origin;
	}

	public void setOrigin(String origin) {
		this.origin = origin;
	}

	public LocalDate getExpiredDate() {
		return expiredDate;
	}

	public void setExpiredDate(LocalDate expiredDate) {
		this.expiredDate = expiredDate;
	}

	@Override
	public String toString() {
		return "Apple [id=" + id + ", name=" + name + ", origin=" + origin + ", expiredDate=" + expiredDate + "]";
	}

}
