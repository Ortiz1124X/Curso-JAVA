package com.Documentacion;

public class AutoMain {

    public static void main(String[] args) {

        String color;

        String fabricante;

        String modelo;

        Double peso;

        Double largo;

        Integer velocidad = 0;

        Integer acelerar = 0;

         String auto = "landRover";
         Auto autoObj = new Auto("blanco","landRover","landRover",1478.3, 4.3);

         Auto autoObj2 = new Auto("Negro","Bmw","Amg-6",1578.7, 5.8);

         autoObj2.peso = 1473.4;

         System.out.println(autoObj2);

        // autoObj2.velocidad = 90;

        System.out.println(autoObj2);

        AutoElectrico autoElectrico = new AutoElectrico();

        autoElectrico.motorElectrico = "Ejemplo motor";
        autoElectrico.color = "blanco";
        autoElectrico.fabricante = "Honda";
        autoElectrico.modelo = "Civic";

        System.out.println(autoElectrico);

        AutoElectrico autoElectrico1 = new AutoElectrico("Azul","Aston","Zagato",1498.8 ,5.4,"XTZ");
        AutoElectrico autoElectrico2 = new AutoElectrico("Verde","Lamborghini","Panamera",1998.8 ,4.4,"YTZ");

        System.out.println(autoElectrico2);

        autoElectrico2.acelerar(35);

        System.out.println(autoElectrico2);











    }


    }
