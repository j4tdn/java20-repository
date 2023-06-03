package coding;
import java.util.Arrays;
import java.util.Random;
public class Ex04SumOfFactorials {
    public static void main(String[] args) {
        int[] numbers = createIntArray();
        sumFactorials(numbers);
    }

    public static int[] createIntArray(){
        int[] numbers = new int[4];
        for(int i = 0; i < numbers.length; i++){
            Random ran = new Random();
            numbers[i] = ran.nextInt(10,21);
        }
        return numbers;
    }
    public static void sumFactorials(int[] numbers) {
        long sumfactorial = 0;
        System.out.println("The four numbers are: " + Arrays.toString(numbers));
        for (int i : numbers) {
            sumfactorial += Factorial(i);
        }
        System.out.print("The sum of the factorials of these numbers is: ");
        System.out.println(sumfactorial);
    }
    public static long Factorial(int n){
        long factorial = 1;
        for(int i = 1; i <=n ; i++){
            factorial *= i;
        }
        return factorial;
    }
}
