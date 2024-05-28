package de.qcademy.inheritance.aufgabe2;

public class Fahrrad extends Fahrzeug{

    public Fahrrad(double position, double geschwindigkeit, double maxGeschwindigkeit, int anzahlRaeder) {
        super(position, geschwindigkeit, maxGeschwindigkeit, anzahlRaeder);
    }

    @Override
    public double getMaxGeschwindigkeit() {
        return 0;
    }

    @Override
    public int getAnzahlRaeder() {
        return 0;
    }
}
