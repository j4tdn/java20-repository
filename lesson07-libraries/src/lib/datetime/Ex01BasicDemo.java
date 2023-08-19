package lib.datetime;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

import utils.DateUtils;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		Locale vietNam= new Locale("vi", "VN");
		Locale.setDefault(vietNam);
		System.out.println("default Locale: " + Locale.getDefault());
		Date now = new Date();
		System.out.println("now: " + now);
		
		//78702ms --> tinh tu 1.1.1970
		Date date = new Date(78702);
		System.out.println("date: " + date);
		System.out.println("date ms: " + date.getTime());
		System.out.println("===================");
		
		Calendar c = Calendar.getInstance();
		int day = c.get(Calendar.DAY_OF_MONTH);
		int month = c.get(Calendar.MONTH) + 1;
		int year = c.get(Calendar.YEAR);
		System.out.println("dd/MM/yyyy: " + day + "/" + month + "/" + year);
		
		//ngay thang nam --> chi can in ra 
		DateFormat df = new SimpleDateFormat("dd.MM.yyyy");
		Date cDate = c.getTime();
		System.out.println("formatted dd.MM.yyyy -> " + df.format(cDate));
		
		df = new SimpleDateFormat("HH:mm:ss");
		System.out.println("formatted HH:mm:ss: " + df.format(cDate));
		
		Calendar firstWeekDay = DateUtils.getFirstDayOfWeek(c);
		System.out.println("first day Week: " + DateUtils.formatted(firstWeekDay, "dd.MM.yyyy"));
		
		System.out.println("\n----------- current week days---------------");
		
		int weekOfYear = c.get(Calendar.WEEK_OF_YEAR);
		day = 1;
		for(; day <= 7; day++) {
			System.out.println("current week("+ weekOfYear +") day: " + DateUtils.formatted(firstWeekDay, "dd.MM.yyyy EEEE"));
			firstWeekDay.add(Calendar.WEEK_OF_MONTH, 1);
		}
		
		c.set(Calendar.MONTH, Calendar.SEPTEMBER);
		int daysInMonth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		System.out.println("days in month: " + daysInMonth);
		year = c.get(Calendar.YEAR);
		System.out.println("is leap year: ("+year+")" + DateUtils.isLeapYear(year));
		
	}
}
