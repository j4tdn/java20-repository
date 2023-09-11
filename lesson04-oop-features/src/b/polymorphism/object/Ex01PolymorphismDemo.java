package b.polymorphism.object;

public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
	
		System.out.println("==>th1--> parent new parent\n");
		Shape sh1 = new Shape();
		sh1.paint();
		sh1.calS();
		System.out.println("\n==>th2--> child new child\n ");
		
		Retangle r1 = new Retangle();
		r1.paint();
		r1.calS();
		
		Square s1 = new Square();
		s1.paint();
		s1.calS();
		System.out.println("\n==>th3--> parent new child\n");
		
		Shape shr1 = new Retangle();
		shr1.paint();
		shr1.calS();
		
		Shape shs1 = new Square();
		shs1.paint();
		shs1.calS();
		
		System.out.println("\n==>th4--> child new parent\n");
		//runtime --> parent can be missed child methods
		// -->child methods have no content at runtime
//		Retangle rsh1 = (Retangle)new Shape();
//		rsh1.paint();
//		rsh1.calS();
//		rsh1.setBackground();
		
		 
		Shape[] shapes = {sh1,r1,s1,shr1,};
		System.out.println("Shapes lenght--> "+ shapes.length);
		Shape ash1 = shapes[1];
		ash1.paint();
		
		System.out.println("\n===============\n");
		callShapeMethod(r1);
		
		//Câu hỏi: tại sao không lấy KDL chính nó new chính nó mà lại lấy
		//KDL cha new con (về nhà)
		/*
		 * 1. Dễ dàng convert qua về giữa các KDL trong phạm vi cha, con
		 * 
		 * 2. Có thể tạo ra 1 mảng có danh sách các phần tử trong phạm vi cha con
		 * Book[] books = {math,chemitry,history,..};
		 * 
		 * 3. Có thể viết ra những hàm chung,tổng quát với tham số
		 * là KDL cha , giá trị truyền vào có thể là chính nó hoặc con
		 */
	}
	
	//design button pattern: factory pattern

	//call all/any [private] methods/attributes in type(Class) --> reflection
	//Shape shape = sh1 | r1
	//shape --> nhận vào KDL Shape hoặc con của Shape
	private static void callShapeMethod(Shape shape) {
		shape.paint();
		shape.calS();
		//instanceof là hàm kiểm tra lúc runtime
//		C1:if(shape !=null && shape.getClass() == Retangle.class)
	   /*C2*/if(shape instanceof Retangle) {
			Retangle r = (Retangle)shape;
			r.setBackground();
		}
	}
}
