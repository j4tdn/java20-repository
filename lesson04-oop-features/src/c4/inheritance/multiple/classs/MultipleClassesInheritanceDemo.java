package c4.inheritance.multiple.classs;

public class MultipleClassesInheritanceDemo {
	public static void main(String[] args) {
		//Father: cooking, running
		//Mother: cooking, playBadmintion
		
		//Child extends Father, Mother
		//class extends class --> 'not required to override' ko bắt buộc override các methods của lớp cha
		//Không hỗ trợ đa kế thừa --> nếu kế thừa nhiều lớp thì lớp con sẽ ko xác định đc methods của lớp cha nào nếu 2 lớp cha đều có methods đó
		
		//solving: when multiple super classes have the same declaration method ==> required to override
		
		//java does not suport 
		
		Child c1 = new Child();
		c1.cooking();
		c1.running();
	}
}
