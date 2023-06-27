package management.ex01student;

import java.util.Scanner;

public class Ex01Demo {
	public static void main(String[] args) {
		Student sv1 = new Student(1, "Tran Thi Hong Loan", 8.5d, 7.0d);
		Student sv2 = new Student(2, "Ngo Ha Binh", 7.5d, 10.0d);
		Student sv3 = new Student();
		enterInfo(sv3);
		
		Student[] dsStu = {sv1, sv2, sv3};
		System.out.println("\nThông tin sinh viên có ĐTB lớn hơn 8.5:");
		searchPoint(dsStu);
		System.out.println("\nThông tin sinh viên có ĐLT lớn hơn ĐTH:");
		comparePoint(dsStu);
	}
	
	public static void searchPoint(Student[] students) {
		for (Student student : students) {
			if(student.calAverage() >= 8.5d) {
				System.out.println(student.toString()); 
			}
		}
	}
	
	public static void comparePoint(Student[] students) {
		for (Student student : students) {
			if(student.getThPoint() > student.getPrPoint()) {
				System.out.println(student.toString()); 
			}
		}
	}
	
	public static void enterInfo(Student sv) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        sv.setId(sc.nextInt());
        sc.nextLine();
        System.out.print("Nhập tên sinh viên: ");
        sv.setName(sc.nextLine());
        System.out.print("Nhập điểm lý thuyết: ");
        sv.setThPoint(sc.nextDouble()); 
        System.out.print("Nhập điểm thực hành: ");
        sv.setPrPoint(sc.nextDouble());

        sc.close();
	}
}
