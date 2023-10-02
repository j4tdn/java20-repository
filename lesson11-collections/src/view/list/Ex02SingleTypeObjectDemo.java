package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02SingleTypeObjectDemo {
	public static void main(String[] args) {
		//How ArrayList works behind the scene
		
		//khởi tạo java.util.ArrayList
		List<String> sequences = new ArrayList<>();
		
		//Thêm 1 hoặc nhiều phần tử vào sequences
		sequences.add("z182");
		sequences.add("a21");
		sequences.add("d811");
		
		//in thông tin
		System.out.println("size -> " + sequences.size());
		
		System.out.println("List of elements --> ");
		for(String s : sequences) {
			System.out.println("+ " + s);
		}
		
		
	}
}
