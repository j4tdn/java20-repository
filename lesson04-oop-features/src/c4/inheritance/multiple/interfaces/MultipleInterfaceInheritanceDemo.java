package c4.inheritance.multiple.interfaces;

public class MultipleInterfaceInheritanceDemo {
	public static void main(String[] args) {
		
		/*
		 * From JDK 1.8 --> Interface method could have body part if method
		 * +default
		 * +static
		 * +private 1.9
		 * 
		 * with method has body --> not required to override in sub types
		 * if super interfaces have duplicate default method with different
		 * --> sub type needs to override default method
		 * 		--> using body from I1
		 * 		-->					I2
		 * 		-->					both
		 * 		-->					itself
		 */
		
		/*
		 * what is the different between interface & abstract class
		 * 
		 * ==> Answer
		 * difference
		 * +interface:
		 * 		.support multiple implements
		 * 		.attribute --> auto 'public static final'
		 * +abstract class:
		 * 		.support single extends
		 * 		.attribute --> nothing special, belong to object scope
		 * 		.method --> depends on 'access modifier'
		 * from JDK 1.0 --> 1.7
		 * +interface:
		 * 		.only have abstract methods
		 * +abstract class:
		 * 		.can have abstract & body methods
		 * 
		 * from JDK 1.8 --> now
		 * 
		 * +interface:
		 * 		.can have abstract & body methods(default, static, private)
		 * +abstract class:
		 *		.can have abstract & body method
		 */
		
		
		
		Child c1 = new Child();
		c1.cooking();
		c1.running();
		c1.playBadminton();
		c1.cooking();
	}
}
