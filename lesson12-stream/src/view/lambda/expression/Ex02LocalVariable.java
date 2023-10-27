package view.lambda.expression;

import common.RunningTime;

public class Ex02LocalVariable {
	public static void main(String[] args) {
		Runnable runnable = testLambda_LocalVar();
		runnable.run();
		
		
	}
	
	//external Class
	
	//anonymous class
	
	//anonymous function
	
	//Auto final with local variable
	
	private static Runnable testLambda_LocalVar() {
		// but no restriction with global, static variable
		
		int timeConsuming = 5;
		return new RunningTime(timeConsuming);
	}
}
