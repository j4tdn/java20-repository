package view;

import java.util.Arrays;

import bean.Student;
import common.Classification;

public class Ex01StudentDemo {
	public static void main(String[] args) {
		Student[] students = getData();
		System.out.println("danh sach SV dat loai Gioi: ");
		Student[] studentsGood = findStudentGood(students);
		System.out.println(Arrays.toString(studentsGood));
		System.out.println();
		System.out.println("danh sach SV hoc lai mon: ");
		Student[] checkStudents = checkStudent(students);
		System.out.println(Arrays.toString(checkStudents));
		
	}
	
	private static Student[] getData() {
		return new Student[] { 
				new Student(102, "Nam", Classification.C),
				new Student(103, "Bảo", Classification.F),
				new Student(104, "Hoàng", Classification.D),
				new Student(105, "Nguyên", Classification.B),
				new Student(107, "Vũ", Classification.F),
				new Student(109, "Lan", Classification.A),
				new Student(202, "Đạt", Classification.C),
				new Student(103, "Bảo", Classification.F),
				new Student(107, "Vũ", Classification.C),
				new Student(104, "Hoàng", Classification.B)
		};
	}
	
	private static Student[] findStudentGood(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;
		for(Student student: students) {
			if(student.getClassification() == Classification.A) {
				result[count++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	private static Student[] checkStudent(Student[] students) {
		Student[] result = new Student[students.length];
		int count = 0;

		boolean[] flags = new boolean[students.length];
		for (int i = 0; i < students.length; i++) {
			if (!flags[i]) {
				processIfOverlap(i, students, flags);
				if (!flags[i]) {
					continue;
				}
				else {
					result[count++] = students[i];
				}
			}

		}
		return Arrays.copyOf(result, count);
	}

	private static void processIfOverlap(int checkpos, Student[] students, boolean[] flags) {
		for (int i = 0; i < students.length; i++) {
			if (!flags[i] && i != checkpos && students[checkpos].getId() == students[i].getId()) {
				flags[checkpos] = true;	
			}
		}
	}
	

}
