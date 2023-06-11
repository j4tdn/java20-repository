package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
     private Customer customer;
     private ItemDetail[] itemDetails ;
     private LocalDateTime odreDate; //wors case 10:10:10 08.05.2021 05.08.2021
     
     public Order() {
		
	}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime odreDate) {
		super();
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.odreDate = odreDate;
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

	public LocalDateTime getOdreDate() {
		return odreDate;
	}

	public void setOdreDate(LocalDateTime odreDate) {
		this.odreDate = odreDate;
	}

	@Override
	public String toString() {
		return "Oder [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", odreDate=" + odreDate
				+ "]";
	}
    
}
