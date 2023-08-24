package view;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Ex04 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		c.set(2022, Calendar.JUNE, 07);
		Calendar c1 = Calendar.getInstance();
		c1.setFirstDayOfWeek(2);
		c1.setTimeInMillis(c.getTimeInMillis());
		int deadline = 110;
		do {
			c1.add(Calendar.DAY_OF_MONTH, 1);
			if (satisfy(c1)) {
				c.add(Calendar.DAY_OF_MONTH, 1);
				deadline--;
			}
		} while (deadline != 0);
		System.out.println("Group A will have to hand over the product to Customer B on: " + format(c1));
	}

	public static String format(Calendar c) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		String date = df.format(c.getTime());
		return date;
	}

	public static boolean satisfy(Calendar c) {
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		int month = c.get(Calendar.MONTH) + 1;
		int dayOfMonth = c.get(Calendar.DAY_OF_MONTH);
		if (dayOfWeek == 7 || dayOfWeek == 1) {
			return false;
		} else if (month == 9) {
			if (dayOfMonth == 1 || dayOfMonth == 2) {
				return false;
			}
		}
		return true;
	}


}
