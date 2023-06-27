package c3.inheritance.abstractclass;

import java.lang.annotation.AnnotationTypeMismatchException;

public class BusinessEmailServiceImpl extends EmailService {

		@Override
		void login() {
			System.out.println("BusinessEmailServiceImpl --> login");
			
		}
		@Override
		void login2Steps() {
			System.out.println("BusinessEmailServiceImlp --> login2Step ");
		}
		/*
		 * EmailService s =new EmailService() {
		 * 
		 * @Override void login() { 
		 * 
		 * } };
		 */

}
