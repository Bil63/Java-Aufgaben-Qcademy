package de.qcademy.inheritance.aufgabe2;

public class Auto extends Fahrzeug{

    public Auto(double position, double geschwindigkeit, double maxGeschwindigkeit, int anzahlRaeder) {
        super(position, geschwindigkeit, maxGeschwindigkeit, anzahlRaeder);
    }

    @Override
    public double getMaxGeschwindigkeit() {
        return 140.0;
    }

    @Override
    public int getAnzahlRaeder() {
        return 4;
    }
}
