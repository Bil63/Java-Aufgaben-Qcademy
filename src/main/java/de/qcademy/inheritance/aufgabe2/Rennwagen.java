package de.qcademy.inheritance.aufgabe2;

public class Rennwagen extends Fahrzeug{

    public Rennwagen(double position, double geschwindigkeit, double maxGeschwindigkeit, int anzahlRaeder) {
        super(position, geschwindigkeit, maxGeschwindigkeit, anzahlRaeder);
    }

    @Override
    public double getMaxGeschwindigkeit() {
        return 220.0;
    }

    @Override
    public int getAnzahlRaeder() {
        return 4;
    }
}
