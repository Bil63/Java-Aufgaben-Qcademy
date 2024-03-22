package de.qcademy.oop2;

public class FirmaApp {

    public static void main(String[] args) {
        Firma firma = new Firma("ABC", "123 Haupstraße 59690 City", 10, 25);
        firma.fuegeRaumHinzu(20);

        System.out.println(firma.anzahlFrei());

    }
}
