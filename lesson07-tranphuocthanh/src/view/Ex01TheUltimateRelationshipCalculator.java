package view;

import static bean.Utils.formattedDuration;
import static bean.Utils.formattedPeriod;
import static bean.Utils.formatter;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

/**
 * Xây dựng ứng dụng The Ultimate Relationship Calculator 
 * ▪ Nhập thời gian bắt đầu hẹn hò của 2 người. 
 * ▪ Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại 
 * ▪ Nhấn Enter để thực hiện tính toán. Hỏi 
 * ▪ Ngày bắt đầu hẹn họ là ngày thứ mấy. 
 * ▪ Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
 */

public class Ex01TheUltimateRelationshipCalculator {

	private static Scanner ip = new Scanner(System.in);
	
	public static void main(String[] args) {
		String pattern = "dd/MM/yyyy HH:mm:ss";
		LocalDateTime start = null;
		LocalDateTime end  = null;
		do {
			 start = getTimeDating(pattern, "bắt đầu");
			 end = getTimeDating(pattern, "kết thúc");
			if (start.isAfter(end)) {
				System.out.println("thời gian bắt đầu phải lớn hơn thời gian kết thúc!");
			} else {
				break;
			}
		} while (true);
		
		 System.out.println("mối tình đã bắt đầu từ : " + formatter("EEEE").format(start) 
				 + " được "+ buildTURC(start, end));
	}
	
	private static String buildTURC(LocalDateTime start, LocalDateTime end) {

		LocalDate dStart = start.toLocalDate();
		LocalTime tStart = start.toLocalTime();
		
		LocalDate dEnd = end.toLocalDate();
		LocalTime tEnd = end.toLocalTime();
		
		Period period = Period.between(dStart, dEnd);
		Duration duration = Duration.between(tStart, tEnd);
		
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		return formattedPeriod(period) + formattedDuration(duration);
	}
	
	private static LocalDateTime getTimeDating(String pattern, String type) {
		DateTimeFormatter df = formatter(pattern);
		LocalDateTime dateTime = null;
		while (dateTime == null) {

			System.out.println("nhập thời gian " + type + " hẹn hò với format '" + pattern + "' "
					+ (type.equals("kết thúc") ? "(nhập 0 nếu vẫn đang hẹn hò): " : ""));
			String input = ip.nextLine();
			if (input.equals("0")) {
				input = df.format(LocalDateTime.now());
				dateTime = LocalDateTime.parse(input, df);
			} else
				try {
					dateTime = LocalDateTime.parse(input, df);
				} catch (DateTimeParseException e) {
					e.printStackTrace();
					System.out.println("vui lòng nhập đúng format!!!");
				}
		}

		return dateTime;
	}
}
