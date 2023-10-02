package view.list;

import java.math.BigDecimal;
import static java.util.Comparator.*;

import bean.Item;
import model.DataModel;
import util.CollectionUtils;
//remove
//-> Duyệt từng phần tử trong list, nếu phần tử nào 'equals' với phần tử cần remove 
//-> Chỉ remove phần tử đầu tiên equals với phần tử cần remove

//contains (lưu ý)
//--> duyệt từng phần tử trong list, nếu equals thì trả về true

//lúc compiles -> equals của Object
//lúc runtime -> equals của class theo địa chỉ 
//--> phải ovveride lại hàm equals trong KDL truyền vào list để thay vì equals theo địa chỉ (mặc định của class Object)
//		thì sẽ equals theo giá trị của thuộc tính mà mình override

public class Ex05BasicOperationsWithItem {
	public static void main(String[] args) {
		var items = DataModel.mockItems();
		System.out.println("items size ");
		Item itemToBeRemoved = new Item(2, "Item A2", bd(22), 101);

		items.remove(itemToBeRemoved);
		CollectionUtils.generateItems("items", items);
		
		//sorting --> Arrays.sort(T[]) : T implements Comparator
		//sorting --> Arrays.sort(T[], Comparator<T> com)
		
		//Collections --> Collections.sort(T[]) : T implements Comparator
		//Collections --> Collections.sort(T[], Comparator<T> com)
		
		//list.sort
		
		items.sort(comparing(Item::getSalesPrices));
		
		CollectionUtils.generateItems("items", items);
	}

	
	
	public static BigDecimal bd(double value) {
		return BigDecimal.valueOf(value);
	}
}
