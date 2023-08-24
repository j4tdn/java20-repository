package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import ultils.DateUtils;


/**
 * Input:
 * Ngày, tháng, năm
 * Validate dữ liệu nhập vào
 * Output:
 * Xuất các thông tin trong bảng màu xanh bên phải.
 */

public class Ex02 {
	public static Scanner ip = new Scanner(System.in);

	public static void main(String[] args) {
		System.out.print("Enter a date in dd/MM/yyyy format: ");

		String date = ip.nextLine();

		if (isValidFormat(date) == true) {
			System.out.println("Date is valid");
		} else {
			System.out.println("Date is invalid!!! Please try again");
		}

		Calendar dateAsCalendar = DateUtils.stringToCalendar(date, "dd/MM/yyyy");

		int dayOfWeek = dateAsCalendar.get(Calendar.DAY_OF_WEEK);
		String[] dayOfWeeks = { "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };

		int dayOfYear = dateAsCalendar.get(Calendar.DAY_OF_YEAR);
		int maxDayOfYear = dateAsCalendar.getActualMaximum(Calendar.DAY_OF_YEAR);

		int dow = dayOfYear / 7;
		if (dayOfYear % 7 != 0) {
			dow += 1;
		}

		String[] months = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
							"October", "November", "December" };

		System.out.println(date + " is a " + dayOfWeeks[dayOfWeek - 1]);
		System.out.println("It is day number " + dayOfYear + " of the year, " + (maxDayOfYear - dayOfYear) + " days left.");
		System.out.println("It is " + dayOfWeeks[dayOfWeek - 1] + " number " + dow + " out of "
				            + (dow + (maxDayOfYear - dayOfYear) / 7) + " in " + dateAsCalendar.get(Calendar.YEAR));
		System.out.println("It is " + dayOfWeeks[dayOfWeek - 1] + " number "
				            + (dateAsCalendar.get(Calendar.DAY_OF_MONTH) / 7 + 1) + " out of "
				            + (dateAsCalendar.get(Calendar.DAY_OF_MONTH) / 7 + 1
						    + (dateAsCalendar.getActualMaximum(Calendar.DATE) - dateAsCalendar.get(Calendar.DAY_OF_MONTH))/ 7)
				            + " in " + dateAsCalendar.get(Calendar.YEAR));
		System.out.println("Year " + dateAsCalendar.get(Calendar.YEAR) + " has "
				            + dateAsCalendar.getActualMaximum(Calendar.DAY_OF_YEAR) + " days.");
		System.out.println(months[dateAsCalendar.get(Calendar.MONTH)] + " " + dateAsCalendar.get(Calendar.YEAR)
				            + " has " + dateAsCalendar.getActualMaximum(Calendar.DAY_OF_MONTH) + " days.");
	}

	public static boolean checkDate(String date) {
		if (date.matches("\\d+")) {
			return true;
		}
		return false;
	}

	public static boolean isValidFormat(String value) {
		Date date = null;
		try {
			DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
			date = df.parse(value);
			if (!value.equals(df.format(date))) {
				date = null;
			}
		} catch (ParseException ex) {
			ex.printStackTrace();
		}
		return date != null;
	}

}