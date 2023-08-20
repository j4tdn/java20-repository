package lib.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDateDemo {
	public static void main(String[] args) {			
		// LocalDate: lưu trữ ngày/tháng/năm
		LocalDate ldate = LocalDate.now();
		System.out.println("ldate --> " + ldate);
		System.out.println("ldate --> " + format(ldate, "dd/MM/yyyy"));
		
		LocalDate anotherDate = LocalDate.now()
			.withDayOfMonth(10)
			.withMonth(9)
			.withYear(2023);
		System.out.println("anotherDate --> " + format(anotherDate, "dd/MM/yyyy"));
		
		// Period: tính hiệu giữa 2 mốc LocalDate
		Period p = Period.between(ldate, anotherDate);
		System.out.println("period --> " + p);
		System.out.println("period toString --> " 
				+ opt(p.getYears(), "year")
				+ opt(p.getMonths(), "month")
				+ opt(p.getDays(), "day")
		);	
	}
	
	private static String opt(int value, String unit) {
		if (value == 0) {
			return "";
		}
		return value + " " + unit + (value > 1 ? "s " : " ");
	}
	
	private static String format(LocalDate ldate, String pattern) {
		DateTimeFormatter df;
		
		df = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		return df.format(ldate);
	}
}
