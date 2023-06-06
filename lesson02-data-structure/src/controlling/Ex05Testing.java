package controlling;

public class Ex05Testing {
	public static void main(String[] args) {
		// Viết 1 hàm tìm max của 2 số a, b int
		System.out.println("max: " + max(2, 4));
	}
	
	private static int max(int a, int b) {
		return (a > b) ? a : b;
	}
}
