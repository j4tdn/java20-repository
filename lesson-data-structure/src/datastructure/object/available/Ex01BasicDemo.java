package datastructure.object.available;

import datastructure.custom.Item;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// primitive 
		
		int a = 10;
		System.out.println("a --- > "+ a);
		
		System.out.println("\n-------\n");
		
		
		//VD: Interger, Long, Boolean,Double(class[atribute])
		// 100% chi co 1 thuoc tinh
		
		// gia tri luu tru o vung HEAP
		// Khi new --> new ra --> luoon tao ra 1 o nho moi va gan lai cho bien
		Integer iA = null;
		Integer iB = new Integer(5);
		Integer iC = new Integer(6);
		Integer iD = new Integer(8);
		Integer iE = new Integer(6);
		Item itA = new Item(1,'A',11f);
		
		System.out.println("iA -->" + iA);
		System.out.println("iB-->" +  iB);//H1
		System.out.println("iC address -->" + System.identityHashCode(iC));//H2
		System.out.println("iD -->" + iD);//H3
		System.out.println("iE -->" + + System.identityHashCode(iE));//H3
		
		System.out.println("\n---cach2----\n");
		
		// gia tri luu tru o vung nho HEAP(constan(hangso) pool(ho))
		// tao ra bien moi --> '' --> kiem tra xem constant pool da co o nho nam chua gia tri 55 chua
		//                            neu chua co thi tao ra o nho de luu gia tri 55
		//                            neu co roi thi --> khong tao ra o nho moi --> GAN DIA CHI DO CHO BIEN
	    Integer aB=55; //H4
	    Integer aC=66; //H5
	    Integer aD=88; //H6
	    Integer aE=66; //H5
	    aE = 999;
	    
	    
	    System.out.println("aB -->" + aB);// H4
		System.out.println("ac-->" +  aC);//H5
		System.out.println("aD -->" + aD);//H6
		System.out.println("aE -->" + aE);//H5
		
		System.out.println("aB -->" + System.identityHashCode(aB));// H4
		System.out.println("ac-->" +  System.identityHashCode(aC));//H5
		System.out.println("aD -->" + System.identityHashCode(aD));//H6
		System.out.println("aE -->" + System.identityHashCode(aE));//H5
	}

}
