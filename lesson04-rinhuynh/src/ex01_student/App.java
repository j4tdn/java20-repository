package ex01_student;

import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		/*
		 * Xây dựng class chứa hàm main: tạo 3 đối tượng sinh viên sv1, sv2, sv3, trong
		 * đó: 1. sv1 chứa thông tin của chính mình (tạo bằng constructor đủ thông số).
		 * 2. sv2 là thông tin người bạn thân nhất của em (tạo bằng constructor đủ thông
		 * số).
		 * 
		 * 3. sv3 tạo bằng constructor mặc định. Tạo hàm nhập các thông tin cho sv3 từ
		 * bàn phím sau đó dùng setter để gán các thuộc tính tương ứng. ---- Đưa danh
		 * sách 3 sinh viên sv1, sv2, sv3 vào mảng một chiều ---- 4. Viết hàm tìm thông
		 * tin sinh viên có điểm trung bình lớn hơn 8.5 5. Viết hàm tìm thông tin sinh
		 * viên có điểm lý thuyết lớn hơn điểm thực hành
		 */

		Student st1 = new Student(1, "Rin", 8, 7);
		Student st2 = new Student(2, "Hai", 9, 9);

		Student st3 = new Student();
		input(st3);

		Student[] students = { st1, st2, st3 };

//		for (var student : students ) {
//			System.out.println(student);
//		}

		findStudent(students);
		findStudent2(students);

	}

	static void input(Student s) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Nhập id : ");
		s.setId(sc.nextInt());
		sc.nextLine();

		System.out.print("Nhập name : ");
		s.setName(sc.nextLine());

		System.out.print("Nhập điểm lý thuyết : ");
		s.setTheoreticalScores(sc.nextFloat());

		System.out.print("Nhập điểm thực hành : ");
		s.setPracticeScores(sc.nextFloat());

	}

	static void findStudent(Student[] students) {
		System.out.println("Sinh viên có điểm trung bình lớn hơn 8.5 ");
		for (var student : students) {
			if (student.getAverageScore() > 8.5) {
				System.out.println(student);
			}
		}

	}

	static void findStudent2(Student[] students) {
		System.out.println("Sinh viên có điểm lý thuyết lớn hơn thực hành ");
		for (var student : students) {
			if (student.getPracticeScores() < student.getTheoreticalScores()) {
				System.out.println(student);
			}
		}
	}

}
