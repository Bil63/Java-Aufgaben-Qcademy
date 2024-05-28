package de.qcademy.inheritance.aufgabe2;

public abstract class Fahrzeug {

    private double position;
    private double geschwindigkeit;
    private double maxGeschwindigkeit;
    private int anzahlRaeder;


    public Fahrzeug(double position, double geschwindigkeit, double maxGeschwindigkeit, int anzahlRaeder) {
        this.position = position;
        this.geschwindigkeit = geschwindigkeit;
        this.maxGeschwindigkeit = maxGeschwindigkeit;
        this.anzahlRaeder = anzahlRaeder;
    }

    public void setGeschwindigkeit(double geschwindigkeit) {
        if (this.geschwindigkeit <= maxGeschwindigkeit) {
            this.geschwindigkeit = geschwindigkeit;
        }else {
            this.geschwindigkeit = maxGeschwindigkeit;
            System.out.println("Maximale Geschwindigkeit kann nicht überschriten werden!");
        }
    }

    public void bewege(double minuten) {
        position += geschwindigkeit * minuten / 60;
    }


    public abstract double getMaxGeschwindigkeit();


    public abstract int getAnzahlRaeder();


    public double getPosition() {
        return position;
    }
}

