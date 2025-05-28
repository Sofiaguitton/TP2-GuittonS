package resolGuittonS;
import java.time.LocalTime;

public class Ejercicio3 {
    public void ejercicio3() {
        // Definir hora de inicio y fin
        LocalTime horaInicio = LocalTime.of(7, 0); // 07:00
        LocalTime horaFin = LocalTime.of(0, 0); // 00:00

        // Crear horario con intervalos de una hora
        System.out.println("Horario de la actividad:");
        LocalTime horaActual = horaInicio;

        while (!horaActual.equals(horaFin)) {
            System.out.println(horaActual + " - " + horaActual.plusHours(1));
            horaActual = horaActual.plusHours(1);

            // Manejo especial para evitar que 00:00 se muestre incorrectamente
            if (horaActual.equals(LocalTime.MIDNIGHT)) {
                break;
            }
        }
        
    }
}
