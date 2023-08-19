package string.mutable;

import java.util.concurrent.TimeUnit;

public class Ex03MultiThread {
	public static void main(String[] args) {
		System.out.println("start\n");
		Thread tA = new Thread(new Task(3, "query dataBase"));
		tA.start();
		
		Thread tB = new Thread(new Task(2, "logic"));
		tB.start();
		Thread tC = new Thread(new Task(5, "calculation"));
		tC.start();
		
		Thread tD = new Thread(new Task(4, "send Email"));
		tD.start();
		
		
		System.out.println("\nend");
	}
	private static class Task implements Runnable {

		private int seconds;
		private String taskName;
		
		public Task(int seconds, String taskName) {
			this.seconds = seconds;
			this.taskName = taskName;
		}
		@Override
		public void run() {
			doJob(seconds, taskName);
		}
		
	}
	private static void doJob(int seconds, String taskName) {
		System.out.println("excuting: " + taskName);
		try {
			for(int i = 1; i<= seconds; i++) {
			TimeUnit.SECONDS.sleep(seconds);
			System.out.println("running " + i + "s");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
