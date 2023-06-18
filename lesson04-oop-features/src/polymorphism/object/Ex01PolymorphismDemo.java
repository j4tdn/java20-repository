package polymorphism.object;

public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
		System.out.println("==> TH1 --> parent new parent\n");
		Shape sh1 = new Shape();
		sh1.paint();
		sh1.calS();
		
		System.out.println("\n==> TH2 --> child new child\n");
		Rectangle r1 = new Rectangle();
		r1.paint();
		r1.calS();
		
		Square sq1 = new Square();
		sq1.paint();
		sq1.calS();
		
		System.out.println("\n==> TH3 --> parent new child\n");
		Shape shr1 = new Rectangle();
		shr1.paint();
		shr1.calS();
		
		Shape shsq1 = new Square();
		shsq1.paint();
		shsq1.calS();
		
		System.out.println("\n==> TH4 --> child new parent\n");
		// cast parent-child exception
		// runtime --> parent can be missed child's methods
		// --> child's methods have no content at runtime
		Rectangle rsh1 = (Rectangle)new Shape();
		rsh1.paint();
		rsh1.calS();
		rsh1.setBackground();
		
		/*
		 * Câu hỏi: Tại sao không lấy KDL chính nó new chính nó mà lại lấy KDL cha new KDL con
		 * 
		 * 
		 */
	}
}
