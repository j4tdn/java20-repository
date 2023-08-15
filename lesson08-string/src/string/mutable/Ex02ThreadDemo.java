package string.mutable;

import java.util.concurrent.TimeUnit;

public class Ex02ThreadDemo {
	public static void main(String[] args) {
		/*
		 Thread: mục đích
		 	+ Thực hiện 1 task(hàm, đoạn code, Runnable) nào đó song song với thread main
		 
		 Mặc định 1 chương trình đơn luồng
		 	+ có 1 main thread
		 	
		 */
		
		System.out.println("*** Start \n");
		
		System.out.println("Thread 1 " + Thread.currentThread().getName());
		
		// tạo thread tA
		Thread tA = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 2 " + Thread.currentThread().getName());				
			}
		}, "TA");
		
		tA.start();
		
		doTask(2);
		System.out.println("\n*** Finish");
	}
	
	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
