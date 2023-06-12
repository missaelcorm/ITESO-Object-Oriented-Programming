import java.util.Calendar;
/**
 * TestCalendar
 */
public class TestCalendar {
    public static void main(String[] args) {
        Calendar d1 = Calendar.getInstance();
        Calendar d2 = Calendar.getInstance();
        d2.set(2021, Calendar.SEPTEMBER, 23, 0, 0, 0);

        if(d1.before(d2))
            System.out.println(d1.getTime());
        else
            System.out.println(d2.getTime());

        //d1.add(Calendar.WEEK_OF_MONTH, 2); d1.add(Calendar.YEAR, -4); //¿?
        int weeks = 2;
        int years = 4;
        int leapComplement = years > 0 ? 1 : -1;

        d1.add(Calendar.DAY_OF_MONTH, (weeks)*7+(years)*365+leapComplement);
        System.out.println(d1.getTime());

        Calendar t1 = Calendar.getInstance();

        t1.set(d2.get(Calendar.YEAR), 
                d2.get(Calendar.MONTH), 
                d2.get(Calendar.DAY_OF_MONTH), 
                d1.get(Calendar.HOUR_OF_DAY), 
                d1.get(Calendar.MINUTE), 
                d1.get(Calendar.SECOND));

        System.out.println(t1.getTime());
    }
}