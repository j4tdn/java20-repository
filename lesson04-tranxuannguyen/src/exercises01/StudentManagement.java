package exercises01;

import java.util.Scanner;

public class StudentManagement {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Student sv1 = new Student(1,"Trần Xuân Nguyên",9.0f,8.0f);
		Student sv2 = new Student(1,"Phạm Khánh Minh",8.5f,9.0f);
		Student sv3 = new Student();
		getStudentInfor(sv3);
		
		Student[] students = {sv1, sv2, sv3};
		System.out.println("Sinh viên có điểm trung bình lớn hơn 8.5: ");
		findMediumScore(students);
		
		System.out.println("Sinh viên có điểm lý thuyết lớn hơn điểm thực hành: ");
		comparePoint(students);
	}
	
	private static void getStudentInfor (Student student) {
		System.out.print("Nhập id: " );
		student.setId(Integer.parseInt(sc.nextLine()));
		System.out.print("Nhập họ và tên: ");
		student.setFullName(sc.nextLine());
		System.out.print("Nhập điểm lý thuyết: ");
		student.setTheoreticalPoint(sc.nextFloat());
		System.out.print("Nhập điểm thực hành: ");
		student.setPracticePoint(sc.nextFloat());		
	}
	
	private static void findMediumScore(Student[] students) {
		for(Student student: students) {
			if(student.calMediumScore() > 8.5) {
				System.out.println(student);
			}
		}
	}
	private static void comparePoint(Student[] students) {
		for(Student student: students)
		{
			if(student.getPracticePoint() < student.getTheoreticalPoint()) {
				System.out.println(student);
			}
		}
	}
}
