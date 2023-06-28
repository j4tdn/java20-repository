package view;

import java.util.Scanner;

import bean.Student;
import utils.CalculatorPoint;

public class Ex01PointStudent {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);
		Student sv1 = new Student(1, "Quan", 8.5f, 9.0f);
		Student sv2 = new Student(2, "Minh", 7.5f, 6.0f);
		
		
		Student sv3 = new Student();
		System.out.print("MaSv sv3 la: ");
		sv3.setMaSv(Integer.parseInt(ip.nextLine()));
		System.out.print("name sv3 la: ");
		sv3.setName(ip.nextLine());
		System.out.print("diem Ly Thuyet sv3 la: ");
		sv3.setPointTheoretica(ip.nextFloat());
		System.out.print("Diem Thuc Hanh sv3 la: ");
		sv3.setPointPractice(ip.nextFloat());
		
		
		Student[] svs = {sv1, sv2, sv3};
		
		System.out.println("sv co Diem TB lon hon 8.5 la: ");
		for(Student sv: svs) {
			if(Student.mediumScore(sv) > 8.5) {
				System.out.println(sv);
			}
		}
		
		System.out.println("Sv co Diem Ly Thuyet lon hon Thuc Hanh la: ");
		for(Student sV:svs) {
			if(CalculatorPoint.isCompare(sV)) {
				System.out.println(sV);
			}
		}
		
		ip.close();
	}
	
	
}	
