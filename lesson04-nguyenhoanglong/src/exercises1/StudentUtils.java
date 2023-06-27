package exercises1;

import exercises4.Person;

public class StudentUtils {
	public static void findAverageScore(Students[] listStudents ) {
		for (Students students : listStudents) {
			if (students.averageScore() > 8.5) {
				System.out.println("Students with GPA greater than 8.5: " + students);
			}
		}
	}
	
	public static void theoreticalscoreThanPraticalscore(Students[] listStudents) {
		for (Students students : listStudents) {
			if (students.getTheoreticalscore() > students.getPraticalscore()) {
				System.out.println("Students have theoretical scores than practical scores: " + students);
			}
		}
	}
	
	public static void findAverageScoresss(Students[] listStudents ) {
		for (Students students : listStudents) {
			System.out.println("Nhân sự: " + students);
		}
	}
}
