package c4.intheritance.multiple.classs;

public class MultipleClassesInheritanceDemo {
	public static void main(String[] args) {
		//class:Father :cooking, running
		//class:Mother:playBathminton
		//Child extends Father,Mother
		
		//java không hỗ trợ đa thừa kế vì không bắt buộc override 
		//nếu như kế thừa lớp cha có những phương thức trùng 
		//nhau thì sẽ không biết lấy của ai
		
	
		//class extends class --> 'not reqeired to override'
		
		
		Child c1 = new Child();
		c1.cooking();
		c1.running();
	}
}
