package b.polymorphism.object;

public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
		// parent new parent
		System.out.println("==> th1 --> parent new parent\n");
		Shape sh1 = new Shape();
		sh1.paint();
		sh1.calS();
		
		// child new child
		System.out.println("\n==> th2 --> child new child\n");
		
		Rectangle r1 = new Rectangle();
		r1.paint();
		r1.calS();
		
		Square s1 = new Square();
		s1.paint();
		s1.calS();
		
		// parent new child
		System.out.println("\n==> th3 --> parent new child\n");
		Shape shr1 = new Rectangle();
		shr1.paint();
		shr1.calS(); // d * r
		
		Shape shs1 = new Square();
		shs1.paint();
		shs1.calS(); // c * c
		
		shr1 = shs1;
		// temporary int, long
		int a = 123;
		long b = Integer.MAX_VALUE + 3;
		
		//b = a;
		//a = (int)b; // restrict to cast from boiunder type to child type
		System.out.println("min int --> " + Integer.MIN_VALUE);
		System.out.println("min int --> " + Integer.MAX_VALUE);
		System.out.println("(int) b --> " + (int) b);
		
		// child new parent
		System.out.println("\n==> th4 --> child new parent\n");
		//Rectangle rsh1 = (Rectangle) new Shape(); // cast parent-child exception
		//rsh1.paint();
		//rsh1.calS();
		//rsh1.setBackground();
		
		Shape[] shapes = {sh1, r1, s1, shr1};
		System.out.println("shapes length --> " + shapes.length);
		Shape ash1 = shapes[1];
		ash1.paint();
		
		System.out.println("=======================================");
		callShapeMethod(s1);
		
		/*
		 * Câu hỏi: Tại sao không lấy KDL chính nó new chính nó mà lại lấy KDL cha new con
		 * 
		 * List 1 = new ArrayList()
		 * Border b = new DottedBorder()
		 * Event e = new MouseEvent()
		 * 
		 * 1. Dễ dàng convert qua về giữa các KDL trong phạm vi cha, con
		 * VD: Person
		 *      + Baby
		 *      + Primary School Student
		 *      + Secondary School Student
		 *      + High School Student
		 *      + Students
		 *      + Employee
		 *      + Child
		 *      + Friend
		 *  2000:  p = new Baby();
		 *  2006:  p = new PsStudent();
		 *  2018:  p = new Student();
		 *  	:  p = new Child();
		 *  
		 *  VD8: Student s = new Student();
		 *  			 s = new Employee(); ('error')
		 *  
		 *  2. Có thể tạo ra 1 mảng có danh sách các phần tử trong phạm vi cha con 
		 *  Book[] books = {Math, Chemistry, History, ...};
		 *  
		 *  3. Có thể biết ra những hàm generic(chung, tổng quát) với tham số là 
		 *  KDL cha, giá trị truyền vào có thể là chính nó hoặc con
		 */
	}
	
	// design pattern: factory pattern
	// accessible
	// call all/any [private] methods/attributes in type(class) --> reflection
	// Shape shape = sh1 || 
	
	private static void callShapeMethod(Shape shape) {
		shape.paint();
		shape.calS();
		
		
		// Rectangle: setBackground
		// nếu lúc runtime shape là Rectangle --> gọi hàm setBackground
		// nếu ko phải thì ko gọi
		// if(shape instanceof Rectangle)
		if(shape != null && shape.getClass() == Rectangle.class) {
			Rectangle r = (Rectangle) shape;
			r.setBackground();
		}
	}
}
