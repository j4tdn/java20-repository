package c3.inheritance.abstractclass;

import javax.swing.JButton;

public class AbstractClassDemo {
	public static void main(String[] args) {
		EmailService es1 = new EmailService() {
			
			@Override
			void login() {
				
				
			}
		};
		es1.login();
		System.out.println("----------");
		
		JButton bt = new JButton();
		bt.addMouseListener(new AbstractMouseListener() {
			
			//remind to override
		});
		//multiple inheritance
		//class both extends, implements
		//update of OOP from JDL 1.8
	}
}
