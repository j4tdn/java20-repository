package bean;

@FunctionalInterface
public interface StudentCondition {
	boolean checkPointStatus(Student student);
}
