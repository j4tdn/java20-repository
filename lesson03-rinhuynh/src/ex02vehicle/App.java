package ex02vehicle;

public class App {
	public static void main(String[] args) {
		Vehicle v1 = new Vehicle("Rin", "LX570", 6500, 70000);
		Vehicle v2 = new Vehicle("Hai", "Camry", 3500, 40000);
		Vehicle v3 = new Vehicle("Ha", "Vios", 1200, 15000);
		Vehicle v4 = new Vehicle("Dung", "SH", 300, 7000);
		Vehicle v5 = new Vehicle("Thao", "AB", 150, 2500);
		Vehicle v6 = new Vehicle("Mo", "Sirius", 110, 1800);
		Vehicle v7 = new Vehicle("Le", "CUP", 50, 700);
		Vehicle v8 = new Vehicle("Huong", "China", 50, 300);

		System.out.printf("%-20s%-20s%-20s%-20s%s\n", "Tên chủ xe", "Loại xe", "Dung tích", "Trị giá", "Thuế phải nộp");
		System.out.println(
				"========================================================================================="
						+ "==============");
		export(v1);
		export(v2);
		export(v3);
		export(v4);
		export(v5);
		export(v6);
		export(v7);
		export(v8);
		
	}

	public static void export(Vehicle v) {
		System.out.printf("%-20s%-20s%-20s%-20s%s\n",v.getOwnername(), v.getModel(), v.getCapacity(), v.getPrice(), v.calTax().toString());
	}
}
