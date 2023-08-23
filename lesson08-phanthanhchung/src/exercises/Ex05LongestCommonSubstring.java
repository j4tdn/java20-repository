package exercises;

import java.util.ArrayList;

public class Ex05LongestCommonSubstring {
    // Driver Code
    public static void main(String[] args)
    {
        String X = "ABCEDEABC";
        String Y = "ABCEDCBBCK";

        System.out.println("The longest common substring is " + LCSubStr(X, Y));
    }
    static String LCSubStr(String s1, String s2)
    {
        String longest = "";

        ArrayList<String> substringsA = new ArrayList<String>();
        for(int i = 0; i < s1.length(); i++){
            for(int j = i + 1; j <= s1.length(); j++){
                substringsA.add(s1.substring(i, j));
            }
        }
        for(int i = 0; i < substringsA.size(); i++){
            if(s2.contains(substringsA.get(i))){
                if(substringsA.get(i).length() > longest.length()){
                    longest = substringsA.get(i);
                }
            }
        }
        return longest;
    }
}
