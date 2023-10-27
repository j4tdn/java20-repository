package ql_cf;

public class NhanVien {   

    private String manv;
    private String tennv;
    private String chucvu,gt,SDT;
    private double luong;
    private String phache,ketoan,phucvu;
    //------------------------------------------------------------------------//
    public NhanVien() {
		// TODO Auto-generated constructor stub
	}
    public NhanVien (String manv,String tennv,String gt,String SDT){
        this.manv = manv;
        this.tennv = tennv;    
        this.gt = gt;
        this.SDT =SDT;
    }
    private String ChucVu(){
        if(luong > 4000000 )return "Pha che";
        if(luong > 3500000 )return "ke toan";
        if(luong > 2800000 )return "phuc vu";
        return "nhan vien moi";
    } 
    public String get_manv(){
        return manv;
    }
    public String get_tennv(){
        return tennv;
    }
    public double luong(){
        return luong;
    }       
    public String get_gt(){
        return gt;
    }
    public String get_SDT(){
        return SDT;
    }
    public void set_luong(double luong){
        this.luong = luong;
        ChucVu();
    }
    public String get_chucvu(){
        return chucvu;
    }
    public void In(){
        System.out.printf("Ma NV: %s , Ten NV: %.2f, Xep Loai: %s, ngay sinh: %.1f,Gioi tinh : %s ,So dien thoai: %.2f",tennv,manv,luong,gt,chucvu,SDT);
    }
}