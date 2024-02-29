package de.qcademy.oop.Punkt;

public class PunktApp {
    public static void main(String[] args) {
        Punkt punkt1 = new Punkt(1,10, -8);
        Punkt punkt2 = new Punkt(2, 12, -6);
        System.out.println(punkt1.toString());
        System.out.println(punkt1.spielglungX());
        System.out.println(punkt1.spielglungY());
        System.out.println(punkt1.spielgungUrsprung());
        System.out.println(punkt1.abstandZu(punkt2));
    }

}