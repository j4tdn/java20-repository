package view.lambda.expression;

import java.util.concurrent.Callable;
import java.util.function.Function;

public class Ex01LambdaTest {
	public static void main(String[] args) {
		
		/*
		 	1. ()->{}: function descriptor
		 	--> đoán đc: số lượng tham số trong hàm trừu tượng
		 	--> : kiểu trả về
		 	--> : tên của functional interface
		 	
		 	2. () ->  "raoul"
		 		: ko co tham số truyền vào 
		 		: trả về T
		 	
		 */
		Runnable runnable = () -> {};
		runnable.run();
		
		Callable<String> callable = () ->  "Raoul";
		
		try {
			System.out.println("callble: " + callable.call());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Function<Integer, String> function =(Integer i) -> "alan" + i;
		System.out.println("function: " + function.apply(18));
	}
}
