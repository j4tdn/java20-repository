package c5.strategypattern;

// arbitrary interface name
@FunctionalInterface
public interface Strategy {
	// strategy method
	// arbitrary(tùy ý) abstract
	
	// important: list of parameters and return type
	// (x,y) -> x/y;
	int process(int x, int y);
	
}
