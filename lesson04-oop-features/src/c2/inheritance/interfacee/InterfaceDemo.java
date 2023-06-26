package c2.inheritance.interfacee;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class InterfaceDemo {
	public static void main(String[] args) {
		// Khởi tạo giá trị cho biến kdl interface --> có 2 cách
		// 	C1: Tạo class implements từ interface
		// 		biến = new class();
		// 		--> Khi phần override của methods được sd nhiều lần
		// 		--> Interface chứa rất nhiều abstract methods
		// 	C2: new interface ra --> override lại abstract methods
		// 		Mỗi lần override sẽ có nội dung khác nhau

		// Anonymous class
		Shape shape = new Shape() {

			@Override
			public void paint() {
				System.out.println("Circle --> paint ...");
			}

			@Override
			public void calS() {
				System.out.println("Circle --> cal s ...");
			}
		};
		shape.paint();
		shape.calS();

		System.out.println("\n=================\n");

		Shape shapeC1 = new Circle();
		shapeC1.paint();
		shapeC1.calS();
		
		System.out.println("\n=================\n");
		
		Shape shapeT1 = new Triangle();
		shapeT1.paint();
		shapeT1.calS();

		Shape shapeT2 = new Triangle();
		shapeT2.paint();
		shapeT2.calS();

		System.out.println("\n=================\n");
		
		JButton btOnOff = new JButton();
		btOnOff.setText("x");
		btOnOff.addMouseListener(new AbstractMouseListener() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
			}
			
		});
	}
}
