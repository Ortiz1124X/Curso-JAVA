package com.Documentacion;

public class SmartDeviceMain {

    String Bluetooth;
    String wifi;
    String NFC;
    String time;


    public SmartDeviceMain (String Bluetooth, String wifi, String NFC, String time){
        this.Bluetooth = Bluetooth;
        this.wifi = wifi;
        this.NFC = NFC;
        this.time = time;

    }

    public SmartDeviceMain(){

    }

    public static void main(String[] args) {
        SmartPhone smartphone = new SmartPhone("True","True","True","10:00");

        smartphone.Bluetooth = "True";
        smartphone.NFC = "True";
        smartphone.time = "10:00";
        smartphone.wifi = "4G";

        System.out.println(smartphone);

        SmartWatch smartwatch = new SmartWatch("True","True","False","True");

        smartwatch.Bluetooth = "True";
        smartwatch.wifi = "True";
        smartwatch.NFC = "False";
        smartwatch.time = "11.11";

        System.out.println(smartwatch);
    }


    }






