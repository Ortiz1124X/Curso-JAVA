package com.Documentacion;

public class Ejercicio {

    public static void main(String[] args) {

        //Para este ejercicio tendréis que crear una función que reciba un precio y devuelva el precio con el IVA incluido.

        //double resultado1 = precio1 + precio2;
        //System.out.println(resultado1);


        double number1 = (100.75);

        double number2 = (35.50);

        double resultado = (5.40);

        double producto1 = (100.75 + 5.40);

        System.out.println(producto1);

        double producto2 = (35.50 + 5.40);

        System.out.println(producto2);

        double number4 = getIva();
        double number5 = getIva2();

    }

    static double getIva(){
        return (100.75 + 5.40);
    }

    static double getIva2(){
        return (35.50 + 5.40);
    }


}
