package lib.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02Converter {
	public static void main(String[] args) {
		/*
		 
		 String: user input, format
		 Date: storage
		 Calendar: storage, functions
		 
		 SimpleDateFormat(String <-> date)
		 */
		
		Calendar c = Calendar.getInstance();
		
		// Calendar to date
		Date date = c.getTime();
		
		// date to string
		DateFormat df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String text = df.format(date);
		
		System.out.println("text --> " + text);
		
		String ipText = "22/10/2018";
		
		// string to date
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			date = df.parse(text);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		
		// date to calendar
		c = Calendar.getInstance();
		c.setTime(date);
		
		System.out.println("c --> " + c);
		
		/*
		 Hạn chế của DateTime trong JAVA 1.7
		 
		 1. Không hỗ trợ KDL để lưu trữ date, time
		 2. Mismatch KDL giữa JAVA với DATABASE
		 3. Ít hỗ trợ các hàm tìm hiệu giữa 2 mốc thời gian
		 
		 */
	}
	
}
