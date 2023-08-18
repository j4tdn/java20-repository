package lib.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateDemo {
	public static void main(String[] args) {
		
		// localdate: ngày tháng năm
		
		LocalDate ldate = LocalDate.now()
				.withDayOfMonth(5)
				.withMonth(6)
				.withYear(2023);
		System.out.println("ldate --> " + format(ldate, "dd/MM/yyyy"));
		
		System.out.println();
		
		LocalDate anotherDate = LocalDate.now()
				.withDayOfMonth(4)
				.withMonth(7)
				.withYear(2023);
		System.out.println("anotherDate --> " + format(anotherDate, "dd/MM/yyyy"));
		
		System.out.println();
		
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
