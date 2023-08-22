package c5.strategypattern;

@FunctionalInterface
public interface Strategy {
	// strategy method
	int process(int x, int y);
	
	default void test() {};
}
