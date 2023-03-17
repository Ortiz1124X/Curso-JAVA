package OpenBootcamp;

import com.Documentacion.Ejercicio;

public class Ejercicio1 {

    String modelo;
    Integer puertas;
    String color;
    String marca;
    String motor;


    public Ejercicio1 (String modelo, Integer puertas, String color, String marca, String motor){
        this.modelo = modelo;
        this.puertas = puertas;
        this.color = color;
        this.marca = marca;
        this.motor = motor;

    }



        public static void main(String[] args) {

            Integer number1 = 7;
            Integer number2 = 77;
            Integer number3 = 777;
            Integer number4 = 7777;

            int result1 = number1 + number2;
            int result2 = number1 + number3;
            int result3 = number3 + number2;
            int result4 = number1 + number2 + number3 + number4;

            System.out.println(result1);
            System.out.println(result2);
            System.out.println(result3);
            System.out.println(result4);

            ////////////////////////////////

            Ejercicio1 Carro = new Ejercicio1("Urus",4,"Negro","Lamborghini","RTX");
            Ejercicio1 Carro1 = new Ejercicio1("AMG",4,"Blanco","Mercedes-Benz","ZTZ");

            System.out.println(Carro);
            System.out.println(Carro1);

            Carro.puertas =5;

            System.out.println(Carro);

        }


    @Override
    public String toString() {
        return "OpenBootcamp.Ejercicio1{" +
                "color='" + color + '\'' +
                ", marca='" + marca + '\'' +
                ", modelo='" + modelo + '\'' +
                ", motor='" + motor + '\'' +
                ", puertas='" + puertas + '\'' +
                '}';
    }
}







