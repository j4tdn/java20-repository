package coding;

import java.util.Scanner;
public class Ex03Factorial {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Please enter an integer to calculate the factorial: ");
        int num = in.nextInt();
        System.out.println("The factorial of n is: " + factorial(num));
    }

    public static int factorial(int n){
        int factorial = 1;
        for(int i = 1; i <=n ; i++){
            factorial *= i;
        }
        return factorial;
    }
}
