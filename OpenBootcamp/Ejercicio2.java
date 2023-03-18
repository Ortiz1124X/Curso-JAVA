package OpenBootcamp;

import java.util.Scanner;

public class Ejercicio2 {

    public static void main(String[] args) {

        int number = 0;

        Scanner Read = new Scanner (System.in);

        System.out.println("Introduce un Numero:");
        number = Read.nextInt();



            if (number > 0)
                System.out.println("El Numero Introducido es Positivo");
            else if (number < 0) {
                System.out.println("El Numero Introducido es Negativo:");

            }

            int numberWhile = 0;

            while (numberWhile < 20) {
                numberWhile++;

               if (numberWhile == 4)
                        break;;

                System.out.println("Numero de Dia " + numberWhile);
                break;

            }

            do {
                System.out.println("Numero de Dia " + numberWhile);
                numberWhile += 1;
            }while (numberWhile <32);

            for (int i = 0; i < 4; i++) {
                System.out.println(i);
            }

        String Estacion ="Summer";

        switch (Estacion) {

            case "Summer":
                System.out.println("Estamos en Verano");
                break;
            case "Winter":
                System.out.println("Estamos en Invierno");
                break;

            case "Spring":
                System.out.println("Estamos en Primavera");

            case "Autumn":
                System.out.println("Estamos en Otoño");

            default:
                System.out.println("Esta Estacion no existe");
                break;
        }




    }
}



