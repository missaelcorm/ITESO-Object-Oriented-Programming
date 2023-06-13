package MyClasses.personas;

public class Estudiante extends Persona {
    private String plan;
    private int credits;
    private int semesters;

    public Estudiante(){
        this.plan = null;
        this.credits = -1;
        this.semesters = -1;
    }

    public Estudiante(String name, String lastName, String secondLastName, int gender, int age, String plan){
        super(name, lastName, secondLastName, gender, age);
        this.plan = plan;
    }

    public void setPlan(String plan){
        this.plan = plan;
    }

    public void setCredits(int credits){
        if(credits >= 0)
            this.credits = credits;
    }

    public void setSemesters(int semesters){
        if(semesters >= 1)
            this.semesters = semesters;
    }

}
