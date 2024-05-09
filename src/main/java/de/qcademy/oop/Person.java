package de.qcademy.oop;

import java.time.LocalDate;

public class Person {

    static int mindestgeburtzjahr = 1990;

    private String vorname;
    private String nachname;
    private double gewicht;
    private LocalDate geburtzdatum;
    // <Sichterbarkeit> <static/nonStatic> <Rückgabetyp> <Methodennamen> (Parameterliste)
    // return -> Rückgabe und Abbruch der Ausführung der Methode
    // keine Rückgabe -> Rückgabetype: void

    Person(String vorname, String nachname, double gewicht, LocalDate geburtzdatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.gewicht = gewicht;
        this.geburtzdatum = geburtzdatum;
    }
    public  int alter() {
        int jetzigesJahr = LocalDate.now().getYear();
        int geburtsJahr = geburtzdatum.getYear();
        return jetzigesJahr - geburtsJahr;

    }
    public void zunehmen(double kg) {
        gewicht += kg;

    }public void abnehmen(double kg) {
        gewicht -= kg;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    public double getGewicht() {
        return gewicht;
    }
}
