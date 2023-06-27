package ex01studentsmanagement;

import java.util.Scanner;

public class Ex01StudentsManagement {
	public static void main(String[] args) {
		Students sv1 = new Students(1,"nguyen tan tai",7.2,7.2);
		Students sv2 = new Students(2,"doan trong hoang anh",9.0,8.5);
		
		Students sv3 = new Students();
		Scanner sc = new Scanner(System.in);
		System.out.println("Nhập mã sinh viên sv3 : ");
		int maSV3 = sc.nextInt();
		sc.nextLine();
		System.out.print("Nhập họ tên sinh viên sv3: ");
		String hoTenSV3 = sc.nextLine();
		System.out.println("Nhập điểm lý thuyết của sinh viên sv3: ");
		double diemLyThuyetSV3 = sc.nextDouble();
		System.out.println("Nhập điểm thực hành của sinh viên sv3: ");
		double diemThucHanhSV3 = sc.nextDouble();
		sv3.setMaSV(maSV3);
		sv3.setHoTen(hoTenSV3);
		sv3.setDiemLyThuyet(diemLyThuyetSV3);
		sv3.setDiemThucHanh(diemThucHanhSV3);
		
		// Đưa danh sách 3 sinh viên sv1, sv2, sv3 vào mảng một chiều
		Students[] danhSachSinhVien = {sv1, sv2, sv3};
		
		// tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
		System.out.println("\nThông tin sinh viên có điểm trung bình lớn hơn 8.5 : ");
		for (Students sv : danhSachSinhVien) {
	            if (sv.tinhDiemTrungBinh() > 8.5) {
	                System.out.println(sv);
	            }
	    }
		
		// Tìm thông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành
        System.out.println("\nThông tin sinh viên có điểm lý thuyết lớn hơn điểm thực hành:");
        for (Students sv : danhSachSinhVien) {
            if (sv.getDiemLyThuyet() > sv.getDiemThucHanh()) {
                System.out.println(sv);
            }
        }
        sc.close();
	}
}
