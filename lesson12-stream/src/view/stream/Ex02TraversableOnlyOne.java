package view.stream;

import java.util.List;
import java.util.stream.Stream;

public class Ex02TraversableOnlyOne {

	public static void main(String[] args) {
		
		
		/*
		 	stream chỉ cho phép duyệt 1 lần duy nhất --> nếu lặp -->throw exception
		 	
		 	Mục đích: dùng xử lí thay vì lưu trữ dữ liệu
		 	Lưu trữ: collection, array
		 	
		 	Stream: internal iteration
		 
		 */
		var sequences = List.of("a", "b", "c", "d" );

		Stream<String> stream = sequences.stream();
		
		stream.forEach(System.out::println);
		stream.forEach(System.out::println);
	}

}
