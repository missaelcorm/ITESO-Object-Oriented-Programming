/**
 * Dia
 */
public class Dia {

    private Languages lang = Languages.ENGLISH;
    private Days day = Days.SUNDAY;

    private String[] dayStr_ES = {"DOMINGO", "LUNES", "MARTES", "MIERCOLES", "JUEVES", "VIERNES", "SABADO"};
    private String[] dayStr_FR = {"DIMANCHE", "LUNDI", "MARDI", "MERCREDI", "JEUDI", "VENDREDI", "SAMEDI"};

    public enum Languages {
        SPANISH, ENGLISH, FRANCAIS
    }

    public enum Days {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
    }

    public void setDay(Days day) {
        this.day = day;
    }

    public void setLang(Languages lang) {
        this.lang = lang;
    }

    public Days getDay() {
        return day;
    }

    public Languages getLang() {
        return lang;
    }

    public String toString(){
        if(this.lang == Languages.ENGLISH)
            return getDay().toString();
        else if(this.lang == Languages.SPANISH)
            return dayStr_ES[getDay().ordinal()];
        else if(this.lang == Languages.FRANCAIS)
            return dayStr_FR[getDay().ordinal()];
        else return null;
    }

}