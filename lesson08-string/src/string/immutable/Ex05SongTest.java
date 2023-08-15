package string.immutable;

import java.util.Arrays;

public class Ex05SongTest {
	
	public static void main(String[] args) {
		
		String bh1 = "d:/music/somethingyoulike.mp3";
		String bh2 = "d:/music/foreverandone.mp3";
		String bh3 = "d:/music/takemetoyourheart.mov";
		
		String[] songs = {bh1, bh2, bh3};
		String[] result = getSongNames(songs, ".mp3");
		System.out.println("song name: " + Arrays.toString(result));
		
	}
	private static String[] getSongNames(String[] songs, String extension) {
		String[] result = new String[songs.length];
		int count = 0;
		
		for (String song: songs) {
			int lastSlashIndexOf = song.lastIndexOf("/");
			int lastDotIndexOf = song.lastIndexOf(".");
			if (song.endsWith(extension)) {
				result[count++] = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
