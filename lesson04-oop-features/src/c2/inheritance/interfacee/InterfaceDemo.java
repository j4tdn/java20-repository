package c2.inheritance.interfacee;

import javax.swing.JButton;

public class InterfaceDemo {
	public static void main(String[] args) {
		// khởi tạo giá trị cho biến KDL interface --> 2 cách
		// Cách 1: tạo class implement từ interface
		// : biến = new class();
		// --> khi phần override của methods đc sử dụng nhiều lần
		// --> interface chứa rất nhìu abstract methods

		// cách 2: new interface ra --> override lại abstract methods
		// : anonymous class
		// --> mỗi lần override sẽ có body khác nhau

		
		// anonymous class
		Shape shape = new Shape() {

			@Override
			public void paint() {
				System.out.println("circle --> paint...");
			}

			@Override
			public void calS() {
				System.out.println("circle --> cal s...");
			}
		};

		shape.paint();
		shape.calS();

		System.out.println("\n=============\n");

		Shape shapeC1 = new Circle();
		shapeC1.paint();
		shapeC1.calS();

		Shape shapeT1 = new Triangle();
		shapeT1.paint();
		shapeT1.calS();

		Shape shapeT2 = new Triangle();
		shapeT2.paint();
		shapeT2.calS();

		System.out.println("\n=============\n");

		// vd về anonymous class
		JButton btOnOff = new JButton();
		btOnOff.setText("x");

		// remind to override
		btOnOff.addMouseListener(new AbstractMouseListener() {
		});

		// multiple inheritance
		// class both extends, implements
		// update of OOP from JDK 1.8
		// + interface --> body method --> default, static, private
		// + functional interface --> lambda expression --> strategy pattern
		// abstraction: --> theoretical
	}
}
