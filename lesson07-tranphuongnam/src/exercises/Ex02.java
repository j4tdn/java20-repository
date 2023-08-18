package exercises;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			try {
				System.out.print("Nhập ngày: ");
				int day = Integer.parseInt(sc.nextLine());
				System.out.print("Nhập tháng: ");
				int month = Integer.parseInt(sc.nextLine());
				System.out.print("Nhập năm: ");
				int year = Integer.parseInt(sc.nextLine());
				
				String dateString = day + "/" + month + "/" + year;
				LocalDate ldate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern("d/M/yyyy"));
				System.out.println(ldate.getDayOfMonth() 
						+ " " + ldate.getMonth() + " "
						+ ldate.getYear() + " is a " + ldate.getDayOfWeek());
				
				System.out.println("Additional fact");
				System.out.println("It is day number " + ldate.getDayOfYear() + " days of the year, "
									  + (ldate.lengthOfYear() - ldate.getDayOfYear()) + " days left");
				
				//Tìm tổng số thứ trong năm và ngày hiện tại thuộc số thứ mấy của thứ trong năm
				int countDayOfWeekInYear = 0;
				int currentDayOfWeekInYear = 0;
				for(int i = 1; i < ldate.lengthOfYear();i++) {
					LocalDate ldateTemp = LocalDate.ofYearDay(year, i);
					if(ldateTemp.getDayOfWeek() == ldate.getDayOfWeek()) {
						countDayOfWeekInYear++;
						if(ldateTemp.equals(ldate)) {
							currentDayOfWeekInYear = countDayOfWeekInYear;
						}
					}
				}
				
				//Tìm tổng số thứ trong tháng và ngày hiện tại thuộc số thứ mấy của thứ trong năm
				int countDayOfWeekInMonth = 0;
				int currentDayOfWeekInMonth = 0;
				for(int i = 1; i < ldate.lengthOfMonth();i++) {
					LocalDate ldateTemp = LocalDate.of(year, ldate.getMonth(), i);
					if(ldateTemp.getDayOfWeek() == ldate.getDayOfWeek()) {
						countDayOfWeekInMonth++;
						if(ldateTemp.equals(ldate)) {
							currentDayOfWeekInMonth = countDayOfWeekInMonth;
						}
					}
				}
				System.out.println("It is " + ldate.getDayOfWeek() + " number " + currentDayOfWeekInYear + " out of " + countDayOfWeekInYear + " in " + year);
				System.out.println("It is " + ldate.getDayOfWeek() + " number " + currentDayOfWeekInMonth + " out of " + countDayOfWeekInMonth + " in " + ldate.getMonth());
				System.out.println("Year " + ldate.getYear() + " has " + ldate.lengthOfYear() + " days");
				System.out.println(ldate.getMonth() + " " +  ldate.getYear() + " has " + ldate.lengthOfMonth() + " days");
				break;
			} catch (NumberFormatException e) {
				e.printStackTrace();
			}
		}
	}
	
}
