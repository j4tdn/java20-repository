package c4.inheritance.multiple.interfaces;

public class MultipleInterfacesInheritanceDemo {
	/*
	 * from JDK 1.8 --> interface method could have body part if methods has keword 
	 * + 'Default'
	 * + 'Static'
	 * + 'private' 1.9
	 * 
	 * with method has body --> not require to override in sub types 
	 	if super interfaces have the duplicate default method with difference body
	 	--> sub type needs to override default method 
	 	--> using body from T1
	 	--> 				T2
	 	--> 				both
	 	-->					no one
	 */
	
	 // static type
	
	 //dynamic type
	 //design pattern ==> strategy pattern 
	public static void main(String[] args) {
		
		
		Child c1 = new Child();
		c1.cooking();
		c1.coding();
	}
}
	
