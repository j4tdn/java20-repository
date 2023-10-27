package view.lambda.expression;

import java.util.concurrent.Callable;
import java.util.function.Function;

public class Ex01LambdaTests {
	public static void main(String[] args) {
		/*
		 * 1. () -> {} : Function descriptor --> 
		 * Phải đoán được 
		 *  + Số lượng tham số trong FI 
		 *  + Kiểu trả về của hàm trừu tượng đó 
		 *  + Tên của FI có sẵn trong Java
		 * 
		 * 2. () -> "Raoul" 
		 * + Ko có tham số truyền vào 
		 * + Trả về T
		 * 
		 * 4. (Integer i) -> return "Alan" + i;
		 */

		Runnable runnable = () -> {
		};
		runnable.run();

		Callable<String> callable = () -> "Raoul";
		
		try {
			System.out.println(callable.call());
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Function<Integer, String> function = (Integer i) ->{
			return "Alan" + i;
		};
		System.out.println(function.apply(18));
		
	}
}
