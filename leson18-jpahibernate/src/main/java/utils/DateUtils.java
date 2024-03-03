package utils;

import java.time.LocalDate;
import java.util.Objects;

public class DateUtils {
	
	private DateUtils() {
	}
	
	public static java.sql.Date toSqlDate(LocalDate ldate) {
		Objects.requireNonNull(ldate, "ldate should not be null");
		return java.sql.Date.valueOf(ldate);
	}
	
	public static java.sql.Date toSqlDatee(LocalDate date){
		Objects.requireNonNull(date,"date should not be null");
		return java.sql.Date.valueOf(date);
	}
	
}