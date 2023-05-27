package datastructure.object.available;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//primitive
		int a=10;
		System.out.println("a --> "+ a);
		System.out.println("\n-----------------\n");
		// Vd: Interger(value), Long , Double(class[attribute])
		// 100% KDL nay chi co 1 thuoc tinh duy nhat
		// gia tri luu tru o vung nho HEAP
		// new --> new ra --> luon tao ra 1 o nho moi va gan lai cho bien
		Integer iA=null;
		Integer iB= new Integer(5);//H1
		Integer iC= new Integer(6);//H2
		Integer iD= new Integer(7);//H3
		Integer iE= new Integer(6);//H22
		System.out.println("iA --> "+ iA);
		System.out.println("iB --> "+ iB); //H1
		System.out.println("iC --> "+ iC); //H2
		System.out.println("iD --> "+ iD); //H3	
		System.out.println("iE --> "+ iE); //H22
		System.out.println("\n-----------\n");
		//gia tri luu tru o vung nho HEAP(constant(hang so) pool (ho))
		//tao ra bien moi --> '55' --> Kiem tra xem constant pool da co o nho nao chua gia tri 55 chua
		//Neu chua co --> tao ra o nho de luu gia tri 55 --> gan dia chi lai cho bien
		//Neu co roi --> Khong tao ra o nho moi --> gan dia chi do cho bien
		Integer oB = 55; //H4
		Integer oC = 66; //H5
		Integer oD = 77; //H6
		Integer oE = 66; //H5
		oE= 999;
		System.out.println("oB --> "+ oB); //H4
		System.out.println("oC --> "+ oC); //H5
		System.out.println("oD --> "+ oD); //H6	
		System.out.println("oE --> "+ oE); //H5
		
		System.out.println("oB --> "+ System.identityHashCode(oB));
		System.out.println("oC --> "+ System.identityHashCode(oC));
		System.out.println("oD --> "+ System.identityHashCode(oD));
		System.out.println("oE --> "+ System.identityHashCode(oE));
	}
}
