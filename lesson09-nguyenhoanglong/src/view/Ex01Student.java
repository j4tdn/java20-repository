package view;

import bean.RankedAcademic;
import bean.Student;

public class Ex01Student {
	public static void main(String[] args) {
		Student[] students = {
				new Student(102, "Nam", RankedAcademic.C),
				new Student(103, "Bảo", RankedAcademic.F),
				new Student(104, "Hoàng", RankedAcademic.D),
				new Student(105, "Nguyên", RankedAcademic.B),
				new Student(107, "Vũ", RankedAcademic.F),
				new Student(109, "Lan", RankedAcademic.A),
				new Student(202, "Đạt", RankedAcademic.C),
				new Student(103, "Bảo", RankedAcademic.F),
				new Student(107, "Vũ", RankedAcademic.C),
				new Student(104, "Hoàng", RankedAcademic.B)};
		
		listStudentRateA(students);
		studentsStudyAgain(students);
		
	}
	
	private static void listStudentRateA(Student[] students) {
		for (Student student : students) {
			if (student.getrAcademic() == RankedAcademic.A) {
				System.out.println("The list of students who have achieved grade A in 2021: " + student);
			}		
		}
	}
	
	private static void studentsStudyAgain(Student[] students) {
		for (Student student : students) {
			if (student.getrAcademic() == RankedAcademic.F) {
				System.out.println("The list of students who have retaken the data structure course in 2021: " + student);
			}
		}
	}
	
}
