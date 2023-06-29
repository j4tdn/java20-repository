package bean;

public class Student {
	private int maSV; // Mã sinh viên
	private String hoVaTen; // Họ tên
	private float diemLT; // Điểm lý thuyết
	private float diemTH; // Điểm thực hành
	public int getMaSV() {
		return maSV;
	}
	
	public Student() {
	}
	
	
	public Student(int maSV, String hoVaTen, float diemLT, float diemTH) {
		this.maSV = maSV;
		this.hoVaTen = hoVaTen;
		this.diemLT = diemLT;
		this.diemTH = diemTH;
	}

	public void setMaSV(int maSV) {
		this.maSV = maSV;
	}
	public String getHoVaTen() {
		return hoVaTen;
	}
	public void setHoVaTen(String hoVaTen) {
		this.hoVaTen = hoVaTen;
	}
	public float getDiemLT() {
		return diemLT;
	}
	public void setDiemLT(float diemLT) {
		this.diemLT = diemLT;
	}
	public float getDiemTH() {
		return diemTH;
	}
	public void setDiemTH(float diemTH) {
		this.diemTH = diemTH;
	}

	@Override
	public String toString() {
		return "Student [maSV=" + maSV + ", hoVaTen=" + hoVaTen + ", diemLT=" + diemLT + ", diemTH=" + diemTH + "]";
	}
	
	public float tinhDiemTB() {
		return (this.diemLT + this.diemTH) / 2.0f;
	}
}
