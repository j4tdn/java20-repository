package controlling;

public class Ex04For {
	public static void main(String[] args) {
		// duyệt và in ra các số nguyên dương < n
		// sử dụng for
		// --> biết trước số lượng vòng lặp, và điều kiện dừng
		// --> duyệt các phần tử trong mảng, danh sách, tập hợp --> for index, for each
		
		// break: thoát khỏi vòng lặp hiện tại
		// continue: bỏ qua phần chưa thực thi của lần lặp hiện tại
		
		int n = 12;
		for (int i = 1; i < n; i++) {
			System.out.print(i + " ");
		}
		System.out.println("\n==============\n");

		for (int i = 1; i < n; i++) {
			System.out.print(i + " ");
			if (i == 5) continue;
			System.out.println("hello");
		}
		System.out.println("\n==============\n");
		
		// label --> break, continue
		ff: for (int row = 1; row <= 6; row++) {
				for (int col = 1; col <= 4; col++) {
					System.out.print("" + row + col + " ");
					if (row == 5 && col == 3) {
						break ff;
					}
				}
				System.out.println();
			}

		System.out.println("\n====== Finished main=====\n");
	}
}
