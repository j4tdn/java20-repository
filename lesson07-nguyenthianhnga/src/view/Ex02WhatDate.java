package view;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

import bean.Utils;

public class Ex02WhatDate {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DateFormat df = new  SimpleDateFormat("dd.MM.yyyy");
		try {
			System.out.println("Enter date: ");
			Date date = df.parse(sc.nextLine());
			Calendar c =Calendar.getInstance();
			c.setTime(date);
			System.out.println(getTime(c));
			System.out.println(getDayOfYear(c));
			System.out.println(getWeekOfYear(c));
			System.out.println(getMaxDayOfMonth(c));
			System.out.println(getOfOut(c));
			System.out.println(getMaxDayOfYear(c));
		}catch(ParseException pe) {
			
		}
		
	}
	private static String getTime(Calendar c)
	{
		return Utils.format(c,"dd MMMM yyyy") +" is a "+Utils.format(c, "EEEE");
	}
	private static String getDayOfYear(Calendar c)
	{
		int dayOfYear = c.get(Calendar.DAY_OF_YEAR);
		int maxDay = c.getActualMaximum(Calendar.DAY_OF_YEAR);
		int dayLefts =maxDay - dayOfYear;
		return  "It is a number "+dayOfYear +"of the year ,"+ dayLefts +" days left";
	}
	
	private static String getWeekOfYear(Calendar c)
	{
		int maxWeek = c.getActualMaximum(Calendar.WEEK_OF_YEAR);
		return "It is "+ c.get(Calendar.WEEK_OF_YEAR)+" out of "+ maxWeek +" in" +c.get(Calendar.YEAR);
	}
	private static String getOfOut(Calendar c)
	{
		String mY = Utils.format(c, "MMMM yyyy");
		int week =c.get(Calendar.DAY_OF_WEEK_IN_MONTH);
		int maxWeek = c.getActualMaximum(Calendar.WEEK_OF_MONTH);
		String month =Utils.format(c, "MMMM");
		
		return "It is "+ month+" number "+week+ " out of "+maxWeek + mY;
		
	}
	private static String getMaxDayOfYear(Calendar c)
	{
		int year =c.get(Calendar.YEAR);
		int dayOfYear =c.getActualMaximum(Calendar.DAY_OF_YEAR);
		return "Year "+year+"has "+dayOfYear+" days";
	}
	private static String getMaxDayOfMonth(Calendar c)
	{
		int maxDayOfMoth = c.getActualMaximum(Calendar.DAY_OF_MONTH);
		return Utils.format(c, "MMMM yyyy")+ " has "+maxDayOfMoth +" days.";
	}
	
	
}
