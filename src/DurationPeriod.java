import java.time.Duration;
import java.time.Period;

public class DurationPeriod {

    public static void main(String[] args) {
        System.out.println(Duration.ofNanos(12300000001L));
        System.out.println(Duration.ofSeconds(180000));
        System.out.println(Duration.parse("PT600.11S"));

        Duration duration1 = Duration.ofSeconds(15);
        Duration duration2 = Duration.ofSeconds(10);
        Duration duration3 = duration1.minus(duration2);
        System.out.println(duration1+" minus "+duration2+" is: "+duration3);

        System.out.println("---------------------");

        System.out.println(Period.ofDays(100));
        System.out.println(Period.ofWeeks(104));
        System.out.println(Period.parse("P11D"));

        Period period = Period.ofDays(20).minusDays(10);
        System.out.println(period);

    }

}
