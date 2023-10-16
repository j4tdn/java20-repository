package view.lambda.expression;

import java.util.function.BiFunction;
import java.util.function.Supplier;

import bean.Tuple;

public class Ex04ConstructorReference {

	public static void main(String[] args) {
		// 1. implementation class

		// 2. anonymous class

		// 3. anonymous function(lambda)

		// 4. method reference
		// --> với bất kì biểu thức lambda nào
		// + số lượng tham số bất kì
		// + kiểu trả về bất kì

		// 5. constructor reference
		// --> lambda thỏa mãn yêu cầu
		// + số lượng tham số bất kì
		// + kiểu trả về KDL đối tượng và được tạo thông qua constructor

		// Supplier<Tuple> s1 = () -> new Tuple();
		// Supplier<Tuple> s1 = Ex04ConstructorReference::init;
		// BiFunction<Integer, Integer, Tuple> b1 = (l, r) -> new Tuple(l, r); // method reference

		// việc new và chọn hàm khởi tạo nào là phụ thuộc vào kiểu FI
		Supplier<Tuple> s1 = Tuple::new; // constructor reference
		
		Tuple tuple = s1.get();
		
		BiFunction<Integer, Integer, Tuple> b1 = Tuple::new; // constructor reference
		Tuple tupleB = b1.apply(7, 5);
		
		System.out.println("tupleB: " + tupleB);
	}

	public static Tuple init() {
		return new Tuple();
	}
}
