package c2.intheritance.interfacee;

//class,enum,interface -->type

//Hàm không có BODY gọi là hàm trừu tượng ,chỉ được tạo trong interface

//Bắt buộc phải được override trong KDL(không phải kiểu trừu tượng) con

//mặc định: public abstract
public interface Shape {
	void paint();
	
	void calS();
}
