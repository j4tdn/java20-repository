package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculator {
	public static void main(String[] args) {
		/*
		 * Xây dựng ứng dụng The Ultimate Relationship Calculator 
		 * + Nhập thời gian bắt đầu hẹn hò của 2 người. 
		 * + Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại 
		 * + Nhấn Enter để thực hiện tính toán. Hỏi 
		 * + Ngày bắt đầu hẹn họ là ngày thứ mấy. 
		 * + Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
		 */
		
		Scanner sc = new Scanner(System.in);

		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
		LocalDateTime startDay;
		LocalDateTime endDay;
		
		System.out.println("Vui lòng trả lời: Bạn đã chia tay chưa?");
		System.out.println("  1. Rồi.");
		System.out.println("  2. Chưa.");
		int opts = Integer.parseInt(sc.nextLine());
		if (opts == 1) {
			System.out.print("Ngày bắt đầu: ");
			startDay = LocalDateTime.parse(sc.nextLine(), df);
			System.out.print("Ngày chia tay: ");
			endDay = LocalDateTime.parse(sc.nextLine(), df);
		} else {
			System.out.print("Ngày bắt đầu: ");
			startDay = LocalDateTime.parse(sc.nextLine(), df);
			endDay = LocalDateTime.now();
		}
		sc.close();
		
		if (endDay.isBefore(startDay)) {
			throw new IllegalArgumentException("Time Range is not value !!!");
		}
				
		LocalDate startDate = startDay.toLocalDate();
		LocalDate endDate = endDay.toLocalDate();
		
		LocalTime startTime = startDay.toLocalTime();
		LocalTime endTime = endDay.toLocalTime();
		
		Period period = Period.between(startDate, endDate);
		Duration duration = Duration.between(endTime, startTime);
		
		if (duration.isNegative()) {
			duration = duration.plusDays(1);
			period = period.minusDays(1);
		}
		
		System.out.print("Mối tình của bạn đã bắt đầu được ");
		System.out.println(period.getYears() + " năm " + period.getMonths() + " tháng " + period.getDays() + " ngày " 
						+ duration.toHoursPart() + " giờ " + duration.toMinutesPart() + " phút " + duration.toSecondsPart() + " giây");
	}

	private static void inputInf() {
		
	}
}
