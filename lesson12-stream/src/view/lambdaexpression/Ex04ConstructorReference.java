package view.lambdaexpression;

import java.util.function.BiFunction;
import java.util.function.Supplier;

import bean.Tuple;

public class Ex04ConstructorReference {
	public static void main(String[] args) {
		// 1. implementation class

		// 2. anonymous class

		// 3. anonymous function(lambda expression)

		// 4. method reference
		//    --> với bất kỳ biểu thức lambda nào
		//    + số lượng tham số bất kỳ
		//    + kiểu trả về bất kỳ

		// 5. constructor reference
		//    --> lambda thỏa mãn yêu cầu
		//    + số lượng tham số bất kỳ
		//    + kiểu trả về KDL đối tượng và được tạo thông qua constructor

		// Supplier<Tuple> s1 = () -> new Tuple();
		// Supplier<Tuple> s1 = Ex04ConstructorReference::init; // method reference
		// BiFunction<Integer, Integer, Tuple> b1 = (l, r) -> new Tuple(l, r); // method reference

		// Việc new mà chọn hàm khởi tạo nào --> phụ thuộc vào kiểu functional interface
		Supplier<Tuple> s1 = Tuple::new; // constructor reference
		Tuple tuple = s1.get();

		BiFunction<Integer, Integer, Tuple> b1 = Tuple::new; // constructor reference
		Tuple tupleBe = b1.apply(7, 7);

		System.out.println("tuple --> " + tuple);
		System.out.println("tupleBe --> " + tupleBe);
	}

	public static Tuple init() {
		return new Tuple();
	}
}
