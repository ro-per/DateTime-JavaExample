import java.time.LocalDateTime;
import java.time.Month;

public class LocalDateTimeTest {

    public static void main(String[] args) {
        System.out.println("Huidige datum en tijd: "+LocalDateTime.now());

        LocalDateTime dateTime =
                LocalDateTime.of(2010, Month.AUGUST,28,21,10,34);
        System.out.println(dateTime);

        LocalDateTime dateTime2 =
                LocalDateTime.of(2000,Month.JANUARY,1,0,0);
        System.out.println(dateTime.isAfter(dateTime2));

        LocalDateTime dateTime3 =
                LocalDateTime.parse("2004-08-28T20:09:04");
        System.out.println(dateTime3);

    }
}
