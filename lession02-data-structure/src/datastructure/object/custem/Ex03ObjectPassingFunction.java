package datastructure.object.custem;
//tên : truyền đối tượng qua hàm
public class Ex03ObjectPassingFunction {
	public static void main(String[] args) {
		//phạm vi sử dụng -->block scope
		Item itX = new Item(7,'T',77f);
		itX.name= 'X';
		System.out.println("itX address --> "+ System.identityHashCode(itX));
		System.out.println(itX);
		System.out.println("\n------Update value-----\n");
		modify(itX);
		System.out.println("itX address --> "+ System.identityHashCode(itX));
		System.out.println(itX);
	}
	// = --> gán ở stack
	// JAVA passing by value at Stack =
	
	//modify(null) --> Item it = null
	//modify(new Item (2,'T',22f); -->Item it = new Item(2,'T'22f)
	//modify(itX) --> Item it =itX
	private static void modify(Item it)
	{
		it.id =111;
		it =new Item(3,'B',33f);
		it.id =6;
		it.name = 'S';
	}
}

	//itX là hai biến :vì phạm vi hoạt động khác nhau(hai hàm khác nhau)
