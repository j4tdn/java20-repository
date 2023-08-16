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
		// Calendar: lưu trữ + hàm xử lý
		
		// Lấy thông tin thời gian hiện tại với [timezone]
		Date now = new Date();
		System.out.println("now --> " + now);
		System.out.println("now ms --> " + now.getTime());
		
		// new Date(long date)
		// date: số milliseconds tính từ epoch(unix) time
		// epoch time: là mốc thời gian trong hệ thống www hiện tại
		//           : mid night 1.1.1970
		Date date = new Date(78702);
		System.out.println("date --> " + date);
		System.out.println("date ms --> " + date.getTime());
		
		System.out.println("\n------ Calendar ------\n");
		
		
		// 1) Ngày, tháng, năm
		
		Locale VIETNAM = new Locale("vi", "VN");
		Locale.setDefault(VIETNAM);
		System.out.println("default locale --> " + Locale.getDefault());
		
		Calendar c = Calendar.getInstance();
		System.out.println("c --> " + c);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println("dd/MM/yyyy ---> " + day + "/" + month + "/" + year);
		
		// c.set(Calendar.HOUR_OF_DAY, 10);
		Date cDate = c.getTime();
		
		// In ngày, tháng, năm
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		System.out.println("formatted(dd.MM.yyyy) --> " + df.format(cDate));
		
		// 2) Giờ, phút, giây
		df = new SimpleDateFormat("HH:mm:ss"); // HH: clock 24
		System.out.println("formatted(HH:mm:ss) --> " + df.format(cDate));
		df = new SimpleDateFormat("hh:mm:ss a"); // hh: clock 12
		System.out.println("formatted(hh:mm:ss a) --> " + df.format(cDate));
		
		// 3) Ngày trong tuần/tháng hiện tại
		Calendar firstWeekDay = DateUtils.getFirstWeekDay(c);
		System.out.println("current --> " + DateUtils.format(firstWeekDay.getTime(), "dd.MM.yyyy"));
		
		System.out.println("\n------ Current week days ------\n");
		
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		for (int i = 1; i <= 7; i++) {
			System.out.println("current week(" + weekOfYear + ") day --> " + DateUtils.format(firstWeekDay.getTime(), "dd.MM.yyyy EEEE"));
			firstWeekDay.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		// 4) Số ngày trong tháng/năm hiện tại
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("days in month --> " + daysInMonth);
		
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("days in year --> " + daysInYear);
		
		// 5) Kiểm tra năm hiện tại có phải năm nhuận không
		System.out.println("is leap year(" + c.get(Calendar.YEAR) + ") --> " + DateUtils.isLeapYear(c.get(Calendar.YEAR)));
		
	}
	
}
