package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02SingleTypeObjectDemo {
	/*
	 
	 // List<String> sequences = new ArrayList<>(); // H1(elementData)
	 
	 class ArrayList<T> {
			
			private static final int DEFAULT_CAPACITY = 10;
			
			// capacity: elementData length --> số phần tử tối đa có thể chứa trong mảng elementData
			
			int size; // 4 --> số lượng phần tử thật sự được chứa trong elementData --> ArrayList truy cập thông qua size
		    Object[] elementData; {Z182, A21, null, D811, null, null, null, null, null, K27}
		                          {Z182, A21, null, D811, null, null, null, null, null, K27, null, null, null, null, null}
		
		    public ArrayList() {
		   	    elementData = {};
		    }
		
		    // sequences.add("Z182")
		    // sequences.add("A21");
		    // sequences.add(null)
		    // sequences.add("D811")
		    // ....
			// sequences.add("K27")  --> i = 9 --> size = 10
			// sequences.add("X11")
			public boolean add(E e) {
			    modCount++;
			    add(e, elementData, size);
			    return true;
			}
			
			private void add(E e, Object[] elementData, int s) {
		        if (s == elementData.length)
		            elementData = grow();
		        elementData[s] = e;
		        size = s + 1;
		    }
		    
		    private Object[] grow() {
		        return grow(size + 1);
		    }
		    
		    // minCapacity = 11
		    private Object[] grow(int minCapacity) {
		        int oldCapacity = elementData.length;
		        if (oldCapacity > 0 || elementData != DEFAULTCAPACITY_EMPTY_ELEMENTDATA) {
		            // return oldLength + Math.max(minGrowth, prefGrowth)
		            int newCapacity = ArraysSupport.newLength(oldCapacity,
		                    minCapacity - oldCapacity, 
		                    oldCapacity >> 1 );
		            return elementData = Arrays.copyOf(elementData, newCapacity);
		        } else {
		            return elementData = new Object[Math.max(DEFAULT_CAPACITY, minCapacity)];
		        }
			}
	}
	 */

	public static void main(String[] args) {

		// How ArrayList works behind the scene

		// Khởi tạo java.util.ArrayList
		List<String> sequences = new ArrayList<>(); // elementData with length = default capacity = 10

		// Khi nào mình sẽ khởi tạo ArrayList với tham số capacity truyền vào
		// --> Khi biết trước được số lượng phần tử tối đa sẽ lưu trữ trong ArrayList
		// --> TH1: tối da < 10: tạo 1 mảng ít phần tử hơn mặc định đỡ tốn memory
		// --> TH2: tối đa > 10: tạo 1 mảng duy nhất, hạn chế phải grow copy tạo mảng nhiều lần  
		sequences = new ArrayList<>(5);
		sequences = new ArrayList<>(100);

		// Thêm 1 hoặc nhiều phần tử vào sequences
		sequences.add("Z182");
		sequences.add("A21");
		sequences.add(null);
		sequences.add("D811");

		// In thông tin
		System.out.println("size --> " + sequences.size());

		System.out.println("\nList of elemenets ");

		for (int i = 0; i < sequences.size(); i++) {
			System.out.println("  + " + sequences.get(i));
		}
	}
}
