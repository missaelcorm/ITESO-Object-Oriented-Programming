/**
 * Date
 */
package MyClasses.Date;

public class Date {

    private int day;
    private int month;
    private int year;

    public Date(){
        this.day = 1;
        this.month = 1;
        this.year = 1970;
    }

    public Date(int year, int month, int day){
        // this.day = day > 0 && day < 32 ? day : this.day;
        // this.month = month > 0 && month < 13 ? month : this.month;
        // this.year = year >= 0 && year <= 9999 ? year : this.year;
        setDay(day);
        setMonth(month);
        setYear(year);
    }

    public void setDay(int day){
        this.day = day > 0 && day < 32 ? day : this.day;
    }

    public void setMonth(int month){
        this.month = month > 0 && month < 13 ? month : this.month;
    }

    public void setYear(int year){
        this.year = year >= 0 && year <= 9999 ? year : this.year;
    }

    public int getDay(){
        return this.day;
    }

    public int getMonth(){
        return this.month;
    }

    public int getYear(){
        return this.year;
    }

    public boolean isValid(){
        switch(this.month){
            case 1, 3, 5, 7, 8, 10, 12:
                return this.day <= 31;
            case 2:
                if(this.day > 29)
                    return false;
                else if(this.day == 29)
                    return (this.year % 4 == 0 && this.year % 100 != 0) || this.year % 400 == 0;
            case 4, 6, 9, 11: 
                return this.day <= 30;
            default: return false;
        }
    }

    public String toString(){
        String monthStr = new String();

        switch(this.month){
            case 1: monthStr = "Enero"; break;
            case 2: monthStr = "Febrero"; break;
            case 3: monthStr = "Marzo"; break;
            case 4: monthStr = "Abril"; break;
            case 5: monthStr = "Mayo"; break;
            case 6: monthStr = "Junio"; break;
            case 7: monthStr = "Julio"; break;
            case 8: monthStr = "Agosto"; break;
            case 9: monthStr = "Septiembre"; break;
            case 10: monthStr = "Octubre"; break;
            case 11: monthStr = "Noviembre"; break;
            case 12: monthStr = "Diciembre"; break;
        }

        return String.format("{\"day\": %d,\"month\": %d, \"year\": %d,\"monthname\": %s}",this.day,this.month,this.year,monthStr);
    }

    public boolean equals(Date d){
        return  this.getDay() == d.getDay() &&
                this.getMonth() == d.getMonth() &&
                this.getYear() == d.getYear();
    }

    public Date clone(){
        return new Date(this.year, this.month, this.day);
    }
}