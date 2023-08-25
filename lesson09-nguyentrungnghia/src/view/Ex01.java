package view;

import java.util.Arrays;

import bean.Student;
import bean.Ranking;

public class Ex01 {
	
	public static void main(String[] args) {
		Student[] students = mockData();
		
		Student[] studentsByRank = findStudents(students, Ranking.A);
		System.out.println(Arrays.toString(studentsByRank));
		
		System.out.println("==========================================");
		
		Student[] reLearnStudents = getStudentsLearningAgain(students);
		System.out.println(Arrays.toString(reLearnStudents));
	}
	
	private static Student[] mockData() {
		return new Student[] {
				new Student(102, "Nam",    Ranking.C),
				new Student(103, "Bảo",    Ranking.F),
				new Student(104, "Hoàng",  Ranking.D),
				new Student(105, "Nguyên", Ranking.B),
				new Student(107, "Vũ",     Ranking.F),
				new Student(109, "Lan",    Ranking.A),
				new Student(202, "Đạt",    Ranking.C),
				new Student(103, "Bảo",    Ranking.F),
				new Student(107, "Vũ",     Ranking.C),
				new Student(104, "Hoàng",  Ranking.B)
		};
	}
	
	// Tìm danh sách sinh viên từng đạt loại A trong năm 2021
	private static Student[] findStudents(Student[] students, Ranking ranking) {
		Student[] result = new Student[students.length];
		
		int running = 0;
		
		for (Student student : students) 
			if (student.getRanking() == ranking) 
				result[running++] = student;
		
		return Arrays.copyOfRange(result, 0, running);
	}

	// Tìm danh sách sinh viên học lại trong năm 2021
	private static Student[] getStudentsLearningAgain(Student[] students) {
		Student[] result = new Student[students.length];
		boolean[] flags = new boolean[students.length];
		
		for (int i = 0; i < flags.length - 1; i++) 
			if (!flags[i]) 
				for (int j = i + 1; j < flags.length; j++) 
					if (students[i].equals(students[j])) {
						flags[i] = true;
						flags[j] = true;
					}
		
		int running = 0;
		for (int i = 0; i < students.length; i++) 
			if (flags[i] && !contains(result, running, students[i])) 
				result[running++] = students[i];
		
		return Arrays.copyOfRange(result, 0, running);
	}
	
	private static boolean contains(Student[] result, int running, Student student) {
		for (int i = 0; i < running; i++) 
			if (student.equals(result[i]))
				return true;
		return false;
	}

}
