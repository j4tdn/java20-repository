package ex02ManagingVehicle;

import java.time.LocalDateTime;

public class App {
	public static void main(String[] args) {
		Owner c1 = new Owner("KH1", "Nguyễn văn A", "09727732", "Tp Huế");
		Owner c2 = new Owner("KH2", "Nguyễn văn B", "09722324", "Tp Đà Nẵng");
		Owner c3 = new Owner("KH3", "Nguyễn văn C", "0972724", "Tp Tam Kỳ");
		
		Vehicle v1 = new Vehicle("V1", " Mercedes", 80, 350);
		Vehicle v2 = new Vehicle("V2", " Toyota  ", 100, 500);
		Vehicle v3 = new Vehicle("V3", " Chevrolet", 150, 450);
		Vehicle v4 = new Vehicle("V4", " Vinfast", 250, 640);
		Vehicle v5 = new Vehicle("V5", " Honda  ", 300, 700);
		
		VehicleOwner o1 = new VehicleOwner(c1, new VehicleDetail[] {
				new VehicleDetail(v1, 1),
				new VehicleDetail(v2, 1),
		}, LocalDateTime. of(2023, 6, 23, 10, 10, 10));
		
		VehicleOwner o2 = new VehicleOwner(c2, new VehicleDetail[] {
				new VehicleDetail(v3, 2),
				new VehicleDetail(v4, 1),
		}, LocalDateTime. of(2023, 4, 23, 10, 10, 10));
		
		VehicleOwner o3 = new VehicleOwner(c3, new VehicleDetail[] {
				new VehicleDetail(v5, 2),
		}, LocalDateTime. of(2023, 5, 23, 10, 10, 10));
		System.out.println("Name of owner		Type of vehicle	     Quanity	    Capacity(cc)	Cost	    Registration tax  \n"
				+"=============================================================================================================");		
		VehicleOwnerUtils.exportregistrationTax(o1);
		VehicleOwnerUtils.exportregistrationTax(o2);
		VehicleOwnerUtils.exportregistrationTax(o3);
		
	}
}
