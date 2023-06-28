package c5.strategypattern;

@FunctionalInterface

//arbitrary interface name
public interface Strategy {

	// Strategy method
	// arbitrary abstract method

	// important: list of parameters and return type
	// (x,y) -> x / y;
	int process(int x, int y);

}
