package bai3;

import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static List<List<Integer>> generateTriangle(int numRows) {
        List<List<Integer>> triangle = new ArrayList<>();

        if (numRows <= 0) {
            return triangle;
        }

        // Thêm hàng đầu tiên vào tam giác Pascal
        List<Integer> firstRow = new ArrayList<>();
        firstRow.add(1);
        triangle.add(firstRow);

        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = triangle.get(i - 1);
            List<Integer> currRow = new ArrayList<>();

            // Phần tử đầu tiên luôn bằng 1
            currRow.add(1);

            for (int j = 1; j < i; j++) {
                // Tính toán giá trị cho phần tử thứ j của hàng thứ i
                int currElement = prevRow.get(j - 1) + prevRow.get(j);
                currRow.add(currElement);
            }

            // Phần tử cuối cùng luôn bằng 1
            currRow.add(1);

            // Thêm hàng hiện tại vào tam giác Pascal
            triangle.add(currRow);
        }

        return triangle;
    }

    public static void printPascalTriangle(int numRows) {
        List<List<Integer>> triangle = generateTriangle(numRows);

        for (List<Integer> row : triangle) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int numRows = 6;
        printPascalTriangle(numRows);
    }
}
