package view.z2.generic.classs;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		IList<String> elements = new JavaList<>();
		
		elements.add("a");
		elements.add("b");
		elements.add("c");
		elements.add("d");
		
		
		System.out.println("size: " + elements.size());
		System.out.println("capacity: " + elements.capacity());
		
		System.out.println();
		
		elements.removeIf(element -> element.equals("b"));
		
		elements.forEach(element -> {
			System.out.print(element + " ");
		});
	}
}
