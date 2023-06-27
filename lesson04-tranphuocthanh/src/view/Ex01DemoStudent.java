package view;

import java.util.Arrays;
import java.util.Scanner;

import bean.Student;

public class Ex01DemoStudent {
	static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		Student s1 = new Student(1, "Trần Phước Thành", 9.2f, 9f);
		Student s2 = new Student(2, "My Bestfried", 9f, 9.5f);
		Student s3 = new Student();
		
		getInfor(s3);
		Student[] students = {s1, s2, s3};
		
		Student[] result1 = findStudentByAverageScore(students);
		for (Student each: result1) {
			System.out.println(each);
		}
		
		System.out.println("\n===========\n");
		
		Student[] result2 = findStudentWithTheoryGreaterThanPracticalScore(students);
		for (Student each: result2) {
			System.out.println(each);
		}
	}
	
	private static void getInfor(Student student) {
		System.out.print("nhập id: " );
		student.setId(Integer.parseInt(ip.nextLine()));
		System.out.print("nhập tên: ");
		student.setName(ip.nextLine());
		System.out.print("nhập điểm lý thuyết: ");
		student.setTheoryScore(ip.nextFloat());
		System.out.print("nhập điểm thực hành: ");
		student.setPracticalScore(ip.nextFloat());
	}
	
	private static Student[] findStudentByAverageScore(Student[] students) {
		Student[] storage = new Student[students.length];
		int count = 0;
		for (Student student: students) {
			if (student.calAverage() > 8.5) {
				storage[count++] = student;
			}
		}
		return Arrays.copyOfRange(storage, 0, count);
	}
	
	private static Student[] findStudentWithTheoryGreaterThanPracticalScore(Student[] students) {
		Student[] storage = new Student[students.length];
		int count = 0;
		for (Student student: students) {
			if (student.getTheoryScore() > student.getPracticalScore()) {
				storage[count++] = student;
			}
		}
		return Arrays.copyOfRange(storage, 0, count);
	}
}
