package MyClasses.personas;

public class Profesor extends Persona {
    private String department;
    private int degree;
    private int shift;

    public static final int SPECIALTY = 0;
    public static final int MASTER = 1;
    public static final int PHD = 2;

    public static final int FULL_TIME = 0;
    public static final int PART_TIME = 1;

    public Profesor(){
        this.department = null;
        this.degree = -1;
        this.shift = -1;
    }

    public Profesor(String name, String lastName, String secondLastName, int gender, int age, String department, int degree, int shift){
        super(name, lastName, secondLastName, gender, age);
        setDepartment(department);
        setDegree(degree);
        setShift(shift);
    }

    public void setDepartment(String department){
        this.department = department;
    }

    public void setDegree(int degree){
        if(degree >= SPECIALTY && degree <= PHD)
            this.degree = degree;
    }

    public void setShift(int shift){
        if(shift >= FULL_TIME && shift <= PART_TIME)
            this.shift = shift;
    }

}
