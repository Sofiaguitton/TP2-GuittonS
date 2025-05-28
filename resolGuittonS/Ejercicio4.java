package resolGuittonS;
import java.time.LocalDate;
import java.time.DayOfWeek;
import java.util.Scanner;

public class Ejercicio4 {
    public void ejercicio4() {
        Scanner scanner = new Scanner(System.in);

        // Pedir fecha de nacimiento al usuario
        System.out.println("Ingresa tu fecha de nacimiento (YYYY-MM-DD):");
        String fechaInput = scanner.nextLine();

        // Convertir la entrada a LocalDate
        LocalDate fechaNacimiento = LocalDate.parse(fechaInput);

        // Obtener el día de la semana
        DayOfWeek diaSemana = fechaNacimiento.getDayOfWeek();

        // Mostrar resultado
        System.out.println(" Resultado:" );
        
        scanner.close();
    }
}