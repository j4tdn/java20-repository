package view;

import java.text.DecimalFormat;
import java.util.Scanner;

import bean.Vehicle;

public class Exercise02 {
	public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");
        System.out.print("Nhập số lượng xe: ");
        int n = ip.nextInt();
        ip.nextLine(); 

        Vehicle[] vehicles = new Vehicle[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Nhập thông tin xe " + (i + 1) + ":");
            System.out.print("Tên chủ xe: ");
            String name = ip.nextLine();
            System.out.print("Mẫu xe: ");
            String model = ip.nextLine();
            System.out.print("Dung tích xylanh: ");
            int content = ip.nextInt();
            System.out.print("Giá xe: ");
            double cost = ip.nextDouble();
            ip.nextLine(); 

            vehicles[i] = new Vehicle(name, model, content, cost);
        }

        System.out.println("| Tên chủ xe | Loại xe | Dung tích | Trị giá | Thuế phải nộp |");
		System.out.println("==============================================================");
        for (int i = 0; i < n; i++) {
            double taxAmount = Vehicle.taxAmount(vehicles[i]); 
            String formattedTax = df.format(taxAmount);
    		System.out.println("    "+vehicles[i].getName()+"\t\t"+
    		vehicles[i].getModel()+"    \t"+vehicles[i].getContent()+"    \t"+vehicles[i].getCost()+"\t\t"+taxAmount );
        }

        ip.close();

	}
	
}
