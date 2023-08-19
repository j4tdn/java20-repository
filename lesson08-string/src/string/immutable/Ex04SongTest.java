package string.immutable;

import java.util.Arrays;

public class Ex04SongTest {
	public static void main(String[] args) {
		String bh1 = "d:/music/somthingyoulike.mp3";
		String bh2 = "d:/music/foreverandone.mp3";
		String bh3 = "d:/music/taketoyouhear.mov";
		
		String[] songs = {bh1, bh2, bh3};
		
		String[] results = getSongNames(songs,".mp3");
		for(String result: results) {
			System.out.println(result);
		}
	}
	
	private static String[] getSongNames(String[] songs, String extension) {
		String[] result = new String[songs.length];
		int count = 0;
		for(String song: songs) {
			if(song.endsWith(extension)) {
				int lastSlast = song.lastIndexOf('/');
				int lastDot = song.lastIndexOf('.');
				String songName = song.substring(lastSlast + 1, lastDot);
				result[count++] += songName;
			}
		}
		return Arrays.copyOfRange(result, 0, count);
	}
}
