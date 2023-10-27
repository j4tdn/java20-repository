package view.lambda.expression;

import bean.Tuple;

public class Ex02LocalVariable {
	
	public static String test = "test";
	
	public static void main(String[] args) {
		Runnable r1 = testLambda_LocalVar();
		r1.run();
	}
	
	// external class
	
	// anonymous class
	
	// anonymous function
	
	// Ex02LocalVariable: testLambda_LocalVar # timeConsuming
	// RunningTime      : run
	
	private static Runnable testLambda_LocalVar() {
		// Auto final with local variable
		int timeConsuming = 5;
		Tuple tuple = new Tuple(2, 5);
		
		// But no restriction with global, static variable
		
		return () -> {
			// timeConsuming = 55;
			// tuple = new Tuple();
			tuple.setLeft(3);
			test = "lesson";
			String taskName = "Task-R1";
			System.out.println("This " + taskName + " takes " + timeConsuming + "(s)");
		};
		
		// return new RunningTime(timeConsuming);
	}
}