package resolGuittonS;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ejercicio2 {
    public void ejercicio2() {
        Scanner scanner = new Scanner(System.in);

        // Pedir fecha al usuario
        System.out.println("Ingresa una fecha en formato YYYY-MM-DD:");
        String fechaInput = scanner.nextLine();

        // Convertir la entrada en un objeto LocalDate
        LocalDate fechaIngresada = LocalDate.parse(fechaInput);
        LocalDate fechaHoy = LocalDate.now();

        // Calcular la diferencia en días
        long diasTranscurridos = ChronoUnit.DAYS.between(fechaIngresada, fechaHoy);

        // Mostrar resultado
        System.out.println("Han pasado " + diasTranscurridos + " días desde " + fechaIngresada + " hasta hoy.");

        scanner.close();
    }
}


