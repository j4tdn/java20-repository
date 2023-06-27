package ex05levelsort;

import java.util.Arrays;

public class LevelSort {
	
	// tính level của một số tự nhiên bằng cách đếm số lượng ước của nó
    public static int findLevel(int number) {
        int count = 0;
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++;
            }
        }
        return count;
    }
    
    // sắp xếp mảng số nguyên theo level tăng dần
    public static void sortArrayByLevel(int[] arr) {
        Integer[] sortedArr = new Integer[arr.length];
        for (int i = 0; i < arr.length; i++) {
            sortedArr[i] = arr[i];
        }

        // truyền một custom comparator vào Arrays.sort() để chỉ định cách sắp xếp dựa trên level của các phần tử
        Arrays.sort(sortedArr, (a, b) -> {
            int levelA = findLevel(a);
            int levelB = findLevel(b);
            return Integer.compare(levelA, levelB);
        });

        for (int i = 0; i < arr.length; i++) {
            arr[i] = sortedArr[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {8, 5, 9, 20};

        System.out.println("Mảng số nguyên ban đầu:");
        System.out.println(Arrays.toString(arr));

        sortArrayByLevel(arr);

        System.out.println("Mảng số nguyên sau khi sắp xếp theo level tăng dần:");
        System.out.println(Arrays.toString(arr));
    }
}
