package view;

public class Ex01ChainString {
	public static void main(String[] args) {
		String name = "Ho Minh Quân";

		System.out.println("In ra mỗi kí tự trên một dòng: ");
		for(int i = 0; i<  name.length(); i++) {
			System.out.println(name.charAt(i));
		}
		
		
		System.out.println("In ra mỗi từ trên mỗi dòng: ");
		String[] names = name.split(" ");
		for(String letter: names) {
			System.out.println(letter);
		}
		
		
		System.out.println("In ra chuỗi đảo ngược theo kí tự: ");
		
		for(int i = name.length() - 1; i >= 0; i--) {
			System.out.print(name.charAt(i));
		}
		
		System.out.println("\nIn ra chuỗi đảo ngược theo từ: ");
		for(int i = names.length - 1; i >=0; i--) {
			System.out.println(names[i]);
		}
	}
}
