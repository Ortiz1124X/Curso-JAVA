package com.Documentacion;

public class FunyParam {

    public static void main(String[] args) {

        // holaMundo();
        // holaMundo();


        String hola = devolverHola();
        System.out.println(hola);

        //holaMundo("Alan");
        holaMundo("Roberto");
        holaMundo(8);

    }

    private static void holaMundo() {
        System.out.println("Hola Mundo");
        System.out.println("Hola Mundo");
    }

    private static void holaMundo(String name) {
        System.out.println("Hola " + name);

    }

    private static void holaMundo(Integer number) {
        System.out.println("El Numero es: " +number);

    }
    private static String devolverHola() {
        return "Hola";
    }


        }




