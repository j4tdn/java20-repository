package view;

import java.util.Arrays;

import bean.Grade;
import bean.Student;

public class Ex01StudentGradeManagerment {
	public static void main(String[] args) {
		Student[] students = { 
				new Student(102, "Nam", Grade.C), 
				new Student(103, "Bảo", Grade.F),
				new Student(104, "Hoàng", Grade.D), 
				new Student(105, "Nguyên", Grade.B),
				new Student(107, "Vũ", Grade.F), 
				new Student(109, "Lan", Grade.A), 
				new Student(202, "Đạt", Grade.C),
				new Student(103, "Bảo", Grade.F), 
				new Student(107, "Vũ", Grade.C),
				new Student(104, "Hoàng", Grade.B),
			};
		
		System.out.println("Danh sách sinh viên:");
		printStudents(students);
		
		System.out.println("\nDanh sách sinh viên từng đạt loại A:");
		printStudents(getStudents(students, Grade.A));
		
		System.out.println("\nDanh sách sinh viên đã tham gia học lại môn CTDL:");
		printStudents(getStudents(students));
	}
	
	private static void printStudents(Student... students) {
		for (Student student : students) {
			System.out.println(student);
		}
	}

	private static Student[] getStudents(Student[] students, Grade grade) {
		Student[] stdAs = new Student[students.length];
		int count = 0;

		for (Student student : students) {
			if (student.getGrade().equals(grade)) {
				stdAs[count++] = student;
			}
		}

		return Arrays.copyOfRange(stdAs, 0, count);
	}

	private static Student[] getStudents(Student[] students) {
		Student[] stdRelearn = new Student[students.length];
		int count = 0;

		for (int i = 0; i < students.length; i++) {
			int countId = 0;
			for (int j = i; j < students.length; j++) {
				if (students[i].getId() == students[j].getId()) {
					countId++;
				}
			}
			
			if (countId > 1) {
				stdRelearn[count++] = students[i];
			}
		}

		return Arrays.copyOfRange(stdRelearn, 0, count);
	}
}
