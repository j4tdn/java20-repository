import java.util.ArrayList;
import java.util.List;

public class Ex01 {
	public static void main(String[] args) {
        int[] arr1 = {2, 8, 9, 1, 6};
        int[] arr2 = {2, 1, 1, 8, 9};
        List<Integer> commonElements = findCommonElements(arr1, arr2);
        System.out.println("Common Elements: " + commonElements);
    }
	
    public static List<Integer> findCommonElements(int[] arr1, int[] arr2) {
        List<Integer> commonElements = new ArrayList<>();

        int i = 0;
        int j = 0;

        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] == arr2[j]) {
                commonElements.add(arr1[i]);
                i++;
                j++;
            } else if (arr1[i] < arr2[j]) {
                i++;
            } else {
                j++;
            }
        }
        return commonElements;
    }
}