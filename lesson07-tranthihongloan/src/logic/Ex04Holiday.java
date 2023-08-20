package logic;

import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Ex04Holiday {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter start date (dd/mm/yyyy):");
        String startDateStr = scanner.nextLine();
        
        System.out.println("Enter end date (dd/mm/yyyy):");
        String endDateStr = scanner.nextLine();
        
        scanner.close();
        
        LocalDate startDate = parseDate(startDateStr);
        System.out.println("startDate --> " + startDate);
        LocalDate endDate = parseDate(endDateStr);
        
        int totalHolidaysInRange = countHolidaysInRange(startDate, endDate);
        
        System.out.println("Total holidays in the specified range: " + totalHolidaysInRange);
    }
    
    public static LocalDate parseDate(String dateStr) {
        String[] parts = dateStr.split("/");
        int day = Integer.parseInt(parts[0]);
        int month = Integer.parseInt(parts[1]);
        int year = Integer.parseInt(parts[2]);
        
        return LocalDate.of(year, month, day);
    }
    
    public static int countHolidaysInRange(LocalDate startDate, LocalDate endDate) {
        int count = 0;
        
        LocalDate currentDate = startDate;
        while (!currentDate.isAfter(endDate)) {
            if (isHoliday(currentDate)) {
                count++;
            }
            
            currentDate = currentDate.plusDays(1);
        }
        
        return count;
    }
    
    public static boolean isHoliday(LocalDate date) {
        return isFixedHoliday(date) || isMovableHoliday(date);
    }
    
    public static boolean isFixedHoliday(LocalDate date) {
        int year = date.getYear();
        int month = date.getMonthValue();
        int day = date.getDayOfMonth();
        
        return (month == Month.JANUARY.getValue() && day == 1) ||  // New Year's Day
               (month == Month.APRIL.getValue() && day == 30) ||   // Reunification Day
               (month == Month.MAY.getValue() && day == 1) ||      // Labor Day
               (month == Month.SEPTEMBER.getValue() && day == 2);  // National Day
    }
    
    public static boolean isMovableHoliday(LocalDate date) {
        int year = date.getYear();
        
        LocalDate tetHoliday = calculateTetHoliday(year);
        LocalDate midAutumnFestival = calculateMidAutumnFestival(year);
        
        return date.equals(tetHoliday) || date.equals(midAutumnFestival);
    }
    
    // Tính ngày Lễ Tết dựa trên lịch âm
    public static LocalDate calculateTetHoliday(int year) {
        // Hàm này cần được cài đặt để tính ngày Lễ Tết dựa trên lịch âm (VD: ngày 1 tháng 1 âm lịch)
        // Mình sẽ để một giá trị tạm thời ở đây
        return LocalDate.of(year, Month.JANUARY, 1);
    }
    
    // Tính ngày Lễ Trung Thu dựa trên lịch dương
    public static LocalDate calculateMidAutumnFestival(int year) {
        // Hàm này cần được cài đặt để tính ngày Lễ Trung Thu dựa trên lịch dương (VD: ngày 15 tháng 8)
        // Mình sẽ để một giá trị tạm thời ở đây
        return LocalDate.of(year, Month.SEPTEMBER, 15);
    }
}
