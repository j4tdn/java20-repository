package view.lambdaexpression;

import java.util.concurrent.Callable;
import java.util.function.Function;

public class Ex01LambdaTests {
	public static void main(String[] args) {
		/*
		 1. () -> {} function descriptor
		  --> đoán được
		  + Số lượng tham số trong hàm trừu tượng của FI
		  + kiểu trả về của hàm trừu tượng đó
		  + tên của FI có sẵn trong Java
		  
		 2. () -> "Raoul"
		  + ko có tham số truyền vào
		  + trả về T

		 4. (Integer i) -> return "Alan" + i
		  + có 1 tham số truyền vào kiểu T
		  + trả về kiểu R
		 */
		Runnable runnable = () -> {};
		runnable.run();
		
		Callable<String> callable = () -> "Raoul";
		try {
			System.out.println("callable --> " + callable);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Function<Integer, String> function = (Integer i) -> {
			return "Alan" + i;
		};
		System.out.println("function: " + function.apply(18));
		
	}
}
