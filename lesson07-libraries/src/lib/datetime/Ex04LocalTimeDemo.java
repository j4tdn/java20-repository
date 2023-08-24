package lib.datetime;

import java.time.Duration;
import java.time.LocalTime;

public class Ex04LocalTimeDemo {
	
	public static void main(String[] args) {
		
		LocalTime ltime = LocalTime.now();
		
		LocalTime anotherTime = LocalTime.now()
				.plusHours(4)
				.minusHours(2)
				.plusMinutes(18);
		
		// duration: tìm hiệu giữa 2 mốc localtime
		Duration duration = Duration.between(ltime, anotherTime);
		
		System.out.println("duration: " + duration);
		System.out.println("duration toString --> "
				+ opt(duration.toHoursPart(), "hour")
				+ opt(duration.toMinutesPart(), "minute")
				+ opt(duration.toSecondsPart(), "second")
		);
	}
}