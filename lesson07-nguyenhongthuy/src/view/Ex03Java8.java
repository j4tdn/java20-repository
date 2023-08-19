package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import utils.DateUtils;

/**
 * 	Viết chương trình, mỗi chức năng một phương thức
	1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
	2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
	3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
	4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
	5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
	6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
 */
public class Ex03Java8 {
	public static void main(String[] args) {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		LocalDate now = LocalDate.now();
		
		System.out.println("1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.");
		System.out.println("ldt1 --> " + formatter.format(getDateTimeNow(ZoneId.of("Asia/Ho_Chi_Minh"))));
		
		formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
		System.out.println("\n2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy)");
		System.out.println("ld2 --> " + formatter.format(getTheLastDateOfTheCurrentMonth()));
		
		System.out.println("\n3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.");
		System.out.println("now --> " + DateUtils.format(now, "dd/MM/yyyy"));
		System.out.println("getFirstWeekday(c) --> " + DateUtils.format(getFirstWeekday(now), "dd/MM/yyyy"));
		System.out.println("getLastWeekday(c) --> " + DateUtils.format(getLastWeekday(now), "dd/MM/yyyy"));
		
		System.out.println("\n4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.");
		System.out.println("c now --> " + DateUtils.format(now, "dd/MM/yyyy"));
		System.out.println("getWeekOfYear(c) --> " + getWeekOfYear(now));
		
		System.out.println("\n5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.");
		System.out.println("now --> " + DateUtils.format(now, "dd/MM/yyyy"));
		System.out.println("getDateAfterNDays(now, 20) --> " + DateUtils.format(getDateAfterNDays(now, 20), "dd/MM/yyyy"));
		
		System.out.println("\n6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.");
		LocalDate dateOfBirth = inputDateOfBirth();
		System.out.println("getDaysLived(dateOfBirth) --> " + getDaysLived(dateOfBirth));
	}
	
	//1. Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ.
	private static LocalDateTime getDateTimeNow(ZoneId id) {
		return LocalDateTime.now(id);
	}
	
	//2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
	private static LocalDate getTheLastDateOfTheCurrentMonth() {
		return LocalDate.now().withDayOfMonth(LocalDate.now().lengthOfMonth());
	}
	
	//3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
	private static LocalDate getFirstWeekday(LocalDate c) {
		LocalDate firstWeekDay = c;
		return firstWeekDay.with(DayOfWeek.MONDAY);
	}
	
	private static LocalDate getLastWeekday(LocalDate c) {
		LocalDate lastWeekDay = getFirstWeekday(c);
		return lastWeekDay.with(DayOfWeek.SUNDAY);
	}
	
	//4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
	private static int getWeekOfYear(LocalDate c) {
		return c.get(ChronoField.ALIGNED_WEEK_OF_YEAR);
	}
	
	//5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
	private static LocalDate getDateAfterNDays(LocalDate lc, long n) {
		return lc.plus(n, ChronoUnit.DAYS);
	}
	
	//Nhập vào ngày sinh
	private static LocalDate inputDateOfBirth() {
		Scanner sc = new Scanner(System.in);
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyy");
		LocalDate date;
		while(true) {
			System.out.print("Enter your date of birth: ");
			try {
				date = LocalDate.parse(sc.nextLine(), formatter);
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Please enter again!!!");
			}
		}
		sc.close();
		return date;
	}
	
	private static long getDaysLived(LocalDate birth) {
		return ChronoUnit.DAYS.between(birth, LocalDate.now());
	}
}
