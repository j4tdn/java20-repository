package common;

public class RunningTime implements Runnable{
	
	private int timeConsuming;
	public RunningTime(int timeConsuming) {
		this.timeConsuming = timeConsuming;
	}
	@Override
	public void run() {
		timeConsuming = 55;
		String taskName = "Task-R1: ";
		System.out.println("this " + taskName + timeConsuming + "(s)");
	}

}
