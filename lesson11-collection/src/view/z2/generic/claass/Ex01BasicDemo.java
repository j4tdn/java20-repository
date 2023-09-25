package view.z2.generic.claass;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		IList<String> elements = new JavaList<>(6);
		
		elements.add("hello");
		elements.add("teo");
		elements.add("hello");
		elements.add("teo");
		elements.add("hello");
		elements.add("teo");
		elements.add("over");
		
		
		System.out.println("size: " + elements.size());
		System.out.println("capacity: " + elements.capacity());
		
		System.out.println();
		
		elements.forEach(element -> {
			System.out.print(element + " ");
		});
	}
}
