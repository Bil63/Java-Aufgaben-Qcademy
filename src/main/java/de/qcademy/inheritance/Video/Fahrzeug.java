package de.qcademy.inheritance.Video;

public abstract class Fahrzeug {

    private String farbe;
    private double motorleistung;
    private double Kraftstoffmenge;
    private double kilometerstand;
    private int baujahr;


    public Fahrzeug(int baujahr, double kilometerstand, double motorleistung, String farbe) {
        this.baujahr = baujahr;
        this.kilometerstand = kilometerstand;
        this.motorleistung = motorleistung;
        this.farbe = farbe;
    }



    public void fahren (double km) {
        this.kilometerstand += km;
        System.out.println("Fahrzeug Kilometerstand: " + km + " km");
    }

    public abstract void starten ();

    public void tanken (double l) {
        this.Kraftstoffmenge += l;
    }

}
