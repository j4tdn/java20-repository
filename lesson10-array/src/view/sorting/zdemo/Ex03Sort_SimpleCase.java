package view.sorting.zdemo;

import java.util.Arrays;
import java.util.function.Function;

import ArrayUtils.ArraysUtils;

import static java.util.Comparator.*;

import bean.Item;
import model.DataModel;

public class Ex03Sort_SimpleCase {
	 public static void main(String[] args) {
		 
		 /*
		  Với những trường hợp đơn giản như sắp xếp các phần tử nhue các thuộc tính 
		  bên trong đối tượng , xử lý null value cho đối tượng
		  --> Sử dụng Comparator.comparing(Function<T, ?> function) thay vì phải new Comparator<T>
		  */
		// array of strings
			String[] sequences = {"a", "z", null, "c", null, "d", "b"};
			Arrays.sort(sequences,nullsFirst(comparing(Function.identity())));
			
			/*
			 comparing(Function.identity()):
			  Đây là một phương thức tĩnh trong lớp Comparator của Java,
			   được sử dụng để so sánh các phần tử của mảng.
			    Trong trường hợp này, Function.identity() đại diện 
			    cho một hàm định danh (identity function),
			     nghĩa là phần tử được so sánh dựa trên giá trị của nó.
			 */
			ArraysUtils.generate("sequences sort with comparator ", sequences);	 	
			
			Arrays.sort(sequences,nullsFirst(comparing(Function.identity(),reverseOrder())));
			ArraysUtils.generate("sequences sort with comparator ", sequences);	 
			
			
			// array of items
			Item[] items = DataModel.mockItems();
			 Arrays.sort(items, (c1, c2) -> c1.getName().compareTo(c2.getName()));
			// Function<T, R> f = (Item item) -> item.getName(); // lambda expression
				// Function<T, R> f = Item::getName; // method reference
				
				// Arrays.sort(items, comparing(Item::getName)); // default asc
			
			 Arrays.sort(items, comparing(Item::getName)); 
			 
			 // Mặc định của hàm comparing là tăng dần
			 //--> Nếu muốn sắp xếp giảm dân thì sử dụng hàm reversed()
			 Arrays.sort(items,comparing(Item::getName).reversed());
			 
			 ArraysUtils.generate("Sort items DESC name with comparing ", items);
			 Arrays.sort(items,comparing(Item::getStoreId).thenComparing(Item::getSalesPrice).reversed());
			 
			 ArraysUtils.generate("Sort items DESC name with comparing ", items);
	}
	
}