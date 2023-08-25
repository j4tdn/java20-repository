package view;

import bean.Ranking;
import bean.Student;

public class Exercises01 {
	
	public static void main(String[] args) {
		
		Student[] students = getStudents();
		
		
		findStudentsA(students);
		
		findStudentsF(students);
	}
	
	private static Student[] getStudents() {
        return new Student[] {
        		new Student(102, "Nam", Ranking.C),
        		new Student(103, "Bảo", Ranking.F),
        		new Student(104, "Hoàng", Ranking.D),
        		new Student(105, "Nguyên", Ranking.B),
        		new Student(107, "Vũ", Ranking.F),
        		new Student(109, "Lan", Ranking.A),
        		new Student(202, "Đạt", Ranking.C),
        		new Student(103, "Bảo", Ranking.F),
        		new Student(107, "Vũ", Ranking.C),
        		new Student(104, "Hoàng", Ranking.B)
        		};
    }
	
	private static void findStudentsA(Student[] students) {
	    System.out.println("Students with Ranking A: ");
	    
	    for (int i = 0; i < students.length; i++) {
	        boolean isDuplicate = false;
	        
	        for (int j = 0; j < i; j++) {
	            if (students[i].getId() == students[j].getId()) {
	                isDuplicate = true;
	                break;
	            }
	        }
	        
	        if (!isDuplicate && students[i].getRank() == Ranking.A) {
	            System.out.println(students[i].toString());
	        }
	    }
	}

	
	private static void findStudentsF(Student[] students) {
		System.out.println("Students with Ranking F: ");
		for (int i = 0; i < students.length; i++) {
	        boolean isDuplicate = false;
	        
	        for (int j = 0; j < i; j++) {
	            if (students[i].getId() == students[j].getId()) {
	                isDuplicate = true;
	                break;
	            }
	        }
	        
	        if (!isDuplicate && students[i].getRank() == Ranking.F) {
	            System.out.println(students[i].toString());
	        }
	    }
	}
}
