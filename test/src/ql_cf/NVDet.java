package ql_cf;

public class NVDet extends NhanVien {
    private int sogio;
    private double phucap;
    
    
    public NVDet(String manv, String tennv, String gt, String SDT, int sogio, double phucap) {
		super(manv, tennv, gt, SDT);
        this.sogio = sogio;
        this.phucap = phucap;
        double luong = sogio *150000 + phucap;
        super.set_luong(luong);
		
	}

    public void In(){
        super.In();
        System.out.printf("sogio %d,phucap :%2.2f",sogio,phucap);
    }
    
}
