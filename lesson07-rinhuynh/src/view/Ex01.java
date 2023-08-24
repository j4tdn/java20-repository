package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

/**
 * Xây dựng ứng dụng The Ultimate Relationship Calculator
 * Nhập thời gian bắt đầu hẹn hò của 2 người.
 * Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại
 * Nhấn Enter để thực hiện tính toán. Hỏi
 * Ngày bắt đầu hẹn họ là ngày thứ mấy.
 * Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
 */

public class Ex01 {
private static final String pattern = "HH:mm:ss dd/MM/yyyy";
	
	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(pattern);
		
		LocalDateTime start = LocalDateTime.parse("15:20:40 15/06/2018", dtf);
		LocalDateTime end = LocalDateTime.parse("20:25:45 15/08/2020", dtf);
		
		if (start.isAfter(end)) {
			throw new IllegalArgumentException("dateStart cannot exceed dateEnd !!!");
		}
		
		// Date: LocalDateTime -> LocalDate => to calculate period
		LocalDate startDate = start.toLocalDate();
		LocalDate endDate = end.toLocalDate();
		
		Period period = Period.between(startDate, endDate);
		
		// Time: LocalDateTime -> LocalTime => to calculate duration
		LocalTime startTime = start.toLocalTime();
		LocalTime endTime = end.toLocalTime();

		Duration duration = Duration.between(startTime, endTime);

		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			endDate = endDate.minusDays(1);
		}

		System.out.println("----- Dating has lasted -----");
		System.out.println(getUnit(period.getYears(), " year(s) ")
				 + getUnit(period.getMonths(), " month(s) ")
				 + getUnit(period.getDays(), " day(s) ")
				 + getUnit(duration.toHoursPart(), " hour(s) ")
				 + getUnit(duration.toMinutesPart(), " minute(s) ")
				 + getUnit(duration.toSecondsPart(), " second(s)"));

		// What weekday is the date they start dating?
		LocalDate date = LocalDate.of(2018, Month.JUNE, 15);
		System.out.println("-----Weekday of starting date-----");
		System.out.println(date.getDayOfWeek());

	}
	
	private static String getUnit(int value, String unit) {
		return value == 0 ? "" : value + unit;
	}

}