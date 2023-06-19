package polymorphism.object;


public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
		System.out.println("th1 --> parent new parent\n");
		Shape sh1 = new Shape();
		sh1.paint();
		sh1.calS();
		
		System.out.println("\nth2 --> child new child\n");
		Rectangle r1 = new Rectangle();
		r1.paint();
		r1.calS();
		
		Square s1 = new Square();
		s1.paint();
		s1.calS();
		
		System.out.println("\nth3 --> parent new child\n");
		Shape shr1 = new Rectangle();
		shr1.paint();
		shr1.calS();
		
		Shape shs1 = new Square();
		shs1.paint();
		shs1.calS();
		
		System.out.println("\nth4 --> child new parent\n");
		Rectangle rsh = (Rectangle)new Shape(); 
		//cast parent-child exception
		//rutime --> parent can be missed child's methods
		//--> child's metods have no content at runtime
		rsh.paint();
		rsh.calS();
		rsh.setBackground();
		
		/*
		 * Câu hỏi: Tại sao ko lấy KDL chính nó new chính nó mà lại lấy KDL cha new con
		 * 
		 */
	}
}
