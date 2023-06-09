package datastructure.array;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		//Khai báo, cấp phát vùng nhớ
		
		// Mảng: + Lưu danh sách phần tử có cùng KDL, có kích thước cố định
		//		 + kiểu dữ liệu đối tượng con của class Object
		//		 + Giá trị ( 1 hoặc nhiều phần tử ) sẽ lưu ở HEAP
		//		 + Giá trị mặc định của mảng là null
		
		int[] a = null;
		
		//Khởi tạo --> cách 1
		//Tạo ra ô nhớ kèm giá trị mặc định (phụ thuộc vào KDL của từng pt trong mảng)
		
		a = new int[5];
		
		// null, null, null, null
		String[] s = new String[4];
	}
}