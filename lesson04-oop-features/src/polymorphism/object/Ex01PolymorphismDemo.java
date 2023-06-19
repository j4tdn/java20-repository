package polymorphism.object;

public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
		System.out.println("==> th1 --> parent new parent\n");
		Shape sh1 = new Shape();
		sh1.paint();
		sh1.calS();

		System.out.println("\n==> th2 --> child new child\n");
		Rectangle r1 = new Rectangle();
		r1.paint();
		r1.calS();

		Square s1 = new Square();
		s1.paint();
		s1.calS();

		// temporary int, long
		int a = 123;
		long b = 234;

		b = a;

		System.out.println("\n==> th3 --> parent new child\n");
		Shape shr1 = new Rectangle();
		shr1.paint();
		shr1.calS();

		Shape shs1 = new Square();
		shs1.paint();
		shs1.calS();

		System.out.println("\n==> th4 --> child new parent");
		// runtime --> parent can be missed child's method
		// --> child's methods have no content at runtime
		Rectangle rsh1 = (Rectangle) new Shape();
		rsh1.paint();
		rsh1.calS();
		rsh1.setBackground();
		
		/*
		 * Câu hỏi: Tại sao không lấy KDL chính nó new chính nó
		 *			mà lại lấy KDL cha new con
		 *
		 */
		
	}
}
