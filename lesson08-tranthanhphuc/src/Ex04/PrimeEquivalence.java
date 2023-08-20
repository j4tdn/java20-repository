package Ex04;

import java.util.ArrayList;
import java.util.Scanner;

public class PrimeEquivalence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số N: ");
        long N = scanner.nextLong();

        System.out.print("Nhập số M: ");
        long M = scanner.nextLong();

        ArrayList<Long> primes = sieveOfEratosthenes(N);

        if (haveCommonPrimeDivisors(N, M, primes)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        scanner.close();
    }

    static ArrayList<Long> sieveOfEratosthenes(long n) {
        boolean[] isPrime = new boolean[(int) n + 1];
        for (int i = 0; i <= n; i++) {
            isPrime[i] = true;
        }

        ArrayList<Long> primes = new ArrayList<>();
        for (long p = 2; p <= n; p++) {
            if (isPrime[(int) p]) {
                primes.add(p);
                for (long i = p * p; i <= n; i += p) {
                    isPrime[(int) i] = false;
                }
            }
        }

        return primes;
    }

    static boolean haveCommonPrimeDivisors(long num1, long num2, ArrayList<Long> primes) {
        for (long prime : primes) {
            while (num1 % prime == 0) {
                num1 /= prime;
            }
            while (num2 % prime == 0) {
                num2 /= prime;
            }
        }
        return num1 == 1 && num2 == 1;
    }
}
