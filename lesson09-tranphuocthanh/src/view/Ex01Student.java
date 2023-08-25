package view;

import java.util.Arrays;

import bean.DataModel;
import bean.Rank;
import bean.Student;

public class Ex01Student {

	public static void main(String[] args) {
		Student[] students = DataModel.getStudents();
		
		// System.out.println(Arrays.toString(getStudentWithAGrade(students, Rank.A)));

		Student[] getStudentStudyAgain = getStudentStudyAgain(students);
		for (Student student: getStudentStudyAgain) {
			System.out.println(student);
		}
	}

	private static Student[] getStudentWithAGrade(Student[] students, Rank rank) {
		Student[] result = new Student[students.length];
		int running = 0;
		
		for (Student student: students) {
			if (student.getRank().equals(rank)) {
				result[running++] = student;
			}
		}
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static Student[] getStudentStudyAgain(Student[] students) {
		Student[] result = new Student[students.length];
		int running = 0;
		
		boolean[] flags = new boolean[students.length];
		
		for (int i = 0; i < students.length; i++) {
			if (!flags[i]) {
				isDuplicated(students, i, flags);
				if (flags[i]) {
					result[running++] = students[i];
				}
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static void isDuplicated(Student[] students, int checkPos, boolean[] flags) {
		for (int i = 0; i < students.length; i++) {
			if (checkPos != i && !flags[i] && students[i].equals(students[checkPos])) {
				flags[i] = true;
				flags[checkPos] = true;
			}
		}
	}
}
