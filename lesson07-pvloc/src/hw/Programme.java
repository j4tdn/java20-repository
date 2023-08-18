package hw;


import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.IsoFields;
import java.time.temporal.TemporalAdjusters;
import java.time.temporal.WeekFields;
import java.util.Locale;

/**
 * Viết chương trình, mỗi chức năng một phương thức
 * 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
 * 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
 * 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
 * 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
 * 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
 * 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
 */

public class Programme {
	public static void main(String[] args) {
		LocalDateTime now = LocalDateTime.now(ZoneId.of("Japan"));
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		String datetime = dtf.format(now);

		LocalDate localdate = LocalDate.now();

		System.out.println("1. Current time in Japan: " + datetime);
		getLastDate(localdate);
		System.out.println("3. First and last day of the week: " + getFirstAndLastDayOfTheWeek(localdate));
		System.out.println("4. It is week number " + localdate.get(IsoFields.WEEK_OF_WEEK_BASED_YEAR) + " of the year.");
		System.out.println("5. The date after adding 20 days is: " + localdate.plusDays(20));
		live(localdate);

	}

	private static void live(LocalDate date) {
		LocalDate start = LocalDate.of(1997, 05, 21);
		LocalDate now = LocalDate.now();

		if (now.isBefore(start)) {
			throw new IllegalArgumentException("Day of birth must be less than now (time)");
		}

		System.out.println("6. I have lived " + ChronoUnit.DAYS.between(start, now) + " days.");
	}

	private static void getLastDate(LocalDate date) {
		LocalDate now = LocalDate.now();
		LocalDate lastDay = now.with(TemporalAdjusters.lastDayOfMonth());
		System.out.println("2. The last date of current month: " + lastDay);
	}

	public static String getFirstAndLastDayOfTheWeek(LocalDate date) {
		Locale japan = Locale.JAPAN;
		WeekFields weekFields = WeekFields.of(japan);
		DayOfWeek firstDayOfTheWeek = weekFields.getFirstDayOfWeek();
		DayOfWeek lastDayOfTheWeek = firstDayOfTheWeek.minus(1);

		LocalDate firstDate = date.with(TemporalAdjusters.previousOrSame(firstDayOfTheWeek));
		LocalDate lastDate = date.with(TemporalAdjusters.nextOrSame(lastDayOfTheWeek));
		return firstDate + " & " + lastDate;
	}

}