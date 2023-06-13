package MyClasses.personas;

/**
 * Persona
 */
public class Persona {
    private String name;
    private String lastName;
    private String secondLastName;
    private int gender;
    private int age;

    public static final int  MALE = 0;
    public static final int  FEMALE = 1;
    
    public Persona(){
        this.name = null;
        this.lastName = null;
        this.secondLastName = null;
        this.gender = -1;
        this.age = -1;
    }

    public Persona(String name, String lastName, String secondLastName, int gender, int age){
        if(gender >= MALE && gender <= FEMALE && age >=0){
            this.name = name;
            this.lastName = lastName;
            this.secondLastName = secondLastName;
            this.gender = gender;
            this.age = age;
        }
    }

    public void setName(String name){
        this.name = name;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setSecondLastName(String secondLastName){
        this.secondLastName = secondLastName;
    }

    public void setGender(int gender){
        if(gender >= MALE && gender <= FEMALE)
            this.gender = gender;
    }

    public void setAge(int age){
        if(age >= 0)
            this.age = age;
    }

}