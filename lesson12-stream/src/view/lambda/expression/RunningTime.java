package view.lambda.expression;

public class RunningTime implements Runnable{
	
	private int timeConsuming;
	
	public RunningTime(int time) {
		timeConsuming = time;
	}
	
	@Override
	public void run() {
		timeConsuming++;
		
	}
}
