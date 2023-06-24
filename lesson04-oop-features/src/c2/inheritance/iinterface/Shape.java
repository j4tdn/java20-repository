package c2.inheritance.iinterface;

//class, enum, interface --> 'type'
public interface Shape {
	
	//abstract methods --> Hàm trừu tượng 
	//bắt buộc phải được override trong KDL (ko phải kiểu trừu tượng ) con;
	
	//mặc định: public abstract
	void paint();
	
	void cals();
}
