import java.time.DayOfWeek;

public class DayOfWeekTest {

    public static void main(String[] args) {
        //dinsdag als een dag van de week
        DayOfWeek aDayOfTheWeek = DayOfWeek.TUESDAY;

        //print alle dagen van de week
        for(DayOfWeek dow:DayOfWeek.values()){
            System.out.println(dow+"("+dow.getValue()+")");
        }
    }


}
