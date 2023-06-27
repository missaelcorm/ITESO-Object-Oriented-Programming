public class Pruebas implements HelloWorld {

    @Override
    public void greet() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greet'");
    }

    @Override
    public void greetSomeone(String someone) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'greetSomeone'");
    }

    public static void main(String[] args) throws Exception {
        Pruebas greetSpanish = new Pruebas() {
            @Override
            public void greet() {
                System.out.println("Hola");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Hola "+someone);
            }
        };

        Pruebas greetEnglish = new Pruebas() {
            @Override
            public void greet() {
                System.out.println("Hello");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Hello "+someone);
            }
        };

        Pruebas greetFrancais = new Pruebas() {
            @Override
            public void greet() {
                System.out.println("Salut");
            }

            @Override
            public void greetSomeone(String someone) {
                System.out.println("Salut "+someone);
            }
        };

        greetSpanish.greet();
        greetSpanish.greetSomeone("Missael");
        greetEnglish.greet();
        greetEnglish.greetSomeone("Missael");
        greetFrancais.greet();
        greetFrancais.greetSomeone("Missael");

        Person profesor = new Person() {
            @Override
            public void work(){
                System.out.println("El profesor esta impartiendo catedra");
            }
        };

        Person alumno = new Person() {
            @Override
            public void work(){
                System.out.println("El alumno esta en clase");
            }
        };

        profesor.work();
        alumno.work();

    }

}
