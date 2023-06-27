package c5.strategypattern;

@FunctionalInterface
//any name 
public interface Strategy {
	//any abstract name method
	// important: list of parameters and return type
	int process(int a, int b);
}
