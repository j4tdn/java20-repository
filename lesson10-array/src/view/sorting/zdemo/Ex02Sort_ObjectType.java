package view.sorting.zdemo;

import java.lang.constant.Constable;
import java.lang.constant.ConstantDesc;
import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.function.Function;

import static java.util.Comparator.comparing;
import static java.util.Comparator.reverseOrder;
import ArrayUtils.ArraysUtils;
import static java.util.Comparator.*;
import bean.Item;
import model.DataModel;

public class Ex02Sort_ObjectType {
	public static void main(String[] args) {
		String[] sequences = {"a1", "z2", "c5", "d4"};
		
		String[] sequences_null = {"a1", "z2",null, "c5",null, "d4"};
		Arrays.sort(sequences_null, nullsFirst(comparing(Function.identity())));
		
		ArraysUtils.generate("Null first with Comparator -->", sequences_null);
		
		
		
		Arrays.sort(sequences);
		/*
		 //*********Arrays.sort(Object[] object)*********
		  -> Yêu cầu KDL truyền vào cho object phải là con của Comparable<?>
		  -> Mặc định : Tăng dần
		  -> Nếu muốn custom lại tăng/ giảm thì KDL truyền vào phải override lại hàm compareTo trong Comparable<>
		  
		  
		  Ex: sequences _ Kiểu dữ liệu : String -> String là kiểu dữ liệu được truyền vào và String có 
		  extends Comparale<String>
		  
		 ---------HÀM String TRONG JAVA------------
		 public final class String
    	implements java.io.Serializable, Comparable<String>, CharSequence,
               Constable, ConstantDesc {
			--------------------------------------
			
		 */
		
		
		// Arrays.sort(T[] elements, Comparator<T> comparator)
				//        : KDL truyền vào bất kỳ, chỉ cần KDL đối tượng
				//        : Sắp xếp tăng dần / giảm dần dựa vào Comparator<T>
				
		
		
		
		
		
		Arrays.sort(sequences,(s1,s2)->{
		return s2.compareTo(s1);
		});
		ArraysUtils.generate("sort DESC", sequences);
		Arrays.sort(sequences,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				return o1.compareTo(o2);
			}
		});
		ArraysUtils.generate("sort String with new Comparator -->>",sequences);
		
		Arrays.sort(sequences, (o1,o2)->o1.compareTo(o2)); ///lamda expresion
		ArraysUtils.generate("sort String with new Comparator lambda -->>",sequences);
		
		Arrays.sort(sequences, (o1,o2)->{
			return o1.compareTo(o2);
		});
		
		
		
		System.out.println("--------------------------------------");
		
		Item[] items =DataModel.mockItems();
		
		
		ArraysUtils.generate("Sort item Name with Comparator ---> ", items);
		
		Arrays.sort(items, (o1,o2)->{
			return o1.getSalesPrice().compareTo(o2.getSalesPrice());
		});
		Arrays.sort(items,
				comparing(Item::getStoreId,reverseOrder()).thenComparing(Item::getSalesPrice)); 
		Arrays.sort(items, 
				comparing(Item::getStoreId, reverseOrder())
				.thenComparing(Item::getSalesPrice));
		ArraysUtils.generate("Sort items by storeId(DESC)", items);
		
		Arrays.sort(items,
				comparing(Item::getStoreId,reverseOrder()).thenComparing(Item::getSalesPrice)); 
				
		
		
		
		// -------------DEMO SORT NULL ATTRIBUTE WITH COMPARATIOR--------------
		///

		items[2].setStoreId(null);
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				return o1.getId().compareTo(o2.getId());
			}
		});
		ArraysUtils.generate("Sort item ID with Comparator ---> ", items);

		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});

		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				Integer st1 = o1.getStoreId();
				Integer st2 = o2.getStoreId();
				if (st1 == null && st2 != null) {
					return -1;

				}
				if (st2 == null) {
					return 1;
				}
				return st1.compareTo(st2);
			}
		});

		ArraysUtils.generate("Sort item by id with Comparator when null id ---> ", items);
		items[6].setSalesPrice(null);
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				BigDecimal price1 = o1.getSalesPrice();
				BigDecimal price2 = o2.getSalesPrice();
				if (price1 == null && price2 != null) // null first
				{
					return -1;
				}
				if (price2 == null) {
					return 1;
				}
				return price1.compareTo(price2); // ASC

			}
		});
		ArraysUtils.generate("Sort item by id with Comparator when null id ---> ", items);

		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				BigDecimal price1 = o1.getSalesPrice();
				BigDecimal price2 = o2.getSalesPrice();
				if (price1 == null && price2 != null) // null last
				{
					return 1;
				}
				if (price2 == null) {
					return -1;
				}
				return price1.compareTo(price2); // ASC

			}
		});
		ArraysUtils.generate("Sort item by id with Comparator when null id ---> ", items);
		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				BigDecimal price1 = o1.getSalesPrice();
				BigDecimal price2 = o2.getSalesPrice();
				if (price1 == null && price2 != null)// null last
				{
					return 1;
				}
				if (price2 == null) {
					return -1;
				}
				return price2.compareTo(price1); /// DESC

			}
		});
		ArraysUtils.generate("Sort item by id with Comparator when null id ---> ", items);

		Arrays.sort(items, new Comparator<Item>() {

			@Override
			public int compare(Item o1, Item o2) {
				BigDecimal price1 = o1.getSalesPrice();
				BigDecimal price2 = o2.getSalesPrice();
				if (price1 == null && price2 != null) /// null first
				{
					return -1;
				}
				if (price2 == null) {
					return -1;
				}
				return price1.compareTo(price2); /// ASC

			}
		});
		ArraysUtils.generate("Sort item by id with Comparator when null id ---> ", items);

		// ---------------END DEMO ----------------------
		
		
		
		/*
		 import static java.util.Comparator.comparing;
		 import static java.util.Comparator.reverseOrder;
		 
		 --> import để sử dụng phương thức comparing/ reverseOrder

		 */
		
		/*
		  Hạn chế: với KDL ví dụ như Item, Employee khi sort với Comparable thì chỉ được
		 phép sort theo 1 phương pháp(theo thuộc tính này, kia) duy nhất
		 
		 
		 @Override
		public int compareTo(Item o) {
			Item i1 = this;
			Item i2 = o;
			// return i1.getId().compareTo(i2.getId());
			return i2.getName().compareTo(i1.getName());
		}
		-> Khi sort bẳng Comparable<T> thì phải override lại hàm compareTo()
		 Ví dụ : 
		 	Khi sort Item  sử dụng Comparable<T> như trên thì chỉ được sort theo 1 thuộc tính duy nhất 
		 */
		
		
	}
}
