package view;

import static bean.Utils.formatterWithDF;
import static bean.Utils.isHoliday;

import java.util.Calendar;

import bean.Holidays;

public class Ex04TimeDeadLine {
	
	private static final int BUGET = 110;
	
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.set(2022, Calendar.JUNE, 7);

		System.out.println("dead line: " + getDateReleased(cal, "dd/MM/yyyy"));

	}
	
	private static String getDateReleased(Calendar cal, String pattern) {
		int running = 0;
		
		while (true) {
			int weekDay = cal.get(Calendar.DAY_OF_WEEK);

			boolean isDayOff = weekDay == Calendar.SATURDAY
					|| weekDay == Calendar.SUNDAY
					|| isHoliday(cal, Holidays.getHolidays());

			if (!isDayOff) {
				running++;
				if (running == BUGET) {
					return formatterWithDF(pattern).format(cal.getTime());
				}
			}
			cal.add(Calendar.DAY_OF_MONTH, 1);
		}
	}
}
