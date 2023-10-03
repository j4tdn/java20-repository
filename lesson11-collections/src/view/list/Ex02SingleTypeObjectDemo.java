package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02SingleTypeObjectDemo {
	
	public static void main(String[] args) {
		
		// How ArrayList works behind the scene
		
		// Khởi tạo java.util.ArrayList
		List<String> sequences = new ArrayList<>(); // elementData with length = default capacity = 10
		
		/* 
		  Khi nào khởi tạo ArrayList với tham số capacity truyền vào?
		 		Trả lời: Khi biết trước SL phần tử tối đa sẽ lưu trữ trong ArrayList
							+ TH1: tối đa < 10: tạo 1 mảng ít phần tử hơn => đỡ tốn memory
							+ TH2: tối đa > 10: tạo duy nhất 1 mảng, hạn chế grow, copy tạo mảng nhiều lần
		*/					
		sequences = new ArrayList<>(5);
		sequences = new ArrayList<>(100);
		
		// Thêm 1 hoặc nhiều phần tử vào sequences
		sequences.add("Z182");
		sequences.add("A21");
		sequences.add("D811");
		
		// In thông tin
		System.out.println("size --> " + sequences.size());
		System.out.println("\nList of elements ");
		for (int i = 0; i < sequences.size(); i++)
			System.out.println("\t" + sequences.get(i));
		
	}

}
