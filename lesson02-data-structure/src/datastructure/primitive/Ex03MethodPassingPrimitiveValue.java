package datastructure.primitive;

public class Ex03MethodPassingPrimitiveValue {
	public static void main(String[] args) {
		
		//block scope
		int a=7;
		int b=5;
		
		modify(a);
		modify(b);
		//a, b không thay đổi giá trị vì khi truyền vào hàm nó chỉ thực hiện trong hàm, ko đưa giá trị ra ngoài
		
		swap(5,7);
		//a, b không thay đổi giá trị vì khi truyền vào hàm nó chỉ thực hiện trong hàm, ko đưa giá trị ra ngoài
		System.out.println(
				"a-->"+a
			+ "\nb-->"+b
		);
	}
	
	private static void modify(int a)
	{
		a=999;
	}
	private static void swap(int a, int b)
	{
		int tmp=a;
		a=b;
		b=tmp;
	}
}
