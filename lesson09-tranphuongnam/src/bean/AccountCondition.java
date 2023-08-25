package bean;

@FunctionalInterface
public interface AccountCondition {
	boolean checkValid(String username, String password);
}
