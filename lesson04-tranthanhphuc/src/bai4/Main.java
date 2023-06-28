package bai4;

public class Main {

	public static void main(String[] args) {
        // Khởi tạo dữ liệu
        GiamDoc giamDoc = new GiamDoc("A", 6, 3, 3);
        TruongPhong truongPhong1 = new TruongPhong("B", 9, 2, 2, "P01");
        TruongPhong truongPhong2 = new TruongPhong("C", 2, 2, 2, "P02");
        NhanSu nhanVien1 = new NhanSu("D", 4, 1);
        NhanSu nhanVien2 = new NhanSu("E", 12, 1);
        NhanSu nhanVien3 = new NhanSu("F", 1, 1);
        NhanSu nhanVien4 = new NhanSu("G", 7, 1);
        NhanSu nhanVien5 = new NhanSu("H", 5, 1);
        NhanSu nhanVien6 = new NhanSu("I", 16, 1);
        
        // Hiển thị thông tin các nhân sự
        System.out.println("Giam doc: "+ giamDoc);
        System.out.println("TruongPhong 1: "+ truongPhong1);
        System.out.println("TruongPhong 2: "+ truongPhong2);
        System.out.println("NhanVien 1: "+ nhanVien1);
        System.out.println("NhanVien 2: "+ nhanVien2);
        System.out.println("NhanVien 3:"+ nhanVien3);
        System.out.println("NhanVien 4: "+ nhanVien4);
        System.out.println("NhanVien 5: "+ nhanVien5);
        System.out.println("NhanVien 6: "+ nhanVien6);
        
        
        // Tính và in ra mức lương của từng loại nhân sự
        double luongNhanVien1 = nhanVien1.tinhLuong();
        double luongNhanVien2 = nhanVien2.tinhLuong();
        double luongNhanVien3 = nhanVien3.tinhLuong();
        double luongTruongPhong1 = truongPhong1.tinhLuong();
        double luongTruongPhong2 = truongPhong2.tinhLuong();
        double luongGiamDoc = giamDoc.tinhLuong();
        
        System.out.println("Mức lương của nhân viên 1: " + luongNhanVien1);
        System.out.println("Mức lương của nhân viên 2: " + luongNhanVien2);
        System.out.println("Mức lương của nhân viên 3: " + luongNhanVien3);
        System.out.println("Mức lương của trưởng phòng 1: " + luongTruongPhong1);
        System.out.println("Mức lương của trưởng phòng 2: " + luongTruongPhong2);
        System.out.println("Mức lương của giám đốc: " + luongGiamDoc);
    }
}

