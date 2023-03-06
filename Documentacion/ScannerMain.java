package com.Documentacion;

import java.util.Scanner;

public class ScannerMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println("Introduce tu nombre");
        String nombre = scanner.nextLine();
        System.out.println("Introduce un numero");
        int numero = scanner.nextInt();

        System.out.println("El nombre introducido es: " + nombre);
        System.out.println("El nummero introducido es: " + numero);

        System.out.println("Oreje pro");

    }
}
