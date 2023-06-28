package c5.strategypattern;
@FunctionalInterface
public interface Strategy {
	
	int process(int x, int y);
	
}
