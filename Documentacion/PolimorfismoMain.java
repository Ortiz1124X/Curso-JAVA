package com.Documentacion;

public class PolimorfismoMain {

    public static void main(String[] args) {

        Auto auto1 = new Auto();

        AutoElectrico auto2 = new AutoElectrico();

        AutoMain auto3 = new AutoMain();

        // Polimorfismo

        Auto auto4 = new Auto();

        Auto auto5 = new AutoElectrico();

        if (auto4 instanceof AutoElectrico) {
            System.out.println("Hostia");
        }

        if (auto5 instanceof AutoElectrico) {
            System.out.println("Lamborghini");
        }


    }

}
