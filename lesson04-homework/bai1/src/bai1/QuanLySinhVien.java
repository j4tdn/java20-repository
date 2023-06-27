package bai1;

import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien(1, "SinhVien1", 10, 9.0);
        SinhVien sv2 = new SinhVien(2, "SinhVien2", 7.5, 8.5);
        SinhVien sv3 = new SinhVien();

      
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập mã số sinh viên của sv3:");
        int maSV = scanner.nextInt();
        scanner.nextLine(); 
        System.out.println("Nhập tên của sv3:");
        String ten = scanner.nextLine();
        System.out.println("Nhập điểm lý thuyết của sv3:");
        double diemLyThuyet = scanner.nextDouble();
        System.out.println("Nhập điểm thực hành của sv3:");
        double diemThucHanh = scanner.nextDouble();

        sv3.setMaSV(maSV);
        sv3.setTen(ten);
        sv3.setDiemLyThuyet(diemLyThuyet);
        sv3.setDiemThucHanh(diemThucHanh);

        SinhVien[] danhSachSinhVien = {sv1, sv2, sv3};

        System.out.println("Danh sách sinh viên có điểm trung bình lớn hơn 8.5:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.tinhDiemTrungBinh() > 8.5) {
                System.out.println(sinhVien.toString());
            }
        }

        System.out.println("Danh sách sinh viên có điểm lý thuyết lớn hơn điểm thực hành:");
        for (SinhVien sinhVien : danhSachSinhVien) {
            if (sinhVien.getDiemLyThuyet() > sinhVien.getDiemThucHanh()) {
                System.out.println(sinhVien.toString());
            }
        }
    }
}