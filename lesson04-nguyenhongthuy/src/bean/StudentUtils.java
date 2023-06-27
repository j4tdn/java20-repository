package bean;

import java.util.Scanner;

public class StudentUtils {
	//Tính điểm trung bình 1 sin viên
	public static float calAverageScore(Student student) {
		return (student.getTheoryScores() + student.getPracticesScores())/2;
	}
	
	//Nhập thông tin một sinh viên
	public static Student inputStudent() {
		Scanner sc = new Scanner(System.in);
		Student std = new Student();
		try {
			System.out.print("Enter id: ");
			std.setId(Integer.parseInt(sc.nextLine()));
			System.out.print("Enter fullname: ");
			std.setFullName(sc.nextLine());
			System.out.print("Enter theory scores : ");
			std.setTheoryScores(Float.parseFloat(sc.nextLine()));
			System.out.print("Enter practice scores : ");
			std.setPracticesScores(Float.parseFloat(sc.nextLine()));
		}catch (Exception e) {
			
		}
		sc.close();
		return std;
	}
	
	//Hiển thị thông tin 1 sinh viên
	public static void outputStudent(Student student) {
		System.out.printf("%-10d|%-20s|%-15.2f|%-15.2f|%-15.2f\n", student.getId(), student.getFullName(), student.getTheoryScores(), student.getPracticesScores(), calAverageScore(student));
	}
	
	//Hiển thị danh sách sinh viên truyền vào
	public static void outputStudents(Student...students) {
		System.out.printf("%-10s|%-20s|%-15s|%-15s|%-15s\n", "id", "fullname", "theory score", "practice score", "avarega score");
		for(Student student : students)
			outputStudent(student);
	}
	
	//Hiển thị danh sách sinh viên trên một ngưỡng điểm cụ thể
	public static void findAverageScoreAboveThreshold(float threshold, Student...students) {
		System.out.printf("%-10s|%-20s|%-15s|%-15s|%-15s\n", "id", "fullname", "theory score", "practice score", "avarega score");
		for(Student student : students) {
			if(calAverageScore(student) > threshold)
				outputStudent(student);
		}
	}
	
	//Hiển thị danh sách sinh viên có điểm LT cao hơn TH
	public static void printInforTheoryScoreHigherThanPracticeScore(Student...students) {
		System.out.printf("%-10s|%-20s|%-15s|%-15s|%-15s\n", "id", "fullname", "theory score", "practice score", "avarega score");
		for(Student student : students) {
			if(student.getTheoryScores() > student.getPracticesScores())
				outputStudent(student);
		}
	}
}
