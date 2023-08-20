package Ex03;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class DateTimeFunctions {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showCurrentTime();

        System.out.println("Ngày cuối cùng của tháng hiện tại là:");
        showLastDayOfMonth();

        System.out.println("Ngày đầu tiên và cuối cùng của tuần hiện tại là:");
        showFirstAndLastDayOfWeek();

        System.out.println("Ngày hiện tại đang ở tuần thứ:");
        showWeekOfYear();

        System.out.println("Nhập vào ngày tháng năm sinh của bạn theo định dạng dd-MM-yyyy");
        String birthday = scanner.nextLine();
        scanner.close();
        showDaysLived(birthday);
    }

    // Xem thời gian hiện tại(dd/MM/yyy HH:mm:ss) 
    public static void showCurrentTime() {
        Date date = new Date();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String formattedDateTime = formatter.format(date);
        System.out.println("Thời gian hiện tại là: " + formattedDateTime);
    }

    // In ngày cuối cùng của tháng hiện tại (dd/MM/yyyy).
    public static void showLastDayOfMonth() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_MONTH, calendar.getActualMaximum(Calendar.DAY_OF_MONTH));
        Date date = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedDate = formatter.format(date);
        System.out.println(formattedDate);
    }

    // Xem ngày đầu tiên và cuối cùng của tuần hiện tại.
    public static void showFirstAndLastDayOfWeek() {
        Calendar calendar = Calendar.getInstance();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.MONDAY);
        Date firstDayOfWeek = calendar.getTime();
        calendar.set(Calendar.DAY_OF_WEEK, Calendar.SUNDAY);
        Date lastDayOfWeek = calendar.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
        String formattedFirstDay = formatter.format(firstDayOfWeek);
        String formattedLastDay = formatter.format(lastDayOfWeek);
        System.out.println("Ngày đầu tiên: " + formattedFirstDay);
        System.out.println("Ngày cuối cùng: " + formattedLastDay);
    }

    // Xem ngày hiện tại đang ở tuần thứ mấy trong năm.
    public static void showWeekOfYear() {
        Calendar calendar = Calendar.getInstance();
        int weekOfYear = calendar.get(Calendar.WEEK_OF_YEAR);
        System.out.println(weekOfYear);
    }

    // Nhập vào ngày tháng năm sinh. Kiểm tra xem bạn đã sống được bao nhiêu ngày.
    public static void showDaysLived(String birthday) {
        SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");
        Date birthDate;
        try {
            birthDate = formatter.parse(birthday);
            Date today = new Date();
            long difference = today.getTime() - birthDate.getTime();
            long days = difference / (1000 * 60 * 60 * 24);
            System.out.println("Bạn đã sống được " + days + " ngày");
        } catch (Exception e) {
            System.out.println("Định dạng ngày tháng không hợp lệ");
        }
    }
}
