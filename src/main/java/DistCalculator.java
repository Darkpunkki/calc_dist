public class DistCalculator {
    public static double calculateDistance(double x1, double y1, double x2, double y2) {
        double xDistance = x2 - x1;
        double yDistance = y2 - y1;
        return Math.sqrt(Math.pow(xDistance, 2) + Math.pow(yDistance, 2));
    }

    // Main method to test the distance calculation
    public static void main(String[] args) {
        double x1 = 3.0, y1 = 4.0;
        double x2 = 7.0, y2 = 1.0;

        double distance = calculateDistance(x1, y1, x2, y2);
        System.out.println("The distance between the two points is: " + distance);
    }
}