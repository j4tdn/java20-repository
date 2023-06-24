package b.polymorphism.object;

public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
	
		System.out.println("parent new parent: ");
		Shape sh1 = new Shape();
		sh1.paint();
		sh1.cals();
		System.out.println("===========");
		System.out.println("child new child: ");
		Square sq1 = new Square();
		sq1.paint();
		sq1.cals();
		
		Rectangle r1 = new Rectangle();
		r1.paint();
		r1.cals();
		System.out.println("===========");
		System.out.println("parent new child:");
		Shape shr1 = new Rectangle();
		shr1.paint();
		shr1.cals();
		
		Shape shs1 = new Square();
		shs1.paint();
		shs1.cals();
		
		System.out.println("child new parent");  
		
		//runtime ---> parent can be missed child's method
		//--> child's methods have no content at runtime
//		Rectangle rs1 = (Rectangle)new Shape();
//		rs1.paint();
//		rs1.cals();
//		rs1.setBackground();
		
		
		Shape[] shape = {sh1, sq1, r1, shr1, shs1};
		System.out.println("Shape Length: " + shape.length);
		Shape ash1 = shape[1];
		ash1.paint();
		
		System.out.println("================\n");

		callShapeMethod(sq1);
		/*
		 * tại sao ko lấy KDL chính nó new chính nó mà lại lấy
		 * KDL Cha new Con?
		 * List l = new ArrayList
		 * border b = new DottedBorder();
		 * Event e = new MouseEvent();
		 * 
		 * 1. dễ dàng convert(complile) qua về giữa các KDL trong phạm vi cha, con
		 * VD: Person
		 * 		+ Baby
		 * 		+ Primary School Student
		 * 		+ Secondary School Student
		 * 		+...
		 * 		+Employee
		 * 2000: p = new Baby();
		 * 2006: p = new PsStudent();
		 * ...
		 * 
		 * 2. Có thể tạo ra 1 mảng có danh sách các phần tử trong phạm vi cha con 
		 * 
		 * 3. có thể viết ra những hàm generic(chung, tổng quát) với tham số là KDL Cha,
		 * giá trị truyền vào có thể là chính nó hoặc con 
		 */
		
		 
	}
	//design pattern: factory pattern 
	
	//accessible
	//call all/any [private] methods/attributes in type(class): reflection
	
	private static void callShapeMethod(Shape shape) {
		shape.paint();
		shape.cals();
		//if runtime shape is rectangle --> call methods setBackground;
		//else can't call
		//if(shape instanceof Rectangle) { or
		if(shape != null && shape.getClass() == Rectangle.class) {
			//((Rectangle) shape).setBackground();
			Rectangle r = (Rectangle) shape;
			r.setBackground();
		}
	}
}
