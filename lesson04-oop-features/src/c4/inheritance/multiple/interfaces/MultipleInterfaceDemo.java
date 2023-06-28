package c4.inheritance.multiple.interfaces;

public class MultipleInterfaceDemo {
	public static void main(String[] args) {
		/*
		 * from jdk 1.8 --> interface method could have body part 
		 * 'default'
		 * 'static'
		 * 'private' 1.9
		 * 
		 * with method has body --> not required to override in sub type
		 * if super interfaces have the duplicate default method with different body
		 * --> sub type needs to override default method
		 * 	--> using body from I1
		 *  --> using body from I2
		 *  -->					both
		 *  -->					itself
		 */
		
		/*
		 *  what is the difference between interface & abstract class
		 *  --> answer
		 *  Difference 
		 *  + interface:
		 *  	. support multile implements
		 *  	. attribute --> auto public static final
		 *  	. method --> auto public abstract
		 *  
		 *  + abstract class	
		 *  	. support single extends
		 *  	. attribute --> nothing special, belong to object scope
		 *  	. method --> depends on access modifier
		 *  
		 *  - from jdk 1.0-1.7
		 *  + interface:
		 *  	.only have abstract methods
		 *  + abstract class
		 *  	. can have abstract & body methods
		 *  
		 *  - from jdk 1.8-now
		 *  + interface:
		 *  	. can have abstract & body methods(default, static, private)
		 *  + abstract class:
		 *  	. can have abstract & body methods
		 */
		
		// static type
		// dynamic type
		// design pattern --> strategy pattern
		
		
		Child c1 = new Child();
		c1.cooking();
		c1.running();
		c1.playBadminton();
		c1.coding();
	}
}
