package bai4;

public class GiamDoc extends NhanSu {
    private double heSoChucVu;
    
    public GiamDoc() {
}

	public GiamDoc(String hoTen, int ngaySinh, double heSoLuong, double heSoChucVu) {
		super(hoTen, ngaySinh, heSoLuong);
		this.heSoChucVu = heSoChucVu;
	}

	public double getHeSoChucVu() {
		return heSoChucVu;
	}

	public void setHeSoChucVu(double heSoChucVu) {
		this.heSoChucVu = heSoChucVu;
	}
    
	public double tinhLuong() {
        return (heSoLuong + heSoChucVu) * 3000000;
    }

	@Override
	public String toString() {
		return "GiamDoc [heSoChucVu=" + heSoChucVu + "]";
	}

	
}
