package Ex04;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class ProjectDeadline {
	public static void main(String[] args) {
		LocalDate startDate = LocalDate.of(2022, 6, 7);
		int projectDuration = 110;
		System.out.println("Ngày nhận project: " + startDate);
		LocalDate deliveryDate = calculateDeliveryDate(startDate, projectDuration);
		System.out.println("Ngày bàn giao sản phẩm cho khách hàng: " + deliveryDate);
	}

	public static LocalDate calculateDeliveryDate(LocalDate startDate, int projectDuration) {
		int daysRemaining = projectDuration;
		LocalDate deliveryDate = startDate;

		int countSarAndSun = 0;

		while (daysRemaining > 0) {
			daysRemaining--;
			deliveryDate = deliveryDate.plusDays(1);
			// Kiểm tra nếu ngày là Thứ 7 hoặc Chủ nhật thì không tính
			if (deliveryDate.getDayOfWeek().equals(DayOfWeek.SUNDAY) || deliveryDate.getDayOfWeek().equals(DayOfWeek.SATURDAY)) {				
				countSarAndSun++;
			}
		}
		
		deliveryDate = deliveryDate.plusDays(countSarAndSun); // 110 ngày làm project và thêm ngày không tính T7,CN
		
		return deliveryDate;
	}
}