package ex01studentmanagement;

import java.util.Scanner;

public class Ex01StudentsManagement {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Ngô Nhật Nguyên", 7.5f, 8.2f);
		Student sv2 = new Student(2, "Nguyễn Hồng Thúy", 8.8f, 9.3f);
		
		Student sv3 = new Student();
		// Nhập thông tin của sv3
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập mã sinh viên: ");
		sv3.setId(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhập tên sinh viên: ");
		sv3.setName(sc.nextLine());
		System.out.print("Nhập điểm LT: ");
		sv3.setLtGrade(Float.parseFloat(sc.nextLine()));
		System.out.print("Nhập điểm TH: ");
		sv3.setThGrade(Float.parseFloat(sc.nextLine()));
		
		Student[] students = {sv1, sv2, sv3};
		getStudentsGPAAbove85(students);
		getStudentsLTGradeAboveTHGrade(students);
	}
	
	private static void getStudentsGPAAbove85(Student[] students) {
		System.out.println("Thông tin sinh viên có điểm trung bình lớn hơn 8.5:");
		for (Student student : students) {
			if (student.calAverage() > 8.5) {
				System.out.println("-->" + student);
			}
		}
	}
	
	private static void getStudentsLTGradeAboveTHGrade(Student[] students) {
		System.out.println("Thông tin sinh viên có điểm LT lớn hơn điểm TH:");
		for (Student student : students) {
			if (student.getLtGrade() > student.getThGrade()) {
				System.out.println("-->" + student);
			}
		}
	}
}
