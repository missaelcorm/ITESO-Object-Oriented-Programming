package iteso.libs.datelib;
/**
 * DateTime
 */
import iteso.libs.datelib.Date;
import java.util.Calendar;

public class DateTime extends Date{

    private int hh;
    private int mi;
    private int ss;

    public DateTime (){
        super();
        Calendar c = Calendar.getInstance();
        setHH(c.get(Calendar.HOUR_OF_DAY));
        setMI(c.get(Calendar.MINUTE));
        setSS(c.get(Calendar.SECOND));
    }

    public DateTime(int yy, int mm, int dd, int hh, int mi, int ss){
        super(yy, mm, dd);
        setHH(hh);
        setMI(mi);
        setSS(ss);
    }

    public DateTime(int hh, int mi, int ss){
        setHH(hh);
        setMI(mi);
        setSS(ss);
    }

    public DateTime(Date d){
        super(d.getYear(), d.getMonth(), d.getDay());
        Calendar c = Calendar.getInstance();
        this.hh = c.get(Calendar.HOUR_OF_DAY);
        this.mi = c.get(Calendar.MINUTE);
        this.ss = c.get(Calendar.SECOND);
    }

    public void setHH(int hh){
        if(hh>=0 && hh<=23)
            this.hh = hh;
    }

    public void setMI(int mi){
        if(mi>=0 && mi<=59)
            this.mi = mi;
    }

    public void setSS(int ss){
        if(ss>=0 && ss<=59)
            this.ss = ss;
    }

    public int getHH(){
        return this.hh;
    }

    public int getMI(){
        return this.mi;
    }

    public int getSS(){
        return this.ss;
    }

    public void next(){
        Calendar c = Calendar.getInstance();
        c.set(super.getYear(), super.getMonth(), super.getDay(), this.getHH(), this.getMI(), this.getSS());
        c.add(Calendar.SECOND, 1);
        
        super.setDate(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH));
        this.setHH(c.get(Calendar.HOUR_OF_DAY));
        this.setMI(c.get(Calendar.MINUTE));
        this.setSS(c.get(Calendar.SECOND));
    }

    public Date toDate(DateTime dt){
        return new Date(dt.getYear(), dt.getMonth(), dt.getDay());
    }

    public DateTime clone(){
        return new DateTime(super.getYear(), super.getMonth(), super.getDay(), this.getHH(), this.getMI(), this.getSS());
    }

    @Override
    public String toString(){
        return "{"+
                    super.toString() + "," +
                    "\"hour\":" + "\"" + this.getHH() +"\"," +
                    "\"minute\":" + "\"" + this.getMI() +"\"," +
                    "\"second\":" + "\"" + this.getSS() +"\"" +
                "}";
    }

    @Override
    public boolean equals(Object o){
        if(o instanceof DateTime){
            DateTime dt = (DateTime) o;
            return super.equals(dt) &&
                    this.getHH() == dt.getHH() &&
                    this.getMI() == dt.getMI() &&
                    this.getSS() == dt.getSS();
        }
        return false;
    }
}