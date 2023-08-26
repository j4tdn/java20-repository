package view.test02;

public class Ex04StringGeneration {

	static int n = 3;
	
	static final int MAX = n + 1;
	
	// Đánh dấu chưa phần tử nào đã/chưa được sử dụng
	static boolean[] flags = new boolean[MAX]; // {false, false, false, false}
	
	// Lưu hoán vị vào mảng A
	static int[] A = new int[MAX];     // {0, 0, 0, 0}

	public static void main(String[] args) {
		// Problem solving --> Validation, IsHappy, MaxStringNumber
		// --> Nắm kỹ phần coding + tư duy code, quen dạng --> giải quyết

		// Algorithm --> Sorting(sắp xếp), BackTracking(quay lui), Recursive(đệ quy)
		// --> Đọc tài liệu xem và [nhớ] hiểu cách thức hoạt động của thuật toán
		// --> Nắm dạng bài mình sẽ gặp với từng thuật toán

		// Sử dụng problem solving để giải quyết alogorithm cũng được
		// Thường thì nó sẽ ko hay, cost time - performance

		// Với n = 3, bắt đầu tại k = 1
		Try(1);
	}

	static void Try(int k) {
		for (int i = 1; i <= n; i++) {
			// Kiểm tra nếu phần tử chưa được chọn thì sẽ đánh dấu
			if (!flags[i]) {
				// Lưu một phần tử vào hoán vị
				A[k] = i;

				// Đánh dấu đã dùng
				flags[i] = true;

				// Kiểm tra nếu đã chứa một hoán vị thì xuất
				if (k == n) {
					print();
				} else {
					Try(k + 1);
				}
				
				flags[i] = false;
			}
		}
	}
	
	static void print() {
		for (int i = 1; i <= n; i++) {
			System.out.print(A[i] + " ");
		}
		System.out.println();
	}
}
