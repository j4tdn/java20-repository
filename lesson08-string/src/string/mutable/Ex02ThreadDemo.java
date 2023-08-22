package string.mutable;

import java.util.concurrent.TimeUnit;

public class Ex02ThreadDemo {
	public static void main(String[] args) {
		/*
		 Mặc định 1 chương trình đơn luồng
		    + Có 1 main thread
		    
		 */
		System.out.println("*** Start \n");
		
		System.out.println("Thread " + Thread.currentThread().getName());
		
		// tạo thread tA
		Thread tA = new Thread(new Runnable() {
			@Override
			public void run() {
				System.out.println("Thread 2 " + Thread.currentThread().getName());
			}
		}, "TA");
		
		// start thread tA --> thực thi task của Runnable
		tA.start();
		
		doTask(2);
		System.out.println("\n*** Finished");
	}
	
	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
