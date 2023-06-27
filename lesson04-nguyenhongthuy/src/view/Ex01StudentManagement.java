package view;

import bean.Student;
import bean.StudentUtils;

public class Ex01StudentManagement {
	public static void main(String[] args) {
		//1. sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số)
		Student sv1 = new Student(1, "Nguyen Hong Thuy", 8.8f, 9);
		
		//2. sv2 chứa thông tin của chính mình (tạo bằng constructor đủ thông số)
		Student sv2 = new Student(2, "Do Bich Tram", 6, 10);
		
		//3. sv3 tạo bằng constructor mặc định. Tạo hàm nhập các thông tin cho sv3 từ bàn phím sau đó dùng setter để gán các thuộc tính tương ứng
		Student sv3;
		sv3 = StudentUtils.inputStudent();
		
		//Đưa danh sách sv1, sv2, sv3 vào mảng một chiều
		Student[] students = {sv1, sv2, sv3};
		
		System.out.println("\n=============================================\n");
		//In danh sách sinh viên
		System.out.println("List of all students: ");
		StudentUtils.outputStudents(students);
		
		System.out.println("\n=============================================\n");
		//4. Tìm thông tin sinh viên có điểm TB lớn hơn 8.5
		System.out.println("List of students with an average score above 8.5: ");
		StudentUtils.findAverageScoreAboveThreshold(8.5f, students);
		
		System.out.println("\n=============================================\n");
		//5. Tìm thông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành
		System.out.println("List of students whose theory scores are higher than their practice scores: ");
		StudentUtils.printInforTheoryScoreHigherThanPracticeScore(students);
	}
}
