package com.Documentacion;

public class AutoElectrico extends Auto{

    String motorElectrico;


    public AutoElectrico(){
    }

    public AutoElectrico(String motorElectrico){
        this.motorElectrico = motorElectrico;
    }

    public AutoElectrico(String color, String fabricante, String modelo, Double peso, Double largo, String motorElectrico){
        super(color, fabricante, modelo, peso, largo);
        this.motorElectrico = motorElectrico;
    }

    public void acelerar(Integer cantidad) {
        Integer acelerarAjustada = cantidad * 4;
        super.acelerar(acelerarAjustada);
    }

    @Override
    public String toString() {
        return "com.Documentacion.AutoElectrico{" +
                "color='" + color + '\'' +
                ", fabricante='" + fabricante + '\'' +
                ", largo=" + largo +
                ", modelo='" + modelo + '\'' +
                ", motorElectrico='" + motorElectrico + '\'' +
                ", peso=" + peso +
                ", velocidad=" + velocidad +
                '}';
    }
}

