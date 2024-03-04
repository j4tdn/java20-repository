package persistence;

import java.util.List;
import java.util.Objects;

public class ItemGroup {
	private Integer id;
	private String name;
	
	private List<Item> items;
	
	/**
	 * Empty constructor
	 */
	public ItemGroup() {
		
	}

	public ItemGroup(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
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
	
	public List<Item> getItems() {
		return items;
	}
	
	public void setItems(List<Item> items) {
		this.items = items;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		
		if (!(obj instanceof ItemGroup)) {
			return false;
		}
		
		ItemGroup that = (ItemGroup) obj;
		
		return getId() == that.getId();
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(getId());
	}
	
	@Override
	public String toString() {
		return "ItemGroup [id=" + id + ", name=" + name +"]";
	}
}
