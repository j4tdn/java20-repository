package c3.inheritance.abstractclass;

import c2.inheritance.interfacee.Shape;

public abstract class EmailService {
	abstract void login();
	void login2Steps() {
		System.out.println("EmailService --> login2Steps");
	}
}
