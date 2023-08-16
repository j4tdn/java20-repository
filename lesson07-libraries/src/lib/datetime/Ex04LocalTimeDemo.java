package lib.datetime;

import java.time.Duration;
import java.time.LocalTime;
import static utils.DateUtils.*;

public class Ex04LocalTimeDemo {
	
	public static void main(String[] args) {
		
		LocalTime lTime = LocalTime.now();
		LocalTime anotherTime = LocalTime.now().plusHours(4).minusHours(2).plusMinutes(18);
		
		// Hiệu của 2 LocalTime
		Duration duration = Duration.between(lTime, anotherTime);
		System.out.println("duration --> " + duration);
		System.out.println("duration toString --> " + opt(duration.toHoursPart(), "hour")
												    + opt(duration.toMinutesPart(), "minute")
												    + opt(duration.toSecondsPart(), "second"));
		
		
	}
	
}
