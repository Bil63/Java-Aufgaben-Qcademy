package de.qcademy.inheritance.aufgabe2;

public class Krankenwagen extends Auto {

    private boolean blaulicht;


    public Krankenwagen(double position, double geschwindigkeit, double maxGeschwindigkeit, int anzahlRaeder) {
        super(position, geschwindigkeit, maxGeschwindigkeit, anzahlRaeder);
    }

    public void schalteBlauchtEin() {
        this.blaulicht = true;
        System.out.println("Blaulicht ist eingeschaltet!");
    }
    public void schalteBlauchAus() {
        this.blaulicht = false;
        System.out.println("Blaulicht ist ausgeschaltet!");
    }




}
