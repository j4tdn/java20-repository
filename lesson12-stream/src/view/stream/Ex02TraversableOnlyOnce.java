package view.stream;

import java.util.List;
import java.util.stream.Stream;

public class Ex02TraversableOnlyOnce {

	public static void main(String[] args) {
	
		/*
		 
		  stream chỉ cho duyệt một lần duy nhất nếu lặp lại sẽ quăng exeption
		  mục đích: dùng stream để xử lý, thay vì lưu trữ dữ liệu
		  
		  lưu trữ: Array, Collection
		  xữ lý: stream
		  
		  stream: internal operation
		  
		 */
		var sequences = List.of("a", "b", "c", "d");
		Stream<String> stream = sequences.stream();
		stream.forEach(seq -> System.out.println("seq-> " + seq));//stream has already been operated upon or closed
	}
	
}
