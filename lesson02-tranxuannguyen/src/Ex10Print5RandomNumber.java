import java.util.ArrayList;
import java.util.Random;

public class Ex10Print5RandomNumber {
	public static void main(String[] args) {
		Random random = new Random();
        ArrayList<Integer> numbers = new ArrayList<Integer>();

        while (numbers.size() < 5) {
            int num = random.nextInt(19,31);
            if (!numbers.contains(num)) {
                numbers.add(num);
            }
        }

        System.out.println("5 so nguyen ngau nhien khong trung lap tu 20 den 30 la: ");
        for (int i = 0; i < numbers.size(); i++) {
            System.out.print(numbers.get(i) + " ");
        }
	}
}
