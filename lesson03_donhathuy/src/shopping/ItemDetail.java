package shopping;

public class ItemDetail {
	private Items item;
	private int quantity;
	public ItemDetail() {
	}
	public ItemDetail(Items item, int quantity) {
		this.item = item;
		this.quantity = quantity;
	}
	public Items getItem() {
		return item;
	}
	public void setItem(Items item) {
		this.item = item;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	@Override
	public String toString() {
		return "ItemDetail [item=" + item + ", quantity=" + quantity + "]";
	}
	
}
