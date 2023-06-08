package shopping;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetail[] itemDetails;
	private LocalDateTime datetime;
	
	public Order()
	{
		
	}

	public Order(Customer customer, ItemDetail[] itemDetails, LocalDateTime datetime) {
		super();
		this.customer = customer;
		this.itemDetails = itemDetails;
		this.datetime = datetime;
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

	public LocalDateTime getDatetime() {
		return datetime;
	}

	public void setDatetime(LocalDateTime datetime) {
		this.datetime = datetime;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDetails=" + Arrays.toString(itemDetails) + ", datetime="
				+ datetime + "]";
	}

	public double export() {
		double totalOfMoney = 0;
		ItemDetail[] ids = getItemDetails();
		for (ItemDetail id :ids)
		{
			Item item = id.getItem();
			int quantity = id.getQuantity();
			double isCost= item.getCost()* quantity;
			if(item.getCost()>590 && LocalDate.of(2021, Month.MAY,8).equals(getDatetime().toLocalDate()))
			{
				isCost *= 0.9;
				
			}
			totalOfMoney+=isCost;
		}
		return totalOfMoney;
	}
	
}
