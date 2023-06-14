import iteso.libs.datelib.*;

public class App {
    public static void main(String[] args) throws Exception {
        DateTime time1 = new DateTime();
        DateTime time2 = new DateTime(0, 26, 03);
        DateTime time3 = new DateTime(2017, 12, 31, 23, 59, 59);
        DateTime time4 = time3;
        Date date5 = new Date(2017, 12, 31);

        Date date3 = time3.toDate(time3);
        date3.next();
        DateTime time6 = new DateTime(date3.getYear(), date3.getMonth(), date3.getDay(), time3.getHH(), time3.getMI(), time3.getSS());


        System.out.println(time1);
        System.out.println(time2);
        System.out.println(time3);
        System.out.println(time4);
        System.out.println(date5);
        System.out.println(date3);
        System.out.println(time6);

        System.out.println(time2.equals(time2.clone(time2)));
        System.out.println(time3.equals(date5));
        System.out.println(date5.equals(time3));
    }
}
