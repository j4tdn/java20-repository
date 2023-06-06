package controlling;

public class Ex04For {
	public static void main(String[] args) {
		//duyêtj và in ra các số nguyên dương <n;
		int n = 12;
		for(int i=1 ;i < n; i++) {
			System.out.println(i+ " - ");
		}
		System.out.println("\n=============\n");
		
		ff: for (int row =1; row<=6; row++) {
			for (int col =1; col <=4; col++) {
				System.out.print(""+ row + col + " ");
				if (row ==5 && col == 3) {
					break ff;
				}
			}
			System.out.println();
		}
	}
}
