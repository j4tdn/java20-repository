package view.z2.generic.claass;

public class Ex01BasicDemo {

	public static void main(String[] args) {
		IList<String> elements = new JavaList<>(6);
		elements.add("a");
		elements.add("b");
		elements.add("c");
		elements.add("b");

		elements.removeIf(element -> element.equals("b"));

		System.out.println("size: " + elements.size());
		System.out.println("capacity: " + elements.getCapacity());
		
		
		elements.forEach(element -> System.out.print(element + " "));
	}
}
