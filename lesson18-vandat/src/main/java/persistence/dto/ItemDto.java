package persistence.dto;

import java.time.LocalDateTime;

public class ItemDto {

	public static String PROP_ID = "igId";
	public static String PROP_NAME = "igName";
	public static String PROP_CREATED_AT = "localDateTime";

	private Integer igId;
	private String igName;
	private LocalDateTime localDateTime;
	
	public ItemDto() {
	}

	public ItemDto(Integer igId, String igName, LocalDateTime localDateTime) {
		this.igId = igId;
		this.igName = igName;
		this.localDateTime = localDateTime;
	}

	public Integer getIgId() {
		return igId;
	}

	public void setIgId(Integer igId) {
		this.igId = igId;
	}

	public String getIgName() {
		return igName;
	}

	public void setIgName(String igName) {
		this.igName = igName;
	}

	public LocalDateTime getLocalDateTime() {
		return localDateTime;
	}

	public void setLocalDateTime(LocalDateTime localDateTime) {
		this.localDateTime = localDateTime;
	}

	@Override
	public String toString() {
		return "ItemDto [igId=" + igId + ", igName=" + igName + ", localDateTime=" + localDateTime + "]";
	}
	
}
