package orcaww;

public class Ex01BassicOperatorDemo {
     public static void main(String[] args) {
		int a = 5;
		
		a = a + 2; //2
		
		a -= 3; //4
		System.out.println("a -->"+ a );
		
		// operator: ++ -- --> prefix, sufix
		 //int b = a++;
		//int b = ++a;
		
		// ++ --
		//prefix : tăng/giảm vào giá trị rồi dùng giá trị tăng giảm để sử lý
		
		// sufix : dùng giá trị hiện tại đi xử lý sau đó mới tăng/giảm
		 
		 System.out.println("a1 -->" + (++a));
		 System.out.println("a2 -->" + (a++));
		 
		 // a = 6
		 int b = a-- + --a + ++a;
		 System.out.println("b --> " + b);
		 
		 int x = 3; 
		 int y = 2;
		 int z = 4;
		  y -= ++z - --x + z-- + y + --z;
		  System.out.println("x --> " + x);
		  System.out.println("y --> " + y);
		  System.out.println("z --> " + z);
		  
		  boolean isEven = (x % 2 == 0);
		  boolean isMultipleOf3 = (y % 3 == 0 );
		   System.out.println("isEvent --> "+ isEven);
		   System.out.println(" ! isEvent --> "+ !isEven);
		   System.out.println("isMultipleOf3 --> "+ isMultipleOf3);
		   System.out.println(" !isMultipleOf3 --> "+ !isMultipleOf3);
		   
		   // tóan tử && ||  code logic
		   // && true khi tất cả biểu thức đều đúng
		   
		   // boolean KQ = BT1 && BT2
		   
		   // BT1(boolean) BT2(boolean) KQ(boolean)
		   //  F           X             F
		   //  T           F             F
		   //  T           T             T
		   //             = BT1 & BT2 --> TẤT CẢ CÁC BIỂU THỨC LUÔN THỰC THI		
		   
		   
		   
            // boolean KQ = BT1 || BT2
		   
		   // BT1(boolean) BT2(boolean) KQ(boolean)
		   //  F           X             F
		   //  T           F             F
		   //  T           T             T
		   //             = BT1 | BT2 --> TẤT CẢ CÁC BIỂU THỨC LUÔN THỰC THI		
		   
		   x= 2; 
		   y =4;
		   boolean isCorect = (x++ > 2 && --y > 2);
		   System.out.println("isCorect --> + isCorect");
		   System.out.println(" x -->   "+ x);
		   System.out.println("y -->  "+ y);
		   // toán tử --> & |  AND OR khi thao tác với bit
	}
}
