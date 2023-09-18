package pattern.strategy;

@FunctionalInterface
public interface Condition {
	boolean test(int number);
}
