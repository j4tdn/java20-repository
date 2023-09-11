package view.sortting.theory;

import static utils.ArrayUtils.swap;

import java.util.Arrays;

import static utils.ArrayUtils.*;
import Functional.Comparator_Int;
import Functional.CompareTo_String;

public class Ex02BubleSort_String {

	public static void main(String[] args) {
		String[] element = {"a12","whz","z","bb","iphone13"};
		
		//1.Sắp xếp tăng dần
		sort(element,(s1,s2) ->{
			return s1.compareTo(s2);
		});
		generate("elements acs", element);
		//2.Sắp xếp giảm dần
		sort(element,(s1,s2) ->{
			return s2.compareTo(s1);
//			return s2.compareTo(s1) * (-1);
		});
		generate("elements desc", element);
		/*
		Với KDL có sẵn của Java như Integer, String, Double so sánh dùng compareTo từ Interface cha con Comparable<T>
		Giá trị của các phần tử có thể bị null 
		An toàn : NULL check trước khi so sánh dùng CompareTo
		Kết luận : Khi nào sắp xếp kiểu dữ liệu đối tượng
		+Phần 1: NULL values
		--> null first || null last
		--> null first: null values < non_null values
		--> null last : null values > non_null values
		+Phan 2: NON_NULL Values
		//ASC || DES
		*/
		
		String[] sequeces = {null,"a12","whz",null,null,"z","bb",null,"iphone13",null};
		generate("sequences ", sequeces);
		//Yêu cầu sắp xếp các phần tử tăng dần NULL first
		sort(sequeces, (s1,s2) ->{
			//NULL first
			if(s1 == null) {
				return -1;
			}
			if(s2 == null) {
				return 1;
			}
			//ASC
			return s1.compareTo(s2);
		});
		
		generate("sequences FIRST ASC", sequeces);
		//Yêu cầu sắp xếp các phần tử tăng dần NULL last
		sort(sequeces, (s1,s2) ->{
			//NULL first
			if(s1 == null && s2 != null) {
				return 1;
			}
			if(s2 == null) {
				return -1;
			}
			//ASC
			return s1.compareTo(s2);
		});
		generate("sequences LAST ASC", sequeces);
		//Yêu cầu sắp xếp các phần tử giam dần NULL first
		//Yêu cầu sắp xếp các phần tử giam dần NULL last
	}
	

	
	private static void sort(String[] elements, CompareTo_String comparator) {
		int lenght = elements.length;
		//iterate round
		for(int i = 0; i < lenght ; i++) {
			//iteate element
			for(int j =0 ; j < lenght - i -1; j++) {
				if(comparator.compare(elements[j],elements[j+1]) > 0) {
					swap(elements ,j ,j + 1);
				}
			}
			System.out.println("Round" + (i+1) + ":" + Arrays.toString(elements));
		}
	}
	
	private static void sortDesc(String[] elements) {
		int lenght = elements.length;
		//iterate round
		for(int i = 0; i < lenght ; i++) {
			//iteate element
			for(int j =0 ; j < lenght - i -1; j++) {
				if(elements[j + 1].compareTo(elements[j]) > 0) {
					swap(elements ,j ,j + 1);
				}
			}
		}
	}
}
