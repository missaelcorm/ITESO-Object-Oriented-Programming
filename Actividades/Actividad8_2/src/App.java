import MyClasses.Date.*;

public class App {
    public static void main(String[] args) throws Exception {
        Date myDate1 = new Date();
        Date myDate2 = new Date();
        Date myDate3 = new Date(2023, 6, 1);

        myDate2.setDay(29);
        myDate2.setMonth(2);
        myDate2.setYear(2021);

        System.out.printf("%04d/%02d/%02d valid: %s\n", myDate1.getYear(), myDate1.getMonth(), myDate1.getDay(), myDate1.isValid());
        System.out.printf("%04d/%02d/%02d valid: %s\n", myDate2.getYear(), myDate2.getMonth(), myDate2.getDay(), myDate2.isValid());
        System.out.printf("%04d/%02d/%02d valid: %s\n", myDate2.getYear(), myDate3.getMonth(), myDate3.getDay(), myDate3.isValid());

        System.out.println(myDate2);

        Date myDate4 = myDate3.clone();
        System.out.println(myDate3);
        System.out.println(myDate4);

        if(myDate3.equals(myDate4))
            System.out.println("Date 3 y 4 son iguales");
    }
}