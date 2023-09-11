package c2.intheritance.interfacee;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class InterfaceDemo {
	//Khởi tạo giá trị cho biến KDL interface --> Có 2 cách
	//C1: Tạo class implement từ interface
	//	: biến = new class();
	//--> Khi phần override của methods được sử dụng nhiều lần
	//--> Interface chứa rất nhiều abtract methods
	
	//C2: New interface ra --> override lại abstract methods
	//	: anonymous class
	// anonumous class
	//--> Mỗi lần override sẽ có body khác nhau
	public static void main(String[] args) {
		Shape shape= new Circle();
		shape.paint();
		shape.calS();
		
		System.out.println("\n----------------------\n");
		
		
		Shape shapeT1 = new Triangle();
		shapeT1.paint();
		shapeT1.calS();
		
		System.out.println("\n----------------------\n");
		
		Shape shapeT2 = new Triangle();
		shapeT2.paint();
		shapeT2.calS();
		
		System.out.println("\n----------------------\n");
		
		//VD về anonumous class
		JButton btnOnOff = new JButton();
		btnOnOff.setText("x");
		
		btnOnOff.addMouseListener(new MouseClickListener() 
		 {
			@Override
			public void mouseClicked(MouseEvent e) {
				
			}
		});
		//multiple inhertitance 
		//class both extends, implements
		//update of OOP from JDK 1.8
		// +interface --> body methods --> default, static ,private
		// + functional interface --> lambda expression --> strategy pattern
		// abstraction: --> theoricticle
	}
}
