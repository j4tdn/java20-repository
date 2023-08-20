package view;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;

public class Test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        LocalDate thoiGianBatDau = LocalDate.of(2018, Month.APRIL, 20);
        System.out.println("Thoi gian bat dau hen ho: " + thoiGianBatDau);
        System.out.print("Ban da chia tay chua (roi/chua): ");
        String s = sc.nextLine();
        LocalDate ngayChiaTay = LocalDate.of(2023, Month.JUNE, 19);
        System.out.println("Ngay bat dau hen ho la ngay: " + thoiGianBatDau.getDayOfMonth());
        if(s.equals("roi")){
            System.out.println("Ngay chia tay: " + ngayChiaTay);
            Duration duration = Duration.between(thoiGianBatDau.atStartOfDay(), ngayChiaTay.atStartOfDay());
            long totalDays = duration.toDays();
            long years = totalDays / 365;
            long months = (totalDays % 365) / 30;
            long days = (totalDays % 365) % 30;
            System.out.println("Moi tinh  duoc: " + years + " nam, " + months + " thang, "
                    + days + " ngay.");
        }else{
            LocalDate ngayHienTai = LocalDate.now();
            System.out.println("Van con` yeu: " + ngayHienTai);
            Duration duration = Duration.between(thoiGianBatDau.atStartOfDay(), ngayHienTai.atStartOfDay());
            long totalDays = duration.toDays();
            long years = totalDays / 365;
            long months = (totalDays % 365) / 30;
            long days = (totalDays % 365) % 30;
            System.out.println("Moi tinh da duoc: " + years + " nam, " + months + " thang, "
                    + days + " ngay.");
       
        }
        
    }
}
