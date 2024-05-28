package de.qcademy.inheritance.Video;

public class Schiff extends Fahrzeug {

    private double tiefgang;


    public Schiff(int baujahr, double kilometerstand, double motorleistung, String farbe, double tiefgang) {
        super(baujahr, kilometerstand, motorleistung, farbe);
        this.tiefgang = tiefgang;
    }

    public void anlegen () {
        System.out.println("Das Schiff wurde am Ufer angelegt");
    }

    @Override
    public void starten() {
        System.out.println("Schiff gestartet!");
    }

    @Override
    public void fahren (double km) {
        super.fahren(km);
        this.tiefgang += 0.02;
        System.out.println("Das Schiff ist weiter gefahren!");
    }
}
