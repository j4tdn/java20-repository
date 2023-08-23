package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04EquivalentPrimes {
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please enter number A: ");
        long a = sc.nextLong();
        System.out.println();

        System.out.println("Please enter number B: ");
        long b = sc.nextLong();

        if (isEquivalentPrimes(a, b)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    private static boolean isEquivalentPrimes(long a, long b){
        if(isPrime(a) && isPrime(b)){
            return false;
        }
        if(primeFactorial(a).equals(primeFactorial(b))) {
            return true;
        }
        return false;
    }

    private static ArrayList<Long> primeFactorial(long a){
        ArrayList<Long> factorial = new ArrayList<>();
        double limit = (double) a /2;
        for(long i = 2; i <= limit; i++){
            if(a % i == 0 && !factorial.contains(i)){
                factorial.add(i);
                a /= i;
            }
            while(a % i == 0){
                a /= i;
            }
        }
        return factorial;
    }

    private static boolean isPrime(long a){
        for(int i = 3; i <= Math.sqrt(a); i+=2){
            if(a % i == 0){
                return false;
            }
        }
        return true;
    }
}
