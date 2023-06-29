package view;

import java.util.Iterator;
import java.util.Scanner;

import bean.Student;

public class Ex01StudentArray {
	public static void main(String[] args) {
		//1
		Student sv1 = new Student(1, "Trần Phương Nam", 9, 8);
		
		//2
		Student sv2 = new Student(2, "Nguyễn Trung Nghĩa", 8.25f, 9);
		
		//3
		Student sv3 = new Student();
		inputInfor(sv3);
		
		Student sinhViens[] = new Student[3];
		sinhViens[0] = sv1;
		sinhViens[1] = sv2;
		sinhViens[2] = sv3;
		
		//4
		System.out.println("\n***** Students have avarage point more than 8.5 *****");
		findStudentsHaveDiemTBGreaterThan8Point5(sinhViens);
		
		//5
		System.out.println("\n***** Students have theory point more than pratice point *****");
		findStudentsHaveDiemLTGreaterThanDiemTH(sinhViens);
		
	}
	
	private static void inputInfor(Student sv) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Nhập mã sinh viên: ");
		sv.setMaSV(Integer.parseInt(scanner.nextLine()));
		System.out.print("Nhập tên sinh viên: ");
		sv.setHoVaTen(scanner.nextLine());
		System.out.print("Nhập điểm lý thuyết: ");
		sv.setDiemLT(Float.parseFloat(scanner.nextLine()));
		System.out.print("Nhập điểm thực hành: ");
		sv.setDiemTH(Float.parseFloat(scanner.nextLine()));
	}
	
	private static void findStudentsHaveDiemTBGreaterThan8Point5(Student[] students) {
		for(Student student : students) {
			if(student.tinhDiemTB() > 8.5f) {
				System.out.println(student);
			}
		}
	}
	
	private static void findStudentsHaveDiemLTGreaterThanDiemTH(Student[] students) {
		for(Student student : students) {
			if(student.getDiemLT() > student.getDiemTH()) {
				System.out.println(student);
			}
		}
	}
}
