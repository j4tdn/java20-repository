package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02SingleTypeObjectsDemo {
	public static void main(String[] args) {
		// how arrayList works behind the scene
		// create java.util.ArrayList
		List<String> sequences = new ArrayList<>();
		//khi nào mình sẽ tạo arrayList khởi tạo capacity
		// khi biết trc đc số lượng phần tử tối đa trong arraylist
		// --> TH1 < tối đa < 10: tạo một mãng phần tử ít hơn mặc định đỡ tốn memory
		// --> TH2: > 10: tạo ra một mãng duy nhất hạn chế phải grow copy tạo mãng nhiều lần
		//add one elements to sequences
		sequences.add("Z182");
		sequences.add("A21");
		sequences.add("D811");
		
		//In 
		System.out.println("size: " + sequences.size());
	}
}
