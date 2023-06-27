package management;

import java.util.Scanner;

public class Text {

    public static void main(String[] args) {
        // Tạo 3 đối tượng SinhVien
        Student sv1 = new Student(1, "Pham Van Loc", 8.5f, 7.5f);
        Student sv2 = new Student(2, "Ho Xuan Huong", 9.0f, 8.0f);

        Student sv3 = new Student();
        Scanner scanner = new Scanner(System.in);

        // Nhập thông tin cho sv3 từ bàn phím
        System.out.print("Nhap ma sinh vien sv3: ");
        int maSV = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ kí tự '\n' trong bộ đệm
        System.out.print("Nhap ho ten sinh vien sv3: ");
        String hoTen = scanner.nextLine();
        System.out.print("Nhap diem ly thuyet sinh vien sv3: ");
        float diemLT = scanner.nextFloat();
        System.out.print("Nhap diem thuc hanh sinh vien sv3: ");
        float diemTH = scanner.nextFloat();

        // Gán thông tin cho sv3 bằng setter
        sv3.setMaSV(maSV);
        sv3.setHoTen(hoTen);
        sv3.setDiemLT(diemLT);
        sv3.setDiemTH(diemTH);

        // Tìm thông tin sinh viên có điểm trung bình lớn hơn 8.5
        if (sv1.tinhDiemTB() > 8.5f) {
            System.out.println("Sinh vien 1 co diem trung binh lon hon 8.5:");
            System.out.println(sv1.toString());
        } else if (sv2.tinhDiemTB() > 8.5f) {
            System.out.println("Sinh vien 2 co diem trung binh lon hon 8.5:");
            System.out.println(sv2.toString());
        } else if (sv3.tinhDiemTB() > 8.5f) {
            System.out.println("Sinh vien 3 co diem trung binh lon hon 8.5:");
            System.out.println(sv3.toString());
        } else {
            System.out.println("Khong tim thay sinh vien nao co diem trung binh lon hon 8.5.");
        }

        // Tìm thông tin sinh viên có điểm LT lớn hơn điểm TH
        if (sv1.getDiemLT() > sv1.getDiemTH()) {
            System.out.println("Sinh vien 1 co diem ly thuyet lon hon diem thuc hanh:");
            System.out.println(sv1.toString());
        } else if (sv2.getDiemLT() > sv2.getDiemTH()) {
            System.out.println("Sinh vien 2 co diem ly thuyet lon hon diem thuc hanh:");
            System.out.println(sv2.toString());
        } else if (sv3.getDiemLT() > sv3.getDiemTH()) {
            System.out.println("Sinh vien 3 co diem ly thuyet lon hon diem thuc hanh:");
            System.out.println(sv3.toString());
        } else {
            System.out.println("Khong tim thay sinh vien nao co diem ly thuyet lon hon diem thuc hanh.");
        }

        scanner.close();
    }
}