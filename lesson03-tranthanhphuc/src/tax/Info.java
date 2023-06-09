package tax;

public class Info {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Nguyễn Thu Loan", "Future Neo", 100, 35000000);
        Vehicle vehicle2 = new Vehicle("Lê Minh Tính", "Ford Ranger", 3000, 250000000);
        Vehicle vehicle3 = new Vehicle("Nguyễn Minh Triết", "Landscape", 1500, 1000000000);

        double tax1 = VehicleUtils.calculateTax(vehicle1);
        double tax2 = VehicleUtils.calculateTax(vehicle2);
        double tax3 = VehicleUtils.calculateTax(vehicle3);

        System.out.println("Tax for vehicle 1: " + tax1);
        System.out.println("Tax for vehicle 2: " + tax2);
        System.out.println("Tax for vehicle 3: " + tax3);
    }

}
