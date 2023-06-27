package b.polymorphism.object;

public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
		//th1 --> parent new parent
		Shape sh1 = new Shape();
		sh1.paint();
		sh1.calS();
		System.out.println("\n================\n");
		//th1 --> child new child
		Rectangle r1 = new Rectangle();
		r1.paint();
		r1.calS();
		
		Square s1 = new Square();
		s1.paint();
		s1.calS();
		System.out.println("\n================\n");
		
		//temporary int, long
		int a = 123;
		long b = Integer.MAX_VALUE + 2;
		b = a;
		a = (int)b;
		System.out.println("min int --> " +Integer.MIN_VALUE);
		System.out.println("max int --> " +Integer.MAX_VALUE);
		System.out.println("(int)b --> " +(int)b);
		
		
		//th3 --> parent new child
		Shape shr1 = new Rectangle();
		shr1.paint();
		shr1.calS();
		
		Shape shs1 = new Square();
		shs1.paint();
		shs1.calS();
		System.out.println("\n================\n");

		//th4 --> child new parent
//		Rectangle rsh1 = (Rectangle)new Shape();
//		rsh1.paint();
//		rsh1.calS();
		Shape[] shapes = {sh1, r1, s1, shr1};
		System.out.println("shapes leght --> " + shapes.length);
		Shape ash1 = shapes[1];
		ash1.paint();
		
		System.out.println("\n================\n");
		callShapeMethods(r1);
		
		/*
		 * Tại sao k lấy kDL chính nó new chính nó mà lại lấy KDL cha new con
		 * 
		 * 1. Dễ dàng convert qua về giữa các KDL trong phạm vi cha, con
		 * vd: person
		 * 		+ Baby
		 * 		+ Primary School Student
		 * 		+ High School Student
		 * 		+ Employee
		 * 		+ Child
		 * 		+ Friend
		 *  2000: p = new Baby();
		 *  2006: p = new PsStudent();
		 *  2018: p = new Student();
		 *  2. Có thể tạo ra 1 mảng có danh sách các phần tử trong phạm vi cha con
		 *  Book[] books = {Math, Chemistry};
		 *  3. Có thể viết ra những hàm generic(chung, tổng quát) với tham số
		 *  là KDL cha, giá trị truyền vào vần có thể là chính nó hoặc con
		 */
	}
	//call all/any [private] methods/attributes in type(Class) --> reflection
	// Shape shape = sh1 || r1;
	//shape --> nhận vào KDl Shape hoặc con của Shape: Square, Rectangle
	private static void callShapeMethods(Shape shape) {
		shape.paint();
		shape.calS();
		
		//rectangle: setBackground
		// nếu lức runtime shape là Rectangle --> gọi hàm setBackground
		//nếu k phải thì k gọi
		if (shape != null && shape.getClass() == Rectangle.class) {
			Rectangle r = (Rectangle)shape;
			r.setBackgound();
		}
		
	}
}
