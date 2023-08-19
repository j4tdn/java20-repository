package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.util.Calendar;

public class Ex03CheckDateTime {
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		System.out.println("time now: " + getLocalDateTime(ZoneId.of("Asia/Tokyo")));
		LocalDate cNow = LocalDate.now();
		Calendar c = Calendar.getInstance();
		int endDayOfMonth = cNow.MAX.getDayOfMonth();
		System.out.println("end day of month: " + endDayOfMonth);
		
		printTheFristAndLastDayOfWeek(c);
		printTheNowDayOfYear(c);
		printAfterTwentyDays(c);
		
		LocalDate startLive = LocalDate.of(2002,7,25);
		printLiveToNow(startLive);
	}
	
	private static LocalDateTime getLocalDateTime(ZoneId string) {
		return LocalDateTime.now(string);
	}
	
	private static void printTheFristAndLastDayOfWeek(Calendar c) {
		int firstDayOfWeek = c.getFirstDayOfWeek();
		int currenDayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DAY_OF_MONTH, firstDayOfWeek - currenDayOfWeek);
		
		String startDayOfWeek = new SimpleDateFormat("dd//MM//yyyy").format(c.getTime());
		c.add(Calendar.DAY_OF_MONTH, 7);
		String endDayOfWeek = new SimpleDateFormat("dd//MM//yyyy").format(c.getTime());
		System.out.println("Ngày đầu tiên trong tuần hiện tại: " + startDayOfWeek);
		System.out.println("Ngày cuối cùng trong tuần hiện tại: " + endDayOfWeek);
	} 
	
	private static void printTheNowDayOfYear(Calendar c) {
		System.out.println("ngày hiện tại đang ở tuần thứ mấy trong năm: " + c.getFirstDayOfWeek() + " cua tuan thu " + c.get(Calendar.WEEK_OF_YEAR)); 
	}
	
	private static void printAfterTwentyDays(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		c.add(Calendar.DAY_OF_MONTH, 20);
		String After20Days = df.format(c.getTime());
		System.out.println("Sau 20 ngày:   " + After20Days);
	}
	public static void printLiveToNow(LocalDate localDate) {
		LocalDateTime current = LocalDateTime.now();
		Period period = Period.between(localDate, current.toLocalDate());
		System.out.println(period.getYears() + " years " + period.getMonths() + " months " + period.getDays() + " days ");
	}
}
