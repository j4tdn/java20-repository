package hw;


import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import view.DateUtils;

public class RelationshipCalculator {
	private static final String PATTERN = "dd/MM/yyyy HH:mm:ss";

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Nhập ngày bắt đầu hẹn hò(dd/MM/yyyy HH:mm:ss): ");
		String startDate = sc.nextLine();
		System.out.print("Nhập ngày két thúc nếu chưa thì để trống(dd/MM/yyyy HH:mm:ss): ");
		String endDate = sc.nextLine();

		DateTimeFormatter dtf = DateTimeFormatter.ofPattern(PATTERN);
		// 20/01/2020 20:20:20
		// 15/03/2023 10:10:10
		LocalDateTime start = DateUtils.stringToLocalDateTime(startDate, dtf);
		LocalDateTime end = DateUtils.stringToLocalDateTime(endDate, dtf);
		if (end == null) {
			end = LocalDateTime.now();
		}

		// Tính Khoảng thời gian yêu nhau
		Period untilDate = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration untilTime = Duration.between(start.toLocalTime(), end.toLocalTime());

		if (untilTime.isNegative()) {
			untilDate = untilDate.minusDays(1);
			untilTime = untilTime.plusDays(1);
		}
		System.out.println("Ngày hẹn hò đầu tiên là thứ: " + start.toLocalDate().getDayOfWeek());

		System.out.println("Mối tình đã bắt đầu được: " + getUnit(untilDate.getYears(), " Năm ")
				+ getUnit(untilDate.getMonths(), " Tháng ") + getUnit(untilDate.getDays(), " Ngày ")
				+ getUnit(untilTime.toHoursPart(), " Giờ ") + getUnit(untilTime.toMinutesPart(), " Phút ")
				+ getUnit(untilTime.toSecondsPart(), " Giây "));

	}

	private static String getUnit(int value, String unit) {
		return value == 0 ? " " : value + unit;
	}
}