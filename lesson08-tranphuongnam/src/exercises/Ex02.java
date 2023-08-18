package exercises;

public class Ex02 {
	public static void main(String[] args) {
		String fullname = "              TrẦN                PhƯƠNG nAM";
		String formattedName = "";
		System.out.println("Tên khi chưa format: " + fullname);
		fullname = fullname.trim();
		fullname = fullname.replaceAll("\\s+", " ");
		
		String[] nameTokens = fullname.split(" ");
		for(String name : nameTokens) {
			formattedName += format(name) + " ";
		}
		
		formattedName = formattedName.trim();
		System.out.println("Tên khi format: " + formattedName);
	}
	
	public static String format(String name) {
		
		String firstLetter = name.substring(0, 1).toUpperCase();
		String restLetter = name.substring(1).toLowerCase();
		return firstLetter + restLetter;
	}
}
