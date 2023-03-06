package com.Documentacion;

import java.util.HashMap;
import java.util.Map;

public class MapMain {

    public static void main(String[] args) {

        Map<String, String> personas = new HashMap<>();

        personas.put("1123213H", "Juan");
        personas.put("1123213L", "Luis");
        personas.put("1123213P", "Pedro");
        personas.put("1123213J", "Jaime");

        System.out.println(personas);

        for (String key : personas.keySet()){
            System.out.println(key);
        }

        for (String value : personas.values()){
            System.out.println(value);
        }

        for (Map.Entry<String, String> pair : personas.entrySet()){
            System.out.println(pair.getKey() + "  /  " + pair.getValue() );
        }
    }

}
