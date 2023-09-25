package view.list;

import java.util.Comparator;
import java.util.List;

import bean.DataModel;
import bean.Item;
import utils.CollectionUtils;

public class Ex05BasicOperationWithItem {
	public static void main(String[] args) {
		// remove (lưu ý)
		// --> duyệt từng phần từ trong list, nếu phần tử nào 'equals'
		// với phần từ cần remove
		// --> chỉ remove phần từ đầu tiên equals với phần tử cần xóa		
		// phải override lại hàm equals trong KDL truyền vào List
		// để thay đổi vì equals theo địa chỉ (mặc định theo địa chỉ) thì nó sẽ 
		//equals theo giá trị của thuộc tính mình override
		
		// --> List: remove, contains
		
		// class --> attribute, constructor, getter, setter, equals, toString;
		List<Item> items = DataModel.mockItems();
		Item itemToBeRemoved = new Item(4, "Item c2", CollectionUtils.bd(32), 106);
		items.remove(itemToBeRemoved);
		
		CollectionUtils.generateItem("items", items);
		
		
		//sorting --> arrays.sort(T[]): T implements Comparable<T>
		//		  --> arrays.sort(T[], Comparator<T> com)
		
		//collection --> collections.sort(T[]): T implements Comparable<T>
		//		  --> arrays.sort(T[], Comparator<T> com)
		//list.sort(Comparator<T>)
		//--> sort items by storeId(ACS), salesPrice(DESC);
		
		items.sort(Comparator.comparing(Item::getStoreId)
				.thenComparing(Item::getSalePrice).reversed());
		CollectionUtils.generateItem("items", items);
	}
}
