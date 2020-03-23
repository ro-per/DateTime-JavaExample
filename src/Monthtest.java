import java.time.Month;

public class Monthtest {

    public static void main(String[] args) {
        //de maand april
        Month aMonth = Month.APRIL;

        //print alle maanden en hun integer waarde
        for(Month month:Month.values()){
            System.out.println(month+"("+month.getValue()+")");
        }

    }
}
