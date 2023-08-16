package view;

import static bean.Utils.formatterWithDF;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.text.ParseException;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import bean.Test03;

public class Ex03TestWithJava07 implements Test03 {

	private static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		Ex03TestWithJava07 test = new Ex03TestWithJava07();
		
		String pattern = "dd/MM/yyyy";
		
		System.out.println("1. " + test.getCurDateTime(pattern + " HH:mm:ss"));

		System.out.println("2. " + test.getLastDayInCurMonth(pattern));

		System.out.println("3." + Arrays.toString(test.getFirstAndLastDaysInCurWeek(pattern)));

		System.out.println("4. " + test.getCurWeekInYear());
		
		System.out.println("5. " + test.checkDateAfter20Days(20, pattern + " EEEE"));
		
		System.out.println("6. " + test.calculateDaysAlive(pattern));
		
		ip.close();
	}

	@Override
	public long calculateDaysAlive(String pattern) {
		Date date = new Date();
		do {
			try {
				System.out.println("vui lòng nhập ngày tháng năm sinh với format '" 
						+ pattern + "': ");
				String input = ip.nextLine();
				date = formatterWithDF(pattern).parse(input);
				break;
			} catch (ParseException e) {
				e.printStackTrace();
				System.out.println("vui lòng nhập đúng format!!!");
			}
		}while (true);
		Calendar dob = Calendar.getInstance();
		dob.setTime(date);
		
		Calendar now = Calendar.getInstance();
		
		if (dob.after(now)) {
			throw new IllegalArgumentException("ngày sinh phải nhỏ hơn thời điểm hiện tại!!");
		}
		
		long distance = now.getTimeInMillis() - dob.getTimeInMillis();
		long divisor = 1000 * 3600 * 24;
		return distance / divisor;
	}
	
	@Override
	public String checkDateAfter20Days(int day, String pattern) {
		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.DAY_OF_MONTH, day);
		
		return formatterWithDF(pattern).format(cal.getTime());
	}
	
	@Override
	public int getCurWeekInYear() {
		Calendar cal = Calendar.getInstance();
		
		return cal.get(Calendar.WEEK_OF_YEAR);
	}

	@Override
	public String[] getFirstAndLastDaysInCurWeek(String pattern) {
		Calendar firstDay = Calendar.getInstance();
		firstDay.add(Calendar.DAY_OF_MONTH, firstDay.getFirstDayOfWeek() - firstDay.get(Calendar.DAY_OF_WEEK));

		Calendar lastDay = Calendar.getInstance();
		lastDay.set(Calendar.DAY_OF_MONTH, firstDay.get(Calendar.DAY_OF_MONTH));
		lastDay.add(Calendar.DAY_OF_MONTH, 6);
		return new String[] { formatterWithDF(pattern).format(firstDay.getTime()),
							formatterWithDF(pattern).format(lastDay.getTime())};
	}

	@Override
	public String getLastDayInCurMonth(String pattern) {
		Calendar cal = Calendar.getInstance();
		cal.set(Calendar.DAY_OF_MONTH, cal.getActualMaximum(Calendar.DAY_OF_MONTH));

		return formatterWithDF(pattern).format(cal.getTime());
	}

	@Override
	public String getCurDateTime(String pattern) {
		System.out.println("vui lòng nhập locale (language, country): ");
		String language = ip.nextLine();
		String country = ip.nextLine();

		Locale area = new Locale(language, country);
		Calendar cal = Calendar.getInstance(area);

		return formatterWithDF(pattern).format(cal.getTime());
	}
}
