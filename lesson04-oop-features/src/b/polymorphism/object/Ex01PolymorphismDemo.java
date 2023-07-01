package b.polymorphism.object;

public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
		//parent new parent
		System.out.println("\nth1 --> parent new parent\n");
		
		Shape sh1 = new Shape();
		sh1.paint();
		sh1.calS();
		
		//child new child
		System.out.println("\nth2 --> child new child\n");
		
		Rectangle r1 = new Rectangle();
		r1.paint();
		r1.calS();
		
		Square s1 = new Square();
		s1.paint();
		s1.calS();
		
		//temporary int, long
		int a = 123;
		long b = Integer.MAX_VALUE + 3;
		
		//b = a;
		//a = (int)b;	//restrict to cast from bounder type to child type
		
		System.out.println("min int --> " + Integer.MIN_VALUE);
		System.out.println("min int --> " + Integer.MAX_VALUE);
		System.out.println("min int --> " + (int)b );
		
		
		//child new parent
		System.out.println("\nth3 --> parent new child\n");
		
		Shape shr1 = new Rectangle();	
		shr1.paint();
		shr1.calS(); 
		
		Shape shs1 = new Square();
		shs1.paint();
		shs1.calS();
		
		shr1 = shs1;

		
		
		System.out.println("\nth4 --> child new parent\n");
		// cast parent-child exception
		// runtime --> parent can be missed child's methods
		// --> child's methods have no content at runtime
		
//		Rectangle rsh1 = (Rectangle)new Shape(); 
//		rsh1.paint();
//		rsh1.calS();
//		rsh1.setBackground();
		
		// r1 --> compile --> Rectangle
		// shapes[1] --> compile --> Shape
		
		Shape[] shapes = {sh1, r1, s1, shr1};
		System.out.println("Shape length --> " + shapes.length);
		Shape ash1 = shapes[1];
		ash1.paint();
		
		System.out.println("\n ===================== \n");
		callShapeMethod(s1);
		
		/*
		 * Câu hỏi: tại sao không lấy KDL chính nó new chính nó mà lại lấy
		 * KDL cha new con
		 * 
		 * List l = new Arraylist
		 * Border b = new DottedBorder();
		 * Event = new MouseEvent()
		 * 
		 * 1. Dễ dàng convert qua về giữa các kiểu dữ liệu trong phạm vi cha, con
		 * VD: Person p;
		 * 		+ Baby
		 * 		+ Primary School Student
		 * 		+ Secondary School Student
		 * 		+ High Student
		 *		+ Student
		 *		+ Employee
		 *		+ Child
		 *		+ Friend
		 *	2000: P = new Baby();
		 *	2006: P = new PsStudent();
		 *	2018: P = new Student();
		 *		: P = new Child();
		 *
		 *
		 *	VD#: Student s = new Student();
		 *				 s = new Employee(); ('error')
		 *
		 * 2. Có thể tạo ra 1 mảng có danh sách các phần tử trong phạm vi cha con
		 * Book[] books = {Math, Chemistry, History
		 * 
		 * 3.Có thể viết ra những hàm generic( chung, tổng quát) với tham số 
		 * là KDL cha, giá trị truyền vào có thể là chính nó hoặc con
		 * 
		 */
	}	
	// design pattern: factory pattern
	// accessible
	// call all/any [private] methods/attributes in type(class) --> reflection
	// shape --> nhận vào KDL Shape hoặc con của Shape: Square, Rectangle...
	
	private static void callShapeMethod(Shape shape) {
		// gọi những hàm của nó.
		shape.paint();
		shape.calS();
		
		// Rectangle: setBackground
		// nếu lúc runtime shape là Rectangle --> gọi hàm setBackground
		// nếu không phải thì không gọi
		
		
		// if (shape != null && shape.getClass() == Rectangle.class) {
		if (shape instanceof Rectangle) {
			// Rectangle r = (Rectangle)new Shape(); --> error
		//	((Rectangle)shape).setBackground();		
			Rectangle r = (Rectangle)shape; // --> no
			r.setBackground();
		}
	}
//		
		//if (shape instanceof Rectangle) {
//		if(shape !! null && shape.getClass() == Rectangle.class) {
			//((Rectangle)shape).setBackground();
//			Rectangle r = (Rectangle)shape;
//			r.setBackground();
//		}



}
