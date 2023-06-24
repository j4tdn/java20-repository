package b.polymorphism.object;

public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
		// Case 1: parent new parent
		System.out.println("Case 1: parent new parent\n");
		Shape sh1 = new Shape();
		sh1.paint();
		sh1.calS();

		// Case 2: child new child
		System.out.println("\nCase 2: child new child\n");
		Rectangle r1 = new Rectangle();
		r1.paint();
		r1.calS();

		Square s1 = new Square();
		s1.paint();
		s1.calS();
		
		//r1 = s1; Không thể
		sh1 = s1; //Dễ dàng convert qua lại giữa cha,con
		sh1 = r1; //Dễ dàng convert qua lại giữa cha,con
		
		// Case 3: parent new child
		System.out.println("\nCase 3: parent new child\n");
		Shape shar1 = new Rectangle();
		shar1.paint();
		shar1.calS();

		Shape shas1 = new Square();
		shas1.paint();
		shas1.calS();

		// Case 4: child new parent
		System.out.println("\nCase 4: child new parent\n");
		// cast parent-child exception
		// runtime --> parent can be missed child's methods
		// --> child's methods have no content at runtime
		// Rectangle rsh1 = (Rectangle) new Shape();

		Shape[] shapes = { sh1, shar1, shas1, s1, r1 };
		shapes[4] = s1; 
		System.out.println(shapes[4].getClass());
		System.out.println("Shapes length --> " + shapes.length);
		Shape ash1 = shapes[1];
		ash1.paint();
		System.out.println("\n==============\n");
		callShapeMethods(s1);
		/*
		 * Tại sao không lấy KDL chính nó new chính nó mà lại lấy KDL cha new KDL con
		 * 
		 * 1. Dễ dàng convert qua về giữa các KDL trong phạm vi cha, con
		 * 
		 * 2. Có thể tạo ra 1 mảng có danh sách các phần tử trong phạm vi cha, con
		 * 
		 * 3. Có thể viết ra những hàm generic(chung, tổng quát) với tham số là KDL cha,
		 * giá trị truyền vào có thể là chính nó hoặc ocn
		 */
	}

	// design pattern: factory pattern
	// accessible
	// Call all/any methods/attributes in type(Class) regardless of [private] -->
	// reflection
	// Shape shape = r1 || s1
	// Shape nhận vào KDL Shape hoặc con của Shape: Square, Rectangle
	private static void callShapeMethods(Shape shape) {
		// Gọi những hàm của nó
		shape.paint();
		shape.calS();

		// Nếu lúc runtime là Rectangle --> gọi hàm setBackground, nếu không thì không
		// gọi
//		if(shape instanceof Rectangle)
		if (shape != null && shape.getClass() == Rectangle.class) {
			Rectangle r = (Rectangle) shape;
			r.setBackground();
		}
	}
}
