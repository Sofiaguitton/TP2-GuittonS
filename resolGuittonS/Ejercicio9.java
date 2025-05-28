package resolGuittonS;
import java.util.Scanner;
import java.util.Arrays;

public class Ejercicio9{

    public void countBills(int amount) {
        int[] denominations = {20000, 10000, 5000, 2000, 1000, 500, 200, 100, 50, 20, 10};
        int[] billCounts = new int[denominations.length];

        for (int i = 0; i < denominations.length; i++) {
            billCounts[i] = amount / denominations[i];
            amount %= denominations[i];
        }

        System.out.println("Bill counts:");
        for (int i = 0; i < denominations.length; i++) {
            if (billCounts[i] > 0) {
                System.out.println("$" + denominations[i] + ": " + billCounts[i]);
            }
        }
    }


    public void ejercicio9() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        int amount = scanner.nextInt();
        scanner.close();

        countBills(amount);
    }
}
