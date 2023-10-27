package view;

public class CalculateStoreDemandDemo {
    public static void main(String[] args) {
        // Define the data for Store Trend Factors, Reference Items, and Weight Ref values.
        double[] storeTrendFactors = {1.0, 1.2, 1.0, 1.0, 1.0, 1.0, 1.5, 1.0, 1.0, 1.0, 0.9, 0.7, 1.0, 1.0};
        double[] referenceItemA55 = {21.9, 66.9, 10.5, 36.4, 14.0, 65.5, 17.9, 26.7, 54.9, 35.0, 22.7, 1.0, 19.1, 19.4};
        double[] referenceItemA77 = {22.0, 150.8, 33.4, 23.4, 26.3, 22.2, 23.6, 21.9, 20.7, 22.0, 26.6, 35.5, 32.1, 22.5};
        double[] weightRef = {2.5, 1.5};

        // Initialize variables to store the total demand.
        double totalDemand = 0.0;

        // Calculate the demand for each store and accumulate the total demand.
        for (int i = 0; i < storeTrendFactors.length; i++) {
            double demand = calculateDemand(storeTrendFactors[i], referenceItemA55[i], referenceItemA77[i], weightRef);
            totalDemand += demand;

            // Print the demand for each store (optional).
            System.out.println("Store " + (i + 1) + " Demand: " + demand);
        }

        // Print the total demand.
        System.out.println("Total Demand: " + totalDemand);
    }

    // Function to calculate the demand for a store.
    public static double calculateDemand(double trendFactor, double refItemA55, double refItemA77, double[] weightRef) {
        double numerator = (refItemA55 * weightRef[0] + refItemA77 * weightRef[1]) * trendFactor;
        double denominator = weightRef[0] + weightRef[1];
        return numerator / denominator;
    }
}