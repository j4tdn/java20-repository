package polymorphism.object;

public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
		// Case 1: parent new parent
		System.out.println("Case 1: parent new parent\n");
		Shape sh1 = new Shape();
		sh1.paint();
		sh1.calS();
		
		
		// Case 2: child new child
		System.out.println("\nCase 2: child new child\n");
		Rectangle r1 = new Rectangle();
		r1.paint();
		r1.calS();
		
		Square s1 = new Square();
		s1.paint();
		s1.calS();
		
		
		// Case 3: parent new child
		System.out.println("\nCase 3: parent new child\n");
		Shape shar1 = new Rectangle();
		shar1.paint();
		shar1.calS();
		
		Shape shas1 = new Square();
		shas1.paint();
		shas1.calS();
		
		
		
		// Case 4: child new parent
		System.out.println("\nCase 4: child new parent\n");
		// cast parent-child exception
		// runtime --> parent can be missed child's methods
		// --> child's methods have no content at runtime
		Rectangle rsh1 = (Rectangle) new Shape();
		
		/*
		 * Tại sao không lấy KDL chính nó new chính nó mà lại lấy KDL cha new KDL con
		 */
	}
}
