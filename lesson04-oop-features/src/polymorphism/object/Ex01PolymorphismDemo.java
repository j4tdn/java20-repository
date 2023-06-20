package polymorphism.object;

public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
		System.out.println("th1 --> parent new parent\n");
		Shape sh1 =new Shape();
		sh1.paint();
		sh1.calS();
				
		System.out.println("th2 --> child new child\n");
		Rectangle r1 = new Rectangle();
		r1.paint();
		r1.calS();
		
		Square s1 = new Square();
		s1.paint();
		s1.calS();
		
		System.out.println("th3 --> parent new child\n");
		Shape shs1 = new Square();
		shs1.paint();
		shs1.calS();
		
		Shape shr1 = new Rectangle();
		shr1.paint();
		shr1.calS();

		System.out.println("th4 --> child new parent\n");
		Square ssh1 = (Square) new Shape();
		
		//cast parent- child exception
		//runtime --> parent can be mised child's methods
		//-->child's methods have no content at runtime
		Rectangle rsh1 = (Rectangle) new Shape();
		rsh1.paint();
		rsh1.calS();
		rsh1.setBackground();
		
		/* 
		 Câu hỏi: Tại sao không lấy KDL chính nó new chính nó mà lại lấy KDL cha new con
		 
		 */
	}
}
