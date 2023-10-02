package view.list;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex06Performance {
	private static int COUNT = 50000;

	public static void main(String[] args) {
		List<String> alist = new ArrayList<>();
		List<String> llist = new LinkedList<>();

		// Add [to the end]
		// Expected AL ~ LL
		long start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.add("element # " + i);
		}
		System.out.println("Add [to the end] " + COUNT + " elements: ArrayList took "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.add("element # " + i);
		}
		System.out.println("Add [to the end] " + COUNT + " elements: LikedList took "
				+ (System.currentTimeMillis() - start) + "ms");

		// AL size = 50000;
		// LL size = 50000;

		// Add at index: 0 | n/2
		// index 0: expected LL > AL
		// index n/2: expected AL >~ LL
		
		int posToBeAdded = 25000;
		for (int i = 0; i < COUNT; i++) {
			alist.add(posToBeAdded, "element # " + i);
		}
		System.out.println("Add at index " + posToBeAdded + ": " + COUNT + " elements: ArrayList took "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.add(posToBeAdded, "element # " + i);
		}
		System.out.println("Add at index " + posToBeAdded + ": " + COUNT + " elements: LinkedList took "
				+ (System.currentTimeMillis() - start) + "ms");

		// Get
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.get(i);
		}
		System.out.println("Get element: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.get(i);
		}
		System.out.println("Get element: LinkedList took " + (System.currentTimeMillis() - start) + "ms");

		// Update
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.set(i, "modified element # " + i);
		}
		System.out.println("Update element: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.set(i, "modified element # " + i);
		}
		System.out.println("Update element: LinkedList took " + (System.currentTimeMillis() - start) + "ms");

		// Remove at index 0
		// Expected: LL > AL
		// Remove at index n/2 
		// Expected: AL >~ LL
		// Remove at n
		// Expected: AL ~ LL
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			alist.remove(49000);
		}
		System.out.println("Remove element: ArrayList took " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++) {
			llist.remove(49000);
		}
		System.out.println("Remove element: LinkedList took " + (System.currentTimeMillis() - start) + "ms");
	}

}