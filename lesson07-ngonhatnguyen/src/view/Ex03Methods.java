package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import java.util.spi.TimeZoneNameProvider;

import utils.DateUtils;

public class Ex03Methods {
	public static void main(String[] args) {
		showTheCurrentTime("Asia/Tokyo");
		System.out.println("\n =================================== \n");
		getLastDateOfCurrentMonth();
		System.out.println("\n =================================== \n");
		getFirstAndLastDateOfCurrentWeek();
		System.out.println("\n =================================== \n");
		getDayAfter20Days();
		System.out.println("\n =================================== \n");
		getWeekOfCurrentDayOfYear();
		System.out.println("\n =================================== \n");
		
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		LocalDate dob = LocalDate.parse("23.07.2003", df);
		getYourLongevityDays(dob);
	}
	
	private static void showTheCurrentTime(String zoneID) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		LocalDateTime crTime = LocalDateTime.now(ZoneId.of(zoneID));
		System.out.println("The current time in " + zoneID + ":");
		System.out.println(crTime.format(df));
		
	}
	
	private static void getLastDateOfCurrentMonth() {
		Calendar c = Calendar.getInstance();
		System.out.print("The last date of current month: ");
		System.out.println(c.getActualMaximum(Calendar.DAY_OF_MONTH) + "." + (c.get(Calendar.MONTH) + 1) + "." + c.get(Calendar.YEAR));
	}
	
	private static void getFirstAndLastDateOfCurrentWeek() {
		Calendar c = Calendar.getInstance();

		Calendar firstWeekDay = Calendar.getInstance();
		int firstDayOfWeek = c.getFirstDayOfWeek();
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		firstWeekDay.add(Calendar.DAY_OF_MONTH, firstDayOfWeek - dayOfWeek);
		
		System.out.print("The first date of current week: ");
		System.out.println(DateUtils.format(firstWeekDay, "dd.MM.yyyy"));
		
		Calendar lastWeekDay = Calendar.getInstance();
		lastWeekDay.add(Calendar.DAY_OF_MONTH, 7 - dayOfWeek);
		System.out.print("The last date of current week: ");
		System.out.println(DateUtils.format(lastWeekDay, "dd.MM.yyyy"));
	}
	
	private static void getWeekOfCurrentDayOfYear() {
		Calendar c = Calendar.getInstance();
		System.out.println("Current day: " + DateUtils.format(c, "dd.MM.yyyy"));
		System.out.print("The week of current day of year: ");
		System.out.println(c.get(Calendar.WEEK_OF_YEAR));
	}
	
	private static void getDayAfter20Days() {
		Calendar c = Calendar.getInstance();
		System.out.println("Current day: " + DateUtils.format(c, "dd.MM.yyyy"));
		System.out.print("The day after 20-days: ");
		c.add(Calendar.DAY_OF_MONTH, 20);
		System.out.println(DateUtils.format(c, "dd.MM.yyyy EEEE"));
	}
	
	private static void getYourLongevityDays(LocalDate dob) {
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy");
		System.out.println("Your birth day: " + dob.format(df));
		
		Period period = Period.between(dob, LocalDate.now());
		long dayLife = period.get(ChronoUnit.YEARS) * 365 + period.get(ChronoUnit.MONTHS) * 30 + period.get(ChronoUnit.DAYS);
		
		System.out.println("The Days number you have lived is: " + dayLife + " days");
	}
}
