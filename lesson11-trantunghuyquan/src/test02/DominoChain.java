package test02;

import java.util.Scanner;

public class DominoChain {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] heights = new int[n];
        int[] positions = new int[n];
        
        for (int i = 0; i < n; i++) {
            heights[i] = scanner.nextInt();
        }
        
        for (int i = 0; i < n; i++) {
            positions[i] = scanner.nextInt();
        }
        
        int maxChainLength = findLongestDominoChain(n, heights, positions);
        System.out.println(maxChainLength);
    }

    public static int findLongestDominoChain(int n, int[] heights, int[] positions) {
        int[] dp = new int[n];
        int maxChainLength = 1;

        for (int i = 0; i < n; i++) {
            dp[i] = 1; 
            
            for (int j = 0; j < i; j++) {
                if (heights[i] > heights[j] && positions[i] > positions[j]) {
                    dp[i] = Math.max(dp[i], dp[j] + 1); 
                }
            }

            maxChainLength = Math.max(maxChainLength, dp[i]);
        }

        return maxChainLength;
    }
}
