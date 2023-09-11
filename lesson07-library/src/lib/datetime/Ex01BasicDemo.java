package lib.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//Lấy thông tin thời gian hiện tại với[timezone]
			Date now = new Date();
			System.out.println("now ==> "+ now);
		//new Date(long date)
		//date: số mili (s) tính từ epoch(unix) time
		//epoch time: là mốc thời gian trong hệ thống www hiện tại
		//		    : mid night 1.1.1970
		//tính toán: quy ngày tháng năm giờ phút giây về 1 đơn vị để tính toán
			Date date = new Date(78702);
			System.out.println("date -->" + date);
			System.out.println("date ms --> " + date.getTime());
			
//			Locale VIETNAM = new Locale("vi","VN");
//			
//			Locale.setDefault(VIETNAM);
			
			System.out.println("defaut locate --> "+ Locale.getDefault());//en-us
			
		//+ 1.Ngày, Tháng, Năm
			Calendar c = Calendar.getInstance();
			System.out.println("c--> " + c);
			int day = c.get(Calendar.DAY_OF_MONTH);
			int month = c.get(Calendar.MONTH) + 1;
			int year = c.get(Calendar.YEAR);
			System.out.println("dd/MM/yyyy ---> "+ day + "/"+ month + "/"+ year);
		//+1 Nếu Ngày, Tháng, Năm --> chỉ cần in ra 
		// dd.MM.yyyy --> pattern , format date time	
			DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
			c.set(Calendar.HOUR_OF_DAY, 10);
			
			Date cDate = c.getTime();
			System.out.println("dd.MM.yyyy--> " +df.format(cDate) );
		//+2 Giờ 12-24, phút, giây
			df = new SimpleDateFormat("HH:mm:ss");//clock 24
			System.out.println("Formated(HH:mm:ss) --> " + df.format(cDate));
			
			df = new SimpleDateFormat("hh:mm:ss a");//clock 12
			System.out.println("Formated(HH:mm:ss a) --> " + df.format(cDate));
		//+3. Ngày trong tuần/tháng hiện tại
		
		//Lấy ngày đầu tuần(phụ thuộc vào quốc gia(locate))
		//Almost:MONDAY
		//US,Canada,Japan:SUNDAY
		//Ngày trong tuần -->Code lưu trữ 
		
		//local: laguage, country
			Calendar firstWeekDay = DayUtil.getFirstWeekDay(c);
//			System.out.println("first week day --> "+ DayUtil.formate(firstWeekDay, "dd.MM.yyyy"));
			
			System.out.println("\n****************Current week day**************\n");
			
			int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
			day = 1;
			
			for(;day <=7;day++) {
//				System.out.println("Current week day ==>"+ DayUtil.formate(firstWeekDay, "dd.MM.yyyy EEEE"));
				firstWeekDay.add(Calendar.DAY_OF_MONTH, 1);
			}
		//+4. Đếm số ngày tháng,năm hiện tại  >> Calendar
			c.set(Calendar.MONTH, Calendar.SEPTEMBER);
			c.set(Calendar.YEAR, 2000);
			int  daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
			System.out.println("day in month --> " + daysInMonth);

			int  daysInYear = c.getActualMaximum(Calendar.DAY_OF_YEAR);
			System.out.println("day in month --> " + daysInYear);
		
		//+5 Kiểm tra năm hiện tại có phải là năm nhuận không
			year = c.get(Calendar.YEAR);
			System.out.println("ís leap year(" + year +") -->" + DayUtil.isLeapYear(year) );
		
	}
}
