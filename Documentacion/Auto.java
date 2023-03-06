package com.Documentacion;

public class Auto {

    // Atributos

    String color;
    String fabricante;
    String modelo;
    Double peso;
    Double largo;
    Integer velocidad = 0;

    // Constructores

    public Auto(String color, String fabricante, String modelo, Double peso, Double largo){
        this.color = color;
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.peso = peso;
        this.largo = largo;
    }

    public Auto() {
    }


    // Comportamiento

    public void acelerar(Integer cantidad){
        if(velocidad > 0 && cantidad <=120){
            this.velocidad += cantidad;
        }

    }

    @Override
    public String toString() {
        return "Auto{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", modelo='" + modelo + '\'' +
                ", peso=" + peso +
                ", largo=" + largo +
                ", velocidad=" + velocidad +
                '}';
    }
}
