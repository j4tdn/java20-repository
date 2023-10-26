package view.lambda.expression;

import bean.Tuple;

final class Ex02LocalVariable {
	
	private static String test = "test";
	
	public static void main(String[] args) {
		Runnable runnable = testLambda_LocalVar();
		runnable.run();
		System.out.println(test);
	}

	private static Runnable testLambda_LocalVar() {
		int timeConsuming = 5;// auto final
		Tuple tuple = new Tuple(2, 5);
		// no restriction with static, global variables
		return new Runnable() {

			@Override
			public void run() {
			//	timeConsuming = 55;
				tuple.setLeft(3);
				test = "hello";
				String taskName = "Task-R1";
				
				System.out.println("this " + taskName + " tasks" + timeConsuming + " s");
			}
		};
	}
}
