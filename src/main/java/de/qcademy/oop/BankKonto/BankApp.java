package de.qcademy.oop.BankKonto;

public class BankApp {

    public static void main(String[] args) {
        BankKonto bilelAloui = new BankKonto("Bilel", "Aloui", "DE0000000000", 10000);
        System.out.println(bilelAloui.toString());
        bilelAloui.einzahlung(1000);
        bilelAloui.auszahlung(200);
        bilelAloui.auszahlung(2000);
        System.out.println("Aktuelle Kontostand: " + bilelAloui.getKontostand() + " €");
    }
}
