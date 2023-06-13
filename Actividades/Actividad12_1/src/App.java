import MyClasses.personas.*;

public class App {
    public static void main(String[] args) throws Exception {
        Persona p1 = new Persona("Danna", "Gonzalez", "Perez", Persona.FEMALE, 27);
        Estudiante e1 = new Estudiante("Missael", "Cortes", "Mendoza", Estudiante.MALE, 20, "ICIB");
        Profesor p2 = new Profesor("Jose Luis", "Elvira", "Valenzuela", Profesor.MALE, 30, "DESI", Profesor.PHD, 40);

        Persona pointerPersona = p2;
        //Profesor pointerProfesor = p1; //Error
        //Profesor pointerProfesor2 = e1; //Error

    }
}
