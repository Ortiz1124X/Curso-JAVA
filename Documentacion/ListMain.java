package com.Documentacion;

import java.util.ArrayList;
import java.util.List;

public class ListMain {

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();

        nombres.add("Nombre 1");
        nombres.add("Nombre 2");
        nombres.add("Nombre 3");
        nombres.add("Nombre 4");

        System.out.println(nombres);

        for (String nombre : nombres){

        }

        List<Coche> autos = new ArrayList<>();

        autos.add (new Coche("Lamborghini Orus"));
        autos.add (new Coche("Shelby Cobra"));
        autos.add (new Coche("Ferrari Aventador"));
        autos.add (new Coche("Mercedes Clase AMG"));
    }
}
