package controlling;

import java.util.Random;

/**
 * Dựa vào thông tin lỗi để in ra mô tả của nó
 * 500: internal error
 * 400:bad request
 * 404:not found
 * 200:succes
 * #:unknow
 */
public class Ex03SwitchCase {
	public static void main(String[] args) {
		int[] errorCodes = {500,400,404,200,999,888};
		Random rd = new Random();
		
		int pos = rd.nextInt(errorCodes.length);
		int element  = errorCodes[pos];
		System.out.println("element--> "+element);
		System.out.println("\n*========== if else ===========*\n");
		String erroDesc = "";
		if(element==500)
		{
			erroDesc = "internal error";
		}else if(element==400)
		{
			erroDesc = "bad request";
		}else if(element==404)
		{
			erroDesc = "not found";
		}
		else if(element==200)
		{
			erroDesc = "success";
		}else {
			erroDesc = "unknow";
		}
		System.out.println("error desription1 -->" + erroDesc);
		System.out.println("\n*========== switch case ===========*\n");
		switch(element) {
		case 500:erroDesc = "internal error"; break;
		case 400:erroDesc = "bad request";break;
		case 404:	erroDesc = "not found";break;
		case 200:erroDesc = "success";break;
		default:erroDesc = "unknow";
		System.out.println("error desription2 -->" + erroDesc);
		}
		//compile:lúc đang gõ lưu--> javac File.java
		//JDK:trình biên dịch cho Eclipse
		//JRE:trình thực thi chạy ra bytecode
		int month = rd.nextInt(1,13);
		int dayInMonth = -1;
		switch (month) {
		case 1,3,5,7,8,10,12:
			dayInMonth=31;
		case 4,6,9:
			dayInMonth=31;
		case 2:
			dayInMonth=28;
			System.out.println("Ngay   "+dayInMonth);
				
		
	}
		}
}
