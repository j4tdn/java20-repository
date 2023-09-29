package view.z2.generic.claass;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		IList<String> elements = new JavaList<>(6);
		
		elements.add("a");
		elements.add("b");
		elements.add("b");
		elements.add("d");
		
		elements.removeIf(element -> {
			return "b".equals(element);
		});
		
		System.out.println("size: " + elements.size());
		System.out.println("capacity: " + elements.capacity());
		
		System.out.println();
		
		elements.forEach(element -> {
			System.out.print(element + " ");
		});
	}
}
