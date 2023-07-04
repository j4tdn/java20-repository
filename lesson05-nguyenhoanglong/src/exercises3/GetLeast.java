package exercises3;

public class GetLeast {
	public static void main(String[] args) {
		int[] a = {2,3};
		int[] b = {2,3,4};	
		System.out.println(getLeastCommonMultiple(a));
		System.out.println(getLeastCommonMultiple(b));
	}
	
	public static int getLeastCommonMultiple(int[] array) {
		int n = 1;
		for (int i : array) {
			n*=i;
		}
		for (int i = 1; i <= n; i++) {
			boolean c = true;
			for (int j : array) {
				if(i % j !=0) {
				c = false;
				}
			}
			if(c) {
				return i;
			}
		}
		return -1;
	}
}	
