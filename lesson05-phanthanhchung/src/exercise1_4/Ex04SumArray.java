package exercise1_4;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex04SumArray {
    public static void main(String[] args) {
        int[] sequence = {1, 5, 8, 9, 2, 5, 9};
        int[] sequence2 = {4, 2, 6, 6, 4, 15, 1};
        System.out.println("Tổng của dãy 1: " + sum(sequence));
        System.out.println("Tổng của dãy 2: " + sum(sequence2));
    }

    public static int sum(int[] sequence){
        ArrayList<Integer> numbersList = new ArrayList<Integer>();
        int[] tempSequence = sequence.clone();
        Arrays.sort(tempSequence);

        int min = 0;
        int max = tempSequence.length - 1;

        for(int i = 0; i < tempSequence.length; i++){
            if(tempSequence[i] != tempSequence[min] && tempSequence[i] != tempSequence[max]){
                if(!numbersList.contains(tempSequence[i]))
                    numbersList.add(tempSequence[i]);
            }
        }

        int sum = 0;
        for(Integer n : numbersList){
            sum += n;
        }

        return sum;
    }
}
