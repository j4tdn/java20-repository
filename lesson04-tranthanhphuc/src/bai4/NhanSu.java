package bai4;

public class NhanSu {
	 private String hoTen;
	 private int ngaySinh;
	 protected double heSoLuong;
	 
	 public NhanSu() {
}

	public NhanSu(String hoTen, int ngaySinh, double heSoLuong) {
		super();
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.heSoLuong = heSoLuong;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public int getNgaySinh() {
		return ngaySinh;
	}

	public void setNgaySinh(int ngaySinh) {
		this.ngaySinh = ngaySinh;
	}

	public double getHeSoLuong() {
		return heSoLuong;
	}

	public void setHeSoLuong(double heSoLuong) {
		this.heSoLuong = heSoLuong;
	}
	 
	public double tinhLuong() {
        return heSoLuong * 1250000;
    }

	@Override
	public String toString() {
		return "NhanSu [hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", heSoLuong=" + heSoLuong + "]";
	}

	
}
