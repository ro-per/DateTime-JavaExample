import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Map;

public class ZonedDateTimeTest {

    public static void main(String[] args) {
        System.out.println("Huidige tijdzone: "+ZoneId.systemDefault());

        //print alle timezone IDs
        for (Map.Entry entry:ZoneId.SHORT_IDS.entrySet()) {
            System.out.println(entry.getKey()+" | "+entry.getValue());
        }

        LocalDateTime localDateTime = LocalDateTime.of(2017,1,20,8,0);
        ZoneId tokyoTimeZone = ZoneId.of("Asia/Tokyo");

        ZonedDateTime zonedDateTime = ZonedDateTime.of(localDateTime,tokyoTimeZone);
        System.out.println(zonedDateTime);

    }
}
