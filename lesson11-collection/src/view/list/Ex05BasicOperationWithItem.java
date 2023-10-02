package view.list;

import java.math.BigDecimal;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;

import bean.Item;
import model.DataModel;
import utils.CollectionUtils;

public class Ex05BasicOperationWithItem {
	public static void main(String[] args) {
		var items = DataModel.mockItems();
		// remove -> Duyệt từng phần tử trong list, nếu phần tử nào equals với phần tử cần remove -> remove 
		// 	      -> Chỉ remove phần tử đầu tiên equals với phần tử cần xóa
		
		// contains(lưu ý)
		// -> Duyệt từng phẩn tử trong list, nếu phần tử nào 'equals' với checking pivot -> true
		
		// Phải override lại hàm equals trong KDL truyền vào list 
		// Để thay vì equals theo địa chỉ(mặc định từ class Object) thì nó sẽ equals theo giá trị của thuộc tính mình override
		
		// Class -> attribute, constructor, getter, setter, equals, toString
		System.out.println("Items size before --> " + items.size());
		Item itemToBeRemoved = new Item(8, "Item A8", bd(63), 101);		
		items.remove(itemToBeRemoved);
		
		System.out.println("Items size after --> " + items.size());
		CollectionUtils.generateItem("items", items);
		
		// Collection --> Collections.sort(List<T>) T implements comparable
		//			  --> Collections,sort(List<T>, comparator<T>)
		
		// list.sort(Comparator<T>)
		// -> sort items by storeId(ASC), salesPrice(DESC)
		
		items.sort(
					Comparator.comparing(Item::getStoreId)
							 .thenComparing(i1 -> i1.getSalesPrice())
							 
				  );
		
		CollectionUtils.generateItem("items after sorted", items);
		
	}
	
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}

//TODO HOMEWORK
// Lý thuyết mảng, DSLK, phân biệt 2 cái 

/*
 * Mảng là cấu trúc dữ liệu lưu tập hợp các phần tử có cùng KDL nằm liên tiếp nhau trong bộ nhớ, có kích thước cố định
 * 
 * Danh sách liên kết là cấu trúc dữ liệu lưu tập hợp các phần tử có cùng KDL, có kích thước dynamic
 * 
 */
// Demo DSLK, phân biệt ArrayList và LinkedList


