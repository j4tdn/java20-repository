package bai1;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		SinhVien sv1 = new SinhVien(123, "Trần Thanh Phúc", 5, 7);
		SinhVien sv2 = new SinhVien(456, "Nguyễn Trung Nghĩa", 8, 6);
		SinhVien sv3 = new SinhVien();
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Nhập thông tin sinh viên 3");
		System.out.print("Mã sinh viên: ");
		int maSinhVien = scanner.nextInt();
		scanner.nextLine(); 

		System.out.print("Họ tên: ");
		String hoTen = scanner.nextLine();

		System.out.print("Điểm lý thuyết: ");
		double diemLyThuyet = scanner.nextDouble();

		System.out.print("Điểm thực hành: ");
		double diemThucHanh = scanner.nextDouble();

		sv3.setMaSinhVien(maSinhVien);
		sv3.setHoTen(hoTen);
		sv3.setDiemLyThuyet(diemLyThuyet);
		sv3.setDiemThucHanh(diemThucHanh);

		SinhVien[] danhSachSinhVien = {sv1, sv2, sv3};

		System.out.println("Danh sách sinh viên:");
		for (SinhVien sinhVien : danhSachSinhVien) {
		System.out.println(sinhVien);
		System.out.println("-------------------------");
	}
}
	public static void timSinhVienTheoDiemTrungBinh(SinhVien[] danhSachSinhVien) {
	    for (int i = 0; i < danhSachSinhVien.length; i++) {
	        if (danhSachSinhVien[i].tinhDiemTrungBinh() > 8.5) {
	            System.out.println(danhSachSinhVien[i].toString());
        }
    }
}

	public static void timSinhVienTheoDiemLyThuyet(SinhVien[] danhSachSinhVien) {
	    for (int i = 0; i < danhSachSinhVien.length; i++) {
	        if (danhSachSinhVien[i].getDiemLyThuyet() > danhSachSinhVien[i].getDiemThucHanh()) {
	            System.out.println(danhSachSinhVien[i].toString());
	        }
	    }
	}
}
