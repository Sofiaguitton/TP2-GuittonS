package resolGuittonS;
import java.util.Scanner;

public class Ejercicio8 {

    public double calculateNormalDistance(double liters) {
        return liters * 12.5; // 100km / 8 liters = 12.5 km/liter
    }

    public double calculateRoughDistance(double liters) {
        double roughConsumptionRate = 8 * 1.15; // 15% increase
        return liters * (100 / roughConsumptionRate);
    }

    public void ejercicio8() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of fuel in liters: ");
        double fuelLiters = scanner.nextDouble();
        scanner.close();

        double normalDistance = calculateNormalDistance(fuelLiters);
        double roughDistance = calculateRoughDistance(fuelLiters);

        System.out.println("Distance on normal roads: " + normalDistance + " km");
        System.out.println("Distance on rough roads: " + roughDistance + " km");
    }
}