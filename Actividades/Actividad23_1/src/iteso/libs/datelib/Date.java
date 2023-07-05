package iteso.libs.datelib;

import java.util.Calendar;

public class Date {
	// Atributos de la clase
	private int year;
	private int month;
	private int day;
	
	public static final int JANUARY = 1;
	public static final int FEBRUARY = 2;
	public static final int MARCH = 3;
	public static final int APRIL = 4;
	public static final int MAY = 5;
	public static final int JUNE = 6;
	public static final int JULY = 7;
	public static final int AUGUST = 8;
	public static final int SEPTEMBER = 9;
	public static final int OCTOBER = 10;
	public static final int NOVEMBER = 11;
	public static final int DECEMBER = 12;
	
	public final int FIRST_YEAR;
	public final int FIRST_MONTH;
	public final int FIRST_DAY;
	
	// Constructores, cuando se crea un objeto/instancia de Date, se ejecuta uno de los constructores
	public Date() {
		Calendar calendar = Calendar.getInstance();
		FIRST_YEAR = calendar.get(Calendar.YEAR);
		FIRST_MONTH = calendar.get(Calendar.MONTH) + 1;
		FIRST_DAY = calendar.get(Calendar.DAY_OF_MONTH);;
		setDate(FIRST_YEAR,FIRST_MONTH,FIRST_DAY);
	}
	
	public Date(int year,int month,int day) {
		if(isValid(year,month,day)) {
			FIRST_YEAR = year;
			FIRST_MONTH = month;
			FIRST_DAY = day;
		} else {
			FIRST_YEAR = 1970;
			FIRST_MONTH = 1;
			FIRST_DAY = 1;
		}
		setDate(year,month,day);
	}
	
	// Setters
	public void setYear(int year) {  // year(color café es el argumento del método
		setDate(year,month,day);
	}
	
	public void setMonth(int month) {
		setDate(year,month,day);
	}
	
	public void setDay(int day) {
		setDate(year,month,day);
	}
	
	public void setDate(int year,int month,int day) {
		if(isValid(year,month,day)) {
			this.year = year;
			this.month = month;
			this.day = day;
		}
	}
	

	private boolean isLeap() {
		return year%400==0 || year%4==0 && year%100!=0;	// Retorna el resultado de una expresión lógica (true o false)
	}

	public static boolean isLeap(int year) {
		return year%400==0 || year%4==0 && year%100!=0;	// Retorna el resultado de una expresión lógica (true o false)
	}
	
	
	/*
	 * Método que devuelve cuántos días tiene el mes que está en los atributos, también considera si el año es bisiesto para
	 * el caso del que si el atributo mes == 2
	 */
	private int daysPerMonth() {
		int retVal=0;	
		
		if(month==JANUARY || month==MARCH || month==MAY || month==JULY
				|| month==AUGUST || month==OCTOBER || month==DECEMBER)
			retVal=31;
		else if(month==APRIL || month==JUNE || month==SEPTEMBER || month==NOVEMBER)
			retVal=30;
		else if(month==FEBRUARY && !isLeap(year))
			retVal=28;
		else if(month==FEBRUARY && isLeap(year))
			retVal=29;
		
		return retVal;	// Retorna un entero
	}
	
	private static int daysPerMonth(int year,int month) {
		int retVal=0;	
		
		if(month==JANUARY || month==MARCH || month==MAY || month==JULY
				|| month==AUGUST || month==OCTOBER || month==DECEMBER)
			retVal=31;
		else if(month==APRIL || month==JUNE || month==SEPTEMBER || month==NOVEMBER)
			retVal=30;
		else if(month==FEBRUARY && !isLeap(year))
			retVal=28;
		else if(month==FEBRUARY && isLeap(year))
			retVal=29;
		
		return retVal;	// Retorna un entero
	}
	
	public boolean isValid() {
		return year>=1800 && year <=20000 &&
				day>=1 && day<=daysPerMonth();  // Los días que tiene el mes y año que ya estám en los atributos
	}
	
	private static boolean isValid(int year,int month,int day) {
		return year>=1800 && year <=20000 &&
				day>=1 && day<=daysPerMonth(year,month);  // Los días que tiene el mes y año que ya estám en los atributos
	}
	
	public int getYear() {
		return year;
	}
	
	public int getMonth() {
		return month;
	}
	
	public int getDay() {
		return day;
	}
	
	// Regresa el día de la semana calculado de los atributos year,month y day
	// 0-Domingo, 1-Lunes, 2-Martes ... 6-Sábado
	public int getDow() {
		int century = year / 100;
		int centuryBase = 6 - 2*(century%4);
		int yy = year % 100;
		int leapDays = yy / 4;
		int[] monthBase = {0,3,3,6,1,4,6,2,5,0,3,5};
		
		int result = centuryBase + yy + leapDays + monthBase[month-1] + day;
		
		if(isLeap() && month<3)	// Si es año bisiesto y el mes es antes de Marzo
			result--;
		
		return result%7; // Regresa un entero
	}

	public static int getDow(int year,int month,int day) {
		int result= -1;
		if(isValid(year,month,day)) {
			int century = year / 100;
			int centuryBase = 6 - 2*(century%4);
			int yy = year % 100;
			int leapDays = yy / 4;
			int[] monthBase = {0,3,3,6,1,4,6,2,5,0,3,5};
			
			result = centuryBase + yy + leapDays + monthBase[month-1] + day;
			
			if(isLeap(year) && month<3)	// Si es año bisiesto y el mes es antes de Marzo
				result--;
			result = result % 7;
		}
		return result; // Regresa un entero
	}

	
	public String getMonthName() {
		String[] monthName = {"January","February","March","April","May","June",
							"July","August","September","October","November","December"};
		
		return monthName[month-1];
	}
	
	public String getDowName() {
		String[] dowName = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
		return dowName[getDow()];
	}

	public void next() {
		day++;
		if(day>daysPerMonth()) {
			day = 1;
			month++;
			if(month>DECEMBER) {
				month = JANUARY;
				year++;
			}
		}
	}
	
	public void before() {
		day--;
		if(day<1) {
			month--;
			if(month<JANUARY) {
				month = DECEMBER;
				year--;
			}
			day = daysPerMonth();
		}
	}

	public boolean equals(Object o){
        if(o instanceof DateTime){
            Date d = (Date) o;
            return this.getYear() == d.getYear() &&
                    this.getMonth() == d.getMonth() &&
                    this.getDay() == d.getDay();
        }
        return false;
    }
	
	public String toString() {
		return "{" +
				"\"year\":"+year+","+
				"\"month\":\""+getMonthName()+"\","+
				"\"day\":"+day+","+
				"\"dow\":\""+getDowName()+"\"" + 
				"}";
	}
}
