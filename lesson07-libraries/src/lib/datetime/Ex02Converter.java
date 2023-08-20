package lib.datetime;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Ex02Converter {
	public static void main(String[] args) {
		Calendar c;	
		Date d;
		DateFormat df;
		String t;
		
		
		//******* CHUYỂN CALENDAR -> DATE -> STRING *******//
		c = Calendar.getInstance();
		d = c.getTime();
		df = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		t =df.format(d);
		
		System.out.println("t --> " + t);
		
		
		//******* CHUYỂN STRING -> DATE -> CALENDAR *******//
		t = "22/10/2018";
		df = new SimpleDateFormat("dd/MM/yyyy");
		try {
			d = df.parse(t);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		c = Calendar.getInstance();
		c.setTime(d);
		
		System.out.println("c --> " + c);
		
		
		//******* HẠN CHẾ CỦA DATETIME TRONG JAVA 1.7 *******//
		/*
			 1. Không hỗ trợ KDL để lưu trữ date, time
			 2. Mismatch KDL giữa JAVA với DATABASE
			 3. Ít hỗ trợ các hàm tìm hiệu giữa 2 mốc thời gian
		*/
	}
}
