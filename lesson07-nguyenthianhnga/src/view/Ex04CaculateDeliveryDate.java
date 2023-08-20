package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Ex04CaculateDeliveryDate {
	public static void main(String[] args) {
		LocalDate start =LocalDate.of(2022, 6, 7);
		int working =110;
		
		  LocalDate deliveryDate = calculateDeliveryDate(start, working);
	        System.out.println("Delivery Date: " + deliveryDate);
	    }

	    private static LocalDate calculateDeliveryDate(LocalDate start, int works) {
	        int count = 0;
	        LocalDate current = start;

	        while (count < works) {
	            current = current.plusDays(1);
	            if (isWorkingDay(current)) {
	                count++;
	            }
	        }

	        return current;
	    }

	    private static boolean isWorkingDay(LocalDate date) {
	        DayOfWeek dayOfWeek = date.getDayOfWeek();
	        if (dayOfWeek == DayOfWeek.SATURDAY || dayOfWeek == DayOfWeek.SUNDAY) {
	            return false;
	        }

	        List<LocalDate> holidays = holidayDays();
	        return !holidays.contains(date);
	    }

	private static List<LocalDate> holidayDays()
	{
		List<LocalDate> holidays = new ArrayList<>();
		holidays.add(LocalDate.of(1, 1, 1));
		holidays.add(LocalDate.of(1, 4, 30));
		holidays.add(LocalDate.of(1, 5, 1));
		holidays.add(LocalDate.of(1, 9, 1));
		holidays.add(LocalDate.of(1, 9, 2));
		
		return holidays;
		}
	}
	



