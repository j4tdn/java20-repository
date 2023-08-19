package lib.datetime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ex03LocalDate {
	public static void main(String[] args) {
		LocalDate lDate = LocalDate.now();
		lDate.withDayOfYear(18).withYear(2023);
		System.out.println("ldate: " + format(lDate, "dd/MM/yyyy"));
		LocalDate anotherDate = LocalDate.now()
							.withDayOfMonth(22)
							.withMonth(12)
							.withYear(2023);
		System.out.println("anotherDate: " + format(anotherDate, "dd/MM/yyyy"));
		System.out.println("====duration=======");
		
		//period: tinh hieu giua 2 moc LocalDate
		Period period = Period.between(lDate, anotherDate);
		System.out.println("period: " 
							+ opt(period.getYears(), "year ")
							+ opt(period.getMonths(), "month")
							+ opt(period.getDays(), "day"));
	}
	
	private static String format(LocalDate date, String pattern) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern(pattern);
		return df.format(date);
	}
	private static String opt(int value, String unit) {
		if(value == 0) {
			return " ";
		}
		return value + " " + unit + (value > 1 ? "s " : "");
	}
}
