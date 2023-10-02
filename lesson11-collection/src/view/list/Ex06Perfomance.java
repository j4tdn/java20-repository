package view.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex06Perfomance {
    private static int COUNT = 50000;

    public static void main(String[] args) {
        List<String> alist = new ArrayList<>();
        List<String> llist = new LinkedList<>();

        // Add [to the end]
        long start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            alist.add("element # " + i);
        }
        System.out.println("Add " + COUNT + " elements: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            llist.add("element # " + i);
        }
        System.out.println("Add " + COUNT + " elements: LikedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // AL: size = 50000
        // LL: size = 50000
        
        // Add at index: 0, n/2
        int posTpbeAdded = 0;
        for (int i = 0; i < COUNT; i++) {
            alist.add(posTpbeAdded, "element # " + i);
        }
        System.out.println("Add at index : " + posTpbeAdded + COUNT
                + " elements: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");
        
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            llist.add(posTpbeAdded, "element # " + i);
        }
        System.out.println("Add at index 49000: " + COUNT
                + " elements: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // Get: AL > LL
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            alist.get(i);
        }
        System.out.println("Get element: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            llist.get(i);
        }
        System.out.println("Get element: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // Update (SET) : AL > LL
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            alist.set(i, "modified element # " + i);
        }
        System.out.println("Update element: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            llist.set(i, "modified element # " + i);
        }
        System.out.println("Update element: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");

        // Remove at index 0
        // Expected
        
        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            alist.remove(0);
        }
        System.out.println("Remove element: ArrayList took "
                + (System.currentTimeMillis() - start) + "ms");

        start = System.currentTimeMillis();
        for (int i = 0; i < COUNT; i++) {
            llist.remove(0);
        }
        System.out.println("Remove element: LinkedList took "
                + (System.currentTimeMillis() - start) + "ms");
    }



}
