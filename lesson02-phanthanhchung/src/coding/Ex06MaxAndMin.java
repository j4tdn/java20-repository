package coding;

import java.util.Scanner;
public class Ex06MaxAndMin {
    public static void main(String[] args) {
        int[] numbers = new int[3];
        inputArray(numbers);
        findMaxAndMin(numbers);
    }

    public static void inputArray(int[] numbers){
        Scanner in = new Scanner(System.in);
        boolean truth = true;
            for(int i = 0; i < numbers.length; i++){
                truth = true;
                while(truth){
                try {
                    System.out.printf("Please enter the #%d number: ", i);
                    String tempnum = in.nextLine();
                    int realnum = Integer.parseInt(tempnum);
                    if(realnum < 0 || realnum >= 20) {
                        System.out.println("Number not in the range of [0, 20), please try again: ");
                        System.out.println();
                    } else{
                        numbers[i] = realnum;
                        truth = false;
                        System.out.println("Number accepted.");
                        System.out.println("*************========*************");
                    }
                } catch(NumberFormatException e){
                    System.out.println("That was not a number, please try again.");
                    System.out.println();
                }
            }
        }
    }

    public static void findMaxAndMin(int [] numbers){
        //System.out.println("The maximum number is: " + Math.max(numbers[0], Math.max(numbers[1], numbers[2])));
        //System.out.println("The minimum number is: " + Math.min(numbers[0], Math.min(numbers[1], numbers[2])));
        int min = numbers[0];
        int max = numbers[0];
        for(int i : numbers){
            if (i > max)
                max = i;
            if (i < min)
                min = i;
        }

        System.out.println("The maximum number is: " + max);
        System.out.println("The minimum number is: " + min);
    }
}
