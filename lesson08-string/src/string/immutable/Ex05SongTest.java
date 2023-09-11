package string.immutable;

import java.util.Arrays;

public class Ex05SongTest {

	public static void main(String[] args) {
		String s1 = "d:/music/somethingyoulike.mp3";
		String s2 = "d:/music/foreveralone.mp3";
		String s3 = "d:/music/takemetoyourheart.mov";
		
		String[] songs = { s1, s2, s3};
		
		String[] songNames = getSongName(songs,".mp3");
		System.out.println("mp3 songs " +Arrays.toString(songNames));
	}
	private static String[] getSongName(String[] songs, String extendtion) {
		String[] result = new String[songs.length];
		int running = 0;
		for(String song: songs) {
			int lastSlashIndexOf = song.lastIndexOf("/");
			int lastDotIndexOf = song.lastIndexOf(".");
			if(song.endsWith(extendtion)) {
				result[running++] = song.substring(lastSlashIndexOf +1,lastDotIndexOf);
			}
			
		}
		return Arrays.copyOfRange(result, 0, running);
		
	}
}
