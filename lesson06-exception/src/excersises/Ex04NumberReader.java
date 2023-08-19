package excersises;

public class Ex04NumberReader {
	/*
	 	Tối đa 3 chữ số
	 	TH1: 1 chữ số 
	 	1,2...9 --> In ra giá trị 
	 	TH2: 2 chữ số
	 	+ 10 -> In Mười
	 	+ 10 -14 -> Mười(chục) + Số (đơn vị)
	 	+ 15 --> 			   + Lăm
	 	
	 	+ 21--> số(Chục) + Mốt
	 	+ 25--> số(Chục) + Lăm
	 
	 	TH3: 3 chữ số 
	 	+ 100 --> số trăm(00) --> một trăm
	 	+ 101 --> số trăm() 0(chục) !0(Số) ---> Một trăm lẽ một
	 	+ 109 --> ok
	 	+ 201 .....
	 	
	 	--số hàng chục lớn hơn 0 320 --> ba trăm + TH2
	 */
	
	public static void main(String[] args) {
		System.out.println("Test read number with one digit: ");
		int[] numbers = {5, 2, 6, 0, 4};
		for(int number: numbers) {
			System.out.println(" " + number + ": "  + readNumberWith1Digit(number));
		}
		System.out.println("}\n");
	}
	private static String readNumberWith1Digit(int number) {
		if( number >= 10) {
			throw new IllegalArgumentException("This funtio is accepted for pos number less then 10 only:");
		}
		NumberMapper[] mappers = NumberMapper.values();
		return mappers[number].getNumberAsTest();
	}
}
