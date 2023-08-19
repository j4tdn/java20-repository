package view;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04DeadlineCalculator {
	
	public static void main(String[] args) {
		/*
		 Ngày bắt đầu: 07/06/2023
		 Thời gian thực hiện: 110 ngày
		 
		 Ràng buộc
		 + Không tính thứ 7, cn
		 + Không tính ngày lễ
		 
		 Tìm thời gian bàn giao sản phẩm
		 */
		
		int days = 11;
		Calendar startDate = getInstance(19, 8, 2023);
		Calendar date = clone(startDate);
		
		int running = 0;
		while(true) {
			if (isWorkingDay(date)) {
				running++;
				if (running == days) {
					break;
				}
			}
			date.add(Calendar.DAY_OF_MONTH, 1);
		}
		System.out.println("\ndeadline --> " + new SimpleDateFormat("dd/MM/yyyy").format(date.getTime()));
	}
	
	private static Calendar[] getHolidays() {
		return new Calendar[] {
				// tet holiday
				getInstance(1, 1),
				getInstance(2, 1),
				getInstance(3, 1),
				getInstance(4, 1),
				getInstance(5, 1),
				// hung king
				getInstance(10, 3),
				getInstance(30, 4),
				getInstance(1, 5),
				getInstance(2, 9)
		};
	}
	
	private static boolean isWorkingDay(Calendar checkDate) {
		int weekDay = checkDate.get(Calendar.DAY_OF_WEEK);
		return weekDay != Calendar.SATURDAY 
				&& weekDay != Calendar.SUNDAY 
				&& !isHoliday(checkDate); 
	}
	
	private static boolean isHoliday(Calendar checkDate) {
		Calendar[] holidays = getHolidays();
		for (Calendar holiday: holidays) {
			if (checkDate.get(Calendar.DAY_OF_MONTH) == holiday.get(Calendar.DAY_OF_MONTH)
					&& checkDate.get(Calendar.MONTH) == holiday.get(Calendar.MONTH)) {
				System.out.println("holiday --> " + new SimpleDateFormat("dd/MM/yyyy").format(checkDate.getTime()));
				return true;
			}
		}
		return false;
	}
	
	private static Calendar clone(Calendar c) {
		Calendar result = Calendar.getInstance();
		result.setTime(c.getTime());
		return result;
	}
	
	private static Calendar getInstance(int day, int month) {
		Calendar c = Calendar.getInstance();
		c.set(0, month - 1, day, 0, 0, 0);
		return c;
	}
	
	private static Calendar getInstance(int day, int month, int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month - 1, day, 0, 0, 0);
		return c;
	}
}
