package logic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex01Dating {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Nhập sẵn dữ liệu
		LocalDate localDate = LocalDate.of(2022, 8, 18);
		LocalTime localTime = LocalTime.of(21, 30, 45);
		LocalDateTime DateTime = LocalDateTime.of(2014, 12, 16,  2, 50, 45);

		// Gộp LocalDate và LocalTime thành LocalDateTime
		LocalDateTime startDateTime = localDate.atTime(localTime);
		
		// Chuyển đối tượng kiểu LocalDateTime sang kiểu chuỗi
		System.out.println("Thời gian bắt đầu hẹn hò của 2 người: ");
		System.out.println(startDateTime
				.format(DateTimeFormatter
						.ofPattern("dd/MM/yyyy HH:mm:ss")));
		
        // Lấy ngày trong tuần từ LocalDate
        DayOfWeek dayOfWeek = localDate.getDayOfWeek();

        // Chuyển đổi DayOfWeek thành số nguyên (1: Thứ 2, 2: Thứ 3, ..., 7: Chủ nhật)
        int dayOfWeekValue = dayOfWeek.getValue();

        System.out.println("\n1. Ngày bắt đầu hẹn họ là ngày thứ mấy?");
        System.out.println("Ngày trong tuần: " + dayOfWeek);
        System.out.println("Số nguyên đại diện cho ngày trong tuần: " + dayOfWeekValue);
	
        System.out.println("\n2. Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây?");
        LocalDateTime endDateTime = LocalDateTime.now();
        
        System.out.println(calTime(startDateTime, endDateTime));
	
        sc.close();
	}
	public static String calTime (LocalDateTime start, LocalDateTime end) {
		LocalDateTime tempDateTime = LocalDateTime.from(start);

		long years = tempDateTime.until(end, ChronoUnit.YEARS );
		tempDateTime = tempDateTime.plusYears( years );

		long months = tempDateTime.until(end, ChronoUnit.MONTHS );
		tempDateTime = tempDateTime.plusMonths( months );

		long days = tempDateTime.until(end, ChronoUnit.DAYS );
		tempDateTime = tempDateTime.plusDays( days );


		long hours = tempDateTime.until(end, ChronoUnit.HOURS );
		tempDateTime = tempDateTime.plusHours( hours );

		long minutes = tempDateTime.until(end, ChronoUnit.MINUTES );
		tempDateTime = tempDateTime.plusMinutes( minutes );

		long seconds = tempDateTime.until(end, ChronoUnit.SECONDS );
       
		return  years + " years " + 
		        months + " months " + 
		        days + " days " +
		        hours + " hours " +
		        minutes + " minutes " +
		        seconds + " seconds.";
	}

	public static LocalDateTime enterDateTime(Scanner sc) {
		// Nhập vào chuỗi thời gian
		System.out.println("Nhập thời gian bắt đầu hẹn hò củ hai bạn:");
		System.out.print("(ngày/tháng/năm) ");
		String dateStr = sc.nextLine();
		System.out.print("(giờ:phút:giây) ");
		String timeStr = sc.nextLine();
		String dateTimeStr = dateStr + " " + timeStr;

		// Chuyển đổi chuỗi thời gian sang một đối tượng kiểu LocalDateTime
		DateTimeFormatter df = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

		return LocalDateTime.parse(dateTimeStr, df);
	}
}
