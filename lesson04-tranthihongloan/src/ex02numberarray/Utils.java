package ex02numberarray;

import java.util.Random;

public class Utils {
	
	private Utils() {	
	}
	
	public static IntNumberArray arrangeArray(IntNumberArray a) {
		int i, j = a.getLength()-1, k = 0;
		Integer[] array = a.getValue();
		for(i = 0; i < a.getLength(); i++) {
			// Lặp đến khi nào gặp lại vị trí hoán đổi của số 
			// chia hết cho 5 thì dừng
			if(i == j ) {
				break;
			}
			
			if(array[i] % 7 == 0) {
				// Nếu số hoán đổi cho vị trí i chia hết cho 7
				// thì giữ nguyên và nhảy lên vị trí tiếp theo
				if(array[k] % 7 == 0) {
					k++;
				}
				swap(array,i, k);
				k++;
			}
			
			else if (array[i] % 5 == 0) {
				// Nếu số hoán đổi cho vị trí i chia hết cho 5
				// thì giữ nguyên và lui lại 
				if(array[j]% 5 == 0) {
					j--;
				}
				
				// Nếu số hoán đổi cho vị trí i chia hết cho 7
				// thì đổi số đó trước rồi mới đổi vị trí 
				if(array[j]% 7 == 0) {
					swap(array,j, k);
					k++;
				}
				swap(array,i, j);
				j--;
				
			}
		}
		return a;
	}
	
	public static void swap(Integer[] array, int index1, int index2) {
        int temp = array[index1];
        array[index1] = array[index2];
        array[index2] = temp;
    }
	
	public static void getIntArray(IntNumberArray a) {
		Random rd = new Random();
		Integer[] array = new Integer[a.getLength()]; 
		for(int i = 0; i < a.getLength(); i++) {
			array[i] = rd.nextInt(5, 101);	
		}
		a.setValue(array);;
	}
}
