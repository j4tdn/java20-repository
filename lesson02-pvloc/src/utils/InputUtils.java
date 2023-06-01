package utils;
import java.util.Random;
import java.util.Scanner;
public class InputUtils {
	private static Scanner ip = new Scanner(System.in);
	private static Random rd = new Random();

	public static int input(String prefix, int maxWrongTimes, int limit) {
		int wrongTimes = 0;
		String text = "";
		do {
			// Toán tử 3 ngôi
			String suffix = wrongTimes > 0 ? "(" + wrongTimes + "): " : ": ";
			// nhập lại
			System.out.print(prefix + suffix);
			text = ip.nextLine();
			// {0,} --> so luong ki tu tu 0 den n = *
			if ((text.matches("[1-9][0-9]{0,}") || text.matches("[0][0-9]{1,}")) && (Integer.parseInt(text) <= limit)) { // 2...
				break;
			}
			wrongTimes++;
			if (wrongTimes == maxWrongTimes) {
				System.out.println("Wrong times = " + maxWrongTimes + " ... Exit ...");
				System.exit(0);
			}
		} while (true);
		return Integer.parseInt(text);
	}

	public static int random(int inclusiveStart, int inclusiveEnd) {
		return inclusiveStart + rd.nextInt(inclusiveEnd - inclusiveStart + 1);
	}
}
