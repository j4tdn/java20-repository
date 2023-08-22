package lib.datetime;

import java.time.*;
import java.time.format.DateTimeFormatter;

public class Ex05LocalDateTimeDemo {
    public static void main(String[] args) {
        DateTimeFormatter df = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");

        // 05.08.2023 17:17:30

        // 05.08.2023 12:17:30

        LocalDateTime vnTime; // end
        vnTime = LocalDateTime.parse("05.08.2023 17:17:30", df);

        LocalDateTime gmTime; // begin
        gmTime = LocalDateTime.parse("03.08.2023 22:17:30", df);

        System.out.println("VnTime: " + vnTime);
        System.out.println("GmTime: " + gmTime);

        // Period: LocalDate
        // Duration: LocalTime

        if(vnTime.isBefore(gmTime)){
            throw new IllegalArgumentException("Time Range is not valid !!!");
        }

        LocalDate vnLocalDate = vnTime.toLocalDate();
        LocalDate gmLocalDate = gmTime.toLocalDate();

        LocalTime vnLocalTime = vnTime.toLocalTime();
        LocalTime gmLocalTime = gmTime.toLocalTime();

        Period period = Period.between(gmLocalDate, vnLocalDate);
        Duration duration = Duration.between(gmLocalTime, vnLocalTime);
        if(duration.isNegative()){
            duration = duration.plusDays(1);
            period = period.minusDays(1);
        }
        System.out.println(period + "'T'" + duration);
    }
}
