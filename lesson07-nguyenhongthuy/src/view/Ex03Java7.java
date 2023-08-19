package view;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import utils.DateUtils;

/**
 * Viết chương trình, mỗi chức năng một phương thức 1. Xem thời gian hiện
 * tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ. 2. In ngày cuối cùng của tháng hiện
 * tại (dd/MM/yyyy). 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại. 4. Xem
 * ngày hiện tại đang ở tuần thứ mấy trong năm. 5. Kiểm tra sau 20 ngày nữa là
 * ngày nào, thứ mấy. 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống
 * được bao nhiêu ngày.
 */
public class Ex03Java7 {
	public static void main(String[] args) {
		System.out.println("1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.");
		Calendar now = getDateNow();
		System.out.println("now --> " + DateUtils.format(now, "dd/MM/yyy HH:mm:ss"));

		System.out.println("\n2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).");
		System.out.println(
				"getTheLastDateOfMonth(now) --> " + DateUtils.format(getTheLastDateOfMonth(now), "dd/MM/yyyy"));

		System.out.println("\n3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.");
		System.out.println("getFirstWeekday(now) --> " + DateUtils.format(getFirstWeekday(now), "dd/MM/yyyy"));
		System.out.println("getLastWeekday(now) --> " + DateUtils.format(getLastWeekday(now), "dd/MM/yyyy"));

		System.out.println("\n4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.");
		System.out.println("getWeeksOfYear(now) --> " + getWeeksOfYear(now));

		System.out.println("\n5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.");
		System.out.println("getDateAfterNDays(now, 20) --> " + DateUtils.format(getDateAfterNDays(now, 20), "dd/MM/yyyy"));
		System.out.println("getDayOfWeek(now, 20) --> " + getDayOfWeek(now, 20));
		
		System.out.println("\n6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.");
		Calendar birth = inputDateOfBirth();
		System.out.println("getDaysLived(birth) --> " + getDaysLived(birth));
	}

	// 1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
	private static Calendar getDateNow() {
		return Calendar.getInstance();
	}

	// 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
	private static Calendar getTheLastDateOfMonth(Calendar c) {
		Calendar date = DateUtils.clone(c);
		date.add(Calendar.MONTH, 1); // set về ngày này tháng sau
		date.set(Calendar.DAY_OF_MONTH, 1); // set ngày về ngày 1 tháng sau
		date.add(Calendar.DAY_OF_MONTH, -1);// trừ đi 1 ngày ra kết quả
		return date;
	}

	// 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
	private static Calendar getFirstWeekday(Calendar c) {
		Calendar firstWeekDay = c;
		int firstDayOfWeek = c.getFirstDayOfWeek();
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		firstWeekDay.add(Calendar.DAY_OF_MONTH, firstDayOfWeek - dayOfWeek);
		return firstWeekDay;
	}

	private static Calendar getLastWeekday(Calendar c) {
		Calendar lastWeekDay = getFirstWeekday(c);
		lastWeekDay.add(Calendar.DAY_OF_WEEK, 6);
		return lastWeekDay;
	}

	// 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
	private static int getWeeksOfYear(Calendar c) {
		return c.get(Calendar.WEEK_OF_YEAR);
	}

	// 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
	private static Calendar getDateAfterNDays(Calendar c, int n) {
		Calendar c1 = DateUtils.clone(c);
		c1.add(Calendar.DAY_OF_MONTH, n);
		return c1;
	}

	private static int getDayOfWeek(Calendar c, int n) {
		Calendar c1 = getDateAfterNDays(c, n);
		return c1.get(Calendar.DAY_OF_WEEK);
	}

	// 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu
	// ngày.
	// Nhập vào ngày sinh
	private static Calendar inputDateOfBirth() {
		Scanner sc = new Scanner(System.in);
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyy");
		Calendar date = Calendar.getInstance();
		while (true) {
			System.out.print("Enter your date of birth: ");
			try {
				Date d = formatter.parse(sc.nextLine());
				date.setTime(d);
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Please enter again!!!");
			}
		}
		sc.close();
		return date;
	}
	private static long getDaysLived(Calendar birth) {
		long start = birth.getTimeInMillis();
		long end = Calendar.getInstance().getTimeInMillis();
		
		long between = end - start;
		long days = between/(60*60*24*1000);
		return days;
	}
}
