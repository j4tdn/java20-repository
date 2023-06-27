package b.polymorphism.object;

public class Ex01PolymorphismDemo {
	public static void main(String[] args) {
		System.out.println("th1 --> parent new parent\n");
		Shape sh1 =new Shape();
//		sh1.paint();
//		sh1.calS();
		callShapeMethods(sh1);
		
		System.out.println("*************");
				
		System.out.println("th2 --> child new child\n");
		Rectangle r1 = new Rectangle();
//		r1.paint();
//		r1.calS();
		callShapeMethods(r1);
		System.out.println("*************");
		
		Square s1 = new Square();
//		s1.paint();
//		s1.calS();
		callShapeMethods(s1);
		System.out.println("*************");
		
		System.out.println("th3 --> parent new child\n");
		Shape shs1 = new Square();
//		shs1.paint();
//		shs1.calS();
		callShapeMethods(shs1);
		System.out.println("*************");
		
		Shape shr1 = new Rectangle();
//		shr1.paint();
//		shr1.calS();
		callShapeMethods(shr1);
		System.out.println("*************");

		System.out.println("th4 --> child new parent\n");
//		Square ssh1 = (Square) new Shape();
		
		Shape[] shapes = {sh1, r1,s1,shr1};
		System.out.println("shape length--> "+ shapes.length);
		Shape ash1 = shapes[1];
		System.out.println();
		//cast parent- child exception
		//runtime --> parent can be mised child's methods
		//-->child's methods have no content at runtime
		/*
		 * Rectangle rsh1 = (Rectangle) new Shape(); rsh1.paint(); rsh1.calS();
		 * rsh1.setBackground();
		 *
		/* 
		 Câu hỏi: Tại sao không lấy KDL chính nó new chính nó mà lại lấy KDL cha new con
		 
		 1.Dễ dàng convert qua về giữa các kiểu dữ liệu trong phạm vi cha, con.
		 2.Có thể tạo ra 1 mảng có danh sách các phần tử trong phạm vi cha con.
		 3.Có thể viết ra những hàm generic (chung, tổng quát) với tham số là KDL cha,
		  giá trị truyền vào có thể là chính nó hoặc con.
		 
		 */
		// design pattern: factory pattern
		//accessible
		//call all/ any [private]  methods/attributes in type(Class) --> reflection
		//Shape shape  = sh1 || r1;
		//shape --> nhận vào KDL Shape hoặc con của Shape: Square, Rectangle.
		
		
		
		
	}
	private  static void callShapeMethods(Shape shape) {
		shape.calS();
		shape.paint();
		
		//Rectangle: setBackground
		//nếu lúc runtime shape là Rectangle --> gọi hàm setBackground
		//nếu k phải thì k gọi
		if(shape instanceof Rectangle)
		{
			//((Rectangle)shape).setBackground();
			Rectangle r = (Rectangle)shape;
			r.setBackground();
		}
		/*
		 if(shape !=null && shape.getClass() == Rectangle.class)
		 {
		 	Rectangle r = (Rectangle)shape;
			r.setBackground();
		 }
		 */
	}
//	đa hình 2 loại 
//	pt: ovr,ovl
//		hàm: cùng chức năng --> để trong cha --> con ovr lại
		//khi anaof trong 1 class có hàm cungd chức năng, cungd tên --> dùng ovl --> vd hàm sum
	
		//khi nào nhiều class cũng chung chức năng, hàm --> áp dùng thừa kế --> có thể dùng luôn hoặc ovr lại
			//--> vì sao k để từng thangew mà phải tạo thêm class rồi ovr lại 
			//--> cùng 1 chức năng để nhiều class --> sec có nhiều tên hàm khác nhau -->
	
	//
	
}
