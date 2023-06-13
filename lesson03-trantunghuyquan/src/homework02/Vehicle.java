package homework02;

import java.text.DecimalFormat;

public class Vehicle {
	private String tenChuXe;
	private String loaiXe;
	private int dungTich;
	private double triGia;
	public String getTenChuXe() {
		return tenChuXe;
	}
	public void setTenChuXe(String tenChuXe) {
		this.tenChuXe = tenChuXe;
	}
	public String getLoaiXe() {
		return loaiXe;
	}
	public void setLoaiXe(String loaiXe) {
		this.loaiXe = loaiXe;
	}
	public int getDungTich() {
		return dungTich;
	}
	public void setDungTich(int dungTich) {
		this.dungTich = dungTich;
	}
	public double getTriGia() {
		return triGia;
	}
	public void setTriGia(double triGia) {
		this.triGia = triGia;
	}
	public Vehicle(String tenChuXe, String loaiXe, int dungTich, double triGia) {
		this.tenChuXe = tenChuXe;
		this.loaiXe = loaiXe;
		this.dungTich = dungTich;
		this.triGia = triGia;
	}
	public Vehicle() {
	}
	
	// tính thuế
	public double thuePhaiNop(int dungTich, double triGia ) {
		double thue = 0;
		if (dungTich < 100) {
            thue = triGia * 0.01;
        } else if (dungTich >= 100 && dungTich <= 200) {
            thue = triGia * 0.03;
        } else if (dungTich > 200) {
            thue = triGia * 0.05;
        }
		return thue;
	}
	@Override
	public String toString() {
		return "Vehicle [tenChuXe=" + tenChuXe + ", loaiXe=" + loaiXe + ", dungTich=" + dungTich + ", triGia=" + decimalFormat.format(triGia)
				+ ",thue= "+ decimalFormat.format(thuePhaiNop(dungTich, triGia)) + "]" ;
	}
	DecimalFormat decimalFormat = new DecimalFormat("###,###.0");
}
