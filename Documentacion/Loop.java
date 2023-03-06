package com.Documentacion;

public class Loop {

    public static void main(String[] args) {

        for (int i  = 0; i <10; i++) {
            if (i == 6)
                continue;

            System.out.println(i+ "Hola Mundo");

        }
        System.out.println("Fin");
    }

}
