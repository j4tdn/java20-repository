package c5.practice;

@FunctionalInterface
//arbitrary interface name
public interface Strategy {
	
	//Strategy method
	//arbitrary any abstract
	
	//import: list of parameters and return type
	// (x, y) -> x / y
	int process(int x, int y);

}
