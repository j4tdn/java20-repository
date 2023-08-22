package string.immutable;

import java.util.Arrays;

public class Ex05SongTest {
	public static void main(String[] args) {		
		String bh1 = "d:/music/somethingyoulike.mp3";
		String bh2 = "d:/music/foroveranddone.mp3";
		String bh3 = "d:/music/takemetoyourheart.mov";
		
		String[] songs = {bh1, bh2, bh3};
		
		String[] songNames = getSongNames(songs);
		System.out.println("mp3 songs --> " + Arrays.toString(songNames));
	}

	private static String[] getSongNames(String[] songs) {
		int number = songs.length;
		int running = 0;
		String[] tempSongs = new String[number];
		for(String song : songs) {
			int lastSlashIndexOf = song.lastIndexOf("/");
			int lastDotIndexOf = song.lastIndexOf(".");
			if(song.endsWith(".mp3")) {
				tempSongs[running++] = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
			}
		}
		return Arrays.copyOfRange(tempSongs, 0, running);
	}
}
