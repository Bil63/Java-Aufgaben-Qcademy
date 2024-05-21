package de.qcademy.inheritance.Video;

public class Main {

    public static void main(String[] args) {
        Schiff schiff1 = new Schiff(2017, 20000.0, 2000.0, "Weiss", 2);
        schiff1.fahren(50.0);
        schiff1.starten();

        Auto auto1 = new Auto();
        Fahrzeug fahrzeug = new Fahrzeug(2009, 25000, 190, "Black") {
            @Override
            public void starten() {
                System.out.println("Anonyme Fahrzeuge gestartet!");
            }
        };
        fahrzeug.starten();
    }
}
