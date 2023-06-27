package bai1;

import java.util.Scanner;

class SinhVien {
    private int maSV;
    private String ten;
    private double diemLyThuyet;
    private double diemThucHanh;

    public SinhVien() {
 
    }

    public SinhVien(int maSV, String ten, double diemLyThuyet, double diemThucHanh) {
        this.maSV = maSV;
        this.ten = ten;
        this.diemLyThuyet = diemLyThuyet;
        this.diemThucHanh = diemThucHanh;
    }

    // Getter và Setter
    public int getMaSV() {
        return maSV;
    }

    public void setMaSV(int maSV) {
        this.maSV = maSV;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getDiemLyThuyet() {
        return diemLyThuyet;
    }

    public void setDiemLyThuyet(double diemLyThuyet) {
        this.diemLyThuyet = diemLyThuyet;
    }

    public double getDiemThucHanh() {
        return diemThucHanh;
    }

    public void setDiemThucHanh(double diemThucHanh) {
        this.diemThucHanh = diemThucHanh;
    }

    public double tinhDiemTrungBinh() {
        return (diemLyThuyet + diemThucHanh) / 2;
    }

    // Phương thức toString
    public String toString() {
        return "Mã số sinh viên: " + maSV +
                "\nTên: " + ten +
                "\nĐiểm lý thuyết: " + diemLyThuyet +
                "\nĐiểm thực hành: " + diemThucHanh;
    }
}
