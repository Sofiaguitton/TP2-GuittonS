package resolGuittonS;
import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class Ejercicio6 {

    public static long daysUntilNextBirthday(int birthYear, int birthMonth, int birthDay) {
        LocalDate today = LocalDate.now();
        LocalDate nextBirthday = LocalDate.of(today.getYear(), birthMonth, birthDay);

        // Check if birthday has already passed this year
        if (nextBirthday.isBefore(today)) {
            nextBirthday = nextBirthday.plusYears(1);
        }

        return ChronoUnit.DAYS.between(today, nextBirthday);
    }


    public void ejercicio6() {
        // Example usage:  Replace with your birthdate
        int birthYear = 1990;
        int birthMonth = 5;
        int birthDay = 10;

        long daysLeft = daysUntilNextBirthday(birthYear, birthMonth, birthDay);
        System.out.println("There are " + daysLeft + " days until your next birthday.");
    }
}