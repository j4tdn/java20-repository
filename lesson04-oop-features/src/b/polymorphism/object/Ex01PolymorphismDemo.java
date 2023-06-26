package b.polymorphism.object;


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
		//Rectangle rsh = (Rectangle)new Shape(); 
		//cast parent-child exception
		//rutime --> parent can be missed child's methods
		//--> child's methods have no content at runtime
		//rsh.paint();
		//rsh.calS();
		//rsh.setBackground();
		
		Shape[] shapes = {sh1, shr1, r1, s1};
		System.out.println("shapes length --> " + shapes.length);
		Shape ash1 = shapes[1];
		ash1.paint();
		
		System.out.println("\n==================================\n");
		callShapeMethods(sh1);
		callShapeMethods(r1);
		
		/*
		 * Câu hỏi: Tại sao ko lấy KDL chính nó new chính nó mà lại lấy KDL cha new con
		 * 
		 * List l = new ArrayList()
		 * Border b = new DottedBorder()
		 * Event e = new MouseEvent()
		 * 
		 * 1. Dễ dàng convert(compile) qua về giữa các KDL trong phạm vi cha, con
		 * 
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
		 * 2000:	p = new Baby()
		 * 2006:	p = new Student()
		 * 2010:	p = new Child()
		 * 
		 * VD: Student s = new Student()
		 * 	   		   s = new Employee(); --> error
		 * 
		 * 2. Có thể tạo ra 1 mảng có danh sách các phần tử trong phạm vi cha con
		 * VD: Book[] books = {Math, History,...};
		 * 
		 * 3. Có thể viết ra những hàm generic(chung, tổng quát) với tham số là 
		 * KDL cha, giá trị truyền vào có thể là chính nó hoặc con
		 */
	}
	
	//design pattern: factory pattern
	
	//accessible
	//call all/any [private] methods/attributes in type(Class) --> reflection
	//Shape nhận vào Shape/Square/Rectangle
	private static void callShapeMethods(Shape shape) {
		shape.paint();
		shape.calS();
		
		//Rectangle : setBackground
		//Nếu lúc runtime là Rectangle thì gọi setBackground()
		//Không thì thôi
		
		//if(shape instanceof Rectangle)
		//	((Rectangle) shape).setBackground();
		
		if(shape != null && shape.getClass() == Rectangle.class) {
			Rectangle r = (Rectangle) shape;
			r.setBackground();
		}
			
	}
	
}
