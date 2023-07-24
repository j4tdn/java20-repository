package common;
@FunctionalInterface
public interface PasswordCondition {
	boolean test(char c);
}
