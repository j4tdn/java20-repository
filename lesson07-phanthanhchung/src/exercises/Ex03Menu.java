package exercises;

import java.text.SimpleDateFormat;

/*
  1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
  2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
  3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
  4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
  5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
  6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.*/

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Scanner;

public class Ex03Menu {
	private static Scanner sc = new Scanner(System.in);
	private static Calendar c = Calendar.getInstance();
	
	public static void main(String[] args) {
		menu();
		int choice = Integer.parseInt(sc.nextLine());
		switch(choice) {
			case 1: 
				System.out.println("Please enter a ZoneID: ");
				String zoneId = sc.nextLine();
				showCurrentTime(ZoneId.of(zoneId));
				break;
			case 2:
				lastDayOfMonth();
				break;
			case 3: 
				fAndLDayOfWeek();
				break;
			case 4:
				checkWeekNum();
				break;
			case 5:
				after20Days();
				break;
			case 6:
				howLongHaveYouLived();
				break;
		}
	}
	
	private static void menu() {
		System.out.println(">---------MENU--------<");
		System.out.println("1. Xem thời gian hiện tại(dd/MM/yyyy HH:mm:ss) ở khu vực bất kỳ. ");
		System.out.println("2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy)");
		System.out.println("3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại. ");
		System.out.println("4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm. ");
		System.out.println("5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy. ");
		System.out.println("6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày. ");
		System.out.println("Hãy nhập một số ...");
	}
	
	private static void showCurrentTime(ZoneId zone) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime datetime = LocalDateTime.now(zone);
		System.out.println("The current time in " + zone + " is " + datetime.format(formatter));
	}
	
	private static void lastDayOfMonth() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		c.set(Calendar.DAY_OF_MONTH, c.getActualMaximum(Calendar.DAY_OF_MONTH));
		System.out.println("The last day of month is:" + 
		c.get(Calendar.DAY_OF_MONTH) + "/" + (c.get(Calendar.MONTH) + 1)  + "/" + c.get(Calendar.YEAR));
	}
	
	/*Monday is the first day of the week, Sunday is the last day of the week*/
	private static void fAndLDayOfWeek() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		int currentDayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		if(currentDayOfWeek != 2 && currentDayOfWeek > 2) {
			c.add(Calendar.DATE, 2 - currentDayOfWeek);
		} else if(currentDayOfWeek < 2) {
			c.add(Calendar.DATE, -6);
		}
		System.out.println("The first day of the current week is: " + formatter.format(c.getTime()));
			c.add(Calendar.DATE, 6);
		System.out.println("The last day of the current week is: " + formatter.format(c.getTime()));
	}
	
	private static void checkWeekNum() {
		int week = c.get(Calendar.WEEK_OF_YEAR);
		switch(week % 10) {
			case 1:
				System.out.println("Today is in the " + week + "st week of the year.");
				break;
			case 2:
				System.out.println("Today is in the " + week + "nd week of the year");
				break;
			case 3:
				System.out.println("Today is in the " + week + "rd week of the year");
				break;
			default:
				System.out.println("Today is in the " + week + "th week of the year");
		}
	}
	
	private static void after20Days() {
		SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
		Calendar c = Calendar.getInstance();
		c.add(Calendar.DATE, 20);
		System.out.println("After 20 days, the date is: " + formatter.format(c.getTime()));
	}
	
	private static void howLongHaveYouLived() {
		String date = "";
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		System.out.println("Please enter the date you were born in format(dd/MM/yyyy): ");
		LocalDate birthday = LocalDate.parse(sc.nextLine(), formatter);
		LocalDate now = LocalDate.now();
		
		long daysBetween = ChronoUnit.DAYS.between(birthday, now);
		System.out.println("Since your birth, you have lived the total of: " + daysBetween + " days.");
	}
}
