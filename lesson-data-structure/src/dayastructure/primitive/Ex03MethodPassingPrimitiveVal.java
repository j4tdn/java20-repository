package dayastructure.primitive;

public class Ex03MethodPassingPrimitiveVal {
     public static void main(String[] args) {
		int a = 7;
		int b = 5;
		modify(a);
		modify(b);
		
		
		System.out.println(
				"a --> " + a
				+ "\nb -->" + b
				
				);
	}
     
     private static void modify(int a) {
    	 a = 9999;
     }
     private static void modify(int a, int b) {
    	 int tmp = a;
    	 a = b; 
    	 b= tmp;
     }
}
