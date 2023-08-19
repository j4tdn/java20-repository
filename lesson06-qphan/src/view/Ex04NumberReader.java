package view;

import java.nio.channels.IllegalChannelGroupException;

import number.mapper.TensNumberMapper;
import number.mapper.UnitNumberMapper;

public class Ex04NumberReader {
	
	/*
	 Tối đa 3 chữ số
	 
	 TH1: 1 chữ số
	   + 1
	   + 2 --> In ra giá trị
	   + .
	   + 9
	  
	 TH2: 2 chữ số
	   + 10 --> Mười
	   + 11 --> Mười một
	   + 14  --> Mười(chục) + Số(đơn vị)
	   + 15  -->            + Lăm
	   + 19  --> ok
	   
	   + 20
	   + 21  --> Số(chục) + Mốt
	   + 25  --> Số(chục) + Lăm
	   + 99  --> ok
	   
	  TH3: 3 chữ số
	   + 100  --> Số(trăm) 0 0 --> một trăm
	   
	   + 101  --> Số(trăm) 0(chục) !0(Số) --> một trăm lẻ một
	   + 109  --> ok
	   + 201
	   + 301
	   + 309
	   
	   -- Số hàng chục lớn hơn 0
	   320    --> ba trăm + TH2
	 */
	
	public static void main(String[] args) {
		System.out.println("Test read number with one digit --> {");
		
		int[] numbers = {5, 2, 7, 0, 4};
		
		for (int number: numbers) {
			System.out.println("    " + number + ": " + readNumberWith1Digit(number));
		}
		
		System.out.println("}\n");
		
		
		System.out.println("Test read number with two digits --> {");
		
		int[] numbersWith2Digits = {10, 11, 12, 15, 19, 20, 60, 90, 21, 25, 29, 38};
		
		for (int number: numbersWith2Digits) {
			System.out.println("    " + number + ": " + readNumberWith2Digits(number));
		}
		
		System.out.println("}\n");
	}
	
	private static String readNumberWith2Digits(int number) {
		if (number < 10 || number > 99) {
			throw new IllegalArgumentException("This function is accepted for range [10, 99]");
		}
		
		int tensNumber = number/10; // số hàng chục
		int unitNumber = number%10; // số hàng đơn vị
		
		TensNumberMapper[] tensMappers = TensNumberMapper.values();
		
		String tensAsText = tensMappers[tensNumber].getNumberAsText();
		
		String unitAsText = "";
		if (unitNumber == 0) {
			unitAsText = tensNumber == 1 ? "" : "mươi";
		} else {
			switch(unitNumber) {
			case 1:
				unitAsText = tensNumber == 1 ? "một" : "mốt";
				break;
			case 5:
				unitAsText = "lăm";
				break;
			default:
				unitAsText = readNumberWith1Digit(unitNumber);
			}
		}
		
		
		return tensAsText + " " + unitAsText; // [mươi]
	}
	
	private static String readNumberWith1Digit(int number) {
		if (number < 0 || number > 9) {
			throw new IllegalArgumentException("This function is accepted for range [0, 9]");
		}
		UnitNumberMapper[] mappers = UnitNumberMapper.values();
		return mappers[number].getNumberAsText();
	}
}
