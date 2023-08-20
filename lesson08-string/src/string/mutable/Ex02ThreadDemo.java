package string.mutable;

import java.util.concurrent.TimeUnit;

public class Ex02ThreadDemo {
	public static void main(String[] args) {
		/*
		 * Thread: mục đích + thực hiện task(task, đoạn code, Runnable) nào đó song song
		 * với thread main
		 * 
		 * Mặc định 1 ctr đơn luồng 
		 * 	+ có 1 main thread
		 * 
		 */

		System.out.println("start");

		System.out.println("thread 1 " + Thread.currentThread().getName());

		// Tạo thread tA
		Thread tA = new Thread(new Runnable() {

			@Override
			public void run() {
				doTask(1);
				System.out.println("Thread 2 " + Thread.currentThread().getName());
			}
		}, "TA");
		
		// start thread tA --> thực thi task của Runnable
		tA.start();

		doTask(2);
		System.out.println("finish");
	}
	
	private static void doTask(int seconds) {
		try {
			TimeUnit.SECONDS.sleep(seconds);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
