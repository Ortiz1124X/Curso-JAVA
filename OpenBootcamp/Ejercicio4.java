package OpenBootcamp;

public class Ejercicio4 {


    static class Persona extends Cliente {

        private int edad;

        public void Setedad (int edad ) {
            this.edad = edad;
        }

        public int getedad (){
            return this.edad;
        }
        private String nombre;

        public void setnombre (String nombre) {
            this.nombre = nombre;
        }

        public String getnombre () {
            return  this.nombre;
        }


        private String numeroTelefono;

        public void setnumeroTelefono (String nummeroTelefono) {
            this.numeroTelefono = nummeroTelefono;
        }

        public String getnumeroTelefon () {
            return this.numeroTelefono;
        }

    }

     static class Cliente extends trabajador {
        private String Credito;

        public void setCredito (String Credito) {
            this.Credito = Credito;
        }

        public String getCredito (){
            return this.Credito;
        }

    }

      static class trabajador {

        private String salario;

        public void setSalario (String salario) {
            this.salario = salario;
        }

        public String getSalario () {
            return this.salario;
        }
    }

    public static void main(String[] args) {

        Persona objeto = new Persona();

        objeto.Setedad(25);
        objeto.setnombre("Luisa");
        objeto.setnumeroTelefono("+34 641568794");
        objeto.setCredito("5€");
        objeto.setSalario("1550€");


        System.out.println(objeto.getedad());
        System.out.println(objeto.getnombre());
        System.out.println(objeto.getnumeroTelefon());
        System.out.println(objeto.getCredito());


        Persona objeto1 = new Persona();

        objeto1.Setedad(25);
        objeto1.setnombre("Felipe");
        objeto1.setnumeroTelefono("+34 641635735");
        objeto1.setCredito("15€");
        objeto1.setSalario("3550€");


        System.out.println(objeto1.getnombre() + " " + objeto1.getedad());
        System.out.println(objeto1.getnumeroTelefon() + objeto1.getCredito());
        System.out.println(objeto1.getSalario());





    }





}

