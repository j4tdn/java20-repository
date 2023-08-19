package string.mutable;

import java.util.concurrent.TimeUnit;

public class Ex02ThreadDemo {
	public static void main(String[] args) {
		/*
		 * Thread: Mục đích thực hiện task(hàm, đoạn code, runnable) nào đó song song với hàm main
		 * mặc định 1 chương trình đơn luồng
		 * 	+ có 1 main thread
		 */
		System.out.println("start\n");
		
		System.out.println("Thread " + Thread.currentThread().getName());
		Thread tA = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 2 " + Thread.currentThread().getName());
			}
		},  "Thread-tA");
		tA.start();
		//Thực thi Thread TA --> Thực thi task của Runnable
		
		doTask(2);
		System.out.println("\nfinish");
	}
	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
}
