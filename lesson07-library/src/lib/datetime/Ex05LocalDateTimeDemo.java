package lib.datetime;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class Ex05LocalDateTimeDemo {

	public static void main(String[] args) throws IllegalAccessException {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		
		LocalDateTime vnTime = LocalDateTime.now();
		
		vnTime  = LocalDateTime.parse("05.08.2023 17:17:30",df);
		LocalDateTime gmTime = LocalDateTime.now(ZoneId.of("Europe/Berlin"));
		
		gmTime  = LocalDateTime.parse("03.08.2023 23:17:30",df);
		
		System.out.println("vnTime -->" + vnTime);
		System.out.println("gmTime -->" + gmTime);
	
//		Period: LocaDate
//		Duration:LocalTime
		if(vnTime.isBefore(gmTime)) {
			throw new IllegalAccessException("Time range is not value");
		}
		
		LocalDate vnLocalDate = vnTime.toLocalDate();
		LocalDate gmLocalDate = gmTime.toLocalDate();
		
		LocalTime vnLocalTime = vnTime.toLocalTime();
		LocalTime gmLocalTime = gmTime.toLocalTime();
	
		
		
		Period period = Period.between(gmLocalDate, vnLocalDate);
		Duration duration = Duration.between(gmLocalTime, vnLocalTime);
		if(duration.isNegative()) {
			duration= duration.plusDays(1);
			period = period.minusDays(1);
			
		}
		System.out.println(period + "'T'" + duration);
	}
}
