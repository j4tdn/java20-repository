import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.YearMonth;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.time.temporal.WeekFields;
import java.util.Arrays;
import java.util.Scanner;

public class Ex03 {
	  private static final Scanner ip = new Scanner(System.in);
	public static void main(String[] args) {
		Ex03 test = new Ex03();
        String pattern = "dd/MM/yyyy";

        System.out.println("1.Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) ở khu vực bất kỳ. " + test.getPresentTime(pattern + " HH:mm:ss"));
        System.out.println("2.In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy). " + test.getLastDayOfMonth(pattern));
        System.out.println("3.Xem ngày đầu tiên và cuối cùng của tuần hiện tại. " + Arrays.toString(test.getFirstAndLastDayOfWeek(pattern)));
        System.out.println("4.Xem ngày hiện tại đang ở tuần thứ mấy trong năm. " + test.getWeekOfYear());
        System.out.println("5.Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy. " + test.checkDateAfter20Days(20, pattern + " EEEE"));
        System.out.println("6." + test.calculateDayOfLife(pattern));
    }

    public String getPresentTime(String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDateTime now = LocalDateTime.now();
        return formatter.format(now);
    }

    public String getLastDayOfMonth(String pattern) {
        LocalDate lastDayOfMonth = YearMonth.now().atEndOfMonth();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(lastDayOfMonth);
    }

    public String[] getFirstAndLastDayOfWeek(String pattern) {
        LocalDate currentDate = LocalDate.now();
        LocalDate firstDayOfWeek = currentDate.with(WeekFields.of(DayOfWeek.MONDAY, 1).dayOfWeek(), 1);
        LocalDate lastDayOfWeek = currentDate.with(WeekFields.of(DayOfWeek.MONDAY, 1).dayOfWeek(), 7);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return new String[] { formatter.format(firstDayOfWeek), formatter.format(lastDayOfWeek) };
    }

    public int getWeekOfYear() {
        LocalDate currentDate = LocalDate.now();
        return currentDate.get(WeekFields.ISO.weekOfWeekBasedYear());
    }

    public String checkDateAfter20Days(int days, String pattern) {
        LocalDate currentDate = LocalDate.now();
        LocalDate futureDate = currentDate.plusDays(days);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return formatter.format(futureDate);
    }

    public String calculateDayOfLife(String pattern) {
        System.out.print("Nhập ngày tháng năm sinh (dd/MM/yyyy): ");
        String input = ip.nextLine();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        LocalDate birthDate = LocalDate.parse(input, formatter);
        LocalDate currentDate = LocalDate.now();
        long dayOfLife = ChronoUnit.DAYS.between(birthDate, currentDate);
        return "Bạn đã sống được " + dayOfLife + " ngày.";
    }
}