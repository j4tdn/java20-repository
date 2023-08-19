package view;

import java.time.DayOfWeek;
import java.time.LocalDate;

import utils.DateUtils;

/**
 * 	Hôm nay ngày 07/06/2022. Nhóm A nhận được dự án từ khách hàng B. Yêu cầu thực hiện
	các chức năng của dự án trong vòng 110 ngày. 
	Biết rằng Thứ 7, Chủ nhật được xem như ngày nghỉ nên không tính vào trong thời gian thực hiện 110 ngày, 
	không tính các ngày nghỉ lễ theo luật quốc gia của nhóm phát triển dự án. 
	
	Hỏi ngày mấy nhóm A sẽ phải bàn giao sản phẩm cho khách hàng B.
 *
 */
public class Ex04 {
	public static void main(String[] args) {
		LocalDate start = LocalDate.of(2022, 06, 07);
		System.out.println("Ngày nhận dự án --> " + DateUtils.format(start, "dd/MM/yyyy"));
		System.out.println("Ngày dự kiến giao dự án --> " + DateUtils.format(findProjectDeliveryDate(start, 110), "dd/MM/yyyy"));
	}
	
	private static LocalDate findProjectDeliveryDate(LocalDate start, int nday) {
		LocalDate end = start.plusDays(nday); //ngày bàn giao chưa tính ngày nghỉ
		
		long countSaturday = DateUtils.countDayOfWeek(start, end, DayOfWeek.SATURDAY);
		long countSunday = DateUtils.countDayOfWeek(start, end, DayOfWeek.SUNDAY);
		
		//Kiểm tra ngày lễ có trúng vào T7/CN không --> nếu có thì ko cộng vào số ngày nghỉ
		
		LocalDate[] holidays = DateUtils.getHolidays();
		
		int countHolidays = 0;
		for(LocalDate holiday : holidays) {
			countHolidays += (holiday.getDayOfWeek()) == DayOfWeek.SATURDAY || (holiday.getDayOfWeek() == DayOfWeek.SUNDAY) ? 0 : 1;
		}
		
		long dayOff = countSaturday + countSunday + countHolidays;
		end = end.plusDays(dayOff);
		return end;
	}
	
}
