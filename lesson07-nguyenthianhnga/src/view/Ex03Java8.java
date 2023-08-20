package view;

import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Calendar;
import java.util.Locale;

public class Ex03Java8 {
	public static void main(String[] args) {
		 String currentTime = getTime("Asia/Ho_Chi_Minh");
	        System.out.println("1.Current time: " + currentTime);
	        // In ngày cuối cùng của tháng hiện tại
	        String lastDayOfMonth = getLastDayOfMonth();
	        System.out.println("2.The last day of the month: " + lastDayOfMonth);

	        // Xem ngày đầu tiên và cuối cùng của tuần hiện tại
	        String firstDayOfWeek = getFirstDayOfWeek();
	        String lastDayOfWeek = getLastDayOfWeek();
	        System.out.println("3.First day of the week: " + firstDayOfWeek);
	        System.out.println("  Last day of the week: " + lastDayOfWeek);

	        // Xem ngày hiện tại đang ở tuần thứ mấy trong năm
	        int weekOfYear = getWeekOfYear();
	        System.out.println("4.Week of the year: " + weekOfYear);
	        
	        String futureDate = getFutureDay(20);
	        String futureDayOfWeek = getFutureDayOfWeek (20);
	        System.out.println("5.After 20 day: " + futureDate);
	        System.out.println("  Day of week after 20 day: " + futureDayOfWeek);
	        
	        String birthdayStr = "15/08/1990";
	        long daysAlive = calculateDaysAlive(birthdayStr);

	        System.out.println("6.You have lived :" + daysAlive + " days.");
	    }
	        
	        
	
	private static String getTime(String lc) {
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDateTime current =LocalDateTime.now(ZoneId.of(lc));
		return current.format(fm);
	}
	private static String getLastDayOfMonth() {
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate time = LocalDate.now();
		LocalDate lastDayOfMonth = time.with(TemporalAdjusters.lastDayOfMonth());
        return lastDayOfMonth.format(fm);
	}
	private static String getFirstDayOfWeek() {
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate time = LocalDate.now();
		LocalDate firstDayOfWeek = time.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        return firstDayOfWeek.format(fm);
	}
	private static String getLastDayOfWeek() {
		DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate time = LocalDate.now();
		LocalDate lastDayOfWeek = time.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        return lastDayOfWeek.format(fm);
	}
	private static int getWeekOfYear() {
		LocalDate date = LocalDate.now();
		return date.get(WeekFields.ISO.weekOfWeekBasedYear());
	}
	private static String getFutureDay(int days) {
		  DateTimeFormatter fm = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate currentDate = LocalDate.now().plusDays(days);
	        return currentDate.format(fm);
	}
	 public static String getFutureDayOfWeek(int days) {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEE", Locale.ENGLISH);
	        LocalDate currentDate = LocalDate.now().plusDays(days);
	        return currentDate.format(formatter);
	    }
	 
	 public static long calculateDaysAlive(String birthdayStr) {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	        LocalDate birthday = LocalDate.parse(birthdayStr, formatter);
	        LocalDate today = LocalDate.now();
	        long days = ChronoUnit.DAYS.between(birthday, today);

	        return days;
	    }
	
}
