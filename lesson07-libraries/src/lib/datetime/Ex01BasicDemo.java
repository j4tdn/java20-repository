package lib.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import utils.DateUtils;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// Date: lưu trữ

		// lấy thông tin current time
		Date now = new Date();
		System.out.println("now --> " + now);

		// new Date(long date)
		// date: số milliseconds tính từ epoch(unix) time
		// epoch time: mốc time trong cái hệ thống www hiện tại
		// : mid night 1.1.1970
		// tính toán: quy ngày tháng năm giờ phút giây về 1 đvi để tính toán

		// 78702 --> tính từ 1.1.1970
		Date date = new Date(78702);
		System.out.println("date --> " + date);
		System.out.println("date ms --> " + date.getTime());

		System.out.println("-------calendar-------");

		// locale: language-country
		// Locale VIETNAM = new Locale("vi", "VN");
		// Locale.setDefault(VIETNAM);
		System.out.println("default locale --> " + Locale.getDefault());

		// 1.Ngày tháng năm
		Calendar c = Calendar.getInstance();
		System.out.println("c --> " + c);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);

		System.out.println("đd/MM/yyyy --> " + day + "/" + month + "/" + year);

		// 1.ngày, tháng, năm --> chỉ cần in ra
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");

		// c.set(Calendar.HOUR_OF_DAY, 10);
		Date cdate = c.getTime();

		System.out.println("formated(dd.MM.yyyy) --> " + df.format(cdate));

		// 2. giờ phút giây
		df = new SimpleDateFormat("hh:mm:ss a");
		System.out.println("formated(hh:mm:ss) --> " + df.format(cdate));

		// 3. ngày trong tuần/tháng hiện tại

		// + lấy ngày đầu tuần (phụ thuộc vào quốc gia(locale))
		// almost: Monday
		// US, Canada, Japan: Sunday
		// ngày trong tuần --> code lưu trữ từ 1(sunday) - 7(saturday)

		Calendar firstWeekDay = DateUtils.getFirstDayOfWeek(c);
		System.out.println("first day of week --> " + DateUtils.format(firstWeekDay, "dd/MM/yyyy"));
	
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		
		day = 1;
		for (; day <= 7; day++) {
			System.out.println("current week day (" + weekOfYear + ")day --> "
					+ DateUtils.format(firstWeekDay, "dd.MM.yyyy EEEE"));
			firstWeekDay.add(Calendar.DAY_OF_MONTH, 1);
		}
	
		// 4.đếm số ngày trong tháng/năm hiện tại >> Calendar
		c.set(Calendar.MONTH, Calendar.SEPTEMBER);
		c.set(Calendar.YEAR, 2000);
		
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("days in month --> " + daysInMonth);
		
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("days in year --> " + daysInYear);
		
		// 5. kiểm tra năm hiện tại có phải năm nhuận ko?
		year = c.get(Calendar.YEAR);
		System.out.println("is leap year (" + year + ") --> " + DateUtils.isLeapYear(year) );
		
		// 6.Ngày đầu tiên trong tuần hiện tại là thứ mấy
		// --> getFirstDayOfWeek
		// 7.Ngày đầu tiên trong tuần hiện tại là ngày thứ mấy
		// --> getFirstDayOfWeek
		
	}
}
