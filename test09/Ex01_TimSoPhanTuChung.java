package test09;

import java.util.ArrayList;
import java.util.Arrays;

public class Ex01_TimSoPhanTuChung {
	public static void main(String[] args) {
        int[] array1 = {2, 8, 9, 1, 6};
        int[] array2 = {2, 1, 1, 8, 9};
        int[] commonElements = timCacPhanTuChung(array1, array2);
        System.out.println("Các phần tử chung trong hai mảng:");
        for (int element : commonElements) {
            System.out.print(element + " ");
        }
    }
    public static int[] timCacPhanTuChung(int[] array1, int[] array2) {
        Arrays.sort(array1);
        Arrays.sort(array2);
        ArrayList<Integer> commonList = new ArrayList<>();
        int i = 0;
        int j = 0;

        while (i < array1.length && j < array2.length) {
            if (array1[i] == array2[j]) {
                commonList.add(array1[i]);
                i++;
                j++;
            } else if (array1[i] < array2[j]) {
                i++;
            } else {
                j++;
            }
        }
        int[] commonElements = new int[commonList.size()];
        for (int k = 0; k < commonList.size(); k++) {
            commonElements[k] = commonList.get(k);
        }
        return commonElements;
    }
}
