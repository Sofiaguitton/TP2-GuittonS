package resolGuittonS;
public class Ejercicio7 {

    public void printTriangle(int n) {
        if (n <= 0) {
            System.out.println("Input must be a positive integer.");
            return;
        }

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void ejercicio7() {
        int numRows = 5; // Change this to create a triangle of different sizes.
        printTriangle(numRows);
    }
}