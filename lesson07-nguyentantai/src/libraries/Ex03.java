package libraries;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Ex03 {
    public static void main(String[] args) {
        displayCurrentTime();
        displayLastDayOfMonth();
        displayFirstAndLastDayOfWeek();
        displayCurrentWeekOfYear();
        displayDateAfterDays(20);
        calculateDaysAlive(1990, 1, 1);
    }

    // 1. Xem thời gian hiện tại (dd/MM/yyyy HH:mm:ss) ở khu vực bất kỳ.
    public static void displayCurrentTime() {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String currentTime = dateFormat.format(new Date());
        System.out.println("Current time: " + currentTime);
    }

    // 2. In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
    public static void displayLastDayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String lastDayOfMonth = dateFormat.format(calendar.getTime());
        System.out.println("Last day of current month: " + lastDayOfMonth);
    }

    // 3. Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
    public static void displayFirstAndLastDayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, calendar.getFirstDayOfWeek());
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String firstDayOfWeek = dateFormat.format(calendar.getTime());

        calendar.add(Calendar.DAY_OF_WEEK, 6);
        String lastDayOfWeek = dateFormat.format(calendar.getTime());

        System.out.println("First day of current week: " + firstDayOfWeek);
        System.out.println("Last day of current week: " + lastDayOfWeek);
    }

    // 4. Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
    public static void displayCurrentWeekOfYear() {
        Calendar calendar = Calendar.getInstance();
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println("Current week of year: " + weekOfYear);
    }

    // 5. Kiểm tra sau 20 ngày nữa là ngày nào, thứ mấy.
    public static void displayDateAfterDays(int days) {
        Calendar calendar = Calendar.getInstance();
        calendar.add(Calendar.DAY_OF_MONTH, days);
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        String dateAfterDays = dateFormat.format(calendar.getTime());

        SimpleDateFormat dayFormat = new SimpleDateFormat("EEEE");
        String dayOfWeek = dayFormat.format(calendar.getTime());

        System.out.println(days + " days from now is: " + dateAfterDays);
        System.out.println("Day of the week: " + dayOfWeek);
    }

    // 6. Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
    public static void calculateDaysAlive(int year, int month, int day) {
        Calendar birthDate = new GregorianCalendar(year, month - 1, day);
        Calendar currentDate = Calendar.getInstance();

        long millisecondsPerDay = 24 * 60 * 60 * 1000;
        long daysAlive = (currentDate.getTimeInMillis() - birthDate.getTimeInMillis()) / millisecondsPerDay;

        System.out.println("Days alive: " + daysAlive);
    }
}
