package bean;

import java.util.Calendar;
import static bean.Utils.*;

public class Holidays {
	
	private Holidays() {
	}
	
	public static Calendar[] getHolidays() {
		
		return new Calendar[] {
			
			getTime(Calendar.JANUARY, 1),getTime(Calendar.JANUARY, 2),
			getTime(Calendar.JANUARY, 20),getTime(Calendar.JANUARY, 21),
			getTime(Calendar.JANUARY, 22),getTime(Calendar.JANUARY, 23),
			getTime(Calendar.JANUARY, 24),getTime(Calendar.JANUARY, 25),
			getTime(Calendar.JANUARY, 26),getTime(Calendar.APRIL, 29),
			getTime(Calendar.APRIL, 30),getTime(Calendar.MAY, 1),
			getTime(Calendar.MAY, 2),getTime(Calendar.MAY, 3),
			getTime(Calendar.SEPTEMBER, 1),getTime(Calendar.SEPTEMBER, 2),
			getTime(Calendar.SEPTEMBER, 3),getTime(Calendar.SEPTEMBER, 4),
			
		};
	}
}
