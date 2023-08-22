package lib.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import utils.DateUtils;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		// Lấy thông tin thời gian hiện tại với [timezone]
		
		// now --> Sat Aug 05 14:16:34 ICT 2023 
		Date now = new Date();
		System.out.println("now --> " + now);
		
		// new Date(long date)
		// date: số milliseconds tính từ epoch(unix) time
		// epoch time: là mốc thời gian trong hệ thống www hiện tại
		//           : mid night 1.1.1970 
		// tính toán: quy ngày tháng năm giờ phút giây về 1 đơn vị để tính toán
		
		// 78702 --> 78702ms tính từ 1.1.1970
		Date date = new Date(78702);
		System.out.println("date --> " + date);
		System.out.println("date ms --> " + date.getTime());
		
		System.out.println("\n ----------- calendar ----------- \n");
		/*
		 * Thinking 
		 * c.getDay()
		 * c.getMonth()
		 * c.getYear()
		 * 
		 * Actual
		 * c.get(DAY)
		 * c.get(MONTH)
		 */
		
		// String(text) Date(ms from epoch) Calendar(ms from epoch)
		
		// +1. Ngày, Tháng, Năm
		Calendar c = Calendar.getInstance();
		System.out.println("c --> " + c);
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH)+1;
		int year = c.get(Calendar.YEAR);
		System.out.println("dd/MM/yyyy --> " + day + "/" + month + "/" + year);
		
		// c.set(Calendar.HOUR_OF_DAY, 10);
		Date cDate = c.getTime();
		
		// +1. Ngày, Tháng, Năm --> chỉ cần in ra thôi
		// dd.MM.yyyy --> pattern, format date time
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		System.out.println("formated(dd.NN.yyyy) --> " + df.format(date));
		
		// +2. Giờ 12-24, Phút, Giây
		df = new SimpleDateFormat("HH:mm:ss"); // clock 24
		System.out.println("formatted(HH:mm:ss) --> " + df.format(cDate));
		
		df = new SimpleDateFormat("hh:mm:ss a"); // clock 12
		System.out.println("formatted(HH:mm:ss a) --> " + df.format(cDate));
		
		// +3, Ngày trong tuần/tháng hiện tại
		
		// + Lấy ngày đầu tuần(phụ thuộc vào quốc gia(locale))
		// Almost: MONDAY
		// US, Canada, Japan: SUNDAY
		// Ngày trong tuần --> Code lưu trữ từ 1(Calendar.SUNDAY) - 7(Calendar.SATURDAY)
		
		// locale: language, country
		Locale VIETNAM = new Locale("vi", "VN");
		Locale.setDefault(VIETNAM);
		System.out.println("default locale --> " + Locale.getDefault()); //en_us
		
		int firstDayOfWeek = c.getFirstDayOfWeek();
		System.out.println("first day of week --> " + firstDayOfWeek);
		
		int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
		System.out.println("day of week --> " + dayOfWeek);
		
		c.add(Calendar.DAY_OF_MONTH, firstDayOfWeek - dayOfWeek);
		System.out.println("current --> " + DateUtils.format(c.getTime(), "dd/MM/yyyy"));
		
		// +4. Đếm số ngày tháng, năm hiện tại >> Calendar
		c.set(Calendar.MONTH, Calendar.SEPTEMBER);
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("days in month --> " + daysInMonth);
		
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("days in year--> " + daysInYear);
		// +5. Kiểm tra năm hiện tại có phải năm nhuận không
		year = c.get(Calendar.YEAR);
		System.out.println("is leap year(" + year + ") --> " + DateUtils.isLeapYear(year));
	}

}
