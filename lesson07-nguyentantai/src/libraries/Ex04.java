package libraries;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashSet;

public class Ex04 {
    public static void main(String[] args) {
        LocalDate startDate = LocalDate.of(2022, 7, 6);
        int projectDuration = 110;

        HashSet<LocalDate> holidays = new HashSet<>();

        LocalDate deliveryDate = calculateDeliveryDate(startDate, projectDuration, holidays);
        System.out.println("Expected delivery date: " + deliveryDate);
    }

    public static LocalDate calculateDeliveryDate(LocalDate startDate, int projectDuration, HashSet<LocalDate> holidays) {
        int daysRemaining = projectDuration;

        LocalDate currentDate = startDate;
        while (daysRemaining > 0) {
            currentDate = currentDate.plusDays(1);

            if (currentDate.getDayOfWeek() == DayOfWeek.SATURDAY || currentDate.getDayOfWeek() == DayOfWeek.SUNDAY) {
                continue;
            }

            if (holidays.contains(currentDate)) {
                continue;
            }

            daysRemaining--;
        }

        return currentDate;
    }
}

