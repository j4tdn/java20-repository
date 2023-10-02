package c4.inheritance.multiple.interfaces;

public class MultipleInterfacesInheritanceDemo {
	public static void main(String[] args) {
		/*
		 * From JDK 1.8 --> interface method could have body part if method has keyword
		 * 		+ 'default'
		 * 		+ 'static'
		 * 		+ 'private' 1.9
		 * 
		 * With method has body --> not required to override in sub types
		 * if super interfaces have duplicate default method with diff
		 *   --> sub type needs to override default method with different body
		 *   	--> using body from I1
		 *   	-->				 	I2
		 *   	-->				 	both
		 *   	-->				 	itself
		 */
		
		//what is the difference between interface and abstract class
		/*	+interface: 
		 * 		. support multiple implements
		 * 		. attribute --> auto 'public static final'
		 * 	+ Abstract class
		 * 		. support single extends
		 * 		. attribute --> nothing special, belong to object scope
		 * 		. method --> depends on 'access modifier'
		 *
		 *  * From JDK 1.0 -> 1.7
		 *  	+ interface: 
		 *  		. only abstract method
		 *  				
		 *  	+ Abstract class:
		 *  		. can have abstract & body methods
		 *  
		 *  * From JDK 1.8 -> now	
		 * 		+ interface: 
		 *  		. can have abstract & body methods (default, static, private)
		 *  				
		 *  	+ Abstract class:
		 *  		. can have abstract & body methods
		 */
		
		Child c1 = new Child();
		c1.cooking();
		c1.running();
		c1.playBadmiton();
		c1.coding();
	}
}
