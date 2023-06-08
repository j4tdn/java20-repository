package shopping;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer custumer;
	private ItemDetail[] itemdetails;
	private LocalDateTime orderDate;
	public Order() {
	}
	public Order(Customer custumer, ItemDetail[] itemdeteil, LocalDateTime localDateTime) {
		this.custumer = custumer;
		this.itemdetails = itemdeteil;
		this.orderDate = localDateTime;
	}
	public Customer getCustumer() {
		return custumer;
	}
	public void setCustumer(Customer custumer) {
		this.custumer = custumer;
	}
	public ItemDetail[] getItemdetails() {
		return itemdetails;
	}
	public void setItemdeteil(ItemDetail[] itemdeteil) {
		this.itemdetails = itemdeteil;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	@Override
	public String toString() {
		return "Order [custumer=" + custumer + ", itemdeteil=" + Arrays.toString(itemdetails) + ", orderDate="
				+ orderDate + "]";
	}
	
	
}
