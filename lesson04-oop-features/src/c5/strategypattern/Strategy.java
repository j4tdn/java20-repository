package c5.strategypattern;

@FunctionalInterface
// arbitrary interface name
public interface Strategy {
	
	// strategy method
	// arbitrary abstract method
	
	// important: list of parameters and return type
	// (x, y) -> x / y;
	int process(int x, int y);
}
