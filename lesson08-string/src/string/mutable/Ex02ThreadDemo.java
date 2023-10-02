package string.mutable;

import java.util.concurrent.TimeUnit;

public class Ex02ThreadDemo {
	public static void main(String[] args) {
		/*
		   	Thread: mục đichs
		   		+ Thực hiện task (hàm , đoạn code, Runnable) nào đó song song
		   		
		 	Mặc định 1 chương trình
		 	+ Có 1 main thread
		 	
		 */
		System.out.println("****Start \n");
		
		System.out.println("Thread 1 " + Thread.currentThread().getName());
		
		Thread tA = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("Thread 2 " + Thread.currentThread().getName());
			}
		}, "TA");
		
		//start thread TA --> thực thi task của Runnable
		tA.start();
		doTask(2);
		
		System.out.println("****Finish \n");
	}

	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
