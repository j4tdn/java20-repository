package exercises.exam;

import static exercises.exam.Score.*;

import java.util.Comparator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ex01StudentsSearch {
	public static void main(String[] args) {
		Student[] students = {
			new Student(102, "Nam", C),
			new Student(103, "Bảo", F),
			new Student(104, "Hoàng", D),
			new Student(105, "Nguyên", B),
			new Student(107, "Vũ", F),
			new Student(109, "Lan", A),
			new Student(202, "Đạt", C),
			new Student(103, "Bảo", F),
			new Student(107, "Vũ", C),
			new Student(104, "Hoàng", B)
		};
		
		System.out.println("Những sinh viên từng đạt loại A là: ");
		for (Student s : getStudentsA(students)) {
			System.out.println(s.toString());
		}
		
		System.out.println("\n\n");
		
		System.out.println("Những sinh viên đã tham gia học lại là: ");
		for(Student s : getStudentRetake(students)) {
			System.out.println(s.toString());
		}
	}
	
	private static Student[] getStudentsA(Student ... samplestudent) {
		List<Student> tempStudents = new ArrayList<>();
 		for(Student student : samplestudent) {
 			if(student.getScore() == Score.A) {
 				tempStudents.add(student);
 			}
 		}
 		
 		return tempStudents.toArray(new Student[0]);
	}
	
	private static Student[] getStudentRetake(Student ... samplestudent) {
		int[] IDs = new int[samplestudent.length];
		ArrayList<Integer> retakeIDs1 = new ArrayList<>();
		Integer[] retakeIDs;
		for(int i = 0; i < samplestudent.length; i++) {
			IDs[i] = samplestudent[i].getStudentID();
		}
		
		Arrays.sort(IDs);

		int t = 0;
		for(int i = 0; i < IDs.length - 1; i++) {
			if(IDs[i] == IDs[i+1]) {
				retakeIDs1.add(IDs[i]);
			}				
		}
		
		retakeIDs = retakeIDs1.toArray(new Integer[0]);
		
		ArrayList<Student> tempStudentsRe = new ArrayList<>();
		
 		for(Student s : samplestudent) {
 			if(tempStudentsRe.contains(s)) {
 				continue;
 			} else {
 				if(retakeIDs1.contains(s.getStudentID()))
 					tempStudentsRe.add(s);
 			}
 		}
 		
 		Student[] tempStudents = tempStudentsRe.toArray(new Student[0]);
 		Arrays.sort(tempStudents, Comparator.comparingInt(Student::getStudentID));
 		
 		return tempStudents;
	}
}
