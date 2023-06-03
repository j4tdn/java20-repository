package coding;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Ex10RandomIntegers {
    public static void main(String[] args) {
        int lowerbound = 20;
        int upperbound = 31;
        createRandomIntegers(lowerbound, upperbound);
    }

    public static void createRandomIntegers(int lower, int upper){
        Random ran = new Random();
        ArrayList<Integer> generatednums = new ArrayList<>();
        int count = 0;
        while(count != 5) {
            int next = ran.nextInt(lower, upper);
            if(!generatednums.contains(next)) {
                generatednums.add(next);
                count++;
            }
        }

        System.out.println("The list of random numbers is: " + generatednums.toString());
    }
}
