package bai4;

public class TruongPhong extends NhanSu {
	
    private double heSoChucVu;
    private String tenDonVi;

    public TruongPhong() {
}

	public TruongPhong(String hoTen, int ngaySinh, double heSoLuong, double heSoChucVu, String tenDonVi) {
		super(hoTen, ngaySinh, heSoLuong);
		this.heSoChucVu = heSoChucVu;
		this.tenDonVi = tenDonVi;
	}

	public double getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}

	public String getTenDonVi() {
		return tenDonVi;
	}

	public void setTenDonVi(String tenDonVi) {
		this.tenDonVi = tenDonVi;
	}
    
	public double tinhLuong() {
        return (heSoLuong + heSoChucVu) * 2200000;
    }

	@Override
	public String toString() {
		return "TruongPhong [heSoChucVu=" + heSoChucVu + ", tenDonVi=" + tenDonVi + "]";
	}

	
}
