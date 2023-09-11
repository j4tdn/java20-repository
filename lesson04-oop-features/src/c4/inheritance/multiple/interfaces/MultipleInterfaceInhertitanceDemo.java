package c4.inheritance.multiple.interfaces;

public class MultipleInterfaceInhertitanceDemo {
	public static void main(String[] args) {
		//Từ phiên bản JDK 1.8 --> Interface có thể có phần body nếu có:
		//+'default'
		//+'static'
		//+'private' 1.9
		
		//Đối với phương thức trong Interface có 
		//body thì phần con không cần thiết phải overide
		
		//Nếu như phần cha và mẹ có cùng default method nhưng khác body thì:
		//Con cần phải override default methods
		//-->using body từ T1
		//-->using body từ T2
		//-->using body từ cả hai
		//-->using body từ chính con
		
		
		//what is difference between interface & abstract class
		/*
		 * --> Diff:
		 * -Interface:
		 * Hỗ trợ multiple implement
		 * Thuộc tính auto public final
		 * Methods auto public abstrac
		 * 
		 * -Abstract
		 * Hỗ trợ singer extends
		 * Thuộc tính k có gì đặc biệt
		 * Methods phụ thuộc vào acsses modifer
		 * 
		 * + từ JDK 1.0 -->1.7
		 * -Interface:
		 * Chỉ chứa hàm abstract
		 *  
		 * -Abstract class:
		 * Có thể chứa abstract và phần body methods
		 * 
		 * +từ JDK 1.8 -->now
		 * -Interface:
		 * Có thể có abstract và body methods(default, static, private)
		 * 
		 * -Abstract:
		 * Có thể có abstract và body methods
		 * */
		//multiple implement còn class thì là singer extend
		Child c1 = new Child();
		c1.cooking();
		c1.playBadminton();
		c1.running();
		c1.coding();
	}
}
