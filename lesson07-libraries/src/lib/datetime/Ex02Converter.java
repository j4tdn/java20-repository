package lib.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02Converter {
	
	public static void main(String[] args) {
		 	
		// Calendar to Date
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		
		// Date to String
		DateFormat df = new SimpleDateFormat("dd/MM/yyy HH:mm:ss E");
		String text = df.format(date);
		System.out.println("text --> " + text);
		
		// String to Date
		text = "22/10/2018";
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// Date to Calendar
		c = Calendar.getInstance();
		c.setTime(date);
		System.out.println("c --> " + c);
		
	}
	
}
