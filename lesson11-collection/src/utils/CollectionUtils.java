package utils;

import java.util.List;

import javax.lang.model.util.Elements;
import javax.sound.midi.Sequence;

public class CollectionUtils {
	private CollectionUtils() {
	}
	
	public static void generate(String prefix, List<String> element) {
		System.out.println(prefix + " {");
		element.forEach(seq -> {
			System.out.println("     " + seq);
		});
		System.out.println("}\n");
	}
}
