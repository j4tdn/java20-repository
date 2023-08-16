package lib.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import static utils.DateUtils.*;

public class Ex03LocalDateDemo {
	
	public static void main(String[] args) {
		
		LocalDate lDate = LocalDate.now();
		System.out.println("lDate --> " + format(lDate, "dd/MM/yyyy"));
		
		LocalDate anotherDate = LocalDate.now().withDayOfMonth(31).withMonth(8).withYear(2023);
		System.out.println("anotherDate --> " + format(anotherDate, "dd/MM/yyyy"));
		
		// Tính hiệu 2 LocalDate
		Period period = Period.between(lDate, anotherDate);
		System.out.println("period --> " + opt(period.getYears(), "year")
										 + opt(period.getMonths(), "month")
										 + opt(period.getDays(), "day"));
		
	}
	
	private static String format(LocalDate lDate, String pattern) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		return df.format(lDate);
	}
	
}
