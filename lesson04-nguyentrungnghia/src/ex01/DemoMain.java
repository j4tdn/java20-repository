package ex01;

import java.util.Scanner;

public class DemoMain {

	public static void main(String[] args) {
		
		Student s1 = new Student(1, "Nguyễn Trung Nghĩa", 8.5f, 9);
		
		Student s2 = new Student(2, "Lê A", 8, 9.2f);
		
		Student s3 = new Student();
		enterInfo(s3);
		
		System.out.println("\n===================\n");
		
		Student[] students = {s1, s2, s3};
		
		System.out.println("Sinh viên có điểm trung bình lớn hơn 8.5:");
		findStudentsGood(students);
		
		System.out.println("\n===================\n");
		
		System.out.println("Sinh viên có điểm lý thuyết lớn hơn điểm thực hành:");
		theoryGreaterThanPractice(students);
		
	}

	// Hàm nhập thông tin SV
	static void enterInfo(Student s) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Nhập mã SV: ");
		int id = Integer.parseInt(ip.nextLine());
		s.setId(id);

		System.out.print("Nhập họ tên: ");
		String name = ip.nextLine();
		s.setName(name);

		System.out.print("Nhập điểm lý thuyết: ");
		float theoreticalGrade = Float.parseFloat(ip.nextLine());
		s.setTheoreticalGrade(theoreticalGrade);

		System.out.print("Nhập điểm thực hành: ");
		float practicalGrade = Float.parseFloat(ip.nextLine());
		s.setPracticalGrade(practicalGrade);

		ip.close();
	}

	// Hàm tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
	static void findStudentsGood(Student[] students) {
		boolean check = false;
		
		for (Student student : students) 
			if (student.getAverageGrade() > 8.5) {
				System.out.println("\t" + student);
				check = true;
			}
		
		if (!check)
			System.out.println("\tKhông có sinh viên nào!");
	}
	
	// Hàm tìm thông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành
	static void theoryGreaterThanPractice(Student[] students) {
		boolean check = false;
		
		for (Student student : students) 
			if (student.getTheoreticalGrade() > student.getPracticalGrade()) {
				System.out.println("\t" + student);
				check = true;
			}
			
		if (!check)
			System.out.println("\tKhông có sinh viên nào!");
	}
	
}
