package b.polymorphism.object;

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
//		Rectangle rsh1 = (Rectangle)new Shape();
//		rsh1.paint();
//		rsh1.calS();
//		rsh1.setBackground();
		
		// r1 --> compile --> Rectangle
		// shapes[1] --> compile --> Shape
		
		Shape[] shapes = {sh1, sq1, r1, shr1};
		System.out.println("shapes length --> " + shapes.length);
		
		System.out.println("\n======================================\n");
		callShapeMethods(r1);
		
		/*
		 * Câu hỏi: Tại sao không lấy KDL chính nó new chính nó mà lại lấy KDL cha new KDL con
		 * 
		 * List l = new ArrayList();
		 * Border b = new DottedBorder();
		 * Event b = new MouseEvent();
		 * 
		 * 1. Dễ dàng convert(compile) qua về giữa các KDL trong phạm vi cha, con
		 * VD: Person p
		 * 		+ Baby
		 * 		+ Primary School Student
		 * 		+ Secondary School Student
		 * 		+ High School Student
		 * 		+ Student
		 * 		+ Employee
		 * 		+ Child
		 * 		+ Friend
		 * 
		 * 2. Có thể tạo ra 1 mảng có danh sách các phần tử trong phạm vi cha con
		 * VD: Book[] books = {History, Math, Chemistry, ...};
		 * 
		 * 3. Có thể viết ra những hàm generic(chung, tổng quát) với tham số là
		 * KDL cha, giá trị truyền vào có thể là chính nó hoặc con
		 * 
		 * 
		 */
	}
	
	// design pattern: factory pattern
	// accessible
	// call all/any [private] methods/attributes in type(Class) --> reflection
	// Shape shape = sh1 || r1
	// shape --> nhận vào KDL Shape hoặc con của Shape: Square, Rectangle
	private static void callShapeMethods(Shape shape) {
		shape.paint();
		shape.calS();
		
		// Nếu lúc runtime shape là Rectangle --> gọi hàm setBackground
		// Nếu không thì thôi
		// if (shape instanceof Rectangle) {
		if (shape != null && shape.getClass() == Rectangle.class) {
			// ((Rectangle) shape).setBackground();
			Rectangle r = (Rectangle)shape;
			r.setBackground();
		}
	}
}
