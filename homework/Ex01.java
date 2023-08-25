package homework;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;

public class Ex01 {
	public static void main(String[] args) {
		LocalDateTime dateTimeStart = LocalDateTime.of(2020, 7, 24, 10, 20, 30);
		LocalDateTime dateTimeEnd = LocalDateTime.of(2023, 8, 27, 1, 22, 32);
		LocalDate dateStart = dateTimeStart.toLocalDate();
		LocalDate dateEnd = dateTimeEnd.toLocalDate();
		Period period = Period.between(dateStart, dateEnd);
		LocalTime timeStart = dateTimeStart.toLocalTime();
		LocalTime timeEnd = dateTimeEnd.toLocalTime();
		Duration duration = Duration.between(timeStart, timeEnd);
		if(dateStart.isAfter(dateEnd)) {
			throw new IllegalArgumentException("date start cannot exceed date end");
		}
		if(timeEnd.isBefore(timeStart)) {
			duration.plusDays(1);
			period.minusDays(1);
		}
		System.out.println("ngay bat dau hen ho la: " + dateTimeStart.getDayOfWeek());
		System.out.println("Duration: " 
				+ optional(period.getYears(), "years")
				+ optional(period.getMonths(), "months") 
				+ optional(period.getDays(), "days") + " " 
				+ optional(duration.toHoursPart(), "Hours")
				+ optional(duration.toMinutesPart(), "minutes")
				+ optional(duration.toSecondsPart(), "seconds"));
		}
	private static String optional(long dmy, String unit) {
		return dmy > 0 ? dmy + " " + unit + " " : " ";
	}
}
