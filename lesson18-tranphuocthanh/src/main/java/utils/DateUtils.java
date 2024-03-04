package utils;

import java.time.LocalDate;

public class DateUtils {
	
	private DateUtils() {
	}
	
	public static java.sql.Date toSqlDate(LocalDate ldate){
		return java.sql.Date.valueOf(ldate);
	}
}
