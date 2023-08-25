package utils;

import java.util.Arrays;

import bean.Rank;
import bean.Student;

public class StudentUtils {
	private StudentUtils() {
		
	}
	//Hiển thì danh sách sinh viên
	public static void printStudents(Student[] students) {
		for(Student student:students) {
			System.out.println(student.toString());
		}
	}
	//Đếm mã sinh viên có trong danh sách 
	private static int countStudent(Student[] students, int id) {
		int count = 0;
		for(Student student : students) {
			if(student.getId() == id) {
				count++;
			}
		}
		return count;
	}
	
	//Tìm danh sách sinh viên từng đạt loại được chỉ định
	public static Student[] findStudents(Student[] students, Rank rank) {
		Student[] result = new Student[students.length];
		int running = 0;
		for(int i = 0; i < students.length; i++) {
			if(students[i].getRank() == rank) {
				result[running++] = students[i];
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	//Tìm danh sách sinh viên đã tham gia học lại
	public static Student[] findStudentsRepeatingCourses(Student[] students) {
		Student[] studentWithRankF = findStudents(students, Rank.F);
		Student[] result = new Student[studentWithRankF.length];
		
		int running = 0;
		for(Student student : studentWithRankF) {
			if(countStudent(students, student.getId()) > 1) {
				result[running++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
