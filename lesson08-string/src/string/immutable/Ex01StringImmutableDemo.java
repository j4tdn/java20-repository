package string.immutable;

public class Ex01StringImmutableDemo {
	public static void main(String[] args) {
		
		//String object
		//storage: heap
		
		String s01 = new String("Hello"); //H1
		String s02 = new String("nice");  //H2
		String s03 = new String("Hello"); //H3
		
		System.out.println(s01 + " --> " + hash(s01));
		System.out.println(s02 + " --> " + hash(s02));
		System.out.println(s03 + " --> " + hash(s03));
		
		System.out.println("\n==================\n");
		
		//string literal
		//storage: heap - constant pool
		
		String sl1 = "welcome"; //H4
		String sl2 = "student"; //H5
		String sl3 = "welcome"; //H4 --> H6
		String sl4 = "welcome"; //H4
		sl3 = "class";			//H6
		
		System.out.println(sl1 + " --> " + hash(sl1));
		System.out.println(sl2 + " --> " + hash(sl2));
		System.out.println(sl3 + " --> " + hash(sl3));
		System.out.println(sl4 + " --> " + hash(sl4));
	
		//immutable
		//should use: string literal
	}
	
	private static int hash(String string) {
		return System.identityHashCode(string);
	}
}
