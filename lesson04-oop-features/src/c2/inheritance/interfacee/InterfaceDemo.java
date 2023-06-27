package c2.inheritance.interfacee;

import javax.swing.JButton;

public class InterfaceDemo {
	
	public static void main(String[] args) {
		// Khởi tạo giá trị cho biến KDL Interface --> có 2 cách
		// Cách 1: Tạo class implement từ Interface 			   : biến = new class();
		// --> khi phần override của methods được sử dụng nhiều lần
		// --> Interface chứa nhiều abstract methods
		
		// Cách 2: New interface --> override lại abstract methods : đc gọi là anonymous class
		// --> Mỗi lần override sẽ có body khác nhau
		Shape shape = new Shape() {
			
			@Override
			public void paint() {
				System.out.println("Circle --> paint.....");
			}
			
			@Override
			public void calS() {
				System.out.println("Circle --> cal s.....");
			}
		};
		shape.paint();
		shape.calS();
		
		System.out.println("\n=========================\n");
		
		Shape shapeC1 = new Circle();
		shapeC1.paint();
		shapeC1.calS();
		
		System.out.println("\n=========================\n");
		
		Shape shapeT1 = new Triangle();
		shapeT1.paint();
		shapeT1.calS();
		
		Shape shapeT2 = new Triangle();
		shapeT2.paint();
		shapeT2.calS();
		
		// VD về anonymous class
		JButton btOnOff = new JButton();
		btOnOff.setText("x");
		btOnOff.addMouseListener(new AbstractMouseListener() {
			// {} remind to override
			
		});
		
	}
}
