package c2.inheritance.interfacee;

public class interfaceDemo {
	public static void main(String[] args) {
		
		//Khởi tạo giá trị cho biến KDL interface --> có 2 cách
		//Cách 1: Tạo class implements từ interface
		//		: biến = new Class();
		//-> Khi phần override của methods được sử dụng nhiều
		
		
		//cách 2: new interface ra --> override lại abstract methods
		//		: anony
		Shape shape = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle --> paint ........");
				
			}
			
			@Override
			public void calS() {
				System.out.println("Circle --> cal s ........");
				
			}
		};
		shape.paint();
		shape.calS();
		System.out.println("\n -------------------------");
		Shape shapeS1 = new Circle();
		shapeS1.paint();
		shapeS1.calS();
		
		System.out.println("\n -------------------------");
		Shape shapeT1 = new Triangle();
		shapeT1.paint();
		shapeT1.calS();
		   
	}
}
