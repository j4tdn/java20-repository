package demomain;

public class Ex04Test {
	public static void main(String[] args) {
		// Cho 2 số nguyên a, b
		CustomInteger a =new CustomInteger(5);
		CustomInteger b =new CustomInteger(7);
		swap(a,b);
		
		//Khi 1 biến truyền qua hàm NT,DT không bao giờ cập nhập giá trị ở STACK
		
		
		System.out.println("A-->" + a);
		System.out.println("B-->" + b);
		//Viết hàm hoán vị 2 số nguyên a,b
	}
	public static void swap(CustomInteger a,CustomInteger b)
	{
		int temp = a.value;
		 a.value=b.value;
		 b.value= temp;
		
	}
}
