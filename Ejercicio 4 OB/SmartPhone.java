package com.Documentacion;

public class SmartPhone extends SmartDeviceMain{

    public SmartPhone(String Bluetooth, String wifi, String NFC, String time) {
        super(Bluetooth, wifi, NFC, time);
    }

    public void SmartDeviceMain(){}
    public static void main(String[] args) {


        SmartPhone smartphone = new SmartPhone("True","True","True","10:00");

        smartphone.Bluetooth = "True";
        smartphone.NFC = "True";
        smartphone.time = "10:00";
        smartphone.wifi = "4G";

        System.out.println(smartphone);

    }

    @Override
    public String toString() {
        return "com.Documentacion.SmartPhone{" +
                "Bluetooth='" + Bluetooth + '\'' +
                ", NFC='" + NFC + '\'' +
                ", time='" + time + '\'' +
                ", wifi='" + wifi + '\'' +
                '}';
    }
}
