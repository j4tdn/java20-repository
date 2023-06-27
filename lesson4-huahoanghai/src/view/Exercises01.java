package view;

import bean.Student;

public class Exercises01 {
	public static void main(String[] args) {
		Student sv1 = new Student(1,"Hải",8.5f,9.3f);
		Student sv2 = new Student(2,"Vũ",9.4f,9.0f);
		Student sv3 = new Student();
		sv3.setId(3);
		sv3.setName("Tài");
		sv3.setPoinTheory(7.5f);
		sv3.setPoinPractice(7.3f);
		
		Student[] students = {sv1, sv2, sv3};
		System.out.println("Danh sách sinh viên có điểm trung bình lớn hơn 8.5:");
		findAbove(students);
		System.out.println("Danh sách sinh viên có điểm lý thuyết lớn hơn điểm thực hành:");
	    findHigher(students);
	
	}
	public static void findHigher(Student[] students) {
		for(Student student: students)
		{
			if(student.getPoinPractice() < student.getPoinTheory()) {
				System.out.println(student);
			}
		}
	}
	public static void findAbove(Student[] students){
		for(Student student: students) {
			if(student.average() > 8.5) {
				System.out.println(student);
			}
		}
	}

}
