package view;



public class Ex03SimpleStringManipulation {
    public static String revert(String s) {
        String[] words = s.split("\\s+");
        StringBuilder result = new StringBuilder();
        
        for (String word : words) {
            result.insert(0, new StringBuilder(word).reverse() + " ");
        }
        
        return result.toString().trim();
    }

    public static void main(String[] args) {
        String input = "Welcome to JAVA10 class";
        String output = revert(input);
        System.out.println(output);
    }
}
