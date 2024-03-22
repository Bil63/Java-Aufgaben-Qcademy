package de.qcademy.oop2;

public class Firma {

    private String name;
    private String adresse;
    private int anzahlRaeume;
    private int moeglicheAnzahlRaeume;
    private int[] gebucht;


    Firma(String name, String adresse, int anzahlRaeume, int moeglicheAnzahlRaeume) {
        this.name = name;
        this.adresse = adresse;
        this.anzahlRaeume = 0;
        this.moeglicheAnzahlRaeume = moeglicheAnzahlRaeume;
        this.gebucht = new int[moeglicheAnzahlRaeume];
    }
    public void fuegeRaumHinzu(int plaetze) {
        if (anzahlRaeume < moeglicheAnzahlRaeume) {
            gebucht[anzahlRaeume] = plaetze;
            anzahlRaeume++;
            System.out.println("Raum mit " + plaetze + " Sitzplätzen wurde hinzufügt");
        }else {
            System.out.println("Maximal Anzahl der möglichen Raümen erreicht!");
        }
    }

    public int sucheRaum(int plaetze) {
        for (int i = 0; i < anzahlRaeume; i++) {
            if (gebucht[i] == plaetze) {
                return i + 1;
            }
        }
        return - 1;
    }
    public int anzahlFrei() {
        return moeglicheAnzahlRaeume - anzahlRaeume;
    }
}
