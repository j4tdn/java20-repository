package exercises;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class Ex01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ngày hẹn hò của 2 bạn: ");
		String dateString = sc.nextLine();

		LocalDateTime startDay = LocalDateTime.parse(dateString, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
		LocalDateTime currentDay = LocalDateTime.now();
		
		Period relationshipDays = getPeriod(startDay.toLocalDate(), currentDay.toLocalDate());
		Duration duration = getDuration(startDay, currentDay);
		
		
		System.out.println("Các bạn yêu nhau vào ngày thứ " + startDay.getDayOfWeek());
		System.out.println("Các bạn yêu nhau đã được: "
									+ opt(relationshipDays.getYears(), "year")
									+ opt(relationshipDays.getMonths(), "month")
									+ opt(relationshipDays.getDays(), "day")
									+ opt(duration.toHoursPart(), "hour")
									+ opt(duration.toMinutesPart(), "minute")
									+ opt(duration.toSecondsPart(), "second")
		);
	}
	
	public static Period getPeriod(LocalDate startDay, LocalDate currentDay) {
		return Period.between(startDay, currentDay);
	}
	
	public static Duration getDuration(LocalDateTime startDay, LocalDateTime currentDay) {
		Duration duration = Duration.between(startDay.toLocalTime(), currentDay.toLocalTime());
		return duration;
	}
	
	public static String opt(int value, String text) {
		if(value == 0) return "";
		return value + " " + text + (value > 1 ? "s " : " ");
	}
	
}
