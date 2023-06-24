package c2.inheritance.iinterface;

import java.awt.event.MouseEvent;

import javax.swing.JButton;

public class InterfaceDemo {
	public static void main(String[] args) {
		//khởi tạo giá trị cho biến KDL interface --> có 2 cách:
		//cách 1: Tạo class implement từ interface
			//  : biến = new class();
		// --> khi phần  override của methods được sử dụng nhiều lần 
		// --> interface chứa rất nhiều abstract methods
		
		//Cách 2: new interface ra --> override lại abstract methods
			//	: anonymous class
		// --> mỗi lần override sẽ có body khác nhau 
		Shape shapeC1 = new Circle();
		shapeC1.paint();
		shapeC1.cals();
		
		System.out.println("===============");
		Shape shapeT1 = new Triangle();
		shapeT1.paint();
		shapeT1.cals();
		
		//VD về anonymous Class
		JButton btOnOf = new JButton();
		btOnOf.setText("x");
		btOnOf.addMouseListener(new AbstractMouseListener() {
			
			//remind to override
			@Override
			public void mouseReleased(MouseEvent e) {
				
			}
			
			@Override
			public void mousePressed(MouseEvent e) {
				
			}
		
		});
		//multiple inheritance
		//class both extends, implements
		//update of OOP from JDK 1.8 (JAVA 08)
		// + interface --> body method --> default, static, private
		// + functional interface --> lambda expression --> strategy pattern
		//abstraction: theoretical
	}
}
