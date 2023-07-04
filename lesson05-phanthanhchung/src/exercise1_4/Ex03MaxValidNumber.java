package exercise1_4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

public class Ex03MaxValidNumber {
    public static void main(String[] args) {
        String textString = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter a test string: ");
        textString = sc.nextLine();

        System.out.println("The max valid number in the string is: " + getMaxValidNumber(textString));
    }

    public static int getMaxValidNumber(String testString){
        ArrayList<String> matchesList = new ArrayList<>();

        Pattern p1 = Pattern.compile("[0-9]+");
        Matcher m1 = p1.matcher(testString);

        while(m1.find()){
            matchesList.add(m1.group());
        }
        int[] numbers = new int[matchesList.size()];
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(matchesList.get(i));
        }

        Arrays.sort(numbers);

        return numbers[numbers.length - 1];
    }
}
