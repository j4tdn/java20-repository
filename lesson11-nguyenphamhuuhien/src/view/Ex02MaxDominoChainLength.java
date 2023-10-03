package view;

import java.util.Scanner;

public class Ex02MaxDominoChainLength {
    public static int longestDominoChain(int[] length, int[] height, int[] position) {
        int n = length.length;
        int[] dp = new int[n];
        dp[0] = 1;
        int maxChainLength = 1;

        for (int i = 1; i < n; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (height[i] > height[j] && position[i] > position[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1);
                }
            }
            maxChainLength = Math.max(maxChainLength, dp[i]);
        }

        return maxChainLength;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] height = new int[n];
        int[] position = new int[n];

        for (int i = 0; i < n; i++) {
            height[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            position[i] = scanner.nextInt();
        }

        int maxChainLength = longestDominoChain(new int[n], height, position);
        System.out.println(maxChainLength);
    }
}