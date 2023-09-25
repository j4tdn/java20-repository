package view.list;

import java.math.BigDecimal;

import bean.Item;
import model.DataModel;
import static utils.CollectionUtils.*;
import static java.util.Comparator.*;

public class Ex05BasicOperatorWithItem {
	// remove
	// --> duyệt từng phần tử trong list, nếu phần tử nào 'equals'
	// với phần tử cần remove --> remove
	// --> chỉ remove phần tử đầu tiên equals với phần tử cần xóa
	
	// lúc compile --> luôn gọi hàm equals của Object --> luôn compare địa chỉ
	// lúc runtime  --> gọi hàm equals của class mình truyền vào --> override hàm equals

	// constains(lưu ý)
	// --> Duyệt từng phần tử trong list, nếu phần tử nào 'equals'
	// với phần tử đang kiểm tra --> true
	
	// --> phải override lại hàm equals trong KDL truyền vào List
	// để thay vì equals theo địa chỉ(mặc định từ class Object) thì nó sẽ
	// equals theo giá trị của thuộc tính mình override
	
	// List --> remove, constains
	
	// class --> attribute, constructor, getter, setter, equals, toString
	
	public static void main(String[] args) {
		var items = DataModel.mockItems();
		System.out.println("item size before --> " + items.size());

		// Item itemToBeRemoved = new Item(99, "Item99", bd(124), 303);
		Item itemToBeRemoved = new Item(8, "Item C4", bd(55), 105);
		items.remove(itemToBeRemoved);
		
		System.out.println("item size after --> " + items.size());
		
		// Arrays.sort(T[]): T implements Comparable<T>
		// Arrays.sort(T[], Comparator<T>) : 
		
		// collection --> Collection.sort(List<T>) T implements Comparatable<T>
		//			  --> Collection.sort(List<T>, Comparator<T>)
		items.sort(comparing(Item::getStoreId)
				.thenComparing(Item::getSalesPrices, reverseOrder()));
		
		generateItem("items", items);
	}

	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
