package lib.datetime;

import java.time.Duration;
import java.time.LocalTime;
import static utils.DateUtils.*;

public class Ex04LocalTime {
	public static void main(String[] args) {
		LocalTime lTime = LocalTime.now();
		
		LocalTime anorthorTime = LocalTime.now()
						.plusHours(4)
						.plusMinutes(18)
						.plusSeconds(3);
		
		Duration duration = Duration.between(lTime, anorthorTime);
		System.out.println(duration);
		System.out.println("duration: " + opt(duration.toHoursPart(), "hour")
										+ opt(duration.toMinutesPart(), "minutes")
										+ opt(duration.toSecondsPart(), "second"));
	}
}
