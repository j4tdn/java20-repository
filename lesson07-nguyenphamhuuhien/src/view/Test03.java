package view;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.TemporalAdjusters;

public class Test03 {

    public static void inKhuVucBatKy(String timeZone){
        LocalDateTime currentTime = LocalDateTime.now(ZoneId.of(timeZone));
        System.out.println("Thoi gian hien tai: " + currentTime);
    }

    public static void inNgayCuoiCuaThang() {
        LocalDate today = LocalDate.now();
        LocalDate lastDayOfThisMonth = today.with(TemporalAdjusters.lastDayOfMonth());
        System.out.println("Ngày cuối cùng của tháng: " + lastDayOfThisMonth);
    }

    public static void inNgayCuoiVaDauCuaTuan(){
        LocalDate today = LocalDate.now();
        LocalDate firstDayOfWeek = today.with(TemporalAdjusters.previousOrSame(DayOfWeek.MONDAY));
        LocalDate lastDayOfWeek = today.with(TemporalAdjusters.nextOrSame(DayOfWeek.SUNDAY));
        System.out.println("Ngay dau cua tuan: " + firstDayOfWeek);
        System.out.println("Ngay cuoi cua tuan: " + lastDayOfWeek);
    }

    public static void main(String[] args) {
        inKhuVucBatKy("Asia/Ho_Chi_Minh");
        inNgayCuoiCuaThang();
        inNgayCuoiVaDauCuaTuan();
    }

	}

