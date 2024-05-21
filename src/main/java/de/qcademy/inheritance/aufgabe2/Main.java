package de.qcademy.inheritance.aufgabe2;

public class Main {
    public static void main(String[] args) {

        Fahrrad fahrrad1 = new Fahrrad(0.0, 0.0, 25.0, 2);
        fahrrad1.setGeschwindigkeit(20.0);
        fahrrad1.bewege(20.0);
        System.out.println("Position Fahrrad: " + fahrrad1.getPosition() + " Km");


        Auto auto1 = new Auto(0.0, 0.0,140.0, 4);
        auto1.setGeschwindigkeit(95.0);
        auto1.bewege(12.0);
        System.out.println("Position Auto: " + auto1.getPosition() + " Km");

        Rennwagen rennwagen1 = new Rennwagen(0.0, 0.0, 220.0, 4);
        rennwagen1.setGeschwindigkeit(200.0);
        rennwagen1.bewege(7.0);
        System.out.println("Position Rennwagen: " + rennwagen1.getPosition() + " Km");

        Krankenwagen krankenwagen1 = new Krankenwagen(0.0, 0.0, 140, 4);
        krankenwagen1.setGeschwindigkeit(65);
        krankenwagen1.bewege(8.0);
        System.out.println("Position Krankenwagen: " + krankenwagen1.getPosition() + " Km");
        krankenwagen1.schalteBlauchtEin();


    }


}
