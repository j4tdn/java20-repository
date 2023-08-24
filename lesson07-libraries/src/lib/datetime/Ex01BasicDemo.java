package lib.datetime;

import java.util.Calendar;
import java.util.Date;

public class Ex01BasicDemo {
	public static void main(String[] args) {
		// Date: lưu trữ
		// Calender: lưu trữ + xử lý
		
		// Lấy thông tin thời gian hiện tại với [timezone]
		
		//now --> Fri Aug 11 20:13:23 ICT 2023
		Date now = new Date();
		System.out.println("now --> " + now);
		
		// new Date(long date)
		// date: số milliseconds tính từ epoch(unix) time
		// epoch time: là mốc thời gian trong hệ thống www hiện tại
		//			 : mid night 1.1.1970
		// tính toán: quy ngày tháng năm giờ phút giây về 1 đơn vị để tính toán
		
		// 78702 --> 78702ms tính từ 1.1 năm 1970
		Date date = new Date(78702);
		System.out.println("date --> " + date);
		System.out.println("date ms --> " + date.getTime());
		
		// + 1. ngày, tháng, năm
		Calendar c = Calendar.getInstance();
				
		
		// + 2. giờ 12-24, phút, giây
		
	}

}
