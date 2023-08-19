package lib.excersices;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04DeadLineCalculator {
	
	public static void main(String[] args) {
		/*
		 	Input: day start: 07/06/2022
		 	Thoi gian thuc hien: 110Ngay
		 	require: ko tinh thu7, cn, ngay le
		 	Tim: Thoi gian ban giao san pham
		 */
		int days = 110;
		Calendar startDate = getInstance(19, 8, 2023);
		Calendar date = clone(startDate);
		int running = 0;
		
		while(running < days){
			if(isWorkingDate(date)) {
				running++;
			}
			date.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("dealine is: " + new SimpleDateFormat("dd//MM//yyyy").format(date));
		
	}
	
	private static boolean isWorkingDate(Calendar checkDate) {
		int weekDay = checkDate.get(Calendar.DAY_OF_WEEK);
		return weekDay != Calendar.SATURDAY && weekDay != Calendar.SUNDAY && !isHoliday(checkDate) ? true : false;
	}
	private static boolean isHoliday(Calendar checkDate) {
		Calendar[] holidays = getHolidays();
		for(Calendar holiday:holidays) {
			if(holiday.get(Calendar.DAY_OF_WEEK) == checkDate.get(Calendar.DAY_OF_WEEK) &&
				holiday.get(Calendar.MONTH) == checkDate.get(Calendar.MONTH)){
				return true;
			}
		}
		return false;
	}
	private static Calendar[] getHolidays() {
		return new Calendar[] {
				getInstance(1, 1),
				getInstance(2, 1),
				getInstance(3, 1),
				getInstance(4, 1),
				getInstance(5, 1),
				getInstance(10, 3),
				getInstance(30, 4),
				getInstance(1, 5),
				getInstance(2, 9),
		};
	}
	
	private static Calendar clone( Calendar c) {
		Calendar result = Calendar.getInstance();
		result.setTime(c.getTime());
		return result;
	}
	private static Calendar getInstance (int day, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day, 0, 0, 0);
		return c;
	}
	private static Calendar getInstance (int day, int month) {
		Calendar c = Calendar.getInstance();
		c.set(0, month - 1, day, 0, 0, 0);
		return c;
	}
}
