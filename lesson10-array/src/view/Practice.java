package view;

import java.util.Arrays;

import functional.Condition;
import functional.Operator;
import utils.ArraysUtils;

public class Practice {
	public static void main(String[] args) {
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		ArraysUtils.generate("Tìm các số chẵn trong mảng",
							filterArraysByCondition(numbers, a -> a % 2 == 0));
		
		ArraysUtils.generate("Tìm các số lẻ trong mảng",
				filterArraysByCondition(numbers, a -> a % 2 != 0));
		
		ArraysUtils.generate("Tìm các số nguyên tố trong mảng",
				filterArraysByCondition(numbers, a -> isPrime(a)));
		
		System.out.println("Tổng --> " +
				calcNumberInArraysByCondition(0, numbers, (a,b)->{
					return a + b;
				}));
					
		System.out.println("Hiệu --> " + calcNumberInArraysByCondition(0, numbers, (a,b) -> a - b));
		
		System.out.println("Số lớn nhất --> " + calcNumberInArraysByCondition(Integer.MIN_VALUE, 
												numbers, (a,b) -> a > b ? a : b));
		
		System.out.println("Số nhỏ nhất --> " + calcNumberInArraysByCondition(Integer.MAX_VALUE, 
				numbers, (a,b) -> a > b ? b : a));
	}
	
	private static boolean isPrime(int number) {
		if(number < 2) return false;
		for(int i = 2; i <= Math.sqrt(number);i++){
			if(number % i == 0) return false;
		}
		return true;
	}
	
	public static int[] filterArraysByCondition(int[] nums, Condition cdn) {
		int[] result = new int[nums.length]; int count =0;
		for(int i = 0 ; i < nums.length;i++) {
			if(cdn.test(nums[i])) {
				result[count++] = nums[i];
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
	
	public static int calcNumberInArraysByCondition(int initial, int[] nums, Operator operator) {
		int result = initial;
		for(int i = 0 ; i < nums.length;i++) {
			result = operator.calc(result, nums[i]);
		}
		return result;
	}
	
	
	
	// Tìm tổng phần tử mảng
	// Tìm hiệu phần tử mảng
	// Tìm số lớn nhất trong phần tử mảng
	// Tìm số nhỏ nhất trong phần tử mảng
}
