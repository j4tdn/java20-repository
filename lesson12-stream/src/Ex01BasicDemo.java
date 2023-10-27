//
//import java.util.ArrayList;
//import java.util.LinkedHashMap;
//import java.util.LinkedHashSet;
//import java.util.List;
//import java.util.stream.Collector;
//import java.util.stream.Collectors;
//import java.util.stream.Stream;
//import static utils.StreamUtils.*;
//
//import bean.Dish;
//import common.Category;
//import model.DataModel;
//
//public class Ex01BasicDemo {
//
//	public static void main(String[] args) {
//
//		/*
//		 CÁC BƯỚC ĐỂ THAO TÁC VỚI STREAM
//			B1: Convert/Init data sang/cho Stream<T>
//			B2: Gọi các hàm xử lý có sẵn trong Stream
//				=> Vẫn trả về Stream
//				=> Intermediate operations
//			B3: Sau khi xử lý xong
//				=> Chuyển đổi Stream sang 1 KDL khác để lưu trữ
//				=> Terminal operations
//		 */
//		
//		var menu = DataModel.mockDishes();
//
//		// 1> Get dishes which have calories > 250
//		var dishes = menu.stream().filter(d -> d.getCalories() > 1000).collect(Collectors.toList());
//		generate("1> Get dishes which have calories > 250", dishes);
//		
//		// 2> Get name of dishes
//		
//		var list = menu.stream().map(Dish::getName).collect(Collectors.toCollection(LinkedHashSet::new));
//		generate("2> Get name of dishes", list);
//		
//		// 3> 
//		
//		var = menu.stream().filter(d -> d.getCategory().equals(Category.VEGGIE)).map(Dish::getName).to
//		
//	}
//
//}
