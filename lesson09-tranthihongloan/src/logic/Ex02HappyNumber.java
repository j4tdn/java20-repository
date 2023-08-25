package logic;

public class Ex02HappyNumber {
	public static void main(String[] args) {
		int number = 44;
		
		if(checkHappyNumber(number)) {
			System.out.println(number + " là số hạnh phúc");
		} else {
			System.out.println(number + " là số FA");
		}
	}
	
	public static boolean checkHappyNumber(int x) {
		do {
			String st = "" + x;
			int s = 0;
			
			for (char c : st.toCharArray()) {
				String numStr = "" + c;
				s = s + Integer.parseInt(numStr)*Integer.parseInt(numStr);
			}
			x = s;
		} while(x > 1);
		
		if(x==1) {
			return true;
		}

		return false;
	}
}
