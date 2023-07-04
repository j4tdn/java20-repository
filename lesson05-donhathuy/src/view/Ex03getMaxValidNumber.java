package view;

public class Ex03getMaxValidNumber {
	public static void main(String[] args) {
		System.out.println(getMaxValidNumber("sffasa2334vvfg445699sas4568900ghhff"));
	}
	private static int getMaxValidNumber(String str) {
		String[] arr = str.split("");
		StringBuilder strb = new StringBuilder();
		for (String ele : arr) {
			if (ele.matches("\\d")) {
				strb.append(ele);
			}else {
				strb.append(" ");
			}
		}
		arr = strb.toString().trim().split("\\s+");
		int max = 0;
		for (String ele : arr) {
			if (Integer.parseInt(ele) > max) {
				max = Integer.parseInt(ele);
			}
		}
		return max;
	}
	
	
}
