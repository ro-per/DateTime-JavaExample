import java.time.Year;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

public class YearTest {

    public static void main(String[] args) {
        System.out.println("Huidige jaar: "+Year.now());

        //het jaar 1960 aanmaken
        Year year = Year.of(1960);

        //controleren op schrikkeljaar
        System.out.println(year+" schrikkeljaar? -> "
                +(year.isLeap()?"Ja":"Nee"));

        //de lengte van een jaar in dagen
        System.out.println(year.length());

        //10 jaar bij optellen
        Year year2 = year.plusYears(10);
        System.out.println(year+" + 10 jaar is: "+year2);
    }
}
