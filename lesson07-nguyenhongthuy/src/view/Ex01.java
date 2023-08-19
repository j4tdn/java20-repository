package view;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import utils.DateUtils;

/**
 * Xây dựng ứng dụng The Ultimate Relationship Calculator 
 * ▪ Nhập thời gian bắt đầu hẹn hò của 2 người. 
 * ▪ Nếu đã chia tay, nhập ngày chia tay ngược lại lấy thời gian hiện tại 
 * ▪ Nhấn Enter để thực hiện tính toán. 
 * 
 * Hỏi 
 * ▪ Ngày bắt đầu hẹn họ là ngày thứ mấy. 
 * ▪ Mối tình đã bắt đầu được bao nhiêu năm, tháng, ngày, giờ, phút, giây
 */
public class Ex01 {
	private static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("------The begining of a date-----");
		LocalDateTime date1 = inputLocalDateTime();
		System.out.println("date1 --> " + DateUtils.format(date1, "dd/MM/yyyy HH:mm:ss"));

		
		System.out.println("\n-----The end of a date-----");
		int opt;
		do {
			System.out.println("Enter an option: (1) đã chia tay hoặc (2) nếu chưa chia tay");
			opt = Integer.parseInt(sc.nextLine());
		} while (opt < 1 || opt > 2);
		LocalDateTime date2 = inputFarewellDate(opt, date1);
		System.out.println("date2 --> " + DateUtils.format(date2, "dd/MM/yyyy HH:mm:ss"));
		
		System.out.println("\n-----Count Duration Of Dating-----");
		System.out.println("countDurationOfDating --> " + countDayOfDating(date1, date2));
		System.out.println("get --> " + getTimeOfDating(date1, date2));
		sc.close();
	}

	private static String getTimeOfDating(LocalDateTime start, LocalDateTime end) {
		Period per = Period.between(start.toLocalDate(), end.toLocalDate());
		Duration dur = Duration.between(start.toLocalTime(), end.toLocalTime());
		
		return DateUtils.getPeriodAndDuration(dur, per);
	}
	
	//Đếm ngày hẹn hò
	private static long countDayOfDating(LocalDateTime start, LocalDateTime end) {
		return ChronoUnit.DAYS.between(start, end);
	}
	
	private static LocalDateTime inputLocalDateTime() {
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		LocalDateTime date;
		while(true) {
			System.out.println("Enter a date: ");
			try {
				String ip = sc.nextLine();
				date = LocalDateTime.parse(ip, formatter);
				break;
			} catch (Exception e) {
				e.printStackTrace();
				System.out.println("Please enter again!!!");
			}
		}
		return date;
	}
	
	private static LocalDateTime inputFarewellDate(int opt, LocalDateTime date1) {
		LocalDateTime date2;
		//opt = 1 --> đã chia tay
		if(opt == 1) {
			do {
				date2 = inputLocalDateTime();
				if(date1.isAfter(date2)) {
					System.out.println("The breakup date must come after the start date of dating. Please enter again!!!");
				}
			}while(date1.isAfter(date2));
		}else {
			date2 = LocalDateTime.now();
		}
		return date2;
	}
}
