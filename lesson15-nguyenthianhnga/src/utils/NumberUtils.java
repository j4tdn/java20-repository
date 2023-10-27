package utils;
import java.math.BigDecimal;
import java.util.Map;

public class NumberUtils {

	private NumberUtils() {

	}

	public static BigDecimal bd(double val) {
		return new BigDecimal(String.valueOf(val));
	}
	public static void print(String prefix, Map<Integer, BigDecimal> map) {
	    System.out.println(prefix);
	    for (Map.Entry<Integer, BigDecimal> entry : map.entrySet()) {
	        Integer key = entry.getKey();
	        BigDecimal value = entry.getValue();
	        System.out.println("whID " + key + " : " + value);
	    }
	}

}