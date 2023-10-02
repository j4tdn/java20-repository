package view.z2.generic.claass;


public class Ex01BasicDemo {
	public static void main(String[] args) {
		Ilist<String> elements = new JavaList<String>();
		
		elements.add("qkuen");
		elements.add("ad2ass");
		elements.add("hello");
		
		elements.removeIf(element -> element.equals("hello"));
		elements.forEach(element -> {
			System.out.print(element + " ");
		});
	}
}
