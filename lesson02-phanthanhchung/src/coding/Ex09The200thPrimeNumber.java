package coding;

import java.util.Scanner;

public class Ex09The200thPrimeNumber {
    public static void main(String[] args) {
        System.out.println("The 200th prime number is: "+ findPrimeNum(200));
    }

    public static int findPrimeNum(int index){
        int i = 1;
        int count = 0;
        while(true){
            if(checkPrime(i) && count == index)
                break;
            else if(checkPrime(i))
                count++;
            if(count != index)
                i++;
        }
        return i;
    }

    public static boolean checkPrime(int number){
        if(number < 2) return false;
        if(number == 2) return true;
        if(number % 2 == 0) return false;
        for(int i = 3; i <= Math.sqrt(number); i+=2) {
            if(number % i == 0) return false;
        }
        return true;
    }
}
