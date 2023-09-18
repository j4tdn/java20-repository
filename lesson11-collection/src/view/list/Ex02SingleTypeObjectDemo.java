package view.list;

import java.util.ArrayList;
import java.util.List;

public class Ex02SingleTypeObjectDemo {

	public static void main(String[] args) {
		// how ArrayList works behind the scene
		List<String> sequences = new ArrayList<>();
		
		// add elements
		sequences.add("X100");
		sequences.add("Z102");
		sequences.add("A19");
		
		System.out.println("size --> " + sequences.size());
		System.out.println("List of elements\n");
		for (String sequence:sequences) {
			System.out.println(sequence);
		}
	}

}
