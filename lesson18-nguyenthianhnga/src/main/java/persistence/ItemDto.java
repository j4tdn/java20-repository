package persistence;

import java.sql.Time;
import java.time.LocalDateTime;
import java.util.Objects;

public class ItemDto {
	public static String PROP_IT_ID = "itId";
	public static String PROP_IT_NAME = "itName";
	public static String PROP_CREATE_AT = "create_at";
	
	private Integer itId;
	private String itName;
	private Time create_at;
	
	public ItemDto() {
		
	}
	public Integer getItId() {
		return itId;
	}
	public void setItId(Integer itId) {
		this.itId = itId;
	}
	public String getItName() {
		return itName;
	}
	public void setItName(String itName) {
		this.itName = itName;
	}
	public Time getCreate_at() {
		return create_at;
	}
	public void setCreate_at(Time create_at) {
		this.create_at = create_at;
	}
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof ItemDto)) {
			return false;
		}
		
		ItemDto that = (ItemDto)o;
		
		return getItId() == that.getItId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getItId());
	}
	@Override
	public String toString() {
		return "ItemDto [itId=" + itId + ", itName=" + itName + ", create_at=" + create_at + "]";
	}

	
}
