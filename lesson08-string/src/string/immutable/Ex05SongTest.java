package string.immutable;

import java.util.Arrays;

public class Ex05SongTest {

	public static void main(String[] args) {
		String s1 = "d:/music/somthingyoulike.mp3";
		String s2 = "d:/music/foreoverandone.mp3";
		String s3 = "d:/music/takemetoyourheart.mov";

		String[] songs = { s1, s2, s3 };

		String[] songNames = getSongNames(songs, ".mp3");
		
		System.out.println("mp3 songs --> " + Arrays.toString(songNames));
	}

	private static String[] getSongNames(String[] songs, String extension) {
		String[] result = new String[songs.length];
		int running = 0;
		for (String song : songs) {
			int lastSlashIndexOf = song.lastIndexOf("/");
			int lastDotIndexOf = song.lastIndexOf(".");
			if (song.endsWith(extension)) {
				result[running++] = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}