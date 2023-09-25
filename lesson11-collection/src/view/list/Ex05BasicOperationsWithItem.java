package view.list;

import static utils.CollectionUtils.generateItem;

import java.math.BigDecimal;
import static java.util.Comparator.*;

import bean.Item;
import model.DataModel;

public class Ex05BasicOperationsWithItem {

	// remove(lưu ý)
	// --> duyệt từng ptu trong list, nếu ptu nào 'equals' với ptu cần remove -->
	// remove
	// chỉ remove ptu đầu tiên equals với ptu cần xóa

	// lúc compile -> luôn gọi hàm equals của Object --> luôn compare địa chỉ
	// lúc runtime -> gọi equals của Item --> override equals --> compare theo mình muốn
	
	// contains(lưu ý)
	// --> duyệt từng ptu trong list, nếu có 'equals' --> true
	
	// phải override lại hàm equals trong KDL truyền vào List
	// để thay vì equals theo địa chỉ(mặc định từ class Object) thì nó sẽ
	// equals theo giá trị của thuộc tính mình override
	
	// class ->> attribute, constructor, getter, setter, equals, hashCode, toString
	
	public static void main(String[] args) {
		
		var items = DataModel.mockItems();
		System.out.println("item size before --> " + items.size());
		// Item itemToBeRemoved = new Item(99, "Item 99", bd(124), 303);
		Item itemToBeRemoved = new Item(4, "Item B2", bd(39), 101);
		
		items.remove(itemToBeRemoved);
		System.out.println("item size after --> " + items.size());

		// sorting --> Arrays.sort(T[]): T implements Comparable<T>
		// 		   --> Arrays.sort(T[], Comparator<T> comp)
		
		// collection --> Collections.sort(List<T>)
		// 			  --> Collections.sort(List<T>, Comparator<T>)
		
		// list.sort(Comparator<T>)
		// --> sort items by storeId(ASC), salesPrice(DESC)
		
		items.sort(comparing(Item::getStoreId)
				.thenComparing(Item::getSalesPrice, reverseOrder()));
		
		generateItem("item: ", items);
		
	}
	
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}

}
