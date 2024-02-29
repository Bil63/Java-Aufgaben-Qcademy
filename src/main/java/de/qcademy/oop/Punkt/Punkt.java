package de.qcademy.oop.Punkt;

public class Punkt {

    int punktNummer;
    double x_Koordinate;
    double y_Koordinate;

    Punkt(int punktNummer, double x_Koordinate, double y_Koordinate) {
        this.punktNummer = punktNummer;
        this.x_Koordinate = x_Koordinate;
        this.y_Koordinate = y_Koordinate;
    }

    public String toString() {
        return "Punktnummer: " + punktNummer + " " + "X: " + x_Koordinate + " " + "Y: " + y_Koordinate;
    }

    public double abstandZumUrsprung() {

        return Math.sqrt(x_Koordinate * x_Koordinate + y_Koordinate * y_Koordinate);
    }

    public Punkt spielglungX() {
        return new Punkt(punktNummer, x_Koordinate, - y_Koordinate);
    }
    public Punkt spielglungY() {
        return new Punkt(punktNummer, - x_Koordinate, y_Koordinate);
    }
    public Punkt spielgungUrsprung() {

        return new Punkt(punktNummer, - x_Koordinate, - y_Koordinate);
    }
    public double abstandZu(Punkt p) {
        double deltaX = p.x_Koordinate - this.x_Koordinate;
        double deltaY = p.y_Koordinate - this.y_Koordinate;
        return Math.sqrt(deltaX * deltaX + deltaY * deltaY);
    }

}
