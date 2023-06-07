package bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime orderDate;
	
	public Order() {
		
	}
	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime orderDate) {
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.orderDate = orderDate;
	}
	public Customer getCustomer() {
		return customer;
	}
	public void setCustomer(Customer customer) {
		this.customer = customer;
	}
	public ItemDetail[] getItemDetails() {
		return itemDetails;
	}
	public void setItemDetails(ItemDetail[] itemDetails) {
		this.itemDetails = itemDetails;
	}
	public LocalDateTime getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDateTime orderDate) {
		this.orderDate = orderDate;
	}
	
	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", orderDate="
				+ orderDate + "]";
	}
	
	public double export() {
		double totalOfSum = 0;
		ItemDetail[] listItemDetails = this.getItemDetails();
		for(ItemDetail itdt : listItemDetails) {
			Item item = itdt.getItem();
			int quantity = itdt.getQuantity();
			totalOfSum += item.getCost() * quantity;
			if(totalOfSum > 590 && LocalDate.of(2023, Month.MAY, 8).isEqual(this.getOrderDate().toLocalDate())){
				totalOfSum *= 0.9;
			}
		}
		return totalOfSum;
	}
}
