package pattern.strategy;

import java.util.Arrays;
import java.util.concurrent.locks.Condition;

import utils.ArraysUtils;

public class Ex02ArrayOperations {
	public static void main(String[] args) {
		/*
		 Đề bài: Cho các danh sách số nguyên dương [1;20]
		 Yêu cầu:
		 	+ Tìm những phần tử là số lẻ trong mảng
		 	+ Tìm những phần tử là số chẵn trong mảng
		 	+ Tìm những phần tử là số nguyên tố trong mảng
		 	+ Tìm những phần tử là số hạnh phúc trong mảng
		 */
		
		int[] numbers = {2,9,3,7,17,22,40,56,44};
		System.out.println("");
		System.out.println(Arrays.toString(getOddNumbers(numbers, new pattern.strategy.Condition() {
			
			@Override
			public boolean test(int number) {
				return number % 2 != 0;
			}
		}))); 
		
		ArraysUtils.generate("Tìm những phần tử là số lẻ trong mảng", getOddNumbers(numbers,new pattern.strategy.Condition() {
			
			@Override
			public boolean test(int number) {
				return number % 2 != 0;
			}
		}));
		ArraysUtils.generate(
				"Tìm những phần tử là số chẵn trong mảng", 
				getEvenNumbers(numbers, num ->{
					return num % 2 == 0;
		}));
		ArraysUtils.generate("Tìm những phần tử là số nguyên tố trong mảng", getPrimeNumbers(numbers));
	}
	/*
	 isPrime(number)
	 number % 2 == 0
	 number % 2 != 0
	
	Xác định các biểu thức (hàm,chiến lược) truyền vào input, output là gì
	Như VD
	 input: number
	 output: true/false
	--> Strategy: boolean strategy(int number)
	
	Tên hàm bất kỳ, tên biến bất kỳ
	 quan trọng: tham số KDL gì, KDL trả về là KDL gì
	
	Trong Java không cho phép truyền tham số qua hàm là một hàm khác
	Tham số chỉ được phép là KDL, NT, ĐT
	
	Tạo ra 1 pattern.strategy interface để chứa Strategy(abtract method trong interface đó)
	
	public interface condition{
		boolean test(int number);
	}
	
	Lấy FI là tham số truyền vào hàm
	Ai muốn truyền biểu thức gì thì override hàm trừu tượng trong FI
	--> Giống mình đang truyền hàm thành tham số
	*/
	//Lẻ
	private static int[] getOddNumbers(int[] numbers, pattern.strategy.Condition cdn) {
		int[] result = new int[numbers.length];
		int run = 0;
		for(int num : numbers) {
			if(cdn.test(num))
				result[run++] = num;
		}
		return Arrays.copyOfRange(result, 0, run);
	}
	
	//Chẵn
	private static int[] getEvenNumbers(int[] numbers, pattern.strategy.Condition cdn) {
		int[] result = new int[numbers.length];
		int run = 0;
		for(int num : numbers) {
			if(cdn.test(num))
				result[run++] = num;
		}
		return Arrays.copyOfRange(result, 0, run);
	}
	
	//Số nguyên tố
	private static int[] getPrimeNumbers(int[] numbers) {
		int[] result = new int[numbers.length];
		int run = 0;
		for(int num : numbers) {
			if(isPrime(num))
				result[run++] = num;
		}
		return Arrays.copyOfRange(result, 0, run);
	}
	
	private static boolean isPrime(int number) {
		if(number < 2) return false;
		for(int i = 2; i <= Math.sqrt(number);i++){
			if(number % i == 0) return false;
		}
		return true;
	}
	
	public static void generate(String prefix, int[] elements) {
		System.out.println(prefix + " --> { ");
		for(Object element : elements) {
			System.out.println("\t" + element);
		}
		System.out.println("}");
	}
}
