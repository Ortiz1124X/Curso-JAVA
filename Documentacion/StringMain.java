package com.Documentacion;

public class StringMain {

    // La clase String

    /*
       length()
       startssWith("")
       endsWith("")
       indexOf("")
       subString(1,5)
       trim()
       equals()
       compareTo
     */
    public static void main(String[] args) {

        String mensaje = "Hola Mundo";

        System.out.println(mensaje.length());
        String mensajeMAY = mensaje.toUpperCase();
        System.out.println(mensajeMAY);
        System.out.println(mensajeMAY.trim());
        mensajeMAY = mensajeMAY.trim();

        String otro = "hola mundo";
        if (mensajeMAY.equalsIgnoreCase(otro)) {
            System.out.println("Verdadero!!");
        }


    }


}
