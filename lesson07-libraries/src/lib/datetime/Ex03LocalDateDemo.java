package lib.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

import utils.DateUtils;

public class Ex03LocalDateDemo {

	public static void main(String[] args) {
		
		// localdate: ngày tháng năm
		LocalDate ldate = LocalDate.now();
		System.out.println("ldate --> " + format(ldate, "dd/MM/yyyy"));
		
		LocalDate anotherDate = LocalDate.now()
				.withDayOfMonth(22)
				.withMonth(12)
				.withYear(2025);
		System.out.println("anotherDate --> " + format(anotherDate, "dd/MM/yyyy"));
	
		// period: tính hiệu giữa 2 mốc localdate
		Period period = Period.between(ldate, anotherDate);
		System.out.println("period --> " + period);
		System.out.println("period toString --> " 
							+ DateUtils.opt(period.getYears(), "year")
							+ DateUtils.opt(period.getMonths(), "month")
							+ DateUtils.opt(period.getDays(), "day"));
	
	}
	
	private static String format(LocalDate ldate, String pattern) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		return df.format(ldate);
	}
	
	
}
