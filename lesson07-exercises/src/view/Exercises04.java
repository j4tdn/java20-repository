package view;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Exercises04 {

	
	
	
	public static void main(String[] args) {
		/*
		 Ngày bắt đầu : 07/06/2023
		 Thời gian thực hiện: 100 ngày
		 
		 Ràng buộc: 
		 +Không tính t7 cn
		 +không tính ngầy lễ
		 
		 Tìm thời gian bàn giao sản phẩm
		 * */
		
		int days =110;
		Calendar startDate = getInstance(2, 9, 2023);
		Calendar date = clone(startDate);
				
		int running = 0;
		while(true) {
			if(isWorkingDay(date)) {
				running ++;
				if(running == days )
					break;
			}
			else {
				System.out.println("day off : "+ new SimpleDateFormat("dd/MM/yyyy").format(date.getTime()));
			}
			date.add(Calendar.DAY_OF_MONTH,1);
		}
		System.out.println("deadline--> " + new SimpleDateFormat("dd/MM/yyyy").format(date.getTime()));
		
		
	}
	
	private static Calendar[] getHoliday() {
		return new Calendar[] {
				
				//Tet holiday
				getInstance(1, 1),
				getInstance(2, 1),
				getInstance(3, 1),
				getInstance(4, 1),
				getInstance(5, 1),
				//gio to
				getInstance(10, 3),
				getInstance(30, 4),
				getInstance(1, 5),
				getInstance(2, 9),
				
		};
	}
	
	private static boolean isWorkingDay(Calendar checkDate) {
		int weekDay  = checkDate.get(Calendar.DAY_OF_WEEK);
		return weekDay != Calendar.SATURDAY
							&& weekDay !=Calendar.SUNDAY
							&& !isHoliday(checkDate);
	}
	
	private static boolean isHoliday(Calendar checkDate) {
		Calendar[] holiday = getHoliday();
		for(Calendar holidays : holiday) {
			if(checkDate.get(Calendar.DAY_OF_MONTH) == holidays.get(Calendar.DAY_OF_MONTH)
			&& checkDate.get(Calendar.MONTH) == holidays.get(Calendar.MONTH)) {
				return true;
			}
		}
		return false ;
	}
	
	private static Calendar clone(Calendar c) {
		Calendar result = Calendar.getInstance();
		result.setTime(c.getTime());
		return result;
	}
	
	private static Calendar getInstance(int day,int month) {
		Calendar c = Calendar.getInstance();
		c.set(0, month -1, day , 0, 0, 0 );
		return c;
	}
	
	private static Calendar getInstance(int day,int month,int year) {
		Calendar c = Calendar.getInstance();
		c.set(year, month -1, day , 0, 0, 0 );
		return c;
	}
}
