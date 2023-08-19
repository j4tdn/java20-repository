package utils;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;

public class DateUtils {
	private DateUtils() {

	}

	public static String format(Calendar c, String pattern) {
		return format(c.getTime(), pattern);
	}

	private static String format(Date date, String pattern) {
		DateFormat df = new SimpleDateFormat(pattern);
		return df.format(date);
	}

	public static String format(LocalDateTime date, String pattern) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		return formatter.format(date);
	}

	public static String format(LocalDate date, String pattern) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
		return formatter.format(date);
	}

	public static String getPeriodAndDuration(Duration duration, Period period) {
		String years = opt(period.getYears(), "year");
		String months = opt(period.getMonths(), "month");
		String days = opt(period.getDays(), "day");

		String hours = opt(duration.toHours(), "hour");
		String minutes = opt(duration.toMinutesPart(), "minute");
		String seconds = opt(duration.toSecondsPart(), "second");

		return years + "" + months + " " + days + " " + hours + " " + minutes + " " + seconds;
	}

	private static String opt(long value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit + (value > 1 ? "s " : " ");
	}
	
	//Tìm số lần xuất hiện của thứ trong tuần giữa 2 mốc thời gian
	public static int countDayOfWeek(LocalDate start, LocalDate end, DayOfWeek dayOfWeek) {
		int count = 0;
        LocalDate current = start;

        while (!current.isAfter(end)) {
            if (current.getDayOfWeek() == dayOfWeek) {
                count++;
            }
            current = current.plus(1, ChronoUnit.DAYS);
        }

        return count;
    }

	public static Calendar clone(Calendar c) {
		Date date = c.getTime();
		Calendar c1 = Calendar.getInstance();
		c1.setTime(date);
		return c1;
	}
	public static LocalDate[] getHolidays() {
		return new LocalDate[]{
			LocalDate.now().withDayOfMonth(1).withMonth(1),
			LocalDate.now().withDayOfMonth(30).withMonth(4),
			LocalDate.now().withDayOfMonth(1).withMonth(5),
			LocalDate.now().withDayOfMonth(2).withMonth(9)
		};
	}
}
