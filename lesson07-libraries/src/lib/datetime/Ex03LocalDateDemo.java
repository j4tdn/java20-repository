package lib.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Ex03LocalDateDemo {

	public static void main(String[] args) {
		
		//Localdate: ngày tháng năm
		
		LocalDate ldate = LocalDate.now();
		System.out.println("ldate --> " + ldate);
		System.out.println("ldate --> " + format(ldate, "dd/MM/yyyy"));
		
		LocalDate anotherDate = LocalDate.now()
								.withDayOfMonth(22)
								.withMonth(12)
								.withYear(2015);
		System.out.println("AnotherDate --> " + format(anotherDate, "dd/MM/yyyy"));
	
		// period: tính hiệu giữa 2 mốc localDate
		Period period = Period.between(anotherDate, ldate);
		System.out.println("Period -->  " + period);
		System.out.println("Period toString --> "
								+ opt(period.getYears(), "year")
								+ opt(period.getMonths(), "month")
								+ opt(period.getYears(), "day")
		);
	}
	
	private static String format(LocalDate ldate,String pattern) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		return df.format(ldate);
	}
	
	private static String opt(int value, String unit) {
		if(value == 0) return " ";
		return value + " " + unit + (value > 1 ?  "s " : " "); 
		
	}
}
