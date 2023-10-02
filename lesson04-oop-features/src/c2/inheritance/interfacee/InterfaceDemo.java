package c2.inheritance.interfacee;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class InterfaceDemo {
	public static void main(String[] args) {
		
		//Khởi tạo giá trị cho biến KDL interface
		//C1: Tạo class implements từ interface
		//	: biến = new class();
		//--> Khi phần override của methods đc sử dụng nhiều 
		//--> Interface chứa rất nhiều abstract methods
		
		//C2: New interface ra --> override lại abstract methods
		//	: anonymous class
		
		Shape shape = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle --> paint ...");
				
			}
			
			@Override
			public void calS() {
				System.out.println("Circle --> calS ...");
				
			}
		};
		
		shape.paint();
		shape.calS();
		
		System.out.println("\n=============================\n");
		
		Shape shapeT1 = new Triangle();
		shapeT1.paint();
		shapeT1.calS();
		
		Shape shapeT2 = new Triangle();
		shapeT2.paint();
		shapeT2.calS();
		
		Shape shapeC2 = new Circle();
		shapeC2.paint();
		shapeC2.calS();
		
		System.out.println("\n=============================\n");
		
		//VD về anonymous class
		JButton btnOnOff = new JButton();
		btnOnOff.setText("x");
		
		btnOnOff.addMouseListener(new MouseClickListener() {
			
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void mouseClicked(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		
		//multiple inheritance
		//class both extends, implements
		//update of OOP from JDK 1.8
		//		+ inheritance --> body method --> default, static, private
		//		+ functional interface --> lambda expression --> strategy pattern
		//abstraction: --> theoretical
	}
}
