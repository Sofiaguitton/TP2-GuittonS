package resolGuittonS;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Scanner;
public class Ejercicio10{
    public void ejercicio10() {
        Scanner scanner = new Scanner(System.in);

        // Ingresar LocalTime
        System.out.println("Ingresa la hora (HH:mm:ss):");
        String timeInput = scanner.nextLine();
        LocalTime localTime = LocalTime.parse(timeInput);

        // Ingresar LocalDateTime
        System.out.println("Ingresa fecha y hora (YYYY-MM-DDTHH:mm:ss):");
        String dateTimeInput = scanner.nextLine();
        LocalDateTime localDateTime = LocalDateTime.parse(dateTimeInput);

        // Comparar
        if (localDateTime.toLocalTime().isAfter(localTime)) {
            System.out.println("El LocalDateTime es mayor.");
        } else {
            System.out.println("El LocalTime es mayor o igual.");
        }

        scanner.close();
    }
}


