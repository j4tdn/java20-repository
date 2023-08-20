package lib.datetime;

import java.time.Duration;
import java.time.LocalTime;
import static utils.DateUtils.*;

public class Ex04LocalTimeDemo {
	public static void main(String[] args) {
		LocalTime ltime = LocalTime.now();
		LocalTime anotherTime = LocalTime.now()
				.plusHours(4)
				.minusHours(2)
				.plusMinutes(18);
		
		// duration: tính hiệu giữa 2 mốc localtime
		Duration duration = Duration.between(ltime, anotherTime);
		System.out.println("duration: " + duration);
	
		// toHours() vs toHoursPart()
		System.out.println("duration toString --> "
				+ opt(duration.toHours(), "hour")
				+ opt(duration.toMinutes(), "minute")
				+ opt(duration.toSeconds(), "second")
		);
		
		System.out.println("duration toString --> "
				+ opt(duration.toHoursPart(), "hour")
				+ opt(duration.toMinutesPart(), "minute")
				+ opt(duration.toSecondsPart(), "second")
		);
	}
}
