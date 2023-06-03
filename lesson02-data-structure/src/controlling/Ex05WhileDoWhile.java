package controlling;

public class Ex05WhileDoWhile {
	public static void main(String[] args) {
		int n=8;
		int i=1;
		while(i<8) {
			i++;
			System.out.println(i+ " ");
		}
		System.out.println("\n========================\n");
		while(true) {
			System.out.println(i+ " ");
			i++;
			if(i==8) {
				break;
			}
		}
	}
}
