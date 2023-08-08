package lib.datetime;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Ex06Test {

	public static void main(String[] args) {
		LocalDateTime fromDateTime = LocalDateTime.of(1984, 12, 16, 7, 45, 55);
		LocalDateTime toDateTime =   LocalDateTime.of(2014, 12, 16,  2, 50, 45);

		LocalDateTime tempDateTime = LocalDateTime.from( fromDateTime );

		long years = tempDateTime.until( toDateTime, ChronoUnit.YEARS );
		tempDateTime = tempDateTime.plusYears( years );

		long months = tempDateTime.until( toDateTime, ChronoUnit.MONTHS );
		tempDateTime = tempDateTime.plusMonths( months );

		long days = tempDateTime.until( toDateTime, ChronoUnit.DAYS );
		tempDateTime = tempDateTime.plusDays( days );


		long hours = tempDateTime.until( toDateTime, ChronoUnit.HOURS );
		tempDateTime = tempDateTime.plusHours( hours );

		long minutes = tempDateTime.until( toDateTime, ChronoUnit.MINUTES );
		tempDateTime = tempDateTime.plusMinutes( minutes );

		long seconds = tempDateTime.until( toDateTime, ChronoUnit.SECONDS );

		System.out.println( years + " years " + 
		        months + " months " + 
		        days + " days " +
		        hours + " hours " +
		        minutes + " minutes " +
		        seconds + " seconds.");

		//prints: 29 years 8 months 24 days 22 hours 54 minutes 50 seconds.
	}
}
