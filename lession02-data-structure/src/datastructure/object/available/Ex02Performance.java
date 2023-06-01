package datastructure.object.available;

public class Ex02Performance {
	public static void main(String[] args) {
		long N = 3000000000l;
		
		//KDL đối tượng  new
		//epoch time --> mốc thời gian cho các hệ điều hành sử dụng
		// để tính toán thời gian --> 1.1.1970 mid night
		
		//27.5.2023
		 
		long start = System.currentTimeMillis();
		for(long i= 1;i<=N;i++)
		{
			Integer iA = new Integer(99);
			Integer iB = new Integer(99);
			
			//Stack --> 2 triệu
			//Heap --> 2 triệu
		}
		long end = System.currentTimeMillis();
		System.out.println("Duration = "+ (end -start)+ "(ms)");
		
		
		//KDL đối tượng constant pool
		
		 start = System.currentTimeMillis();
		for(long i= 1;i<=N;i++)
		{
			Integer iA =99;
			Integer iB =99;
			//Stack --> 6 tỉ
			//Heap --> 1
		}
		end = System.currentTimeMillis();
		System.out.println("Duration = "+ (end -start)+ "(ms)");
	
}
}