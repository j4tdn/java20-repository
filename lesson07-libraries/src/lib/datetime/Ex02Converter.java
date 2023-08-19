package lib.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02Converter {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Date date = c.getTime();
		
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String text = df.format(date);
		System.out.println("text: " + text);
		
		text = "22/10/2018";
		
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		c = Calendar.getInstance();
		c.setTime(date);
		
		System.out.println("c: " + c);
		/*
		 * han che date time JAVA7
		  1. ko ho tro KDL luu tru date, time
		  2. Mismatch KDL giua JAVA voi DATABASE
		  3. it ho tro ham tim hieu giua 2 moc time	
		 */
	}
}
