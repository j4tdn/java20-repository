package exercises;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Locale;

public class Ex03 {
	public static void main(String[] args) {
//		1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
		Locale locale = Locale.FRENCH;
		printDate(LocalDateTime.now(), locale);
//		2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
		printTheLastDayOfThisMonth(LocalDateTime.now());
//		3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
		Calendar c = Calendar.getInstance();
		printTheFristAndLastDayOfWeek(c);
//		4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
		getWeekinWeeksYear(c);
//		5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
		printAfter20Days(c);
//		6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
		getLive(LocalDate.of(2003,10,17));
	}
	
	public static void printDate(LocalDateTime date, Locale locale) {
		Locale.setDefault(locale);
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		String dateString = df.format(date);
		System.out.println(dateString);
	}
	
	public static void printTheLastDayOfThisMonth(LocalDateTime localDateTime) {
		LocalDate ldate = localDateTime.toLocalDate();
		System.out.println("Ngày cuối cùng của tháng hiện tại " + ldate.lengthOfMonth() + "/" + ldate.getMonthValue() + "/" +ldate.getYear());
	}
	
	public static void printTheFristAndLastDayOfWeek(Calendar c) {
		int firstDayOfWeek = c.getFirstDayOfWeek();
		int currenDayOfWeen = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DAY_OF_MONTH, firstDayOfWeek - currenDayOfWeen);
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String startDayOfWeek = df.format(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 7);
		String endDayOfWeek = df.format(c.getTime());
		System.out.println("Ngày đầu tiên trong tuần hiện tại: " + startDayOfWeek);
		System.out.println("Ngày cuối cùng trong tuần hiện tại: " + endDayOfWeek);
	} 
	
	public static void getWeekinWeeksYear(Calendar c) {
		System.out.println("CURRENT WEEK OF YEAR: " + c.get(Calendar.WEEK_OF_YEAR));
	} 
	
	public static void printAfter20Days(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String currentDay = df.format(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 20);
		String _20DaysAfter = df.format(c.getTime());
		
		System.out.println("Ngày hiện tại: " + currentDay);
		System.out.println("Sau 20 ngày:   " + _20DaysAfter);
	} 
	
	public static void getLive(LocalDate localDate) {
		LocalDateTime current = LocalDateTime.now();
		Period period = Period.between(localDate, current.toLocalDate());
		System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days ");
	}
}
