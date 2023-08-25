package view;

import java.util.Arrays;

import bean.Enum;
import bean.Student;
import bean.StudentCondition;
public class Ex01 {
	
	public static void main(String[] args) {
		Student[] listDefaultStudents = mockData();
		Student[] listStudentGetPointA = findListStudentOnCondition(listDefaultStudents, student -> {
			return student.getPoint().equals(Enum.A);
		});
		
		Student[] listStudentLearnAgain = findTheNumOfLearn(listDefaultStudents);
		Student[] listStudentLearnAgainCach2 = findTheNumOfLearnCach2(listDefaultStudents);
		
		System.out.println("List student get A --> " + Arrays.toString(listStudentGetPointA));
		System.out.println("List student learn again --> " + Arrays.toString(listStudentLearnAgain));
		System.out.println("List student learn again cach 2 --> " + Arrays.toString(listStudentLearnAgainCach2));
	}
	
	private static Student[] mockData() {
		return new Student[] {
				new Student(102, "Nam", Enum.C),
				new Student(103, "Bảo",Enum.F),
				new Student(104, "Hoàng", Enum.D),
				new Student(105, "Nguyên", Enum.B),
				new Student(107, "Vũ", Enum.F),
				new Student(109, "Lan", Enum.A),
				new Student(202, "Đạt", Enum.C),
				new Student(103, "Bảo", Enum.F),
				new Student(107, "Vũ", Enum.C),
				new Student(104, "Hoàng", Enum.B)
				
		};
	}
	
	private static Student[] findListStudentOnCondition(Student[] students, StudentCondition cdn) {
		Student[] result  = new Student[students.length];
		int running = 0;
		for(Student student : students) {
			if(cdn.checkPointStatus(student)) {
				result[running++] = student;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
	
	//Cách 1: Dùng 2 for lồng nhau
	private static Student[] findTheNumOfLearn(Student[] students) {
		boolean[] isVisitedStu = new boolean[1000];
		Student[] result = new Student[students.length]; 
		
		int running = 0;
		for(int i = 0 ; i < students.length;i++) {
			int id = students[i].getId();
			for(int j = i + 1; j < students.length;j++) {
				if(students[j].getId() == id && !isVisitedStu[students[i].getId()]) {
					isVisitedStu[students[i].getId()] = true;
					result[running++] = students[i];
				}
			}
		}
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
	//Cách 2: Dùng 1 for nhưng nếu mã số sinh viên lớn thì không thể dùng cách 2 này
	private static Student[] findTheNumOfLearnCach2(Student[] students) {
		boolean[] isVisitedStu = new boolean[1000];
		Student[] result = new Student[students.length];
		
		int[] count = new int[1000];
		int running = 0;
		for(Student student : students) {
			count[student.getId()]++;
			
			if(count[student.getId()] >= 2 && !isVisitedStu[student.getId()]) {
				result[running++] = student;
				isVisitedStu[student.getId()] = true;
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
