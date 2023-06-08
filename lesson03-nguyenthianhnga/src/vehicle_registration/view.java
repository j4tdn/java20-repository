package vehicle_registration;

import java.util.Scanner;

public class view {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in);
        System.out.print("Enter the number of vehicles: ");
        int quantity = ip.nextInt();
        ip.nextLine();
        
        Vehicle[] vehicles = new Vehicle[quantity];
        for(int i =0;i< quantity;i++)
        {
            System.out.println("Enter information for vehicle number " + (i + 1) + ":");
            System.out.print("Enter Owner Name: ");
            String ownerName = ip.nextLine();
            System.out.print("Enter Vehicle Type: ");
            String vehicleType = ip.nextLine();
            System.out.print("Enter value: ");
            double value = Double.parseDouble(ip.nextLine());
            System.out.print("Enter cylinder: ");
            double cylinder = Double.parseDouble(ip.nextLine());
            
            vehicles[i] = new Vehicle(ownerName,vehicleType,value,cylinder);
        }
        
        System.out.println("Table of registration taxes for each vehicle: \n");
        System.out.printf("%-15s %-15s %-15s %-15s %-15s\n", "Owner Name", "Vehicle Type", "Value", "Cylinder","Registration Tax");
        for (int i = 0; i < quantity; i++) {
            System.out.printf("%-15s %-15s %-15.2f %-15.2f %-15.2f\n",vehicles[i].getOwnerName(), vehicles[i].getVehicleType(), vehicles[i].getValue(), vehicles[i].getCylinder(), vehicles[i].calculateRegistrationTax());
        }
         
         
        ip.close();
        System.out.println("\n The program has ended.");
    }   
}

