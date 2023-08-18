package string.mutable;

import java.util.concurrent.TimeUnit;

public class Ex03MultitThread {
	
	public static void main(String[] args) {
		System.out.println("START");
		
		Thread tA = new Thread(new Task(1, "query database"));
		tA.start();
		
		Thread tB = new Thread(new Task(2, "logic"));
		tB.start();
		
		Thread tC = new Thread(new Task(3, "fix bug"));
		tC.start();
		
		Thread tD = new Thread(new Task(4, "maintain"));
		tD.start();
	
		Thread tE = new Thread(new Task(5, "tester"));
		tE.start();
		
		System.out.println("****FINISH");
		
	}
	
	private static class Task implements Runnable {
		
		private int second;
		private String taskName;
		
		
		
		public Task(int second, String taskName) {
			this.second = second;
			this.taskName = taskName;
		}


		@Override
		public void run() {
			System.out.println("Thread " + Thread.currentThread().getName() + " is executing " + taskName);
			doJob(second, taskName);
			
		}
	}
	
	private static void doJob(int seconds, String taskName) {
		System.out.println("Execute task: " + taskName);
		try {
			for(int i = 1 ; i < seconds;i++) {
				TimeUnit.SECONDS.sleep(1);
				System.out.println("Running: " + i + "s");
			}
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
	}
}
