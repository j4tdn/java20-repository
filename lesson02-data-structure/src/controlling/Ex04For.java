package controlling;

public class Ex04For {
	public static void main(String[] args) {
		//biết trước số lượng vòng lặp, biết trước điều kiện
		//duyệt các phần tử trong mảng, danh sách, tập hợp
		// --> for index, for each
		
		//duyệt và in các số nguyên dương <n
		int n = 12;
		int i = 1;
		for(;;) {
			System.out.print(i + " ");
			i++;
			if(i == n)
				break;
		}
		System.out.println("\n=====================\n");
		for(i = 1; i < n; i++)
			System.out.print(i + " ");
		
		System.out.println("\n=====================\n");
		//row = 5, col = 3 --> dừng for
		//gán lable --> break lable
		of : for(int row = 1; row <= 6; row++) {
			for(int col = 1; col <= 4; col++) {
				System.out.print("" + row + col + " ");
				if(row == 5 && col == 3)
					break of;
			}
			System.out.println();
		}
	}
}
