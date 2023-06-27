package exercises1;

import java.util.Scanner;

public class AppStudents {
	public static void main(String[] args) {
		Students sv1 = new Students(1, "Trần Hùng", 7.0f, 8.5f);
		Students sv2 = new Students(2, "Nguyễn Văn Sơn", 9.2f, 9.0f);
		Students sv3 = new Students();
		Students[] listStudents = {sv1, sv2, sv3};
		Scanner ip = new Scanner(System.in);
		System.out.println("Enter ID: ");
		sv3.setId(ip.nextInt());
		ip.nextLine();
		System.out.println("Enter name: ");
		sv3.setName(ip.nextLine());
		System.out.println("Enter theoreticalscore: ");
		sv3.setTheoreticalscore(ip.nextFloat());
		System.out.println("Enter praticalscore: ");
		sv3.setPraticalscore(ip.nextFloat());
		
		StudentUtils.findAverageScore(listStudents);
		StudentUtils.theoreticalscoreThanPraticalscore(listStudents);
		StudentUtils.findAverageScoresss(listStudents);	
		
	}
}
