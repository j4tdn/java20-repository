package tax;

class VehicleUtils {
    public static double calculateTax(Vehicle vehicle) {
        double tax;
        int capacity = vehicle.getCapacity();

        if (capacity < 100) {
            tax = vehicle.getValue() * 0.01;
        } else if (capacity >= 100 && capacity <= 200) {
            tax = vehicle.getValue() * 0.03;
        } else {
            tax = vehicle.getValue() * 0.05;
        }

        return tax;
    }
}

