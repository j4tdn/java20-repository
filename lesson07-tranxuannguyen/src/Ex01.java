import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Ex01 {
	
	  public static void main(String[] args) {
	        Scanner ip = new Scanner(System.in);

	        System.out.print("Nhập ngày bắt đầu hẹn hò (dd/MM/yyyy HH:mm:ss): ");
	        String startDateInput = ip.nextLine();

	        LocalDateTime startDate = LocalDateTime.parse(startDateInput, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));

	        LocalDateTime breakupDate;
	        do {
	            breakupDate = getBreakupDate(ip);

	            if (breakupDate.isBefore(startDate)) {
	                System.out.println("Ngày chia tay không thể trước ngày bắt đầu hẹn hò. Vui lòng nhập lại.");
	            }
	        } while (breakupDate.isBefore(startDate));

	        calculateRelationship(startDate, breakupDate);
	    }

	    public static void calculateRelationship(LocalDateTime startDate, LocalDateTime breakupDate) {
	        LocalDate startDateLD = startDate.toLocalDate();
	        LocalDate breakupDateLD = breakupDate.toLocalDate();

	        Period period = Period.between(startDateLD, breakupDateLD);
	        Duration duration = Duration.between(startDate, breakupDate);
	        
	        if (startDate.getDayOfWeek().getValue()!=1) {
		        System.out.println("Ngày bắt đầu hẹn hò là ngày thứ " + startDate.getDayOfWeek().getValue());
	        }else 
	        	System.out.println("Ngày bắt đầu hẹn hò là ngày Chủ Nhật");
	        
	        System.out.println("Mối tình đã bắt đầu được "
	                + opt(period.getYears(), "năm")
	                + opt(period.getMonths(), "tháng")
	                + opt(period.getDays(), "ngày")
	                + opt(duration.toHoursPart(), "giờ")
	                + opt(duration.toMinutesPart(), "phút")
	                + opt(duration.toSecondsPart(), "giây"));
	    }

	    public static String opt(int value, String unit) {
	        return value == 0 ? "" : value + " " + unit + ", ";
	    }

	    public static LocalDateTime getBreakupDate(Scanner scanner) {
	        System.out.print("Ngày chia tay? (Nếu chưa chia tay, hãy bấm Enter): ");
	        String breakupDateInput = scanner.nextLine();

	        LocalDateTime currentDate = LocalDateTime.now();
	        LocalDateTime breakupDate;

	        if (breakupDateInput.isEmpty()) {
	            breakupDate = currentDate;
	        } else {
	            breakupDate = LocalDateTime.parse(breakupDateInput, DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss"));
	        }

	        return breakupDate;
	    }
}