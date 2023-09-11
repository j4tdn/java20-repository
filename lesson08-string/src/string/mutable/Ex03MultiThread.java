package string.mutable;

import java.util.concurrent.TimeUnit;

public class Ex03MultiThread {

	public static void main(String[] args) {
		System.out.println("****Start \n");
		
		
		Thread tA = new Thread(new Task(3,"query database"));
		tA.start();
		
		Thread tB = new Thread(new Task(2,"logic"));
		tB.start();
		
		Thread tC = new Thread(new Task(5,"caculation"));
		tC.start();
		
		doJob(4,"send mail");
		
		System.out.println("\n****End ");
	}
	
	private static class Task implements Runnable{
		
		private static int second;
		private String taskName;
		
		public Task(int second,String taskName) {
			this.second = second;
			this.taskName = taskName;
		}
		@Override
		public void run() {
			System.out.println("Thread " +Thread.currentThread().getName() + "is excutiing " + taskName);
			
			doJob(second,taskName);
			
			System.out.println("Task " +taskName + "is Done!");
		}
	}
	
	private static void doJob(int seconds,String taskName) {
		System.out.println("Excuting Task" + taskName);
		try {
			for(int i =1 ; i<=seconds;i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Running" + i + "s");
			}
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		
	}
}
