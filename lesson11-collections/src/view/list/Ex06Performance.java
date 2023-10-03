package view.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex06Performance {

	private static int COUNT = 50000;

	public static void main(String[] args) {
		List<String> alist = new ArrayList<>();
		List<String> llist = new LinkedList<>();

		// Add(to the end)
		long start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++)
			alist.add("element # " + i);
		System.out.println("Add(to the end) " + COUNT + " elements: ArrayList takes "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++)
			llist.add("element # " + i);
		System.out.println("Add(to the end) " + COUNT + " elements: LikedList takes "
				+ (System.currentTimeMillis() - start) + "ms");

		System.out.println("========================================================================");

		// Add at index: 0
		start = System.currentTimeMillis();
		int posToBeAdded = 0;
		for (int i = 0; i < COUNT; i++)
			alist.add(posToBeAdded, "element # " + i);
		System.out.println("Add at index " + posToBeAdded + ": " + COUNT + " elements: ArrayList takes "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++)
			llist.add(posToBeAdded, "element # " + i);
		System.out.println("Add at index " + posToBeAdded + ": " + COUNT + " elements: LinkedList takes "
				+ (System.currentTimeMillis() - start) + "ms");

		System.out.println("========================================================================");

		// Add at index: n/2
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++)
			alist.add(alist.size() / 2, "element # " + i);
		System.out.println("Add at index n/2: " + COUNT + " elements: ArrayList takes "
				+ (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++)
			llist.add(llist.size() / 2, "element # " + i);
		System.out.println("Add at index n/2: " + COUNT + " elements: LinkedList takes "
				+ (System.currentTimeMillis() - start) + "ms");

		System.out.println("========================================================================");

		// Get
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++)
			alist.get(i);
		System.out.println("Get element: ArrayList takes " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++)
			llist.get(i);
		System.out.println("Get element: LinkedList takes " + (System.currentTimeMillis() - start) + "ms");

		System.out.println("========================================================================");

		// Set
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++)
			alist.set(i, "modified element # " + i);
		System.out.println("Update element: ArrayList takes " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++)
			llist.set(i, "modified element # " + i);
		System.out.println("Update element: LinkedList takes " + (System.currentTimeMillis() - start) + "ms");

		System.out.println("========================================================================");

		// Remove
		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++)
			alist.remove(0);
		System.out.println("Remove element at index 0: ArrayList takes " + (System.currentTimeMillis() - start) + "ms");

		start = System.currentTimeMillis();
		for (int i = 0; i < COUNT; i++)
			llist.remove(0);
		System.out
				.println("Remove element at index 0: LinkedList takes " + (System.currentTimeMillis() - start) + "ms");
	}

}