package string.immutable;

import java.util.Arrays;

public class Ex05Test {
	public static void main(String[] args) {
		String bh1 = "d:/music/somethingyoulike.mp3";
		String bh2 = "d:/music/takemetoyourhear.mp3";
		String bh3 = "d:/music/alonewith.mov";

		String[] songs = { bh1, bh2, bh3 };

		String[] result = getMp3Song1(songs);
		for (String song : result) {
			System.out.println(song);
		}
	}

//	private static String[] getMp3Song(String[] songs) {
//		String[] result = new String[songs.length];
//		int running = 0;
//		for(String song: songs) {
//			String[] tokens = song.split("/");
//			for(String token : tokens) {
//				if(token.endsWith("mp3")) {
//					result[running++] = token.substring(0,token.indexOf("."));
//				}
//			}
//		}
//		return Arrays.copyOfRange(result, 0, running);
//	}

	private static String[] getMp3Song(String[] songs) {
		String[] result = new String[songs.length];
		int running = 0;
		for (String song : songs) {
			int lastSlashIndexOf = song.lastIndexOf("/");
			int lastDotIndexOf = song.lastIndexOf(".");
			if (song.endsWith(".mp3")) {
				result[running++] = song.substring(lastSlashIndexOf + 1, lastDotIndexOf);
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}

	private static String[] getMp3Song1(String[] songs) {
		String[] result = new String[songs.length];
		int running = 0;
		for (String song : songs) {
			if (song.endsWith(".mp3")) {
				song = song.replaceAll(".mp3", "");
				String[] tokens = song.split("/");
				result[running++] = tokens[tokens.length - 1];
			}
		}
		return Arrays.copyOfRange(result, 0, running);
	}
}
