package c4.inheritance.multiple.classs;

public class MultipleClassesInheritanceDemo {
	public static void main(String[] args) {
		
		//father: cooking, running
		//mother: playBadminton, cooking
		
		//Child extends father, mother
		
		//class extends class --> not required to override
		//solving: when multiple super classes have the same declaration method
		//--> require to override
		
		//java does not support multiple inheritance method
		Child c1 = new Child();
		c1.cooking();
		c1.running();
	}
}
