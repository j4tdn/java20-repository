package view.lambda.expression;

import bean.Tuple;

public class Ex02LocalVariable {
	
	private static String test = "test";
	
	public static void main(String[] args) {
		Runnable r1 = testLambda_LocalVar();
		r1.run();
		System.out.println(test);
	}

	// External class

	// Anonymous class

	// Anonymous function

	// Auto final with local variable

	// Ex02LocalVariable : testLambda_LocalVar # timeConsuming
	// RunningTime : run
	
	// Effectively auto final
	
	//But no restrictions with global, static variable
	
	public static Runnable testLambda_LocalVar() {
		int timeConsuming = 55;
		Tuple tuple = new Tuple(2,5);
		// Đây chính là FI runnable
		return () -> {
			// timeConsuming = 5;   // Không cho phép
			// tuple = new Tuple(); // Không cho phép
			tuple.setLeft(3);
			test = "Hello";
			String taskName = "Task-R1";
			System.out.println("This " + taskName + " method takes " + timeConsuming + "(s)");
		};

//		return new RunningTime(timeConsuming);
	}
}
