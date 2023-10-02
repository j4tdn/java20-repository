package lib.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import utils.DateUtils;

public class Ex01BasicDemo {
	
	public static void main(String[] args) {
		//Date: lưu trữ
		//Calendar: lưu trữ + hàm xử lý
		
		//Lấy thông tin thời gian hiện tại với [timezone]
		
		//now --> Thu Aug 10 09:32:42 ICT 2023
		
		Date now = new Date();
		System.out.println("now --> " + now);
		
		
		//new Date(long date)
		//date: số milliseconds tính từ epoch (unix) time
		//epoch time: là mốc thời gian trong hệ thống www hiện tại
		//			: mid night 1.1.1970
		//tính toán: quy ngày tháng năm giờ phút giây về 1 đơn vị để tính toán
		
		//78702 --> 78702ms tính từ 1.1.1970
		Date date = new Date(78702);
		System.out.println("date --> " + date);
		System.out.println("date ms --> " + date.getTime());
				
		System.out.println("\n-------------Calendar-------------\n");
		/*
		 * java.util.GregorianCalendar
		 * [time=1691635036348,areFieldsSet=true,areAllFieldsSet=true,
		 * lenient=true,zone=sun.util.calendar.ZoneInfo[id="Asia/Saigon",
		 * offset=25200000,dstSavings=0,useDaylight=false,transitions=11,
		 * lastRule=null],firstDayOfWeek=2,minimalDaysInFirstWeek=1,ERA=1,
		 * YEAR=2023,MONTH=7,WEEK_OF_YEAR=33,WEEK_OF_MONTH=2,DAY_OF_MONTH=10,
		 * DAY_OF_YEAR=222,DAY_OF_WEEK=5,DAY_OF_WEEK_IN_MONTH=2,AM_PM=0,HOUR=9,
		 * HOUR_OF_DAY=9,MINUTE=37,SECOND=16,MILLISECOND=348,ZONE_OFFSET=25200000,
		 * DST_OFFSET=0]
		 * 
		 * Thinking
		 * c.getDay()
		 * c.getMonth()
		 * c.getYear()
		 * 
		 * Actual
		 * c.get(DAY)
		 * c.get(MONTH)
		 */
		
		//String(text) Date(ms from epoch) Calendar (ms from epoch)
		
		//locale: language, country
		Locale VIETNAME = new Locale("vi", "VN");
		System.out.println("locale --> " + Locale.getDefault());//en-US
		Locale.setDefault(VIETNAME);
		System.out.println("default locale --> " + Locale.getDefault());//vn-VVN
		
		//+ 1. Ngày, tháng, năm
		Calendar c = Calendar.getInstance();
		System.out.println("c --> " + c);
		int day = c.get(Calendar.DAY_OF_MONTH) + 1;
		int month = c.get(Calendar.MONTH);
		int year = c.get(Calendar.YEAR);
		System.out.println("dd/MM/yyyy --> " + day + "/" + month + "/" + year);
		//c.set(Calendar.HOUR_OF_DAY, 10);
		Date cDate = c.getTime();
		
		
		//+ 1. Ngày, tháng, năm -> chỉ cần in ra
		//dd.MM.yyyy --> pattern, format date time
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		System.out.println("formated(dd.MM.yyy) --> " + df.format(cDate));
		
		
		//+ 2. Giờ 12 - 24, Phút, Giây
		df = new SimpleDateFormat("HH:mm:ss"); //clock 24
		System.out.println("formated(HH:mm:ss) --> " + df.format(cDate));
		
		df = new SimpleDateFormat("hh:mm:ss a"); //clock 12
		System.out.println("formated(hh:mm:ss) --> " + df.format(cDate));
		
		
		//+ 3: In ra số ngày trong tuần/ tháng hiện tại
		
		
		//+ Lấy ngày đầu tuần (phụ thuộc vào quốc gia(locale)
		//Almost: MONDAY
		//US, Canada, Japan: SUNDAY
		//Ngày trong tuần --> code lưu trữ từ 1 (Calendar.SUNDAY) - 7(Calendar.SATURDAY)
		
		Calendar firstWeekDay = DateUtils.getFirstWeekday(c);
		System.out.println("first week day --> " + DateUtils.format(firstWeekDay, "dd.MM.yyyy"));
		
		System.out.println("\n-------------- current week days ------------------");
		
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		day = 1;
		for (; day <= 7; day++) {
			System.out.println("current week(" + weekOfYear + ") day --> " 
					+ DateUtils.format(firstWeekDay, "dd.MM.yyyy EEEE"));
			firstWeekDay.add(Calendar.DAY_OF_MONTH, 1);
		}
		
		// + 4. Đếm số ngày tháng, năm hiện tại >> Calendar
		c.set(Calendar.MONTH, Calendar.SEPTEMBER);
		c.set(Calendar.YEAR, 2023);
		
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("days in month --> " + daysInMonth);
		
		int daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		System.out.println("days in year --> " + daysInYear);
		
		// + 5. Kiểm tra năm hiện tại có phải năm nhuận không
		year = c.get(Calendar.YEAR);
		System.out.println("is leap year(" + year + ") --> " + DateUtils.isLeapYear(year));
		
		// + 6. Ngày đầu tiên trong tuần hiện tại là ngày thứ mấy
		// getFristDayOfWeek
		
		// + 7. Ngày đầu tiên trong tuần hiện tại là ngày mấy
		// getFirstWeekDay
		
		// =>>> Epoch time
	}
}
