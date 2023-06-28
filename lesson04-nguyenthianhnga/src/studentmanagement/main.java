package studentmanagement;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
		Student st1 =new Student(1, "Chế Gia Tịnh", 8.5, 9);
		Student st2 =new Student(1, "Châu Mẫn Nhi", 6.5, 5);
		Student st3 = new Student();
		Scanner ip = new Scanner(System.in);
		System.out.println("\t\t|ENTER INFORMATION|");
		System.out.print("\nEnter ID: ");
		st3.setId(ip.nextInt());
		ip.nextLine();
		System.out.print("\nEnter fullname: ");
		st3.setFullName(ip.nextLine());
		System.out.print("\nEnter theory grade: ");
		st3.setTheoryGrade(ip.nextDouble());
		System.out.print("\nEnter practice grade: ");
		st3.setPracticeGrade(ip.nextDouble());
		
		Student[] students = {st1,st2,st3};
		
		System.out.println("\nStudents with average grade greater than 8.5: ");
		for(Student student:students)
		{
			if(student.tinhDiemTrungBinh()>8.5)
			{
				System.out.println("\t"+student);
			}
		}
		
		System.out.println("\nStudents with theory grade greater than practice grade:");
		for(Student student:students)
		{
			if(student.getTheoryGrade()>student.getPracticeGrade())
			{
				System.out.println("\t"+student);
			}
		}
		
	}
}
