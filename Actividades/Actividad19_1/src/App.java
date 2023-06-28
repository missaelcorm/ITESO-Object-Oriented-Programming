
public class App {
    public static void main(String[] args) throws Exception {
        Dia d1 = new Dia();
        d1.setDay(Dia.Days.TUESDAY);

        d1.setLang(Dia.Languages.ENGLISH);
        System.out.println(d1);

        d1.setLang(Dia.Languages.FRANCAIS);
        System.out.println(d1);

        d1.setLang(Dia.Languages.SPANISH);
        System.out.println(d1+"\n");

        for (Dia.Languages lang : Dia.Languages.values()){
            d1.setLang(lang);
            for (Dia.Days day : Dia.Days.values()) {
                d1.setDay(day);
                System.out.println(d1);
            }
            System.out.println();
        }
    }
}
