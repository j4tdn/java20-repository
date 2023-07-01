package c4.inheritance.multiple.interfaces;

public class MultipleInterfacesInheritanceDemo {
	public static void main(String[] args) {
		/*
		 * From JDK 1.8 --> Interface method could have body part if method has keyword
		 * + 'default'
		 * + 'static'
		 * + 'private' 1.9
		 * 
		 * With method has body --> not required to override in sub types
		 * if super interfaces have the duplicate default method with diff body
		 * --> sub type needs to override default method
		 * 		--> using body from I1
		 * 		--> 				I2
		 * 		-->					both
		 * 		-->					itself
		 */
		
		/*
		 * What is the difference between interface & abstract class
		 * 
		 * --> Answer
		 * 
		 * Difference
		 * + interface:
		 * 	. supports multiple implements
		 * 
		 * + abstract class:
		 * 	. support single extends
		 * 	. attribute --> nothing special, belong to object scope
		 * 	. method --> depends on 'access modifier'
		 * 
		 * From JDK 1.0 - 1.7
		 * + Interface:
		 * 	. only have abstract methods
		 * + Abstract class:
		 * 	. can have abstract & body methods
		 * 
		 *  * From JDK 1.8 - now
		 * + Interface:
		 * 	. can have abstract & body methods( default, static, private)
		 * + Abstract class:
		 * 	. can have abstract & body methods
		 * 
		 */
		
		//static type
		//dynamic type
		//design pattern ==> strategy pattern
	
		
		Child c1 = new Child();
		c1.cooking();
		c1.running();
		c1.playBadminton();
		c1.coding();
	}

}
