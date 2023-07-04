package c4.inheritance.multiple.interfaces;

public class MultipleInterfaceInheritanceDemo {
	public static void main(String[] args) {
		Child c1 = new Child();
		c1.cooking();
		c1.running();
		c1.playBadminton();
		c1.coding();
		//multiple implements
		
		//what is the diffrence between interface & abstract class
	/*
	 Difference
	 + interface:
	 	.support multiple implements
	 	.attribute --> auto 'public static final'
	 	.method --> auto 'public abstract'
	 + abstract class:
	 	1.support single extends
	 	.attribute --> nothing special, belong to object scope
	 	.method --> depends on 'access modifier'
	 From JDK 1.0 -1.7
	 + interface:
	 	1.only have abstract methods
	 + abstract class:
	 	1.can have abstract & body methods
	 	
	 From JDK 1.8 - now
	 + interface
	 	.can have abstract & body methods(default, static, private)
	 + abstract class
	 	.can have abstract & body methods
	 */
	}
}
