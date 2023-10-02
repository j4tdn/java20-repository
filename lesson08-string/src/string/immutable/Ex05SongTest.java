package string.immutable;

import java.util.Arrays;

public class Ex05SongTest {
	public static void main(String[] args) {
		String s1 = "d:/music/somethingyoulike.mp3";
		String s2 = "d:/music/foreverandone.mp3";
		String s3 = "d:/music/takemetoyourheart.mp3";
		
		String[] songs = {s1, s2, s3};
		
		System.out.println(String.join("\n", getSongNames(songs)));
	}
	
	private static String[] getSongNames(String[] songs) {
		String[] result = new String[songs.length];
		int i = 0;
		for(String song : songs) {
			int lastSlashIndexOf = song.lastIndexOf("/");
			int lastDotIndexOf = song.lastIndexOf(".");
			if(song.endsWith(".mp3")) {
				result[i++] = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
			}
		}
		return Arrays.copyOfRange(result, 0, i);
	}
}
