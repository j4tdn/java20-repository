package persistence.dto;

import java.sql.Time;
import java.util.Objects;

public class ItemOrderDto {
	
	public static String PROP_IO_ID = "ioId";
	public static String PROP_IO_NAME = "ioName";
	public static String PROP_IO_CREATED_TIME = "ioCreatedTime";
	
	private Integer ioId;
	private String ioName;
	private Time ioCreatedTime;
	
	public ItemOrderDto() {
	}

	public ItemOrderDto(Integer ioId, String ioName, Time ioCreatedTime) {
		this.ioId = ioId;
		this.ioName = ioName;
		this.ioCreatedTime = ioCreatedTime;
	}

	public Integer getIoId() {
		return ioId;
	}

	public void setIoId(Integer ioId) {
		this.ioId = ioId;
	}

	public String getIoName() {
		return ioName;
	}

	public void setIoName(String ioName) {
		this.ioName = ioName;
	}

	public Time getIoCreatedTime() {
		return ioCreatedTime;
	}

	public void setIoCreatedTime(Time ioCreatedTime) {
		this.ioCreatedTime = ioCreatedTime;
	}
	
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		
		if (!(o instanceof ItemOrderDto)) {
			return false;
		}
		
		ItemOrderDto that = (ItemOrderDto)o;
		
		return getIoId() == that.getIoId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getIoId());
	}

	@Override
	public String toString() {
		return "ItemGroupDto [igId=" + ioId + ", igName=" + ioName + ", ioCreatedTime=" + ioCreatedTime + "]";
	}
}
