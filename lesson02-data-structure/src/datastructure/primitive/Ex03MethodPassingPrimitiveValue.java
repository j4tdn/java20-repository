package datastructure.primitive;

public class Ex03MethodPassingPrimitiveValue {
		public static void main(String[] args) {
			//block scope
			int a=7;
			int b=5;
			modify(a);
			modify(b);
			//a -->7
			//b -->5
			swap(a,b);
			System.out.println(
					);
			
		}
		/* Khi truyen tham so qua ham --> truyen tham tri || tham chieu
		 * pass by value ||
		 * 
		 */
		private static void modify(int a) {
			a=9999;
		}
		private static void swap(int a,int b) {
			int tmp=a;
			a=b;
			b=tmp;
		}
}
