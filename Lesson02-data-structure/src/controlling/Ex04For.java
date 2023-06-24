package controlling;


public class Ex04For {
	public static void main(String[] args) {
		//duyệt và in ra n các phần tử các số nguyên dương nhỏ hơn n
		//sử dụng for khi
		// biết trước số lượng vòng lặp, biết trước điều kiện dừng
		//--> duyệt các phần tử trong mảng, danh sách, tập hợp 
		// --for index, for each
		int n = 12;
		for(int i = 1; i < n; i++) {
			System.out.print(i + "");
			   
		}
		System.out.println();
		of: for(int row = 1; row <= 6; row++) {
			for(int col = 1; col <=4; col++) {
				System.out.print("" + row + col + " ");
				if(row == 5 && col == 3) {
					break of;
				}
			}
			System.out.println();
		}
	}
}
