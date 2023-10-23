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
		long b = 234;

		b = a;

		System.out.println("\n==> th3 --> parent new child\n");
		Shape shr1 = new Rectangle();
		shr1.paint();
		shr1.calS();

		Shape shs1 = new Square();
		shs1.paint();
		shs1.calS();

		shr1 = shs1;
		System.out.println("after assigning!");
		shr1.paint();
		shs1.paint();
		
		
		
		System.out.println("\n==> th4 --> child new parent");
		// runtime --> parent can be missed child's method
		// --> child's methods have no content at runtime
//		Rectangle rsh1 = (Rectangle) new Shape();
//		rsh1.paint();
//		rsh1.calS();
//		rsh1.setBackground();
		
		// r1 --> compile --> Rectangle
		// shape[1] --> compile --> Shape
		Shape[] shapes = {sh1, r1, s1, shr1};
		System.out.println("shapes length --> " + shapes.length);
		// Rectangle ash2 = shapes[1];
		Shape ash1 = shapes[1];
		ash1.paint();
		
		System.out.println("\n=============\n");
		callShapeMethods(r1);
		
		/*
		 * Câu hỏi: Tại sao không lấy KDL chính nó new chính nó
		 *			mà lại lấy KDL cha new con
		 *	List l = new ArrayList()
		 *
		 * 1. Dễ dàng convert qua về giữa các KDL trong phạm vi cha, con
		 * vd: Person p;
		 * 		+ Baby
		 * 		+ Primary school student
		 * 		+ Secondary school student
		 * 		+ High school student
		 * 		+ Student
		 * 		+ Employee
		 * 		+ Child
		 * 		+ Friend
		 * 
		 * 	2000: p = new Baby();
		 *  2006: p = new PsStudent();
		 *  	: p = new Child();
		 * 
		 *  vd#: Student s = new Student();
		 *  			 s = new Employee(); --> error
		 *  
		 *  2. Có thể tạo ra 1 mảng có danh sách các phần tử trong phạm vi cha, con
		 *   Book[] books = {Math, Chemistry, History,...};
		 *  
		 *  3. Có thể viết ra những hàm generic(chung, tổng quát) với tham số là KDL cha
		 *     giá trị truyền vào có thể là chính nó hoặc con
		 */
		
	}
	
	// design pattern: factory pattern
	// accessible
	// call all/any [private] methods/attributes in type(Class) --> reflection
	
	private static void callShapeMethods(Shape shape) {
		shape.paint();
		shape.calS();
		// if (shape instanceof Rectangle) {
			if (shape != null && shape.getClass() == Rectangle.class) {
			Rectangle r = (Rectangle)shape;
			r.setBackground();
		}
		
		// Rectangle: setBackground
		// nếu lúc runtime shape là Rectangle --> gọi setBackground
		// nếu ko phải thì ko gọi
	}
}
