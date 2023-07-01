package c4.inheritance.mutiple.interfaces;

public class MultipleInterfaceInheritanceDemo {
	
	public static void main(String[] args) {
		/*
		 From JDK 1.8
		 
		 if super interfaces have duplicate default method with different body
		 --> sub type needs override default method
		 	 --> using body from I1
		 	 -->				 I2
		 	 -->				 both
		 	 -->				 itself
		 */
		
		/* what is the difference between interface & abstract class
		 --> answer
		 Difference:
		 + interface: 
		 	. support multiple implements
		 	. attribute --> auto 'public static final'
		 	. method --> auto 'public abstract'
		 	
		 + abstract class:
		 	. support single extends
		 	. attribute --> nothing special, belong to object scope
		 	. method --> depends on 'access modifier'
		 
		 From JDK 1.0 - 1.7
		 + interface:
		 	. only have abstract methods
		 + abstract class:
		 	. can have abstract & body methods
		 
		 From JDK 1.8 - now
		 + interface:
		 	. can have abstract & body methods(default, static, private)
		 + abstract class:
		 	. can have abstract & body methods
		 	
		 */
		
		Child c1 = new Child();
		c1.cooking();
		c1.running();
		c1.playBadminton();
		c1.coding();
	}
}
