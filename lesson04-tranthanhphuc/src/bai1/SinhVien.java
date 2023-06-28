package bai1;

public class SinhVien {
	private int maSinhVien;
	private String hoTen;
	private double diemLyThuyet;
	private double diemThucHanh;
	
	public SinhVien() {
}

	public SinhVien(int maSinhVien, String hoTen, double diemLyThuyet, double diemThucHanh) {
		super();
		this.maSinhVien = maSinhVien;
		this.hoTen = hoTen;
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
	}

	public int getMaSinhVien() {
		return maSinhVien;
	}

	public void setMaSinhVien(int maSinhVien) {
		this.maSinhVien = maSinhVien;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
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

	@Override
	public String toString() {
		return "SinhVien [maSinhVien=" + maSinhVien + ", hoTen=" + hoTen + ", diemLyThuyet=" + diemLyThuyet
				+ ", diemThucHanh=" + diemThucHanh + ", tinhDiemTrungBinh()=" + tinhDiemTrungBinh() + "]";
	}
		
}
