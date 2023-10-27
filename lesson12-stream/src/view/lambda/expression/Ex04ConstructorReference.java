package view.lambda.expression;

import java.util.function.BiFunction;
import java.util.function.Supplier;

import bean.Apple;
import bean.Tuple;

public class Ex04ConstructorReference {
	public static void main(String[] args) {
		// 1. Implementation class

		// 2. -> anonymous class

		// 3. -> anonymous function(lambda expression)

		// 4. -> method reference
		// 		--> Với bất kỳ biểu thức lambda nào
		//		+ Số lượng tham số bất kỳ
		//		+ Kiểu trả về bất kỳ
		
		// 5. Constructor reference
		// 		--> Chỉ có thể chuyển sang Constructor Reference khi Lambda thỏa mãn yêu cầu
		//		+ Số lượng tham số bất kỳ
		//		+ KDL trả về là KDL đối tượng và được tạo thông qua Constructor
		
		// Việc new mà Java chọn hàm khởi tạo nào -> phụ thuộc vào KDL functional interface
		Supplier<Tuple> s1 = () -> new Tuple();
		s1 = Ex04ConstructorReference::init; // Method reference
		s1 = Tuple::new; // Constructor Reference
		Tuple tuple = s1.get();
		
		BiFunction<Integer, Integer, Tuple> b1 = (l,r) -> new Tuple(l,r);
		BiFunction<Integer, Integer, Apple> b2 = (l,r) -> new Apple(l,r);
		b1 = Tuple::new;
		b2 = Ex04ConstructorReference::initApple;
		
		Tuple tupleB = b1.apply(7, 7);
		
		System.out.println(tuple);
		System.out.println(tupleB);
	}
	
	public static Apple initApple(int a, int b) {
		return new Apple(a,b);
	}
	
	public static Tuple init() {
		return new Tuple();
	}
}
