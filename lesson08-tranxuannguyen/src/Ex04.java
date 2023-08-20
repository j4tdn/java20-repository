import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ex04{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số tự nhiên N: ");
        int N = scanner.nextInt();

        System.out.print("Nhập số tự nhiên M: ");
        int M = scanner.nextInt();

        boolean areEquivalent = checkEquivalentPrimes(N, M);

        if (areEquivalent) {
            System.out.println(N + " và " + M + " là nguyên tố tương đương.");
        } else {
            System.out.println(N + " và " + M + " không là nguyên tố tương đương.");
        }
    }

    public static boolean checkEquivalentPrimes(int N, int M) {
        Set<Integer> primeFactorsN = getPrimeFactors(N);
        Set<Integer> primeFactorsM = getPrimeFactors(M);

        return primeFactorsN.equals(primeFactorsM);
    }

    public static Set<Integer> getPrimeFactors(int number) {
        Set<Integer> primeFactors = new HashSet<>();

        for (int i = 2; i <= number; i++) {
            while (number % i == 0) {
                primeFactors.add(i);
                number /= i;
            }
        }

        return primeFactors;
    }
}