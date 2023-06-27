package view;

import java.util.Scanner;

import bean.Ex01Student;

public class Ex01App {
	public static void main(String[] args) {
		//1.
		Ex01Student st1 = new Ex01Student(100, "Đỗ Nhật Huy", 9.8f, 8.7f);
		//2.
		Ex01Student st2 = new Ex01Student(100, "Đỗ Văn Huy", 5.5f, 7.3f);
		//3.
		Ex01Student st3 = new Ex01Student();
		System.out.println("Enter student 03: ");
		Scanner ip = new Scanner (System.in);
		System.out.print("Id: ");
		st3.setId(Integer.parseInt(ip.nextLine()));
		System.out.print("Name: ");
		st3.setName(ip.nextLine());
		System.out.print("Theory score: ");
		st3.setTheoryScore(Float.parseFloat(ip.nextLine()));
		System.out.print("Pratice score: ");
		st3.setPraticeScore(Float.parseFloat(ip.nextLine()));
		//4.
		Ex01Student[] students = {st1, st2, st3};
		System.out.println("Students have average > 8.5:");
		for (Ex01Student student : students) {
			if (student.averageScore() > 8.5f) {
				System.out.println(student.toString());
			}
		}
		//5.
		System.out.println("Students have theory score > pratice score:");
		for (Ex01Student student : students) {
			if (student.getTheoryScore() > student.getPraticeScore()) {
				System.out.println(student.toString());
			}
		}
		ip.close();
		
	}
}
