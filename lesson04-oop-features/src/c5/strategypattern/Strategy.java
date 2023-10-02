package c5.strategypattern;

@FunctionalInterface
//arbitrary interface name
public interface Strategy {
	//strategy method
	//any abstract method
	
	//inportant: list of parameters and return type
	// (x, y) -> x / y;
	int process(int a, int b);
}

//lambda / 'anonymous interface'
// cách viết ngắn gọn để tạo 1 giá trị/ thể hiện cho 1 biến/ kdl 



/*
 * Functional Interface (SAM: Single Abstract Method) là 1 interface chứa: + duy nhất 1 asbtract method
 * 											 							   + có/ không default/static method
 * Annotation (@FunctionalInterface) ==> có hoặc không cũng được nhưng nên có để tránh sai sót khi biên dịch
 * 
 * Lợi ích của functional interface: sử dụng labda expression để tạo ra thể hiện (instance) cho interface đó
 * 
 * 
 */