package view;

import java.lang.reflect.Array;
import java.util.Arrays;

import bean.Student;

public class Ex01 {
	public static void main(String[] args) {
		Student[] students = {
				new Student(102, "Nam", "C"),
				new Student(103, "Bảo", "F"),
				new Student(104, "Hoàng", "D"),
				new Student(105, "Nguyên", "B"),
				new Student(107, "Vũ","F"),
				new Student(109, "Lan", "A"),
				new Student(202, "Đạt", "C"),
				new Student(103, "Bảo", "F"),
				new Student(107, "Vũ", "C"),
				new Student(104, "Hoàng", "B")
		};
		
		Student[] StudentWithARated = getARatedStudent(students);
		for(Student s : StudentWithARated) {
			System.out.println(s.getName());
		}
		
		Student[] StudentWithFRated = getFRatedStudent(students);
		for(Student s : StudentWithFRated) {
			System.out.println(s.getName());
		}
	}
	
	private static Student[] getARatedStudent(Student[] students) {
		Student[] temp = new Student[students.length];
		int count = 0;
		for(Student s : students) {
			if(s.getRating().equals("A")) {
				temp[count++] = s;
			}
		}
		Student[] result = Arrays.copyOfRange(temp, 0, count);
		return result;
	}
	
	private static Student[] getFRatedStudent(Student[] students) {
		Student[] temp = new Student[students.length];
		int count = 0;
		for(Student s : students) {
			if(s.getRating().equals("F")) {
				temp[count++] = s;
			}
		}
		Student[] result = Arrays.copyOfRange(temp, 0, count);
		return result;
	}
}