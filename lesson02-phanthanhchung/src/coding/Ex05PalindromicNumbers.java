package coding;
import java.util.Scanner;

public class Ex05PalindromicNumbers {
    public static void main(String[] args) {
        String testnum = inputNumber();
        if(checkPalindromicNumbers(testnum))
            System.out.println("The number " + testnum + " is a palindromic number.");
        else
            System.out.println("The number " + testnum + " is not a palindromic number.");
    }

    public static String inputNumber() {
        Scanner in = new Scanner(System.in);
        int number = 0;
        String testnum = "";
        while (true) {
            try {
                System.out.println("Please enter an integer to check for palindromic number: ");
                testnum = in.nextLine();
                number = Integer.parseInt(testnum);
                if (number < 10)
                    System.out.println("The number must be positive and have at least 2 digits. Please try again.");
                else
                    break;
            } catch (NumberFormatException e) {
                System.out.println("That was not a number, please try again.");
                System.out.println();
            }
        }
        return testnum;
    }
    // for example, if a number is: 12321, we only iterate i from 0 to 2 (the middle index)
    // if a number is : 1441, we only iterate i from 0 to 1 (the middle index)
    // if a number is : 123321, we only iterate i from 0 to 2 (the middle index)
    public static boolean checkPalindromicNumbers(String testnum){
        int numofdigits = (int) Math.log10(Integer.parseInt(testnum)) + 1;
        int lastindex = numofdigits - 1;
        for(int i = 0,j = lastindex; i <= numofdigits/2 - 1; i++, j--){
            if(testnum.charAt(i) != testnum.charAt(j))
                return false;
        }
        return true;
    }
}

    // if a number has 7 digits like: 1234567, we only iterate i from 0 to (7/2 - 1) digits, that means from 0 to 2
