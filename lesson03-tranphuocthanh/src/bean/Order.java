package bean;

import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] item_detail;
	private LocalDateTime orderDate;

	public Order() {
	}

	public Order(Customer customer, ItemDetail[] item_detail, LocalDateTime orderDate) {
		this.customer = customer;
		this.item_detail = item_detail;
		this.orderDate = orderDate;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetail[] getItem_detail() {
		return item_detail;
	}

	public void setItem_detail(ItemDetail[] item_detail) {
		this.item_detail = item_detail;
	}

	public LocalDateTime getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", item_detail=" + Arrays.toString(item_detail) + ", orderDate="
				+ orderDate + "]";
	}

	

}
