package com.Documentacion;

public class Switch {

    public static void main(String[] args) {
        String weahter ="brrrrrrrr";

        switch (weahter) {

            case "Sunny":
                System.out.println("El clima es Soleado");
                break;
            case "Cloudy":
                System.out.println("El clima es nublado");
                break;

            default:
                System.out.println("No se puede diferenciar el clima");
                break;
        }
    }
}
