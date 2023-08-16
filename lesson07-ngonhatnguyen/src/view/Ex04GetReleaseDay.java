package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import utils.DateUtils;

public class Ex04GetReleaseDay {
	public static void main(String[] args) {
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
		Date beginDay = null;
		try {
			beginDay = df.parse("07/06/2022");
		} catch (ParseException e) {
			e.printStackTrace();
		}
		Calendar c = Calendar.getInstance();
		c.setTime(beginDay);

		Calendar fDay = getFinishDay(c);
		System.out.println("The begin day: " + DateUtils.format(c, "dd.MM.yyyy EEEE"));
		System.out.println("The release day: " + DateUtils.format(fDay, "dd.MM.yyyy EEEE"));

	}

	private static Calendar getFinishDay(Calendar c) {
		// 1 tuần trừ 2 ngày k làm còn 5 ngày --> 110 / 5 = số tuần làm việc
		// tháng 9 có 1 ngày nghỉ quốc khánh --> + 1 ngày làm việc
		
		int weeks = 110 / 5;
		
		// tính ngày bị thiếu của tuần đầu tiên nếu công việc k bắt đầu đủ 5 ngày.
		int dayOfFirstWeek = c.get(Calendar.DAY_OF_WEEK);
		int missingDay = 5 - (7 - dayOfFirstWeek);
		
		Calendar e = DateUtils.clone(c);
		e.add(Calendar.DAY_OF_MONTH, weeks * 7 + 1 - missingDay);
		return e;
	}
}
