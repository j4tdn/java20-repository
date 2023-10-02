package string.mutable;

import java.util.concurrent.TimeUnit;

public class Ex03MultiThread {
	public static void main(String[] args) {
		System.out.println("**** Start \n");
		
		doTask(2, "query database");
		doTask(3, "logic");
		doTask(5, "calculation");
		doTask(4, "send mail");
	}
	
	private static void doTask(int seconds, String taskName) {
		System.out.println("Excuting task " + taskName);
		try {
			for(int i = 1; i <= seconds; i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Running " + i +"s");
				
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
