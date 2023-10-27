package view.stream;

import java.util.List;
import java.util.function.Consumer;

public class Ex08Reduce {
	public static void main(String[] args) {
		List<Integer> numbers =List.of(1,2,3,4,5,6,7,8);
		
		//sum
//		int sum =numbers.stream()
 //				.reduce(0,(a,b)->a+b);
		int sum =numbers.stream()
				.reduce(0,Integer::sum);
		System.out.println("Reduce sum --> "+sum);
		var optMax = numbers.stream().reduce(Integer::max);
		optMax.ifPresent(val -> System.out.println("Reduce max:"+val));
		
		/*
		  public void ifPresent(Consumer<? super T> action) {
		        if (value != null) {
		            action.accept(value);
       		}
    	}
		 */
		
		
		int lcm = numbers.stream().reduce(1,(a,b)->(a*b)/gcd(a,b));
		System.out.println("reduce least commont multiple --> "+lcm );
	}
	private static int gcd(int a,int b)
	{
		while(a!=b)
		{
			if(a>b)
			{
				a=a-b;
				
			}
			else {
				b=b-a;
			}
		}return a;
	}
}
