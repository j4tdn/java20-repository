package ex01_student_management;

import java.util.ArrayList;

public class StudentsTest {
	public static void main(String[] args) {
		Students sv1 = new Students("IT100", "Chung", 7.0, 8.5);
		Students sv2 = new Students("EE104", "Duy", 9.0, 7.3);
		Students sv3 = new Students();
		
		sv3.setStudentID("EE105");
		sv3.setName("An");
		sv3.setTheoryMark(7.6);
		sv3.setPracticalMark(10);
		
		Students[] group = {sv1, sv2, sv3};
		findAvgMark(group);
		findTheoBigPrac(group);
		
	}
	
	public static void findAvgMark(Students[] group) {
		int i = 1;
		ArrayList<Students> groupA = new ArrayList<>();
		System.out.println("Những học sinh có điểm trung bình lớn hơn 8.5 là: ");
		for(Students student : group) {
			if(student.averageMark() > 8.5) 
				groupA.add(student);
		}
		
		if(groupA.isEmpty())
			System.out.println("Danh sách trống.");
		else
			for(Students student : groupA) {
				System.out.println(i + ") " + student.toString());
				System.out.println("Average score is: " + student.averageMark());
			}
		System.out.println("======================================================");
	}
	
	
	public static void findTheoBigPrac(Students[] group) {
		int i = 1;
		ArrayList<Students> groupA = new ArrayList<>();
		System.out.println("Những học sinh có điểm lý thuyết > thực hành là: ");
		for(Students student : group) {
			if(student.getTheoryMark() > student.getPracticalMark())
				groupA.add(student);
		}
		
		if(groupA.isEmpty())
			System.out.println("Danh sách trống.");
		else
			for(Students student : groupA) {
				System.out.println(i + ") " + student.toString());
			}
		System.out.println("======================================================");
	}
}
