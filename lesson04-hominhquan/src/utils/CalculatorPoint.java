package utils;

import bean.Student;

public class CalculatorPoint {
	private CalculatorPoint() {
	}
	
	public static boolean isCompare(Student std) {
		return std.getPointTheoretica() > std.getPointPractice() ? true : false;
	}
	
}
