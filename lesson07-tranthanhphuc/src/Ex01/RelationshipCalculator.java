package Ex01;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class RelationshipCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập thời gian bắt đầu hẹn hò của hai người theo định dạng dd-MM-yyyy HH:mm:ss");
        String startDate = scanner.nextLine();
        System.out.println("Nếu đã chia tay, nhập ngày chia tay theo cùng định dạng, ngược lại để trống");
        String endDate = scanner.nextLine();
        scanner.close();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");
        LocalDateTime start = LocalDateTime.parse(startDate, formatter);
        LocalDateTime end;
        if (endDate.isEmpty()) {
            end = LocalDateTime.now();
        } else {
            end = LocalDateTime.parse(endDate, formatter);
        }

        long years = ChronoUnit.YEARS.between(start, end);
        long months = ChronoUnit.MONTHS.between(start.plusYears(years), end);
        long days = ChronoUnit.DAYS.between(start.plusYears(years).plusMonths(months), end);
        long hours = ChronoUnit.HOURS.between(start.plusYears(years).plusMonths(months).plusDays(days), end);
        long minutes = ChronoUnit.MINUTES.between(start.plusYears(years).plusMonths(months).plusDays(days).plusHours(hours), end);
        long seconds = ChronoUnit.SECONDS.between(start.plusYears(years).plusMonths(months).plusDays(days).plusHours(hours).plusMinutes(minutes), end);

        System.out.println("Ngày bắt đầu hẹn hò là ngày " + start.getDayOfWeek());
        System.out.println("Mối tình đã bắt đầu được " + years + " năm " + months + " tháng " + days + " ngày " + hours + " giờ " + minutes + " phút " + seconds + " giây");
    }
}
