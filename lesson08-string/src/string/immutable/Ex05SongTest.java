package string.immutable;

import java.util.Arrays;

public class Ex05SongTest {
	
	public static void main(String[] args) {
		String[] paths = { "d:/music/shapeofyou.mp3", "d:/music/allweknow.mp3", "d:/music/onmyway.mov" };
		String[] list = getSongNames(paths, ".mov");
		for (String songName : list)
			System.out.println(songName);
	}

	// Get list of mp3 songs
	private static String[] getSongNames(String[] paths, String extension) {
		String[] list = new String[paths.length];
		int index = 0;
		for (String path : paths) {
			if (path.endsWith(extension)) {
				String songName = path.substring(path.lastIndexOf("/") + 1, path.lastIndexOf("."));
				list[index++] = songName;
			}
		}
		return Arrays.copyOfRange(list, 0, index);
	}
	
}
