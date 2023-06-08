package bean;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

public class Order {
	private Customer customer;
	private ItemDetails[] itemDs;
	private LocalDateTime shoppingDay;
	
	public Order() {
		
	}

	public Order(Customer customer, ItemDetails[] itemDs, LocalDateTime shoppingDay) {
		this.customer = customer;
		this.itemDs = itemDs;
		this.shoppingDay = shoppingDay;
	}

	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public ItemDetails[] getItemDs() {
		return itemDs;
	}

	public void setItems(ItemDetails[] itemDs) {
		this.itemDs = itemDs;
	}

	public LocalDateTime getShoppingDay() {
		return shoppingDay;
	}

	public void setShoppingDay(LocalDateTime shoppingDay) {
		this.shoppingDay = shoppingDay;
	}

	@Override
	public String toString() {
		return "Order [customer=" + customer + ", itemDs=" + Arrays.toString(itemDs) + ", shoppingDay=" + shoppingDay
				+ "]";
	}
	
	public double export() {
		double totalOfMoney = 0;
		ItemDetails[] ids = getItemDs();
		for (ItemDetails id : ids) {
			Item item = id.getItem();
			int quanlity = id.getQuantity();
			double idCost = item.getCost() * quanlity;
			if (LocalDate.of(2023, 5, 5).isEqual(getShoppingDay().toLocalDate())) {
				idCost *= 0.9;
			}
			totalOfMoney += idCost;
		}
		return totalOfMoney;
	}
	
	public void printItem() {
		System.out.println("Khách hàng: " + customer.getName());
		System.out.println("===================================================================================");
		ItemDetails[] ids = getItemDs();
		for (ItemDetails id : ids) {
			Item item = id.getItem();
			System.out.println(item.getId() + "			" + item.getOs() + "		" + item.getColor() + "	" + item.getCost() + "	" + id.getQuantity());
		}
		System.out.println("Totals: " + export());
		System.out.println();
	}
}
