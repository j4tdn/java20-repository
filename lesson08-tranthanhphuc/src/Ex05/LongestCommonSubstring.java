package Ex05;

import java.util.Scanner;

public class LongestCommonSubstring {

    public static String findLongestCommonSubstring(String s1, String s2) {
    	
        int doDai = 0;
        int viTri = 0;
        int m = s1.length();
        int n = s2.length();
        int[][] L = new int[m + 1][n + 1];

        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                if (s1.charAt(i - 1) == s2.charAt(j - 1)) {
                    L[i][j] = L[i - 1][j - 1] + 1;
                    if (L[i][j] > doDai) {
                        doDai = L[i][j];
                        viTri = i;
                    }
                }
            }
        }

        if (doDai == 0) {
            return "";
        }

        return s1.substring(viTri - doDai, viTri);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập xâu s1: ");
        String s1 = sc.nextLine();
        System.out.print("Nhập xâu s2: ");
        String s2 = sc.nextLine();
        String kq = findLongestCommonSubstring(s1, s2);

        System.out.println("Kết quả:");
        if (!kq.isEmpty()) {
            System.out.println(kq);
        } else {
            System.out.println("Không có xâu con chung");
        }
    }
}

