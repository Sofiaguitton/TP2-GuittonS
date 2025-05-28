package resolGuittonS;
import java.time.LocalDateTime;
import java.time.Duration;
import java.util.Scanner;

public class Ejercicio5 {
    public void ejercicio5() {
        Scanner scanner = new Scanner(System.in);

        // Pedir fecha y hora del primer parcial
        System.out.println("Ingresa la fecha y hora del primer parcial (YYYY-MM-DDTHH:mm):");
        String fechaPrimerParcialInput = scanner.nextLine();
        LocalDateTime fechaPrimerParcial = LocalDateTime.parse(fechaPrimerParcialInput);

        // Fecha del segundo parcial
        LocalDateTime fechaSegundoParcial = LocalDateTime.of(2025, 6, 26, 19, 20);

        // Calcular diferencia
        Duration diferencia = Duration.between(fechaPrimerParcial, fechaSegundoParcial);
        long dias = diferencia.toDays();
        long horas = diferencia.toHours() % 24;
        long minutos = diferencia.toMinutes() % 60;

        // Mostrar resultado
        System.out.println("Faltan " + dias + " días, " + horas + " horas y " + minutos + " minutos entre los dos parciales.");

        scanner.close();
    }
}
