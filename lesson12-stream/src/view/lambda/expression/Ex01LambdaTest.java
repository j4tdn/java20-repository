package view.lambda.expression;

import java.util.concurrent.Callable;
import java.util.function.Function;

public class Ex01LambdaTest {

	public static void main(String[] args) {
		
		/*
		 1. () -> {} : Runnable
		 --> đoán
		 	+ số lượng tham số truyền vào
		 	+ KDL trả về
		 	+ tên của FI có sẵn trong java
		 
		 2. () -> "Raoul" : Callable
		 
		 
		 4. (Integer i) -> return "Alan " + i;
		 */
		
		Runnable runnable = () -> {};
		runnable.run();
		
		Callable callable = () -> "Raoul";
		
		try {
			System.out.println("callable: " + callable.call());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Function<Integer, String> func = (Integer i) -> "Alan " + i;
		
		System.out.println("func: " + func.apply(18));
		
		
	}

}
