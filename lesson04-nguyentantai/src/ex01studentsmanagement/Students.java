package ex01studentsmanagement;

public class Students {
	private int maSV;
	private String hoTen;
	private Double diemLyThuyet;
	private Double diemThucHanh;
	
	public Students() {
	}

	public Students(int maSV, String hoTen, Double diemLyThuyet, Double diemThucHanh) {
		this.maSV = maSV;
		this.hoTen = hoTen;
		this.diemLyThuyet = diemLyThuyet;
		this.diemThucHanh = diemThucHanh;
	}

	public int getMaSV() {
		return maSV;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public Double getDiemLyThuyet() {
		return diemLyThuyet;
	}

	public void setDiemLyThuyet(Double diemLyThuyet) {
		this.diemLyThuyet = diemLyThuyet;
	}

	public Double getDiemThucHanh() {
		return diemThucHanh;
	}

	public void setDiemThucHanh(Double diemThucHanh) {
		this.diemThucHanh = diemThucHanh;
	}

	public double tinhDiemTrungBinh() {
		return (diemLyThuyet + diemThucHanh) / 2;
	}
	
	@Override
	public String toString() {
		return "Students [maSV=" + maSV + ", hoTen=" + hoTen + ", diemLyThuyet=" + diemLyThuyet + ", diemThucHanh="
				+ diemThucHanh + "]";
	}
}
