package lib.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Set;

public class Ex05LocalDateTimeDemo {

	public static void main(String[] args) {
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		
		LocalDateTime vnTime = LocalDateTime.now();
		LocalDateTime gmTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		
		gmTime = LocalDateTime.parse("05.08.2023 22:17:30", df);
		vnTime = LocalDateTime.parse("05.08.2024 17:17:30", df);
		
		System.out.println("vnTime --> " + vnTime);
		System.out.println("gmTime --> " + gmTime);
		
		// Hiệu của 2 LocalDateTime
		
		if (vnTime.isBefore(gmTime))
			throw new IllegalArgumentException("Time range is not valid");
		
		LocalDate vnLocalDate = vnTime.toLocalDate();
		LocalDate gmLocalDate = gmTime.toLocalDate();
		
		LocalTime vnLocalTime = vnTime.toLocalTime();
		LocalTime gmLocalTime = gmTime.toLocalTime();
		
		Period period = Period.between(gmLocalDate, vnLocalDate);
		Duration duration = Duration.between(gmLocalTime, vnLocalTime);
		if (duration.isNegative()) {
			duration = duration.plusHours(24);
			period = period.minusDays(1);
		}
		
		System.out.println(period + " " + duration);
		
	}
	
}
