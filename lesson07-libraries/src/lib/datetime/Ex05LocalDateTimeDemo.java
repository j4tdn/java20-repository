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
		
		Set<String> zoneIds=  ZoneId.getAvailableZoneIds();
		for(String zoneString : zoneIds) {
			System.out.println(zoneString);
		}
	
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		
		LocalDateTime vnTime = LocalDateTime.now(); //end
		vnTime = LocalDateTime.parse("06.08.2024 17:30:02", df);
		
		LocalDateTime gmTime = LocalDateTime.now(ZoneId.of("Europe/Berlin")); //begin
		gmTime = LocalDateTime.parse("05.08.2023 17:30:02", df);
		
		System.out.println("VnTime --> " + vnTime);
		System.out.println("gmTime --> " + gmTime);
		
		
		
		//Period: LocalDate
		//Duration : LocalTime
		
		if(vnTime.isBefore(gmTime)) {
			throw new IllegalArgumentException("Time range is not valid");
		}
		LocalDate vnLocalDate = vnTime.toLocalDate();
		LocalDate gmLocalDate = gmTime.toLocalDate();
		
		LocalTime vnLocalTime = vnTime.toLocalTime();
		LocalTime gmLocalTime = gmTime.toLocalTime();
		
		Period period = Period.between(gmLocalDate, vnLocalDate);
		Duration duration = Duration.between(gmLocalTime, vnLocalTime);
		
		if(duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
			
		}
		
		System.out.println("period --> " + duration);
	}
}
