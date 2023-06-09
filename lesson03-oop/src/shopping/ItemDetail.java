package shopping;

public class ItemDetail {
	private Item item;
	private int quatity;
	public ItemDetail() {
	}
	public ItemDetail(Item item, int quatity) {
		super();
		this.item = item;
		this.quatity = quatity;
	}
	public Item getItem() {
		return item;
	}
	public void setItem(Item item) {
		this.item = item;
	}
	public int getQuatity() {
		return quatity;
	}
	public void setQuatity(int quatity) {
		this.quatity = quatity;
	}
	@Override
	public String toString() {
		return "ItemDetail [item=" + item + ", quatity=" + quatity + "]";
	}
	
}
