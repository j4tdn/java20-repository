package lib.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static utils.DateUtils.*;

public class Ex03LocalDateDemo {

	public static void main(String[] args) {
		LocalDate ldate = LocalDate.now();
		System.out.println("ldate --> " + format(ldate, "dd/MM/yyyy"));
		System.out.println();
		
		LocalDate anotherDate = LocalDate.now()
				.withDayOfMonth(22)
				.withMonth(12)
				.withYear(2025);
		System.out.println("anotherDate --> " + format(anotherDate, "dd/MM/yyyy"));
		
		// period: tính hiệu giữa 2 mốc localdate
		Period period = Period.between(ldate, anotherDate);
		System.out.println("period --> " + period);
		System.out.println("period toString --> " 
				+ opt(period.getYears(), "year")
				+ opt(period.getMonths(), "month")
				+ opt(period.getDays(), "day")
		);
	}
	
	private static String format(LocalDate ldate, String pattern) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		return df.format(ldate);
	}
	
	private static String opt(int value, String unit) {
		if (value == 0) {
			return " ";
		}
		return value + " " + unit + (value > 1 ? "s " : " ");

	}
}
