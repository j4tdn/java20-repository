package Ex02DominoChainLength;

public class Ex02DominoChainLength {
	
	public static void main(String[] args) {
		
		Domino[] dominos = new Domino[] {
				new Domino(1, 0),
				new Domino(2, 5),
				new Domino(3, 6),
				new Domino(4, 8),
				new Domino(5, 50)
		};
		
		int longest = 0;
		int chLength = 0;
		for (int i = 0; i < dominos.length-1; i++) {
			if(dominos[i].checkDistance(dominos[i+1].getPosition())) {
				if(chLength == 0) {
					chLength++;
				}
				chLength++;
			} else {
				if(chLength>longest) {
					longest = chLength;
				}
				chLength = 0;
			}
		}
	
		System.out.println(longest);	
	}
}
