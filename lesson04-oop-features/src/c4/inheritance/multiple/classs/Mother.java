package c4.inheritance.multiple.classs;

public class Mother {
	
	
	void playBadminton()
	{
		System.out.println("Mother --> play badminton ");
	}
}
//java  về cơ bản k hỗ trợ đa thừa kề --> vì khi class kế thừa class k bắt buộc overide  
//-->nếu trong class cha có hàm trùng nhau (chức năng)mà body khác nhau--> không biết gọi của hàm nào
//-->