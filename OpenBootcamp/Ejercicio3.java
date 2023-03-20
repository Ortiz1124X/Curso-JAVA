package OpenBootcamp;

public class Ejercicio3 {

    public static void main(String[] args) {

        Persona persona = new Persona();
        persona.SetEdad(18);
        persona.setNombre("Libby Daniel");
        persona.setNumeroMovil("+ 57 3114618728");

        Persona persona1 = new Persona();
        persona1.SetEdad(19);
        persona1.setNombre("Stiven Amaris");
        persona1.setNumeroMovil("+ 57 3007725374");

        Persona persona2 = new Persona();
        persona2.SetEdad(18);
        persona2.setNombre("Juan Jose");
        persona2.setNumeroMovil("+ 57 3194191196");

        System.out.println(persona.getEdad());
        System.out.println(persona.getNombre());
        System.out.println(persona.getNumeroMovil());

        System.out.println(persona1.getEdad());
        System.out.println(persona1.getNombre());
        System.out.println(persona1.getNumeroMovil());

        System.out.println(persona2.getEdad());
        System.out.println(persona2.getNombre());
        System.out.println(persona2.getNumeroMovil());


    }

    static class  Persona {

        private int Edad;

        public void SetEdad(int Edad) {
            this.Edad = Edad;
        }

        public int getEdad() {
            return this.Edad;
        }
        private String Nombre;

        public void setNombre( String Nombre) {
            this.Nombre = Nombre;
        }

        public String getNombre() {
            return this.Nombre;
        }

        private String numeroMovil;

        public void setNumeroMovil( String numeroMovil) {
            this.numeroMovil = numeroMovil;
        }

        public String getNumeroMovil() {
            return this.numeroMovil;
        }


    }



}
