package controlling;

public class Ex04For {
	public static void main(String[] args) {
		// Duyệt và in ra các số nguyên dương < n
		// Sử dụng for khi
		// -> Biết trước số lượng vòng lặp, biết trước điều kiện dừng
		// --> Duyệt các phần tử trong mảng, danh sách, tập hợp
		//     -- for index, for each
		
		// break: thoát khỏi vòng lặp hiện tại
		// continue: bỏ qua phần chưa thực thi của lần lặp hiện tại
		
		int n = 12;
		int i = 1;
		for (;;) {
			System.out.print(i + " ");
			i++;
			if (i == n) {
				break;
			}
		}

		System.out.println("\n======== continue ==========\n");

		for (i = 1; i < n; i++) {
			System.out.println("prefix");
			System.out.println(i);
			if (i == 8) {
				continue;
			}
			System.out.println("suffix");
		}

		System.out.println("\n==================\n");
		// row = 5, col = 3 --> kết thúc for
		ff: for (int row = 1; row <= 6; row++) {
			for (int col = 1; col <= 4; col++) {
				System.out.print("" + row + col + " ");
				if (row == 5 && col == 3) {
					break ff;
				}
			}
			System.out.println();
		}

		System.out.println("\n==== Finished main ===");

		// S1
		// S2
		// S3
		// S4
		// S5
		// S6
		// S7
		//  -- A --> S8
		//  -- B --> S18
		// if (A) {
			// S8
			// S9
			// S10
			// S11
			// S12
			// S13
			// S14
			// S15
			// S16
			// S17
	    // }
		// S18
		// S19
	}
}
