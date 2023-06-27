package b.polymorphism.object;

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
		long b = 120; // Integer.MAX_VALUE + 3
		
		// b = a;
		a = (int)b; // restrict to cast from bounder type to child type
		System.out.println("min int --> " + Integer.MIN_VALUE);
		System.out.println("max int --> " + Integer.MAX_VALUE);
		System.out.println("(int)b --> " + (int)b);
		
		System.out.println("\n==> th3 --> parent new child\n");
		
		Shape shr1 = new Rectangle();
		shr1.paint();
		shr1.calS();
		
		Shape shs1 = new Square();
		shs1.paint();
		shs1.calS();
		
		System.out.println("\n==> th4 --> child new parent\n");
		// cast parent-child exception
		// runtime --> parent can be missed child's methods
		// --> child's methods have no content at runtime
		//Rectangle rsh1 = (Rectangle)new Shape(); 
		//rsh1.paint();
		//rsh1.calS();
		//rsh1.setBackground();
		
		Shape[] shapes = {sh1, r1,s1, shr1};
		System.out.println("shapes length --> " + shapes.length);
		Shape ash1 = shapes[1];
		ash1.paint();
		System.out.println("\n ======= \n");
		
		callShapeMethods(sh1);
		/*
		 * Câu hỏi: Tạo sao không lấy KDL chính nó new chính nó mà lại lấy KDL cha new con
		 * 
		 * List l = new ArrayList()
		 * Border b = new DottedBorder();
		 *  Event e = new MounseEvent()

		 *1. de dang convert qua ve giua các KDL trong pham vi cha , con
		 *VD :
		 *2. co the tao ra 1 mang fanh sach cac phan tu trong pham vi cha con 
		 *
		 *3.Có thể  viết ra những hàm generic(chung, tổng quát) với tham số là KDL cha
		 * giá trị truyền vào giá trị có thể là chính nó hoặc con
		 **/
		
	}
	private static void callShapeMethods(Shape shape) {
		// gọi những hàm của nó
		shape.paint();
		shape.calS();
		
		// Rectangle : setBackground
		// nếu lúc runtime shape là Rectangle --> gọi  hàm setBackround
		// nếu không phải thì ko gọi
		// if (shape instanceof Rectangle ){
		if (shape != null  && shape.getClass() == Rectangle.class) {
			Rectangle r = (Rectangle)shape;
			r.setBackground();
		}
	}
}