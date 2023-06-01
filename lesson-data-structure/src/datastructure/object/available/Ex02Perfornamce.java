package datastructure.object.available;

public class Ex02Perfornamce {
	public static void main(String[] args) {
		long N = 3000000000l;// 1 trieu
		
		// vong lap for
		
		//kdl doi tuong new
		// epoch time --> moc thoi gian cho he dieu hanh su dung
		// de tinh toan thoi gian --> 1.1.1970 mid might
		
		
		//System.currentTimeMillis(); --> thoi gian hien tai
		// so ms ti hien tai ve epoch time
		long start = System.currentTimeMillis();
		for (long i = 1; i<=N; i++) {
			Integer iA= new Integer(99);
			Integer iB= new Integer(99);
		}
		long end = System.currentTimeMillis();
		System.out.println("duration = " + (end- start)+ "(ms)");
		
		// STACK --> 6 ti
		// HEAP --> 6 ti
		
		
		System.out.println("\n ====================/n");
		 start = System.currentTimeMillis();
		for (long i = 1; i<=N; i++) {
			Integer iA= 99;
			Integer iB= 99;
		}
		 end = System.currentTimeMillis();
		System.out.println("duration = " + (end- start)+ "(ms)");
		// STACK --> 6 ti
				// HEAP --> 1
			
		}
	}


