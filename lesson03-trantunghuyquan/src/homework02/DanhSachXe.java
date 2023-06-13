package homework02;

import java.util.ArrayList;
import java.util.Scanner ;

public class DanhSachXe {
	ArrayList <Vehicle> list = new ArrayList ();
	Scanner  scanner = new Scanner (System.in);
	private void themXe(){
		
		System.out.println("Tên chủ xe: ");	
		scanner.nextLine();
		String tenChuXe = scanner.nextLine();

		System.out.println("Loại xe: ");
		String loaiXe = scanner.nextLine();
		System.out.println("Nhập dung tích: ");
		int dungTich = scanner.nextInt();
		System.out.println("Nhập trị giá: ");
		double triGia = scanner.nextDouble();
		Vehicle vehicle = new Vehicle(tenChuXe, loaiXe, dungTich, triGia);
		list.add(vehicle);
	}
	private void inRa() {
		for (Vehicle vehicle: list) {
			System.out.println(vehicle.toString());
		}
	}
	public void menu() {
		int chon;
		do {
			System.out.println("nhập ch�?n trư�?ng hợp: ");
			System.out.println("1 nhập thông tin ");
			System.out.println("2 xuất bảng ");
			System.out.println("3 thoát chương trình ");
			chon = scanner.nextInt();
			switch(chon) {
			case 1:
				themXe();
				break;
			case 2:
				inRa();
				break;
			case 3:
				System.out.println("kết thúc ");
				break;
			}
		}while (chon != 3);
	}
	 
}
