package persistence.dtos;

import java.sql.Date;

public class ItemDTO {
	
	public static final String ID = "id";
	public static final String NAME = "name";
	public static final String CREATE_AT = "createAt";
	
	private Integer id;

	private String name;

	private Date createAt;

	public ItemDTO() {
	}

	public ItemDTO(Integer id, String name, Date createAt) {
		super();
		this.id = id;
		this.name = name;
		this.createAt = createAt;
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

	public Date getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	@Override
	public String toString() {
		return "ItemDTO [id=" + id + ", name=" + name + ", createAt=" + createAt + "]";
	}

}
