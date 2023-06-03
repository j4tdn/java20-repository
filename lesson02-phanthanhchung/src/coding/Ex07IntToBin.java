package coding;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07IntToBin {
    public static void main(String[] args) {
        System.out.println("Please enter an integer N to calculate the binary equivalent: ");
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        convertToBinary(N);
    }

    public static void convertToBinary(int N){
        ArrayList<Integer> binary = new ArrayList<>();
        int tempremainder;
        while(N > 0){
            tempremainder = N % 2;
            binary.add(tempremainder);
            N /= 2;
        }

        System.out.println("The binary equivalent of N is: ");
        for(int i = binary.size() - 1; i >= 0; i--){
            System.out.print(binary.get(i));
        }
    }
}
