package de.qcademy.oop2;

public class FirmaApp {
    public static void main(String[] args) {

        Firma firma = new Firma("Firm", "Berlin", 20);

        Raum bookedRaum = new Raum(5);
        bookedRaum.setBooked(true);

        firma.raumHinzufuegenBeiPlatz(10);
        firma.RaumHinzufuegen(bookedRaum);

        Raum raum = firma.findeRaumBeiPlatzNummer(5);

        System.out.println(firma);
        System.out.println(raum);
        System.out.println(firma.getFreieRaum());
    }
}
