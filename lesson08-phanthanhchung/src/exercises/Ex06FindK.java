package exercises;

import java.util.Scanner;

public class Ex06FindK {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter number K: ");
        int k = sc.nextInt();
        StringBuilder sequence = new StringBuilder();
        for(int i = 1; ;i++){
            sequence.append(i);
            if(sequence.length() > k)
                break;
        }

        System.out.println("The number at position " + k + " is " + sequence.charAt(k - 1) + ".");
    }
}
