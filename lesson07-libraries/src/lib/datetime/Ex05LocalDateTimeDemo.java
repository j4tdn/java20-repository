package lib.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Ex05LocalDateTimeDemo {
	public static void main(String[] args) {
		
		// 05.10.2024 17:17:30
		
		// 05.08.2023 20:17:30
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		
		LocalDateTime vnTime = LocalDateTime.now(); // end
		vnTime = LocalDateTime.parse("05.10.2024 17:17:30", df);
		
		LocalDateTime gmTime = LocalDateTime.now(ZoneId.of("Europe/Berlin")); // begin
		gmTime = LocalDateTime.parse("05.08.2023 20:17:30", df);
		
		System.out.println("vnTime --> " + vnTime);
		System.out.println("gmTime --> " + gmTime);
		
		// Period: LocalDate
		// Duration: LocalTime
		
		if (vnTime.isBefore(gmTime)) {
			throw new IllegalArgumentException("Time Range is not value !!!");
		}
		
		LocalDate vnLocalDate = vnTime.toLocalDate();
		LocalDate gmLocalDate = gmTime.toLocalDate();
		
		LocalTime vnLocalTime = vnTime.toLocalTime();
		LocalTime gmLocalTime = gmTime.toLocalTime();
		
		Period period = Period.between(gmLocalDate, vnLocalDate);
		Duration duration = Duration.between(gmLocalTime, vnLocalTime);
		// TODO
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		System.out.println(period + "'T'" + duration);
	}
}
