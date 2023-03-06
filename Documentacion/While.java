package com.Documentacion;

public class While {

    public static void main(String[] args) {

        int count = 0;
        while (count < 20) {
            count++;
            if (count == 6)
                break; // Acaba con el flujo de ejecucion del programa
                       // Continue;  // Salta el valor 6 y continua a la siguiente iteracion

            System.out.println("Hello World" + count);
            // count++; // condicion
        }
        System.out.println("fin");
    }
}
