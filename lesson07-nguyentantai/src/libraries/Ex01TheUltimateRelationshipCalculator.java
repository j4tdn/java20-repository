package libraries;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01TheUltimateRelationshipCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập thời gian bắt đầu hẹn hò của 2 người (yyyy-MM-dd HH:mm:ss): ");
        LocalDateTime startDate = LocalDateTime.parse(scanner.nextLine(), DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));

        System.out.print("Đã chia tay? (Y/N): ");
        boolean isBreakup = scanner.nextLine().equalsIgnoreCase("Y");

        LocalDate breakupDate = isBreakup ? LocalDate.now() : null;

        System.out.println();

        // Tính toán ngày thứ mấy
        LocalDate currentDate = isBreakup ? breakupDate : LocalDate.now();
        int dayOfWeek = startDate.getDayOfWeek().getValue();

        System.out.println("Ngày bắt đầu hẹn hò là ngày thứ: " + dayOfWeek);

        // Tính toán khoảng thời gian
        Duration duration = isBreakup ? Duration.between(startDate, breakupDate.atStartOfDay()) : Duration.between(startDate, LocalDateTime.now());

        Period period = Period.between(startDate.toLocalDate(), currentDate);
 
        System.out.println("Mối tình đã bắt đầu được " + period.getYears() + " năm, " + period.getMonths() + " tháng, " + period.getDays() + " ngày, " + duration.toHours() + " giờ, " + duration.toMinutes() + " phút, " + duration.getSeconds() + " giây");
     }
}
