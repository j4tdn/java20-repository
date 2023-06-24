package c.inheritance.interfacee;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

import c2.inheritance.interfacee.AbstractMouseListener;

public class InterfaceDemo {
	public static void main(String[] args) {
		// Khởi tạo giá trị cho biến KDL interface --> có 2 cách
		// Cách 1: Tạo class implement từ interface
		// 		 : biến = new class():
		// --> Khi phần override của methods được sử dụng nhiều lần
		// --> Interface chứa rất nhiều abstract methods
		
		// Cách 2: Neww interface ra --> override lại abstract methods
		// 		 : anonymous class
		
		Shape shape = new Shape() {

			@Override
			public void paint() {
				System.out.println("Circle --> paint ...");
			}

			@Override
			public void calS() {
				System.out.println("Circle --> cal S ...");
			}
			
		};
		shape.paint();
		shape.calS();
		
		System.out.println("\n=============================================\n");
		
		Shape shapeC1 = new Circle();
		shapeC1.paint();
		shapeC1.calS();
		
		Shape shapeT1 = new Triangle();
		shapeT1.paint();
		shapeT1.calS();
		
		System.out.println("\n=============================================\n");
		
		// VD về anonymous class
		JButton btOnOff = new JButton();
		btOnOff.setText("x");
		
		btOnOff.addMouseListener(new AbstractMouseListener() {
			// remind to override
			@Override
			public void mouseClicked(MouseEvent e) {
			}
			
			@Override
			public void mouseExited(MouseEvent e) {
			}
		});
		
		// multiple inheritance
		// class both extends, implements
		// update of OOP from JDK 1.8
		//	  + interface --> body method --> default, static, private
		//	  + functional interface --> lambda expression --> strategy pattern
		// abstraction: --> theoretical
		
	}
}
