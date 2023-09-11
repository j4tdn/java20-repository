package string.immutable;

public class Ex01StringImmutableDemo {

	public static void main(String[] args) {
		//string object
		//storage: heap đều là immutable
		
		String so1 = new String("hello");
		String so2 = new String("nice");
		String so3 = new String("nice");
		
		System.out.println(so1 + "--> " + hash(so1)); //H1
		System.out.println(so2 + "--> " + hash(so2)); //H2
		System.out.println(so3 + "--> " + hash(so3)); //H3
	
		System.out.println("\n ================= \n");
		
		//string literal
		// storage: heap - constant pool , đều là immutable
		String sl1 = "welcome";
		String sl2 = "studen";
		String sl3 = "welcome";
		String sl4 = "welcome";
		
		System.out.println("sl1"+ sl1 + "--> " + hash(sl1)); //H4
		System.out.println( "sl2"+sl2 + "--> " + hash(sl2)); //H5
		System.out.println( "sl3"+sl3 + "--> " + hash(sl3)); //H4
		System.out.println( "sl4"+sl4 + "--> " + hash(sl4)); //H4
	
		sl3 = "class";
		
		System.out.println(sl3 + "--> " + hash(sl3)); //H4
	
	   // immutable
	   // shouble use: string literal
	}
	
	private static int hash(String string) {
		return System.identityHashCode(string);
	}
}
