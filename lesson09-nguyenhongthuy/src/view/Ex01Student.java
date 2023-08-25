package view;

import bean.Rank;
import bean.Student;
import utils.StudentUtils;

/*
 * 	Trong năm 2021 có N sinh viên khoa CNTT đăng ký học phần cấu trúc dữ liệu. Thông
	tin mỗi sinh viên được lưu trữ tại hệ thống gồm: Mã sinh viên, Họ tên, Xếp loại
	Xếp loại học lực được lưu trong Enum với các giá trị: A, B, C, D, E, F
	Với sinh viên có học lực loại F bắt buộc phải đăng ký học lại.
	Student[] students
	{
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
	}
	 Tìm danh sách sinh viên từng đạt loại A trong năm 2021.
	 Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.
 */
public class Ex01Student {
	public static void main(String[] args) {
		Student[] students = { new Student(102, "Nam", Rank.C), 
				new Student(103, "Bảo", Rank.F),
				new Student(104, "Hoàng", Rank.D), 
				new Student(105, "Nguyên", Rank.B), 
				new Student(107, "Vũ", Rank.F),
				new Student(109, "Lan", Rank.A), 
				new Student(202, "Đạt", Rank.C), 
				new Student(103, "Bảo", Rank.F),
				new Student(107, "Vũ", Rank.C), 
				new Student(104, "Hoàng", Rank.B) };
		System.out.println("Danh sách sinh viên.");
		StudentUtils.printStudents(students);
		
		System.out.println("\n========================\n");
		
		System.out.println("Tìm danh sách sinh viên từng đạt loại A trong năm 2021.");
		StudentUtils.printStudents(StudentUtils.findStudents(students, Rank.A));
		
		System.out.println("\n========================\n");
		
		System.out.println("Tìm danh sách sinh viên đã tham gia học lại môn cấu trúc dữ liệu trong năm 2021.");
		StudentUtils.printStudents(StudentUtils.findStudentsRepeatingCourses(students));
	}
}
