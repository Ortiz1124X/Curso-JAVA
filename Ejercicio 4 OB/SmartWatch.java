package com.Documentacion;

public class SmartWatch extends SmartDeviceMain{

    public SmartWatch(String Bluetooth, String wifi, String NFC, String time) {
        super(Bluetooth, wifi, NFC, time);
    }

    public void SmartDeviceMain(){}

    public static void main(String[] args) {

        SmartWatch smartwatch = new SmartWatch("True","True","False","True");

        smartwatch.Bluetooth = "True";
        smartwatch.wifi = "5G";
        smartwatch.NFC = "False";
        smartwatch.time = "11.11";

    }

    @Override
    public String toString() {
        return "com.Documentacion.SmartWatch{" +
                "Bluetooth='" + Bluetooth + '\'' +
                ", NFC='" + NFC + '\'' +
                ", time='" + time + '\'' +
                ", wifi='" + wifi + '\'' +
                '}';
    }
}
