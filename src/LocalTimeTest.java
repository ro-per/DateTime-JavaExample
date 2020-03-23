import java.time.LocalTime;

public class LocalTimeTest {

    public static void main(String[] args) {
        //huidige tijd
        System.out.println("Huidige tijd: "+LocalTime.now());

        //middag tijd
        System.out.println(LocalTime.NOON);

        //een specifieke tijd
        System.out.println(LocalTime.of(15,11));
        System.out.println(LocalTime.of(15,11,3));
        System.out.println(LocalTime.of(15,11,3,526354445));

        LocalTime tijd1 = LocalTime.of(17,10,12);
        LocalTime tijd2 = tijd1.minusMinutes(10);
        System.out.println(tijd1+" min 10 minuten is: "+tijd2);



    }
}
