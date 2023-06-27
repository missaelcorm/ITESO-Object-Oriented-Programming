public abstract class Person {
    private int edad = 0;
    private int sexo = MALE;

    public static final int MALE = 0;
    public static final int FEMALE = 0;

    public void setEdad(int edad){
        if(edad >= 0)
            this.edad = edad;
    }

    public void setSexo(int sexo){
        if(sexo >= MALE && sexo <= FEMALE)
            this.sexo = sexo;
    }

    public abstract void work();
}
