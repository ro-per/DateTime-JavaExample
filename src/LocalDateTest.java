import java.time.Duration;
import java.time.LocalDate;
import java.time.Month;

/**
 * Een voorbeeld klasse ter illustratie van LocalDate
 */
public class LocalDateTest {

    public static void main(String[] args) {
        System.out.println("Minimum date:      \t"+LocalDate.MIN);
        System.out.println("Maximum date:      \t"+LocalDate.MAX);
        System.out.println("Now date:          \t"+LocalDate.now());
        System.out.println("0 days from epoch: \t"+LocalDate.ofEpochDay(0));

        LocalDate date1 = LocalDate.of(2014,12,24); //December 24, 2014
        System.out.println("Date1:             \t"+date1);

        LocalDate date2 = LocalDate.of(2009, Month.APRIL,22);     //April 22, 2009
        System.out.println("Date2:             \t"+date2);

        LocalDate date3 = date2.withDayOfYear(1);
        System.out.println("Date3:             \t"+date3);

        LocalDate date4 = date3.minusWeeks(2);
        System.out.println("Date4:             \t"+date4);
    }
}
