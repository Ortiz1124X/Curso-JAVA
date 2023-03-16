package com.Documentacion;

import java.awt.image.RasterOp;
import java.io.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;

public class Exercise1 {
    public static void main(String[] args) {

        try {
            InputStream fichero = new FileInputStream("/Music");

            try {
                int datos = fichero.read();
                while (datos != -1) {
                    System.out.println((char) datos);
                    datos = fichero.read();
                }

            } catch (IOException e) {
                System.out.println("No se puede leer" + e.getMessage());
            }

        } catch (FileNotFoundException e) {
            System.out.println("No encontramos los temas mi papacho" + e.getMessage());
        }

        try {
            InputStream in = new FileInputStream("/Music");
            byte[] datos = in.readAllBytes();

            PrintStream out = new PrintStream("4 Am Eladio Carrion.mp3");
            out.write(datos);
            out.close();
        } catch (Exception e) {
            System.out.println("Exepcion" + e.getMessage());
        }

        Map<String, String> personas = new HashMap<>();

        personas.put("45698712H", "Eladio");
        personas.put("15489631M", "Maicol");
        personas.put("12564893S", "Salomon");
        personas.put("59631458E", "Emmanuel");

        System.out.println(personas);

        for (String key : personas.keySet()) {
            System.out.println(key);
        }


        for (String value : personas.values()) {
            System.out.println(value);
        }


        for (Map.Entry<String, String> pair : personas.entrySet()) {
            System.out.println(pair.getKey() + "  /  " + pair.getValue());
        }

        ArrayList <String> Players = new ArrayList<>();

        Players.add("Courtois");
        Players.add("Carvajal");
        Players.add("Militao");
        Players.add("Alaba");
        Players.add("Rudiger");
        Players.add("Kroos");
        Players.add("Modric");
        Players.add("Camavinga");
        Players.add("Vinicius");
        Players.add("Benzema");
        Players.add("Rodrygo");

        System.out.println(Players);

        LinkedList <String>  RealMadrid = new LinkedList<>(Players);
        System.out.println(RealMadrid);

    }


    }

