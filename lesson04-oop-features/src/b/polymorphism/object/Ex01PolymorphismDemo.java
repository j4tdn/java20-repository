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

		System.out.println("\n==> th3 --> parent new child\n");

		Shape shr1 = new Rectangle();
		shr1.paint();
		shr1.calS();

		Shape shs1 = new Square();
		shs1.paint();
		shs1.calS();

		shr1 = shs1;
		shr1.calS();

		System.out.println("\n==> th4 --> child new parent\n");

		// Rectangle rsh1 = (Rectangle) new Shape();
		// rsh1.paint();
		// rsh1.calS();
		// rsh1.setBackground();

		// r1 --> compile --> Rectangle
		// shapes[1] --> compile --> Shape
		Shape[] shapes = { sh1, r1, s1, shr1 };
		Shape ash1 = shapes[1];
		ash1.paint();

		System.out.println("\n=====================\n");

		callShapeMethods(r1);
	}

	// call all/any [private] methods/attributes in type(Class) --> reflection

	private static void callShapeMethods(Shape shape) {
		// gọi những hàm của nó
		shape.paint();
		shape.calS();
		
		// Rectangle: setBackground
		// Nếu lúc runtime shape là Rectangle --> gọi hàm setBackground
		// Nếu không phải thì không gọi
		if (shape instanceof Rectangle) {
			Rectangle r = (Rectangle) shape;
			r.setBackground();
		}
	}
}
