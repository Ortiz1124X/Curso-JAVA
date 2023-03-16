package com.Documentacion;


import java.io.*;
import java.util.*;
import java.util.Scanner;


public class Exercise {

    public static void main(String[] args) {




        String reverse = "Hola Mundo";

        System.out.println(reverse);

        String reversed = new StringBuilder("Hola Mundo").reverse().toString();

        System.out.println(reversed);

        String names [] = {"Nicol", "Valeria", "Daniela"};

        for (String name : names) {
            System.out.println("Nombre del peluche:"+ " " + name);
        }

        for (int i = 0; i < names.length; i++) {
            System.out.println("Nombre del peluche:"+ " " + names[i] + ": " + " en posicion " + i);
        }

        int arrayBidimensional [][] = new int[4][8];
        arrayBidimensional [0][0] = 1;
        arrayBidimensional [0][1] = 2;
        arrayBidimensional [0][2] = 3;
        arrayBidimensional [0][3] = 4;
        arrayBidimensional [0][4] = 5;

        arrayBidimensional [1][0] = 6;
        arrayBidimensional [1][1] = 9;
        arrayBidimensional [1][2] = 12;
        arrayBidimensional [1][3] = 15;

        for (int i = 0; i < arrayBidimensional.length; i++){
            System.out.println("Valor de i" + i);

            for (int j = 0; j < arrayBidimensional[2].length; j++){
                System.out.println("Estoy en i=" + i + ", j =" + j);
                System.out.println(arrayBidimensional [i][j]);
            }

        }

        Vector <String> vector = new Vector<>();
        vector.add("Nicol");
        vector.add("Daniela");
        vector.add("Luisa");
        vector.add("Laura");
        vector.add("Valeria");

        System.out.println(vector);

        vector.remove("Daniela");
        vector.remove("Luisa");

        /* initialCapacity and capacityincrement
          El problema de no usar correctamente estas dos tipos de capacidad es que sera mas tardado y tendremos que crear y repetir codigo
          mientras que al definir la capacidad inicial es que sabemos cuantos datos se pueden introducur desde un principio y al usar el
          incremento sabemos cuantos datos podemos agrupar para hacer una practica mejor.
         */

        ArrayList <String> Lista = new ArrayList<>();
        Lista.add("Oscar");
        Lista.add("Jonathan");
        Lista.add("Juan");
        Lista.add("Esteban");

        System.out.println(Lista);


        LinkedList <String> lista = new LinkedList<>(Lista);
        System.out.println(lista);


        ArrayList <Integer> Numbers = new ArrayList<>();
        Scanner teclado = new Scanner(System.in);


        for (int i = 0; i <11 ; i++){
            System.out.println(i);


        }

        while (Numbers.size() < 5){
            System.out.println("Introduce un Numero:");
            int numero = teclado.nextInt();
            if (numero % 1 == 0) // No es par
                Numbers.add(numero);

        }

        System.out.println("\nNumeros introducidos");
        for (Integer par : Numbers)
            System.out.println(par + " ");

        System.out.println(Numbers);


        try {
            DividePorCero(4,0);
        }catch (Exception e){
            System.out.println("Demo de Codigo");

        }

        try {
            InputStream fichero = new FileInputStream("/Music");

            try {
                int datos = fichero.read();
                while (datos != -1){
                    System.out.println((char) datos);
                    datos = fichero.read();
                }

            }catch (IOException e) {
                System.out.println("No se puede leer" + e.getMessage());
            }

        }catch (FileNotFoundException e){
            System.out.println("No encontramos los temas mi papacho" + e.getMessage());
        }

        try {
            InputStream  fileIn = new FileInputStream("file.txt");
            byte [] datos = fileIn.readAllBytes();

            PrintStream fileOut = new PrintStream("file.txt");
            fileOut.write(datos);
            fileOut.close();
        } catch (Exception e) {
            System.out.println("Exepcion"+ e.getMessage());
        }


    }

    public static int DividePorCero(int A, int B)throws ArithmeticException, IOException{
        int resultado = 0;
        try {
            resultado = A / B;
        } catch (ArithmeticException e) {

            System.out.println("Esto no puede hacerse");

            throw new IOException();


        }return resultado;



    }


        }










