package Ex02CalculateTheTaxPayable;

public class App {
	public static void main(String[] args) {
		Customer c1 = new Customer("KH1", "Nguyễn tấn tài", "0383956206", "TP Đà Nẵng");
		Customer c2 = new Customer("KH2", "Đoàn trọng hoàng anh", "0925642015", "TP Huế");
		
		Vehicle v1 = new Vehicle("V1", "Honda", 100, 3000);
		Vehicle v2 = new Vehicle("V2", "Yamaha", 50, 1500);
		Vehicle v3 = new Vehicle("V3", "Yamaha Exciter", 250, 10000);
		Vehicle v4 = new Vehicle("V4", "Honda Wave Alpha", 200, 7000);
		
		VehicleCustomer o1 = new VehicleCustomer(c1, new VehicleDetail[] {
				new VehicleDetail(v1, 1),
				new VehicleDetail(v2, 2),
				});
		
		VehicleCustomer o2 = new VehicleCustomer(c2, new VehicleDetail[] {
				new VehicleDetail(v3, 2),
				new VehicleDetail(v4, 1),
				});
		System.out.print("Tên chủ xe	Loại xe	Dung tích	Trị giá		Thuế phải nộp\n");
		System.out.println("=========================================================================");
		VehicleCustomer.outputVehicle(o1);
		VehicleCustomer.outputVehicle(o2);
		
	}
}
